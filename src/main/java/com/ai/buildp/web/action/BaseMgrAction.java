package com.ai.buildp.web.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.buildp.dao.model.TBaseRegion;
import com.ai.buildp.service.interfaces.IBaseMgrSV;

@Controller
@RequestMapping(value = "/base")
public class BaseMgrAction extends BaseAction {

	private static Logger logger = LogManager.getLogger(BaseMgrAction.class);
	
	@Autowired
	IBaseMgrSV iBaseMgrSV;
	
	@RequestMapping(value = "/getregion")
	public void getRegion(HttpServletRequest request, HttpServletResponse response) {
		List<TBaseRegion> regions = new ArrayList<TBaseRegion>();
		String regionCode = request.getParameter("regionCode");
		if ((regionCode == null)||("0".equals(regionCode.substring(0, 1)))) {
			regionCode = "000000";
		}
		regions = iBaseMgrSV.getRegionByParent(regionCode);
		
		JSONObject jsonObject = new JSONObject();
		JSONArray jsArray = new JSONArray(regions);
		jsonObject.put("aData", jsArray);
		
		responseSuccess(response, "success", jsonObject);
	}
	
	@RequestMapping(value = "/getRegionName", produces = "text/html;charset=UTF-8")
    @ResponseBody
	public String getRegionName(String regionCode){
		String regionName =iBaseMgrSV.getNameByCode(regionCode);
		JSONObject jsonArray = new JSONObject();
        jsonArray.put("regionName", regionName);
        String jsonStr = jsonArray.toString();
    	return jsonStr;
	}
}
