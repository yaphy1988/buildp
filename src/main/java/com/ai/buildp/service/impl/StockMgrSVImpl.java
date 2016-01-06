package com.ai.buildp.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.buildp.dao.mapper.TStockInfoMapper;
import com.ai.buildp.dao.mapper.TStockOptMapper;
import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TStockInfo;
import com.ai.buildp.dao.model.TStockInfoExample;
import com.ai.buildp.dao.model.TStockOpt;
import com.ai.buildp.dao.model.TStockOptExample;
import com.ai.buildp.dao.model.TStockOptExample.Criteria;
import com.ai.buildp.service.interfaces.IStockMgrSV;

@Service
public class StockMgrSVImpl implements IStockMgrSV {

    @Autowired
    TStockInfoMapper tStockInfoMapper;
    
    @Autowired
    TStockOptMapper tStockOptMapper;
    
    public void getStockInfo(PageInfo<TStockInfo> pageInfo,TStockInfo param) {
        List<TStockInfo> infos = null;
        
        //条件参数
        Date startDate = null;
        Date endDate = null;
        int minAvailCount = 0;
        int maxAvailCount = 0;
        
        
//        if(param.getStartDate() != null){
//            startDate = param.getStartDate();
//        }
        
//        if(param.getEndDate() != null){
//            endDate = param.getEndDate();
//        }
        
//        if(param.getMinAvailCount() != null){
//        	minAvailCount = param.getMinAvailCount();
//        }
        
//        if(param.getMaxAvailCount() != null){
//        	maxAvailCount = param.getMaxAvailCount();
//        }
        
        try {
            TStockInfoExample ex = new TStockInfoExample();
            com.ai.buildp.dao.model.TStockInfoExample.Criteria criteria = ex.createCriteria();
            
            ex.setOrderByClause("create_time desc");
            ex.setLimitClauseCount(pageInfo.getPageSize());
            ex.setLimitClauseStart((pageInfo.getPageIndex()-1)*pageInfo.getPageSize());
            
            
            if(startDate != null){
                criteria.andCreateTimeGreaterThanOrEqualTo(startDate);
            }
            
            if(endDate != null){
            	criteria.andCreateTimeLessThanOrEqualTo(endDate);
            }
            
            if(param.getSupplierId() != null){
            	criteria.andSupplierIdEqualTo(param.getSupplierId());
            }
            
//            if(minAvailCount != null){
//                criteria.andAvailCountGreaterThanOrEqualTo(minAvailCount);
//            }
            
//            if(maxAvailCount != null){
//            	criteria.andAvailCountLessThanOrEqualTo(maxAvailCount);
//            }
            
            if(param.getCreateUser() != null ){
            	criteria.andCreateUserLike("%" + param.getCreateUser() + "%");
            }
            
            infos = tStockInfoMapper.selectByExample(ex);
            int count = tStockInfoMapper.countByExample(ex);
            pageInfo.setResult(infos);
            pageInfo.setTotal(count);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getStockOptHis(PageInfo<TStockOpt> pageInfo,TStockOpt param) {
        List<TStockOpt> infos = null;
        
        //条件参数
        Date startDate = null;
        Date endDate = null;
        
//        if(param.getStartDate() != null){
//            startDate = param.getStartDate();
//        }
//        
//        if(param.getEndDate() != null){
//            endDate = param.getEndDate();
//        }
        
        try {
            TStockOptExample ex = new TStockOptExample();
            Criteria criteria = ex.createCriteria();
            
            ex.setOrderByClause("create_time desc");
            ex.setLimitClauseCount(pageInfo.getPageSize());
            ex.setLimitClauseStart((pageInfo.getPageIndex()-1)*pageInfo.getPageSize());
            
            if(startDate != null && endDate != null){
                criteria.andCreateTimeBetween(startDate, endDate);
            }
            
            if(param.getCreateStaff() != null){
                criteria.andCreateStaffLike("%"+param.getCreateStaff() + "%");
            }
            
            
            infos = tStockOptMapper.selectByExample(ex);
            int count = tStockOptMapper.countByExample(ex);
            pageInfo.setResult(infos);
            pageInfo.setTotal(count);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

	public boolean stockInOpt(TStockOpt record) throws Exception{
		TStockInfo newStockInfo = new TStockInfo();
		TStockInfo oldStockInfo = null;
		//如果用户名为空，则跳过
		if(record.getCreateStaff().isEmpty()){
			return false;
		}
		//如果库存没有该材料，则添加;
		//有则更新库存数量
		
//			if((oldStockInfo = tStockInfoMapper.selectByMaterialIdAndSupplierId(record.getMaterialId(), 
//					record.getSupplierId())) == null){
//				newStockInfo.setMaterialId(record.getMaterialId());
//				newStockInfo.setSupplierId(record.getSupplierId());
//				newStockInfo.setCount(record.getCount());
//				newStockInfo.setAvailCount(record.getCount());
//				newStockInfo.setCreateUser(record.getCreateStaff());
//				tStockInfoMapper.insert(newStockInfo);
//				//获取新库存信息的stockId
//				Long newStockId = tStockInfoMapper.selectByMaterialIdAndSupplierId(record.getMaterialId(), 
//					record.getSupplierId()).getStockId();
//				record.setStockId(newStockId);
//			}else{
//				//根据stockId获取TStockInfo对象
//				Long stockId = oldStockInfo.getStockId();
//				TStockInfo stockInfo = tStockInfoMapper.selectByPrimaryKey(stockId);
//				//增加库存数量并更新
//				Long count = record.getCount();
//				stockInfo.setCount(stockInfo.getCount()+count);
//				stockInfo.setAvailCount(stockInfo.getAvailCount()+count);
//				stockInfo.setUpdateUser(record.getCreateStaff());
//				tStockInfoMapper.updateByPrimaryKey(stockInfo);
//				
//				record.setStockId(stockId);
//			}
//			
			//记录入库操作
			tStockOptMapper.insert(record);
		
		return true;
	}

	public boolean stockOutOpt(TStockOpt record) throws Exception{
		TStockInfo newStockInfo = new TStockInfo();
		TStockInfo oldStockInfo = null;
		//如果用户名为空，则跳过
		if(record.getCreateStaff().isEmpty()){
			return false;
		}
		//如果库存没有该材料，则跳出;
		//有则更新库存数量
//		if((oldStockInfo = tStockInfoMapper.selectByMaterialIdAndSupplierId(record.getMaterialId(), 
//				record.getSupplierId())) == null){
//			return false;
//		}else{
//			//根据stockId获取TStockInfo对象
//			Long stockId = oldStockInfo.getStockId();
//			TStockInfo stockInfo = tStockInfoMapper.selectByPrimaryKey(stockId);
//			
//			Long count = record.getCount();
//			//如果出库数量大于可用库存数量，则跳出
//			if(count > stockInfo.getAvailCount()){
//				return false;
//			}
//			//增加库存数量并更新
//			
//			stockInfo.setCount(stockInfo.getCount()-count);
//			stockInfo.setAvailCount(stockInfo.getAvailCount()-count);
//			stockInfo.setUpdateUser(record.getCreateStaff());
//			tStockInfoMapper.updateByPrimaryKey(stockInfo);
//			
//			record.setStockId(stockId);
//			//记录入库操作
//			
//			tStockOptMapper.insert(record);
//		}
		return true;
	}

	public TStockInfo getTStockInfoByMaterialIdAndSupplierId(Long materialId,
			Long supplierId) {
		TStockInfo stockInfo = null;
//		tStockInfoMapper.selectByMaterialIdAndSupplierId(materialId, supplierId);
		return stockInfo;
	}
	
	
}
