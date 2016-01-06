package com.ai.buildp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.buildp.dao.mapper.TBaseRegionMapper;
import com.ai.buildp.dao.model.TBaseRegion;
import com.ai.buildp.dao.model.TBaseRegionExample;
import com.ai.buildp.service.interfaces.IBaseMgrSV;

@Service
public class BaseMgrSVImpl implements IBaseMgrSV {

	@Autowired
	private TBaseRegionMapper tBaseRegionMapper;
	
	public List<TBaseRegion> getRegionByParent(String parentCode) {
		List<TBaseRegion> regions = new ArrayList<TBaseRegion>();
		try{
			TBaseRegionExample example = new TBaseRegionExample();
			example.or().andParentCodeEqualTo(parentCode);
			regions = tBaseRegionMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return regions;
	}

	public List<TBaseRegion> getAllProvince() {
		List<TBaseRegion> regions = new ArrayList<TBaseRegion>();
		try{
			TBaseRegionExample example = new TBaseRegionExample();
			example.or().andParentCodeEqualTo("000000");
			regions = tBaseRegionMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return regions;
	}

	public String getNameByCode(String regionCode) {
		String regionName = null;
		
		try{
			TBaseRegion region =  tBaseRegionMapper.selectByPrimaryKey(regionCode);
			regionName = region.getRegionName();
		}catch(Exception e){
			e.printStackTrace();
		}
		return regionName;
	}

}
