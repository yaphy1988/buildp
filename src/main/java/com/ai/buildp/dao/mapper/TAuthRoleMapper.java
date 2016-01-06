package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TAuthRole;
import com.ai.buildp.dao.model.TAuthRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthRoleMapper {
    int countByExample(TAuthRoleExample example);

    int deleteByExample(TAuthRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(TAuthRole record);

    int insertSelective(TAuthRole record);

    List<TAuthRole> selectByExample(TAuthRoleExample example);

    TAuthRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") TAuthRole record, @Param("example") TAuthRoleExample example);

    int updateByExample(@Param("record") TAuthRole record, @Param("example") TAuthRoleExample example);

    int updateByPrimaryKeySelective(TAuthRole record);

    int updateByPrimaryKey(TAuthRole record);

    void insertBatch(List<TAuthRole> recordLst);
}