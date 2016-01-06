package com.ai.buildp.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TMaterialInfo;
import com.ai.buildp.dao.model.TMaterialType;
import com.ai.buildp.model.view.TMaterialInfoView;
import com.ai.buildp.model.view.TMaterialTypeView;
import com.ai.buildp.service.interfaces.IMaterialMgrSV;

/**
 * Description: 材料管理 前面请求类<br>
 * Date: 2015年2月27日 <br>
 * @category 材料管理
 * @author xuanjian
 */
@Controller
@RequestMapping(value = "material")
public class MaterialMgrAction {
	
	private static Logger logger = LogManager.getLogger(MaterialMgrAction.class);
    
    @Autowired
    IMaterialMgrSV iMaterialMgrSV;
    
    @RequestMapping(value = "types")
    public String getAllMaterialType(HttpServletRequest request, HttpServletResponse response){
        List<TMaterialType> list = iMaterialMgrSV.getMaterialType();
        request.setAttribute("types", list);
        logger.info("转发到材料信息管理页面，/jsp/material/materialinfomgr.jsp");
        return "/material/materialtypemgr";
    }
    
    @RequestMapping(value = "infos")
    public String getAllMaterialInfo(HttpServletRequest request, HttpServletResponse response){
        List<TMaterialInfo> list = iMaterialMgrSV.getAllMaterialInfo();
        request.setAttribute("infos", list);
        logger.info("转发向到材料信息管理页面，/jsp/material/materialinfomgr.jsp");
        return "/material/materialinfomgr";
    }
    
    @RequestMapping(value = "getPageTypes")
    public String getPageTypes(HttpServletRequest request, HttpServletResponse response){
    	int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		
		TMaterialTypeView param = new TMaterialTypeView();
		if(!request.getParameter("typeId").isEmpty()){
			Long typeId = Long.valueOf(request.getParameter("typeId"));
			param.setTypeId(typeId);
		}
		if(!request.getParameter("typeName").isEmpty()){
			String typeName = request.getParameter("typeName");
			param.setTypeName(typeName);
		}
		if(!request.getParameter("parentTypeName").isEmpty()){
			String parentTypeName = request.getParameter("parentTypeName");
			param.setParentTypeName(parentTypeName);
		}
		if(!request.getParameter("endNode").isEmpty()){
			String endNode = request.getParameter("endNode");
			param.setEndNode(endNode);
		}
		
		PageInfo<TMaterialTypeView> pageInfo = new PageInfo<TMaterialTypeView>();
		pageInfo.setPageIndex(pageIndex);
		pageInfo.setPageSize(pageSize);
		iMaterialMgrSV.getTypesPerPage(pageInfo,param);
		System.out.println("============="+pageInfo.getResult());
		request.setAttribute("pageInfo", pageInfo);   //分页信息
		//返回分页查询得到的结果页面
        return "/material/typelist";
    }
    
    @RequestMapping(value = "getPageInfos")
    public String getPageInfos(HttpServletRequest request, HttpServletResponse response){
    	int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		
		TMaterialInfoView param = new TMaterialInfoView();
		if(!request.getParameter("materialName").isEmpty()){
			String materialName = request.getParameter("materialName");
			param.setMaterialName(materialName);
		}
		if(!request.getParameter("typeName").isEmpty()){
			String typeName = request.getParameter("typeName");
			param.setTypeName(typeName);
		}
		if(!request.getParameter("standard").isEmpty()){
			String standard = request.getParameter("standard");
			param.setStandard(standard);
		}
		if(!request.getParameter("status").isEmpty()){
			String status = request.getParameter("status");
			param.setStatus(status);
		}
		
		PageInfo<TMaterialInfoView> pageInfo = new PageInfo<TMaterialInfoView>();
		pageInfo.setPageIndex(pageIndex);
		pageInfo.setPageSize(pageSize);
		iMaterialMgrSV.getInfosPerPage(pageInfo, param);
		System.out.println("============="+pageInfo.getResult());
		request.setAttribute("pageInfo", pageInfo);   //分页信息
		//返回分页查询得到的结果页面
        return "/material/infolist";
    }

    
    @RequestMapping(value = "deleteMaterialType",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteMaterialType(Long typeId){
    	boolean flag = iMaterialMgrSV.deleteMaterialTypeById(typeId);
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "deleteMaterialInfo",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteMaterialInfo(Long materialId){
    	boolean flag = iMaterialMgrSV.deleteMaterialInfoById(materialId);
    	JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "toAddMaterialType")
    public String toAddMaterialType(){
    	logger.info("跳转到材料类型添加页面，/jsp/material/materialtypeadd.jsp");
    	return "material/materialtypeadd";
    }
    
    @RequestMapping(value = "addMaterialType",produces = "text/html;charset=UTF-8")
    @ResponseBody
	public String addMaterialType(TMaterialType record) {
		boolean flag = iMaterialMgrSV.addMaterialType(record);
		JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
	}
    
    @RequestMapping(value = "toAddMaterialInfo")
    public String toAddMaterialInfo(){
    	logger.info("跳转到材料信息添加页面，/jsp/material/materialinfoadd.jsp");
    	return "material/materialinfoadd";
    }
    
    @RequestMapping(value = "addMaterialInfo",produces = "text/html;charset=UTF-8")
    @ResponseBody
	public String addMaterialInfo(TMaterialInfo record) {
		boolean flag = iMaterialMgrSV.addMaterialInfo(record);
		JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
	}
    
    /**
     * 返回材料类型id与name列
     * Date: 2015年3月6日
     * @author huangguozhu
     * @return
     */
    @RequestMapping(value = "getMaterialTypeIdsAndNames",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getMaterialTypeNames(){
    	List<Long> ids = new ArrayList<Long>();
    	List<String> names = new ArrayList<String>();
    	List<TMaterialType> types = iMaterialMgrSV.getMaterialType();
    	for(TMaterialType type:types){
    		Long typeId = type.getTypeId();
    		ids.add(typeId);
    		String typeName = type.getTypeName();
    		names.add(typeName);
    	}
    	JSONObject jsonArray = new JSONObject();
    	jsonArray.put("ids", ids);
    	jsonArray.put("names", names);
    	System.out.println(names);
    	String jsonStr = jsonArray.toString();
    	return jsonStr;
    }
    
    /**
     * 返回材料类型id与name列，除了是叶子结点的
     * Date: 2015年3月9日
     * @author huangguozhu
     * @return
     */
    @RequestMapping(value = "getMaterialTypeIdsAndNamesExceptEndNode",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getMaterialTypeNamesExceptEndNode(){
    	List<Long> ids = new ArrayList<Long>();
    	List<String> names = new ArrayList<String>();
    	List<TMaterialType> types = iMaterialMgrSV.getMaterialType();
    	for(TMaterialType type:types){
    		//如果type是叶子结点，则跳过
    		if("1".equals(type.getEndNode())){
    			continue;
    		}

			Long typeId = type.getTypeId();
    		ids.add(typeId);
    		String typeName;
			typeName = type.getTypeName();
			names.add(typeName);
    		
    	}
    	JSONObject jsonArray = new JSONObject();
    	jsonArray.put("ids", ids);
    	jsonArray.put("names", names);
    	String jsonStr = jsonArray.toString();
    	return jsonStr;
    }
    
    /**
     * 返回材料信息id，name与standard列
     * Date: 2015年3月6日
     * @author huangguozhu
     * @return
     */
    @RequestMapping(value = "getMaterialIdsAndNamesAndStandards",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getMaterialIdsAndNamesAndStandards(){
    	List<Long> ids = new ArrayList<Long>();
    	List<String> names = new ArrayList<String>();
    	List<String> standard = new ArrayList<String>();
    	List<TMaterialInfo> infos = iMaterialMgrSV.getAllMaterialInfo();
    	System.out.println(standard);
    	for(TMaterialInfo info:infos){
    		ids.add(info.getMaterialId());
    		if(info.getStandard() == null){
    			names.add(info.getMaterialName());
    		}else{
    			names.add(info.getStandard()+info.getMaterialName());
    		}
    	}
    	JSONObject jsonArray = new JSONObject();
    	jsonArray.put("ids", ids);
    	jsonArray.put("names", names);
    	System.out.println(names);
    	String jsonStr = jsonArray.toString();
    	return jsonStr;
    }
    
    @RequestMapping(value = "queryByMaterialId",produces = "text/html;charset=UTF-8")
    public String queryByMaterialId(HttpServletRequest request, HttpServletResponse response){
    	Long id = Long.parseLong(request.getParameter("materialId"));
        TMaterialInfo info = iMaterialMgrSV.getInfoByMaterialId(id);
        System.out.println(info);
        logger.info("编辑材料信息：" + info.toString());
        request.setAttribute("info", info);
        return "material/infoedit";
    }
    
    @RequestMapping(value = "saveEditInfo",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String saveEditInfo(TMaterialInfo info){
    	info.setUpdateTime(new Date());
    	boolean flag = iMaterialMgrSV.updateMaterilInfo(info);
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "queryByTypeId",produces = "text/html;charset=UTF-8")
    public String queryByTypeId(HttpServletRequest request, HttpServletResponse response){
    	Long id = Long.parseLong(request.getParameter("typeId"));
        TMaterialType type = iMaterialMgrSV.getTypeByTypeId(id);
        logger.info("编辑材料类型：" + type.toString());
        request.setAttribute("type", type);
        return "material/typeedit";
    }
    
    @RequestMapping(value = "saveEditType",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String saveEditType(TMaterialType type){
    	type.setUpdateTime(new Date());
    	boolean flag = iMaterialMgrSV.updateMaterilType(type);
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
    
    @RequestMapping(value = "isExistTypeName", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String isExistTypeName(String typeName){
    	boolean flag = iMaterialMgrSV.isExistTypeName(typeName);
        JSONObject jsonArray = new JSONObject();
        jsonArray.put("flag", flag);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }
}
