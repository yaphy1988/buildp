package com.ai.buildp.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ai.buildp.util.Constant;
import com.ai.buildp.dao.model.TAuthMenu;
import com.ai.buildp.dao.model.TAuthRole;
import com.ai.buildp.dao.model.TAuthUser;
import com.ai.buildp.service.interfaces.IAuthMgrSV;
import com.ai.buildp.service.interfaces.IAuthUserSV;
import com.ai.buildp.web.action.BaseAction;

@Controller
@RequestMapping(value = "/login")
public class LoginAction extends BaseAction {

    private static Logger logger = LogManager.getLogger(LoginAction.class);
    
    @Autowired
    IAuthUserSV iAuthUserSV;
    
    @Autowired
    IAuthMgrSV iAuthMgrSV;
	
	@RequestMapping(value = "/checkname")
	public void checkName(HttpServletRequest request, HttpServletResponse response) {
		String userCode = request.getParameter("usercode");
		TAuthUser authUser = iAuthUserSV.getAuthUserByCode(userCode);
		
		if (authUser != null) {
		    responseSuccess(response, "", new JSONObject());
        } else {
            responseFailed(response, "", new JSONObject());
            logger.debug(userCode + "用户名不存在！");
        }
	}
	
	@RequestMapping(value = "/check")
	public void checkLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userCode = request.getParameter("usercode");
		String passWord = request.getParameter("password");
		String vali = request.getParameter("vali");
		TAuthUser authUser = iAuthUserSV.getAuthUserByCode(userCode);
        if (authUser != null) {
            String pwd = DigestUtils.md5Hex(authUser.getPassWord());//数据库里保存的是MD5加密的，现在没有并没有，所以，在这里先加一次。
            
            String passwd = DigestUtils.md5Hex(pwd+Constant.passwdConstant);
            if(null != passWord && passWord.equals(passwd)){
				if ("true".equals(vali.trim())) {
					/**登录成功后，根据登录用户名查询出所在角色，并根据角色查询出拥有的所有菜单权限初始化菜单*/
					HttpSession session = request.getSession();
					List <TAuthRole> authRoles = iAuthMgrSV.getUserRoles(authUser.getUserId()); 
					if (authRoles != null) {
						List<TAuthMenu> li = iAuthMgrSV.getMenusByRole(authRoles);
						session.setAttribute("menulist", li);
					}
					session.setAttribute("Login_State", true);
					request.getSession().setAttribute("user", authUser);
				}
                responseSuccess(response, "", new JSONObject());
            } else {
                responseFailed(response, "", new JSONObject());
                logger.debug(userCode + "用户名密码错误！");
            }
        } else {
            responseFailed(response, "", new JSONObject());
            logger.debug(userCode + "用户名不存在！");
        }
		
		
	}
	
	@RequestMapping(value = "/getPasswordConstant")
	public void getPasswordConstant(HttpServletRequest request, HttpServletResponse response){
	    String pwd = Constant.passwdConstant;
	    responseSuccess(response, pwd, new JSONObject());
	}
	
	@RequestMapping(value = "/makeSessionInvali")
	public void makeSessionInvali(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
			this.responseSuccess(response, "成功登出！", null);
		}
	}

	@RequestMapping(value = "/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response) {
	    String code=request.getParameter("code");
        if(!code.equalsIgnoreCase(request.getSession().getAttribute("verifyCode").toString())){
            this.responseFailed(response, "fail", null);
        }else{
            this.responseFailed(response, "success", null);
        }
		
	}
	
	public static void main(String args[]) {
		
	}
}
