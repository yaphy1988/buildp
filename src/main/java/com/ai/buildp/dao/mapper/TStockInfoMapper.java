package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TStockInfo;
import com.ai.buildp.dao.model.TStockInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStockInfoMapper {
    int countByExample(TStockInfoExample example);

    int deleteByExample(TStockInfoExample example);

    int deleteByPrimaryKey(Long stockId);

    int insert(TStockInfo record);

    int insertSelective(TStockInfo record);

    List<TStockInfo> selectByExample(TStockInfoExample example);

    TStockInfo selectByPrimaryKey(Long stockId);

    int updateByExampleSelective(@Param("record") TStockInfo record, @Param("example") TStockInfoExample example);

    int updateByExample(@Param("record") TStockInfo record, @Param("example") TStockInfoExample example);

    int updateByPrimaryKeySelective(TStockInfo record);

    int updateByPrimaryKey(TStockInfo record);

    void insertBatch(List<TStockInfo> recordLst);
}