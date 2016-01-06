package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TStockInDetail;
import com.ai.buildp.dao.model.TStockInDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStockInDetailMapper {
    int countByExample(TStockInDetailExample example);

    int deleteByExample(TStockInDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(TStockInDetail record);

    int insertSelective(TStockInDetail record);

    List<TStockInDetail> selectByExample(TStockInDetailExample example);

    TStockInDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") TStockInDetail record, @Param("example") TStockInDetailExample example);

    int updateByExample(@Param("record") TStockInDetail record, @Param("example") TStockInDetailExample example);

    int updateByPrimaryKeySelective(TStockInDetail record);

    int updateByPrimaryKey(TStockInDetail record);

    void insertBatch(List<TStockInDetail> recordLst);
}