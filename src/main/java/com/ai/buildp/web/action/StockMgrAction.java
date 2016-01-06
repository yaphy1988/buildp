package com.ai.buildp.web.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.time.DateUtils;
import org.codehaus.groovy.runtime.powerassert.Value;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TStockInfo;
import com.ai.buildp.dao.model.TStockOpt;
import com.ai.buildp.dao.model.TSupplierInfo;
import com.ai.buildp.service.interfaces.IStockMgrSV;

/**
 * Description: 库存信息、入库、出库<br>
 * Date: 2015年3月9日 <br>
 * @category 库存
 * @author xuanjian
 */

@Controller
@RequestMapping(value = "stock")
public class StockMgrAction {
    
    @Autowired
    IStockMgrSV iStockMgrSV;
    
    /**
     * 转发到出入库操作页面
     * @return
     */
    @RequestMapping(value = "option")
    public String toStockIn(){
    	return "stock/stockoption";
    }
    
    
    
    @RequestMapping(value = "manager")
    public String getStockInfo(HttpServletRequest request, HttpServletResponse response){
    	//日期组件 初始日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        Date today = new Date();
        String sday = sdf.format(today);
        String eday = sdf.format(DateUtils.addMonths(today, -2));//两个月之前
        request.setAttribute("start_day", eday);
        request.setAttribute("end_day", sday);
        return "stock/stockinfomgr";
    }
    
    @RequestMapping(value = "stockpageinfo")
    public String getStockPageInfo(HttpServletRequest request, HttpServletResponse response){
        int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
        int pageSize = Integer.valueOf(request.getParameter("pageSize"));
        
        TStockInfo param = new TStockInfo();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        Long supplierId = null;
        Long minAvailCount = null;
        Long maxAvailCount = null;
        String createStaff = null;
        
        try {
        	if(!request.getParameter("startDate").isEmpty()){
        		startDate = sdf.parse(request.getParameter("startDate"));
        	}
        	if(!request.getParameter("endDate").isEmpty()){
        		endDate = sdf.parse(request.getParameter("endDate"));
        	}
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
        if(!request.getParameter("supplierId").isEmpty()){
            supplierId = Long.parseLong(request.getParameter("supplierId"));
        }
        
        if(!request.getParameter("minAvailCount").isEmpty()){
        	minAvailCount = Long.parseLong(request.getParameter("minAvailCount"));
        }
        
        if(!request.getParameter("maxAvailCount").isEmpty()){
        	maxAvailCount = Long.parseLong(request.getParameter("maxAvailCount"));
        }
        
        if(!request.getParameter("createStaff").isEmpty()){
            createStaff = request.getParameter("createStaff");
        }
        
//        param.setStartDate(startDate);
//        param.setEndDate(endDate);
        param.setSupplierId(supplierId);
//        param.setMinAvailCount(minAvailCount);
//        param.setMaxAvailCount(maxAvailCount);
        param.setCreateUser(createStaff);
        
        PageInfo<TStockInfo> pageInfo = new PageInfo<TStockInfo>();
        pageInfo.setPageIndex(pageIndex);
        pageInfo.setPageSize(pageSize);
        iStockMgrSV.getStockInfo(pageInfo, param);
        request.setAttribute("pageInfo", pageInfo);
        return "stock/infolist";
    }
    
    /**
     * 库存操作历史查询
     * @param request
     * @param response
     * @return
     * Date: 2015年3月11日 <br>
     * @author xuanjian
     */
    @RequestMapping(value = "opthis")
    public String getStockOptHis(HttpServletRequest request, HttpServletResponse response){
        
        //日期组件 初始日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        Date today = new Date();
        String sday = sdf.format(today);
        String eday = sdf.format(DateUtils.addMonths(today, -2));//两个月之前
        request.setAttribute("start_day", eday);
        request.setAttribute("end_day", sday);
        
        return "stock/stockopthis";
    }
    
    @RequestMapping(value = "stockoptpageinfo")
    public String getStockOptHistPageInfo(HttpServletRequest request, HttpServletResponse response){
        int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
        int pageSize = Integer.valueOf(request.getParameter("pageSize"));
        
        TStockOpt param = new TStockOpt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        String optType = null;
        String createStaff = null;
        
        try {
            startDate = sdf.parse(request.getParameter("startDate"));
            endDate = DateUtils.addDays(sdf.parse(request.getParameter("endDate")), 1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        if(!request.getParameter("optType").isEmpty()){
            optType = request.getParameter("optType");
        }
        
        if(!request.getParameter("createStaff").isEmpty()){
            createStaff = request.getParameter("createStaff");
        }
        
//        param.setStartDate(startDate);
//        param.setEndDate(endDate);
        param.setOptType(optType);
        param.setCreateStaff(createStaff);
        
        PageInfo<TStockOpt> pageInfo = new PageInfo<TStockOpt>();
        pageInfo.setPageIndex(pageIndex);
        pageInfo.setPageSize(pageSize);
        iStockMgrSV.getStockOptHis(pageInfo,param);
        request.setAttribute("pageInfo", pageInfo);
        return "stock/opthislist";
    }
    
    /**
     * 入库操作
     */
    @RequestMapping(value="stockInOpt", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String stockInfOpt(TStockOpt record){
    	boolean flag = false;
		try {
			flag = iStockMgrSV.stockInOpt(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
    	return jsonStr;
    }
    /**
     * 出库操作
     */
    @RequestMapping(value="stockOutOpt", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String stockOutfOpt(TStockOpt record){
    	boolean flag = false;
    	try{
    		flag =  iStockMgrSV.stockOutOpt(record);
    	}catch(Exception e){
    		e.printStackTrace();
    		throw new RuntimeException(e);
    	}
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
    	return jsonStr;
    }
    
    /**
     * 根据材料编号与供应商编号获取可用库存量
     * @param request
     * @return
     */
    @RequestMapping(value = "getStockAvailCount", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getStockAvailCount(HttpServletRequest request){
    	Long materialId = null;
    	Long supplierId = null;
    	TStockInfo stockInfo = null;
    	if(!"".equals(request.getParameter("materialId"))){
    		materialId = Long.valueOf(request.getParameter("materialId"));
	    	if(!"".equals(request.getParameter("supplierId"))){
	    		supplierId = Long.valueOf(request.getParameter("supplierId"));
	        	stockInfo = iStockMgrSV.getTStockInfoByMaterialIdAndSupplierId(materialId, supplierId);
	    	}
    	}
    	int availCount = 0;
    	if(stockInfo != null){
    		availCount = stockInfo.getAvailCount();
    	}
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("availCount", availCount);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
}
