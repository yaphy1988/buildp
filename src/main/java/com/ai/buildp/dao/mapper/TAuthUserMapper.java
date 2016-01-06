package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TAuthUser;
import com.ai.buildp.dao.model.TAuthUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthUserMapper {
    int countByExample(TAuthUserExample example);

    int deleteByExample(TAuthUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TAuthUser record);

    int insertSelective(TAuthUser record);

    List<TAuthUser> selectByExample(TAuthUserExample example);

    TAuthUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TAuthUser record, @Param("example") TAuthUserExample example);

    int updateByExample(@Param("record") TAuthUser record, @Param("example") TAuthUserExample example);

    int updateByPrimaryKeySelective(TAuthUser record);

    int updateByPrimaryKey(TAuthUser record);

    void insertBatch(List<TAuthUser> recordLst);
}