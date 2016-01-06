package com.ai.buildp.dao.mapper;

import com.ai.buildp.dao.model.TSupplierInfo;
import com.ai.buildp.dao.model.TSupplierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSupplierInfoMapper {
    int countByExample(TSupplierInfoExample example);

    int deleteByExample(TSupplierInfoExample example);

    int deleteByPrimaryKey(Long supplierId);

    int insert(TSupplierInfo record);

    int insertSelective(TSupplierInfo record);

    List<TSupplierInfo> selectByExample(TSupplierInfoExample example);

    TSupplierInfo selectByPrimaryKey(Long supplierId);

    int updateByExampleSelective(@Param("record") TSupplierInfo record, @Param("example") TSupplierInfoExample example);

    int updateByExample(@Param("record") TSupplierInfo record, @Param("example") TSupplierInfoExample example);

    int updateByPrimaryKeySelective(TSupplierInfo record);

    int updateByPrimaryKey(TSupplierInfo record);

    void insertBatch(List<TSupplierInfo> recordLst);
}