package com.ai.buildp.service.interfaces;

import java.util.List;

import com.ai.buildp.dao.model.TSupplierInfo;

/**
 * Description: <br>
 * Date: 2015年2月27日 <br>
 * @category 类别
 * @author xuanjian
 */
public interface ISupplierInfoSV {
    
    
    /**
     * 获取供货商信息
     * @return
     * Date: 2015年2月27日 <br>
     * @author xuanjian
     */
    public List<TSupplierInfo> getSuppliers();
    
    /**
     * 删除供货商信息
     * @param supplierId
     * Date: 2015年3月5日<br>
     * @author huangguozhu
     */
    public boolean deleteSupplierById(Long supplierId);
    
    /**
     * 添加供货商信息
     * @param record
     * Date: 2015年3月5日<br>
     * @author huangguozhu
     * @return
     */
    public boolean addSupplier(TSupplierInfo record);
    
    /**
     * 判断供应商名称是否重复
     * @param supplierName
     * @return
     */
    public boolean isExistSupplierName(String supplierName);
    
    /**
     * 根据Id查询供应商信息
     * @param supplierId
     * @return
     * Date: 2015年3月26日 <br>
     * @author xuanjian
     */
    public TSupplierInfo queryInfoById(Long supplierId);
    
    /**
     * 保存编辑信息
     * @param record
     * @return
     * Date: 2015年3月26日 <br>
     * @author xuanjian
     */
    public boolean saveEditInfo(TSupplierInfo record);
}
