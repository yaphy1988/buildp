package com.ai.buildp.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.buildp.dao.model.TProjInfo;
import com.ai.buildp.dao.model.TProjInfoExample;

public interface TProjInfoMapper {
    int countByExample(TProjInfoExample example);

    int deleteByExample(TProjInfoExample example);

    int deleteByPrimaryKey(Long projId);

    int insert(TProjInfo record);

    int insertSelective(TProjInfo record);

    List<TProjInfo> selectByExample(TProjInfoExample example);

    TProjInfo selectByPrimaryKey(Long projId);

    int updateByExampleSelective(@Param("record") TProjInfo record, @Param("example") TProjInfoExample example);

    int updateByExample(@Param("record") TProjInfo record, @Param("example") TProjInfoExample example);

    int updateByPrimaryKeySelective(TProjInfo record);

    int updateByPrimaryKey(TProjInfo record);

    void insertBatch(List<TProjInfo> recordLst);
}