package com.ai.buildp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.buildp.dao.mapper.TAuthUserMapper;
import com.ai.buildp.dao.model.TAuthUser;
import com.ai.buildp.dao.model.TAuthUserExample;
import com.ai.buildp.service.interfaces.IAuthUserSV;

@Service
public class AuthUserSVImpl implements IAuthUserSV {

	@Autowired
	private TAuthUserMapper tAuthUserMapper;

	public TAuthUser getAuthUser(Long userId) {
		TAuthUser userBean = null;
		try {
			userBean = tAuthUserMapper.selectByPrimaryKey(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

	public TAuthUser getAuthUserByName(String userName) {
		TAuthUser userBean = null;
		try {
//			userBean = tAuthUserMapper.selectUserByName(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

	public TAuthUser getAuthUserByCode(String userCode) {
		TAuthUserExample example = new TAuthUserExample();
		TAuthUser userBean = null;
		try {
			/**
			 * example.or()
			 * 得到criteria对象，调用其内部方法andUserCodeEqualTo()增加userCode查询条件，等价于and
			 * USER_CODE = :userCode
			 */
			example.or().andUserCodeEqualTo(userCode);
			List<TAuthUser> authUserList = tAuthUserMapper
					.selectByExample(example);
			userBean = authUserList.get(0);
		} catch (Exception e) {
			e.printStackTrace();
			// throw new
			// BusinessException(BusinConstants.AuthConstants.USER_NOT_FOUND,"用户登录名"+userCode+"不存在！");
		}
		return userBean;
	}

	public List<TAuthUser> getAllUserInfos() {
		List<TAuthUser> list = null;
		try {
			list = tAuthUserMapper.selectByExample(new TAuthUserExample());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public void deleteUserById(Long userId) {
		try {
			tAuthUserMapper.deleteByPrimaryKey(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addUser(TAuthUser record) {
		try{
			tAuthUserMapper.insert(record);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
