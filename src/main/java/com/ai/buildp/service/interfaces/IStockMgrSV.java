package com.ai.buildp.service.interfaces;

import org.springframework.transaction.annotation.Transactional;

import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TStockInfo;
import com.ai.buildp.dao.model.TStockOpt;

public interface IStockMgrSV {
    
    /**
     * 获取库存信息 
     * @return
     * Date: 2015年3月9日 <br>
     * @author xuanjian
     */
    public void getStockInfo(PageInfo<TStockInfo> pageInfo,TStockInfo param);
    
    
    /**
     * 获取库存操作历史信息 
     * @return
     * Date: 2015年3月9日 <br>
     * @author xuanjian
     */
    public void getStockOptHis(PageInfo<TStockOpt> pageInfo,TStockOpt param);
    
    /**
     * 入库操作
     * @param record
     * @return
     * @author huangguozhu
     */
    @Transactional
    public boolean stockInOpt(TStockOpt record) throws Exception;
    /**
     * 出库操作
     * @param record
     * @return
     * @author huangguozhu
     */
    @Transactional
    public boolean stockOutOpt(TStockOpt record) throws Exception;
    
    /**
     * 根据材料编号与供应商编号获取材料信息对象
     * @param materialId
     * @param supplierId
     * @return
     * Date: 2015年3月18日 <br>
     * @author huangguozhu
     */
    public TStockInfo getTStockInfoByMaterialIdAndSupplierId(Long materialId, Long supplierId);
}
