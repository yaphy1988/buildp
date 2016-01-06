package com.ai.buildp.web.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.util.StringUtil;
import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TAuthMenu;
import com.ai.buildp.dao.model.TAuthMenuInfo;
import com.ai.buildp.dao.model.TAuthPermission;
import com.ai.buildp.dao.model.TAuthRole;
import com.ai.buildp.dao.model.TSupplierInfo;
import com.ai.buildp.service.interfaces.IAuthMgrSV;
import com.ai.buildp.service.interfaces.IAuthUserSV;


@Controller
@RequestMapping(value = "/manager")
public class AuthMgrAction extends BaseAction {
	
	private static Logger logger = LogManager.getLogger(AuthMgrAction.class);
	
	@Autowired
    IAuthMgrSV iAuthMgrSV;
	
	@RequestMapping(value = "/allroles")
	public String allRoles(HttpServletRequest request, HttpServletResponse response) {
		List <TAuthRole> authRoles = iAuthMgrSV.getAllRoles();
		List<TAuthMenu> allMenus = iAuthMgrSV.getAllMenus();
		
		//页面初始化参数authRoles的值，供jsp页面中调用
		request.setAttribute("authRoles", authRoles);
		request.setAttribute("allMenus", allMenus);
		logger.info("跳转到权限管理页面，/jsp/manager/authmanage.jsp");
		//跳转到jsp页面根目录下的manager/authmanage.jsp页面
		return "manager/authmanage";
	}
	
	@RequestMapping(value = "/getallroles")
	public String getAllRoles(HttpServletRequest request, HttpServletResponse response) {
		int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		PageInfo<TAuthRole> pageInfo = new PageInfo<TAuthRole>();
		pageInfo.setPageIndex(pageIndex);
		pageInfo.setPageSize(pageSize);
		iAuthMgrSV.getRolesPerPage(pageInfo);
		System.out.println("============="+pageInfo.getResult());
		//页面初始化参数authRoles的值，供jsp页面中调用
		request.setAttribute("pageInfo", pageInfo);   //分页信息
		//返回分页查询得到的结果页面
		return "manager/rolelist";
	}
	
	@RequestMapping(value = "/editpermission")
	public String getRolePermission(HttpServletRequest request, HttpServletResponse response) {
		/**根据入参roleId查询出角色拥有的菜单权限，返回数据给前台页面展示*/
		Long roleId = new Long(request.getParameter("roleId"));
		List<TAuthPermission> permissions = iAuthMgrSV.getPermissionByRoleId(roleId);
		List<Long> menuIds = new ArrayList<Long>();
		for (TAuthPermission per : permissions) {
			menuIds.add(per.getMenuId());
		}
		List<TAuthMenu> allMenus = iAuthMgrSV.getAllMenus();
		List<TAuthMenuInfo> menuInfos = new ArrayList<TAuthMenuInfo>();
		for (TAuthMenu menu : allMenus) {
			TAuthMenuInfo menuInfo = new TAuthMenuInfo();
			menuInfo.setCreateTime(menu.getCreateTime());
			menuInfo.setMenuId(menu.getMenuId());
			menuInfo.setMenuLevel(menu.getMenuLevel());
			menuInfo.setMenuName(menu.getMenuName());
			menuInfo.setMenuUrl(menu.getMenuUrl());
			menuInfo.setOrderNum(menu.getOrderNum());
			menuInfo.setParentMenu(menu.getParentMenu());
			menuInfo.setRemark(menu.getRemark());
			menuInfo.setRoleId(roleId);
			if (menuIds.contains(menuInfo.getMenuId())) {
				menuInfo.setRight(1);
			}
			menuInfos.add(menuInfo);
		}
		//页面初始化参数authRoles的值，供jsp页面中调用
		request.setAttribute("menuInfos", menuInfos);
		request.setAttribute("roleId", roleId);
		return "manager/editpermission";
	}
	
	@RequestMapping(value = "/savepermission")
	public void editPermission(HttpServletRequest request, HttpServletResponse response) {
		/**修改角色权限*/
		Long roleId = new Long(request.getParameter("roleId"));
		String[] currPermission = request.getParameter("currPermission").split(",");
		List<Long> currPer = new ArrayList<Long>();
		for(String str : currPermission){
			if (StringUtil.isNumber(str)) {
				Long e = new Long(str);
				currPer.add(e);
			}
		}
		//保存当前角色的权限数据
		boolean flag = iAuthMgrSV.saveRolePermission(roleId, currPer);
		if (flag) {
			responseSuccess(response, "success", null);
		} else {
			responseFailed(response, "faile", null);
		}
	}
	
	@RequestMapping(value="deleterole")
	public void deleteRoleById(HttpServletRequest request, HttpServletResponse response) {
		/**删除用户角色*/
		Long roleId = new Long(request.getParameter("roleId"));
		if (iAuthMgrSV.deleteRoleById(roleId)>0) {
			responseSuccess(response, "success", null);
		} else {
			responseFailed(response, "faile", null);
		}
	}
	
	@RequestMapping(value = "getRoleIdsAndNames", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getRoleIdsAndNames(){
        List<Long> ids = new ArrayList<Long>();
        List<String> names = new ArrayList<String>();
        List<TAuthRole> roles = iAuthMgrSV.getAllRoles();
        for (TAuthRole role : roles) {
            ids.add(role.getRoleId());
            names.add(role.getRoleName());
        }
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("ids", ids);
        jsonArray.put("names", names);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
}
