package com.ai.buildp.service.interfaces;

import java.util.List;

import com.ai.buildp.dao.model.TAuthUser;

public interface IAuthUserSV {

	public TAuthUser getAuthUser(Long userId);
	
	public TAuthUser getAuthUserByName(String userName);
	
	/**
	 * 根据登录用户名查询返回用户bean
	 * @param userCode
	 * @return TAuthUser
	 */
	public TAuthUser getAuthUserByCode(String userCode);
	
	
	
	/**
	 * 获取所有用户信息
	 * @return
	 * Date: 2015年3月3日 <br>
	 * @author xuanjian
	 */
	public List<TAuthUser> getAllUserInfos();
	
	/**
	 * 根据用户Id删除用户
	 * @param userId
	 * Date: 2015年3月3日 <br>
	 * @author huangguozhu
	 */
	public void deleteUserById(Long userId);
	
	/**
	 * 根据用户信息添加用户
	 * @param user
	 * @author huangguozhu
	 */
	public void addUser(TAuthUser record);
}
