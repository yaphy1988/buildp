package com.ai.buildp.dao.mapper;

import java.util.List;

import com.ai.buildp.model.view.TMaterialTypeViewExample;
import com.ai.buildp.model.view.TMaterialTypeView;

public interface TMaterialTypeViewMapper {
	int countByExample(TMaterialTypeViewExample example);
	
	List<TMaterialTypeView> selectByExample(TMaterialTypeViewExample example);
}
