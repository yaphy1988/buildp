package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TMeasureUnits;
import com.ai.buildp.dao.model.TMeasureUnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMeasureUnitsMapper {
    int countByExample(TMeasureUnitsExample example);

    int deleteByExample(TMeasureUnitsExample example);

    int deleteByPrimaryKey(String measureCode);

    int insert(TMeasureUnits record);

    int insertSelective(TMeasureUnits record);

    List<TMeasureUnits> selectByExample(TMeasureUnitsExample example);

    TMeasureUnits selectByPrimaryKey(String measureCode);

    int updateByExampleSelective(@Param("record") TMeasureUnits record, @Param("example") TMeasureUnitsExample example);

    int updateByExample(@Param("record") TMeasureUnits record, @Param("example") TMeasureUnitsExample example);

    int updateByPrimaryKeySelective(TMeasureUnits record);

    int updateByPrimaryKey(TMeasureUnits record);

    void insertBatch(List<TMeasureUnits> recordLst);
}