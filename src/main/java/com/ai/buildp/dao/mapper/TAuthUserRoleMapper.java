package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TAuthUserRole;
import com.ai.buildp.dao.model.TAuthUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthUserRoleMapper {
    int countByExample(TAuthUserRoleExample example);

    int deleteByExample(TAuthUserRoleExample example);

    int insert(TAuthUserRole record);

    int insertSelective(TAuthUserRole record);

    List<TAuthUserRole> selectByExample(TAuthUserRoleExample example);

    int updateByExampleSelective(@Param("record") TAuthUserRole record, @Param("example") TAuthUserRoleExample example);

    int updateByExample(@Param("record") TAuthUserRole record, @Param("example") TAuthUserRoleExample example);

    void insertBatch(List<TAuthUserRole> recordLst);
}