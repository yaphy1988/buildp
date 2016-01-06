package com.ai.buildp.web.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.dao.model.TAuthUser;
import com.ai.buildp.dao.model.TAuthUserRole;
import com.ai.buildp.service.interfaces.IAuthMgrSV;
import com.ai.buildp.service.interfaces.IAuthUserSV;

@Controller
@RequestMapping(value = "user")
public class UserMgrAction extends BaseAction {
	
	private static Logger logger = LogManager.getLogger(UserMgrAction.class);

	@Autowired
	IAuthUserSV iAuthUserSV;
	
	@Autowired
	IAuthMgrSV iAuthMgrSV;

	@RequestMapping(value = "usermanage")
	public String getAllUserInfos(HttpServletRequest request,
			HttpServletResponse response) {
		List<TAuthUser> list = new ArrayList<TAuthUser>();
		try {
			list = iAuthUserSV.getAllUserInfos();
			request.setAttribute("users", list);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("获取所有用户信息错误！");
		}
		logger.info("转发到用户管理页面，/jsp/user/usermanage.jsp");
		return "user/usermanage";
	}

	@RequestMapping(value = "deleteUser")
	public String deleteUserById(HttpServletRequest request) {
		try {
			Long userId = new Long(request.getParameter("userId"));
			iAuthUserSV.deleteUserById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("重定向到用户管理页面，/jsp/user/usermanage.jsp");
		return "redirect:/user/usermanage";
	}

	@RequestMapping(value = "toAddUser")
	public String toAddUser() {
		logger.info("转发到用户添加页面，/jsp/user/useradd.jsp");
		return "user/useradd";
	}

	@RequestMapping(value = "addUser")
	public String addUser(TAuthUser user, TAuthUserRole userRole, Long roleId,Model map,HttpServletRequest request, HttpServletResponse response) {
		
		try {
			iAuthUserSV.addUser(user);
			
			Long userId = iAuthUserSV.getAuthUserByName(user.getUserName()).getUserId();
			
			//分配角色
			userRole.setUserId(userId);
			userRole.setRoleId(roleId);
			System.out.println(userRole);
			iAuthMgrSV.addUserRole(userRole);
			map.addAttribute("optResult", "addSuccess");
		} catch (Exception e) {
		    map.addAttribute("optResult", "fail");
			e.printStackTrace();
			logger.error("添加用户信息错误！");
		}
		logger.info("重定向到用户管理页面，/jsp/user/usermanage.jsp");
		return getAllUserInfos(request, response);
	}
	
	@RequestMapping(value = "getIdAndName", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getUserIdAndName(){
        List<Long> ids = new ArrayList<Long>();
        List<String> names = new ArrayList<String>();
        List<TAuthUser> users = iAuthUserSV.getAllUserInfos();
        for (TAuthUser tAuthUser : users) {
            ids.add(tAuthUser.getUserId());
            names.add(tAuthUser.getUserName());
        }
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("ids", ids);
        jsonArray.put("names", names);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
}
