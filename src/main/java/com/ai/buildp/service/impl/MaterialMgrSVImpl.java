package com.ai.buildp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.buildp.dao.mapper.TMaterialInfoMapper;
import com.ai.buildp.dao.mapper.TMaterialInfoViewMapper;
import com.ai.buildp.dao.mapper.TMaterialTypeMapper;
import com.ai.buildp.dao.mapper.TMaterialTypeViewMapper;
import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TMaterialInfo;
import com.ai.buildp.dao.model.TMaterialInfoExample;
import com.ai.buildp.dao.model.TMaterialType;
import com.ai.buildp.dao.model.TMaterialTypeExample;
import com.ai.buildp.model.view.TMaterialInfoView;
import com.ai.buildp.model.view.TMaterialInfoViewExample;
import com.ai.buildp.model.view.TMaterialTypeView;
import com.ai.buildp.model.view.TMaterialTypeViewExample;
import com.ai.buildp.model.view.TMaterialTypeViewExample.Criteria;
import com.ai.buildp.service.interfaces.IMaterialMgrSV;

@Service
public class MaterialMgrSVImpl implements IMaterialMgrSV {

    @Autowired
    TMaterialTypeMapper tMaterialTypeMapper;
    
    @Autowired
    TMaterialInfoMapper tMaterialInfoMapper;
    
    @Autowired
    TMaterialTypeViewMapper tMaterialTypeViewMapper;
    
    @Autowired
    TMaterialInfoViewMapper tMaterialInfoViewMapper;
    
    public List<TMaterialType> getMaterialType() {
        List<TMaterialType> types = new ArrayList<TMaterialType>();
        try {
            types = tMaterialTypeMapper.selectByExample(new TMaterialTypeExample());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }

    public List<TMaterialInfo> getAllMaterialInfo() {
        List<TMaterialInfo> infos = null;
        try {
            infos = tMaterialInfoMapper.selectByExample(new TMaterialInfoExample());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return infos;
    }

	public boolean deleteMaterialTypeById(Long typeId) {
		boolean flag = false;
		try{
			int i = tMaterialTypeMapper.deleteByPrimaryKey(typeId);
			if(i == 1){
				flag = true;
			}else{
				flag = false;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean deleteMaterialInfoById(Long materialId) {
		boolean flag = false;
		try{
			int i = tMaterialInfoMapper.deleteByPrimaryKey(materialId);
			if(i == 1){
				flag = true;
			}else{
				flag = false;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean addMaterialType(TMaterialType record) {
		boolean flag = false;
		try{
			int i = tMaterialTypeMapper.insert(record);
			if(i == 1){
				flag = true;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean addMaterialInfo(TMaterialInfo record) {
		boolean flag = false;
		try{
			int i = tMaterialInfoMapper.insert(record);
			if(i == 1){
				flag = true;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public void getTypesPerPage(PageInfo<TMaterialTypeView> pageInfo, TMaterialTypeView param) {
		List <TMaterialTypeView> types = new ArrayList<TMaterialTypeView>();
		try{
			TMaterialTypeViewExample example = new TMaterialTypeViewExample();
			Criteria criteria= example.createCriteria();
			
			if(param.getTypeId()!=null) {
				criteria.andTypeIdEqualTo(param.getTypeId());
			}
			if(param.getTypeName() != null){
				String typeName = "%" + param.getTypeName() + "%";
				criteria.andTypeNameLike(typeName);
			}
			if(param.getParentTypeName()!=null){
				String parentTypeName = "%" + param.getParentTypeName() + "%";
				criteria.andParentTypeNameLike(parentTypeName);
			}
			if(param.getEndNode() != null)
				criteria.andEndNodeEqualTo(param.getEndNode());
			
			//按照主键排序，升序排列，分页查询必须排序
			example.setOrderByClause("type_id");
			example.setLimitClauseCount(pageInfo.getPageSize());
			example.setLimitClauseStart((pageInfo.getPageIndex()-1)*pageInfo.getPageSize());
			types = tMaterialTypeViewMapper.selectByExample(example);
			int count = tMaterialTypeViewMapper.countByExample(example);
			pageInfo.setResult(types);
			pageInfo.setTotal(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getInfosPerPage(PageInfo<TMaterialInfoView> pageInfo, TMaterialInfoView param) {
		List <TMaterialInfoView> infos = new ArrayList<TMaterialInfoView>();
		try{
			TMaterialInfoViewExample example = new TMaterialInfoViewExample();
			com.ai.buildp.model.view.TMaterialInfoViewExample.Criteria criteria= example.createCriteria();
			
			if(param.getMaterialName()!=null) {
				String materialName = "%" + param.getMaterialName() + "%";
				criteria.andMaterialNameLike(materialName);
			}
			if(param.getTypeName() != null){
				String typeName = "%" + param.getTypeName() + "%";
				criteria.andTypeNameLike(typeName);
			}
			if(param.getStandard()!=null){
				String standard = "%" + param.getStandard() + "%";
				criteria.andStandardLike(standard);
			}
			if(param.getStatus() != null)
				criteria.andStatusEqualTo(param.getStatus());
			
			//按照主键排序，升序排列，分页查询必须排序
			example.setOrderByClause("material_id");
			example.setLimitClauseCount(pageInfo.getPageSize());
			example.setLimitClauseStart((pageInfo.getPageIndex()-1)*pageInfo.getPageSize());
			infos = tMaterialInfoViewMapper.selectByExample(example);
			int count = tMaterialInfoViewMapper.countByExample(example);
			pageInfo.setResult(infos);
			pageInfo.setTotal(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TMaterialInfo getInfoByMaterialId(Long materialId) {
		TMaterialInfo info = null;
		try{
			info = tMaterialInfoMapper.selectByPrimaryKey(materialId);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return info;
	}

	public boolean updateMaterilInfo(TMaterialInfo info) {
		boolean flag = false;
		try {
			int i = tMaterialInfoMapper.updateByPrimaryKeySelective(info);
			if(i == 1){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public TMaterialType getTypeByTypeId(Long typeId) {
		TMaterialType type = null;
		try{
			type = tMaterialTypeMapper.selectByPrimaryKey(typeId);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return type;
	}
	
	public boolean updateMaterilType(TMaterialType type) {
		boolean flag = false;
		try {
			int i = tMaterialTypeMapper.updateByPrimaryKeySelective(type);
			if(i == 1){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean isExistTypeName(String typeName) {
		int count = 0;
//				count = tMaterialTypeMapper.countByTypeName(typeName);
		if(count ==1){
			return true;
		}
		return false;
	}

}
