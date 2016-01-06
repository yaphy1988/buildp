package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TSupplierQuotation;
import com.ai.buildp.dao.model.TSupplierQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSupplierQuotationMapper {
    int countByExample(TSupplierQuotationExample example);

    int deleteByExample(TSupplierQuotationExample example);

    int deleteByPrimaryKey(Long quotationId);

    int insert(TSupplierQuotation record);

    int insertSelective(TSupplierQuotation record);

    List<TSupplierQuotation> selectByExample(TSupplierQuotationExample example);

    TSupplierQuotation selectByPrimaryKey(Long quotationId);

    int updateByExampleSelective(@Param("record") TSupplierQuotation record, @Param("example") TSupplierQuotationExample example);

    int updateByExample(@Param("record") TSupplierQuotation record, @Param("example") TSupplierQuotationExample example);

    int updateByPrimaryKeySelective(TSupplierQuotation record);

    int updateByPrimaryKey(TSupplierQuotation record);

    void insertBatch(List<TSupplierQuotation> recordLst);
}