package com.ai.buildp.service.interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TAuthMenu;
import com.ai.buildp.dao.model.TAuthPermission;
import com.ai.buildp.dao.model.TAuthRole;
import com.ai.buildp.dao.model.TAuthUserRole;

public interface IAuthMgrSV {

	/**
	 * 根据登录用户ID查询出所属角色，如果同时隶属于多个角色返回角色List
	 * @param userId
	 * @return
	 */
	public List<TAuthRole> getUserRoles(Long userId);
	
	/**
	 * 根据传入的TAuthRole对象查询出角色对应有权限的所有菜单列表
	 * @param roles
	 * @return
	 */
	public List<TAuthMenu> getMenusByRole(List<TAuthRole> roles);
	
	/**
	 * 获取所有的角色
	 * @return
	 */
	public List<TAuthRole> getAllRoles();
	
	/**
	 * 获取所有的菜单，为角色分配菜单时使用
	 * @return
	 */
	public List<TAuthMenu> getAllMenus();
	
	/**
	 * 根据角色编码roleId获取角色拥有的菜单权限
	 * @param roleId
	 * @return List<TAuthPermission>
	 */
	public List<TAuthPermission> getPermissionByRoleId(Long roleId);
	
	/**
	 * 按照分页获取角色，返回一页的角色数据
	 * @return
	 */
	public void getRolesPerPage(PageInfo<TAuthRole> pageInfo);
	
	/**
	 * 保存最新的角色权限数据
	 * @param roleId
	 * @param MenuIdList
	 * @return
	 */
	@Transactional
	public boolean saveRolePermission(Long roleId, List<Long> MenuIdList);
	
	/**
	 * 按照roleId删除角色
	 * @param roleId
	 * @return
	 */
	@Transactional
	public int deleteRoleById(Long roleId);
	
	/**
	 * 添加用户角色
	 * @param userId
	 * @param roleId
	 */
	public void addUserRole(TAuthUserRole userRole);
}
