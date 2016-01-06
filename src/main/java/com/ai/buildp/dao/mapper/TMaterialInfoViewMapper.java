package com.ai.buildp.dao.mapper;

import java.util.List;

import com.ai.buildp.model.view.TMaterialInfoView;
import com.ai.buildp.model.view.TMaterialInfoViewExample;

public interface TMaterialInfoViewMapper {
	int countByExample(TMaterialInfoViewExample example);
	
	List<TMaterialInfoView> selectByExample(TMaterialInfoViewExample example);
}
