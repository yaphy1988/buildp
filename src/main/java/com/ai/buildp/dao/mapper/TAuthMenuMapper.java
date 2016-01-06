package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TAuthMenu;
import com.ai.buildp.dao.model.TAuthMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthMenuMapper {
    int countByExample(TAuthMenuExample example);

    int deleteByExample(TAuthMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(TAuthMenu record);

    int insertSelective(TAuthMenu record);

    List<TAuthMenu> selectByExample(TAuthMenuExample example);

    TAuthMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") TAuthMenu record, @Param("example") TAuthMenuExample example);

    int updateByExample(@Param("record") TAuthMenu record, @Param("example") TAuthMenuExample example);

    int updateByPrimaryKeySelective(TAuthMenu record);

    int updateByPrimaryKey(TAuthMenu record);

    void insertBatch(List<TAuthMenu> recordLst);
}