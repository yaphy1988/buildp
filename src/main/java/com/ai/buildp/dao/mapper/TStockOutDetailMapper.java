package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TStockOutDetail;
import com.ai.buildp.dao.model.TStockOutDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStockOutDetailMapper {
    int countByExample(TStockOutDetailExample example);

    int deleteByExample(TStockOutDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(TStockOutDetail record);

    int insertSelective(TStockOutDetail record);

    List<TStockOutDetail> selectByExample(TStockOutDetailExample example);

    TStockOutDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") TStockOutDetail record, @Param("example") TStockOutDetailExample example);

    int updateByExample(@Param("record") TStockOutDetail record, @Param("example") TStockOutDetailExample example);

    int updateByPrimaryKeySelective(TStockOutDetail record);

    int updateByPrimaryKey(TStockOutDetail record);

    void insertBatch(List<TStockOutDetail> recordLst);
}