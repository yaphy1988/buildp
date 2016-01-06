package com.ai.buildp.service.interfaces;

import java.util.List;

import com.ai.buildp.dao.model.TBaseRegion;

public interface IBaseMgrSV {

	/**
	 * 根据父级区域编码获取直属区域数据
	 * @param parentCode
	 * @return
	 */
	public List<TBaseRegion> getRegionByParent(String parentCode);
	
	/**
	 * 查询出所有省级区域
	 * @return
	 */
	public List<TBaseRegion> getAllProvince();
	
	/**
	 * 根据区域编号获得其名称
	 * @param regionCode
	 * @return
	 */
	public String getNameByCode(String regionCode);
}
