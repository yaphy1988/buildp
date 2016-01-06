package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TMaterialType;
import com.ai.buildp.dao.model.TMaterialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMaterialTypeMapper {
    int countByExample(TMaterialTypeExample example);

    int deleteByExample(TMaterialTypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(TMaterialType record);

    int insertSelective(TMaterialType record);

    List<TMaterialType> selectByExample(TMaterialTypeExample example);

    TMaterialType selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") TMaterialType record, @Param("example") TMaterialTypeExample example);

    int updateByExample(@Param("record") TMaterialType record, @Param("example") TMaterialTypeExample example);

    int updateByPrimaryKeySelective(TMaterialType record);

    int updateByPrimaryKey(TMaterialType record);

    void insertBatch(List<TMaterialType> recordLst);
}