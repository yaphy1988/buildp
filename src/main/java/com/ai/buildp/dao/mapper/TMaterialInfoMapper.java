package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TMaterialInfo;
import com.ai.buildp.dao.model.TMaterialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMaterialInfoMapper {
    int countByExample(TMaterialInfoExample example);

    int deleteByExample(TMaterialInfoExample example);

    int deleteByPrimaryKey(Long materialId);

    int insert(TMaterialInfo record);

    int insertSelective(TMaterialInfo record);

    List<TMaterialInfo> selectByExample(TMaterialInfoExample example);

    TMaterialInfo selectByPrimaryKey(Long materialId);

    int updateByExampleSelective(@Param("record") TMaterialInfo record, @Param("example") TMaterialInfoExample example);

    int updateByExample(@Param("record") TMaterialInfo record, @Param("example") TMaterialInfoExample example);

    int updateByPrimaryKeySelective(TMaterialInfo record);

    int updateByPrimaryKey(TMaterialInfo record);

    void insertBatch(List<TMaterialInfo> recordLst);
}