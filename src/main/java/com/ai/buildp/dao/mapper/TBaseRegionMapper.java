package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TBaseRegion;
import com.ai.buildp.dao.model.TBaseRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseRegionMapper {
    int countByExample(TBaseRegionExample example);

    int deleteByExample(TBaseRegionExample example);

    int deleteByPrimaryKey(String regionCode);

    int insert(TBaseRegion record);

    int insertSelective(TBaseRegion record);

    List<TBaseRegion> selectByExample(TBaseRegionExample example);

    TBaseRegion selectByPrimaryKey(String regionCode);

    int updateByExampleSelective(@Param("record") TBaseRegion record, @Param("example") TBaseRegionExample example);

    int updateByExample(@Param("record") TBaseRegion record, @Param("example") TBaseRegionExample example);

    int updateByPrimaryKeySelective(TBaseRegion record);

    int updateByPrimaryKey(TBaseRegion record);

    void insertBatch(List<TBaseRegion> recordLst);
}