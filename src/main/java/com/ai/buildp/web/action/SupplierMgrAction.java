package com.ai.buildp.web.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.dao.model.TAuthUser;
import com.ai.buildp.dao.model.TMaterialInfo;
import com.ai.buildp.dao.model.TSupplierInfo;
import com.ai.buildp.service.interfaces.ISupplierInfoSV;

@Controller
@RequestMapping(value = "/supplier")
public class SupplierMgrAction {

	private static Logger logger = LogManager.getLogger(SupplierMgrAction.class);
	
    @Autowired
    ISupplierInfoSV iSupplierInfoSV;
    
    @RequestMapping(value = "info")
    public String supplierInfo(HttpServletRequest request, HttpServletResponse response){
        List<TSupplierInfo> infos = iSupplierInfoSV.getSuppliers();
        request.setAttribute("infos", infos);
        return "supplier/infomanage";
    }
    
    @RequestMapping(value = "deleteSupplier",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteSuppliper(Long supplierId, Model map,HttpServletRequest request, HttpServletResponse response){
    	boolean flag = iSupplierInfoSV.deleteSupplierById(supplierId);
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "toAddSupplier")
    public String toAddSuppliper(){
    	System.out.println("feseger");
    	logger.info("转发到供应商添加页面，/jsp/supplier/supplieradd.jsp");
    	return "supplier/supplieradd";
    }
    
    @RequestMapping(value = "addSupplier",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addSuppliper(TSupplierInfo record,Model map,HttpServletRequest request, HttpServletResponse response){
    	boolean flag = iSupplierInfoSV.addSupplier(record);
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "getSupplierIdsAndNames", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getSupplierIdsAndNames(){
        List<Long> ids = new ArrayList<Long>();
        List<String> names = new ArrayList<String>();
        List<TSupplierInfo> suppliers = iSupplierInfoSV.getSuppliers();
        for (TSupplierInfo tSupplierInfo : suppliers) {
            ids.add(tSupplierInfo.getSupplierId());
            names.add(tSupplierInfo.getSupplierName());
        }
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("ids", ids);
        jsonArray.put("names", names);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "isExistSupplierName", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String isExistSupplierName(String supplierName){
        boolean flag = iSupplierInfoSV.isExistSupplierName(supplierName);
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "queryBysupplierId")
    public String queryBysupplierId(HttpServletRequest request, HttpServletResponse response){
        Long id = Long.parseLong(request.getParameter("supplierId"));
        TSupplierInfo info = iSupplierInfoSV.queryInfoById(id);
        logger.info("编辑供应商信息：" + info.toString());
        request.setAttribute("info", info);
        return "supplier/infoedit";
    }
    
    @RequestMapping(value = "saveEditInfo", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String saveEditInfo(TSupplierInfo record,Model model,HttpServletRequest request, HttpServletResponse response){
        boolean flag = iSupplierInfoSV.saveEditInfo(record);
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "common/applicationContext.xml" });
        String[] names = context.getBeanDefinitionNames();
        System.out.print("=========Beans:");
        for (String string : names)
            System.out.print(string + ",");
        System.out.println("=============");
    }
}
