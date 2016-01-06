package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TAuthPermission;
import com.ai.buildp.dao.model.TAuthPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthPermissionMapper {
    int countByExample(TAuthPermissionExample example);

    int deleteByExample(TAuthPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(TAuthPermission record);

    int insertSelective(TAuthPermission record);

    List<TAuthPermission> selectByExample(TAuthPermissionExample example);

    TAuthPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") TAuthPermission record, @Param("example") TAuthPermissionExample example);

    int updateByExample(@Param("record") TAuthPermission record, @Param("example") TAuthPermissionExample example);

    int updateByPrimaryKeySelective(TAuthPermission record);

    int updateByPrimaryKey(TAuthPermission record);

    void insertBatch(List<TAuthPermission> recordLst);
}