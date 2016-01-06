package com.ai.buildp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.buildp.dao.mapper.TAuthMenuMapper;
import com.ai.buildp.dao.mapper.TAuthPermissionMapper;
import com.ai.buildp.dao.mapper.TAuthRoleMapper;
import com.ai.buildp.dao.mapper.TAuthUserRoleMapper;
import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TAuthMenu;
import com.ai.buildp.dao.model.TAuthMenuExample;
import com.ai.buildp.dao.model.TAuthPermission;
import com.ai.buildp.dao.model.TAuthPermissionExample;
import com.ai.buildp.dao.model.TAuthRole;
import com.ai.buildp.dao.model.TAuthRoleExample;
import com.ai.buildp.dao.model.TAuthUserRole;
import com.ai.buildp.dao.model.TAuthUserRoleExample;
import com.ai.buildp.service.interfaces.IAuthMgrSV;

@Service
public class AuthMgrSVImpl implements IAuthMgrSV {
	
	@Autowired
	private TAuthMenuMapper tAuthMemuMapper;
	@Autowired
	private TAuthUserRoleMapper tAuthUserRoleMapper;
	@Autowired
	private TAuthRoleMapper tAuthRoleMapper;
	@Autowired
	private TAuthPermissionMapper tAuthPermissionMapper;
	@Autowired
	private TAuthMenuMapper tAuthMenuMapper;

	public List<TAuthRole> getUserRoles(Long userId) {
		List<TAuthRole> roles = new ArrayList<TAuthRole>();
		try{
			TAuthUserRoleExample example = new TAuthUserRoleExample();
			example.or().andUserIdEqualTo(userId).andStatusNotEqualTo("0");
			List<TAuthUserRole> userRoles = tAuthUserRoleMapper.selectByExample(example);
			for (TAuthUserRole userRole : userRoles) {
				TAuthRole role = tAuthRoleMapper.selectByPrimaryKey(userRole.getRoleId());
				if (role != null && !roles.contains(role))
					roles.add(role);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roles;
	}

	public List<TAuthMenu> getMenusByRole(List<TAuthRole> roles) {
		List<TAuthMenu> authMenus = new ArrayList<TAuthMenu>();
		List<Long> roleIds = new ArrayList<Long>();
		for (TAuthRole role : roles) {
			roleIds.add(role.getRoleId());
		}
		try{
			TAuthPermissionExample example = new TAuthPermissionExample();
			example.or().andRoleIdIn(roleIds);
			List<TAuthPermission> permissions = tAuthPermissionMapper.selectByExample(example);
			for (TAuthPermission o : permissions) {
				System.out.println(o.getMenuId());
				TAuthMenu menu = tAuthMenuMapper.selectByPrimaryKey(o.getMenuId());
				if (menu!=null && !authMenus.contains(menu))
					authMenus.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authMenus;
	}

	public List<TAuthRole> getAllRoles() {
		List <TAuthRole> authRoles = new ArrayList<TAuthRole>();
		try{
			TAuthRoleExample example = new TAuthRoleExample();
			//example.or();
			authRoles = tAuthRoleMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authRoles;
	}

	public List<TAuthMenu> getAllMenus() {
		List <TAuthMenu> authMenus = new ArrayList<TAuthMenu>();
		try{
			TAuthMenuExample example = new TAuthMenuExample();
			example.or();
			authMenus = tAuthMenuMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authMenus;
	}

	public List<TAuthPermission> getPermissionByRoleId(Long roleId) {
		List <TAuthPermission> permissions = new ArrayList<TAuthPermission>();
		try{
			TAuthPermissionExample example = new TAuthPermissionExample();
			example.or().andRoleIdEqualTo(roleId);
			permissions = tAuthPermissionMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return permissions;
	}

	public void getRolesPerPage(PageInfo<TAuthRole> pageInfo) {
		List <TAuthRole> authRoles = new ArrayList<TAuthRole>();
		try{
			TAuthRoleExample example = new TAuthRoleExample();
			//按照主键排序，升序排列，分页查询必须排序
			example.setOrderByClause("role_id");
			example.setLimitClauseCount(pageInfo.getPageSize());
			example.setLimitClauseStart((pageInfo.getPageIndex()-1)*pageInfo.getPageSize());
			authRoles = tAuthRoleMapper.selectByExample(example);
			int count = tAuthRoleMapper.countByExample(example);
			pageInfo.setResult(authRoles);
			pageInfo.setTotal(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean saveRolePermission(Long roleId, List<Long> MenuIdList) {
		boolean flag = false;
		try{
			List<TAuthPermission> oldPermission = getPermissionByRoleId(roleId);
			List<Long> oldMenuIds = new ArrayList<Long>();
			for (TAuthPermission per : oldPermission) {
				oldMenuIds.add(per.getMenuId());
			}
			//根据数据库中的权限判断哪些权限需要删除
			for (TAuthPermission per : oldPermission) {
				if (!MenuIdList.contains(per.getMenuId())) {
					// 老的权限新权限中没有，需要删除
					tAuthPermissionMapper.deleteByPrimaryKey(per.getPermissionId());
				}
			}
			for (Long e : MenuIdList) {
				if (!oldMenuIds.contains(e)) {
					// 新权限在老的权限列表中没有，需要新增
					TAuthPermission record = new TAuthPermission();
					record.setMenuId(e);
					record.setRoleId(roleId);
					record.setUserType("0");
					record.setCreateTime(new Date());
					tAuthPermissionMapper.insert(record);
				}
			}
			flag = true;
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public int deleteRoleById(Long roleId) {
		try{
			return tAuthRoleMapper.deleteByPrimaryKey(roleId);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void addUserRole(TAuthUserRole userRole) {
		try{
			tAuthUserRoleMapper.insert(userRole);
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
