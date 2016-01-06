package com.ai.buildp.dao.model;

public final class TAuthMenuInfo extends TAuthMenu {
	private Long roleId;
	private int right = 0; //默认值0，表示没有授权给角色roleId

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
