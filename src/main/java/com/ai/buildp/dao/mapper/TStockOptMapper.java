package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TStockOpt;
import com.ai.buildp.dao.model.TStockOptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStockOptMapper {
    int countByExample(TStockOptExample example);

    int deleteByExample(TStockOptExample example);

    int deleteByPrimaryKey(Long stockOptId);

    int insert(TStockOpt record);

    int insertSelective(TStockOpt record);

    List<TStockOpt> selectByExample(TStockOptExample example);

    TStockOpt selectByPrimaryKey(Long stockOptId);

    int updateByExampleSelective(@Param("record") TStockOpt record, @Param("example") TStockOptExample example);

    int updateByExample(@Param("record") TStockOpt record, @Param("example") TStockOptExample example);

    int updateByPrimaryKeySelective(TStockOpt record);

    int updateByPrimaryKey(TStockOpt record);

    void insertBatch(List<TStockOpt> recordLst);
}