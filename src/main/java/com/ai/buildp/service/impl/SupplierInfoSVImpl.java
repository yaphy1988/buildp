package com.ai.buildp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.buildp.dao.mapper.TSupplierInfoMapper;
import com.ai.buildp.dao.model.TSupplierInfo;
import com.ai.buildp.dao.model.TSupplierInfoExample;
import com.ai.buildp.service.interfaces.ISupplierInfoSV;

@Service
public class SupplierInfoSVImpl implements ISupplierInfoSV {

    @Autowired
    private TSupplierInfoMapper tSupplierInfoMapper;
    
    public List<TSupplierInfo> getSuppliers() {
        List<TSupplierInfo>  infos = new ArrayList<TSupplierInfo>();
        try {
            TSupplierInfoExample example = new TSupplierInfoExample();
            infos = tSupplierInfoMapper.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return infos;
    }

    public static void main(String[] args) {
        
    }

	public boolean deleteSupplierById(Long supplierId) {
	    int i = 0;
		try{
			i = tSupplierInfoMapper.deleteByPrimaryKey(supplierId);
		}catch(Exception e){
			e.printStackTrace();
		}
		return i>0?true:false;
	}

	public boolean addSupplier(TSupplierInfo record) {
		int count = 0;
		try{
			count = tSupplierInfoMapper.insert(record);
			if(count != 0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public boolean isExistSupplierName(String supplierName) {
		boolean flag = false;
		try{
			int count = 0;
//			tSupplierInfoMapper.countBySupplierName(supplierName);
			if(count == 1){
				flag = true;
			}
			if(count == 0){
				flag = false;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

    public TSupplierInfo queryInfoById(Long supplierId) {
        return tSupplierInfoMapper.selectByPrimaryKey(supplierId);
    }

    public boolean saveEditInfo(TSupplierInfo record) {
        boolean flag = true;
        try {
            tSupplierInfoMapper.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
