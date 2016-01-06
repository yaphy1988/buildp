package com.ai.buildp.util;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StringUtil {
	/**
	 * 文件名加后缀
	 * @param filePathString
	 * @param addString
	 * @return
	 */
	public String addForFilePath(String filePathString,String addString){
		int dotaIndex=filePathString.lastIndexOf(".");
		if(dotaIndex!=-1){
			return filePathString.substring(0,dotaIndex)+addString+filePathString.substring(dotaIndex);
		}else {
			return filePathString+addString;
		}		
	}
	public static String getCapitalize(String srcString,String addString){
		return addString+(srcString.charAt(0)+"").toUpperCase()+srcString.substring(1);
	}
	public static String getNoCapitalize(String srcString,String addString){
		return addString+(srcString.charAt(0)+"").toLowerCase()+srcString.substring(1);
	}
	public static String addWhenUpper(String srcString,String addString){
		StringBuilder returnStringBuilder=new StringBuilder();
		for (int i = 0; i < srcString.length(); i++) {
			char c=srcString.charAt(i);
			if (Character.isUpperCase(c)) {
				returnStringBuilder.append(addString+c);
			}else {
				returnStringBuilder.append(c);
			}
		}
		return returnStringBuilder.toString();
	}
	/**
	 * 获取一个字符串首字母大写的格式
	 * 例如：输入adminInfo将返回AdminInfo
	 * @param srcString
	 * @return
	 */
	public static String getFirstUp(String srcString){
		return (srcString.charAt(0)+"").toUpperCase()+srcString.substring(1);
	}
	/**
	 * 获取一个字符串首字母小写的格式
	 * 例如：输入AdminInfo将返回adminInfo
	 * @param srcString
	 * @return
	 */
	public static String getFirstLower(String srcString){
		return (srcString.charAt(0)+"").toLowerCase()+srcString.substring(1);
	}
	/**
	 * 判断一个字符串是否为空，如果为空返回true,否则返回false.
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		boolean flag = false;
		if(str==null || "".equals(str.trim())){
			flag = true;
		}
		return flag;
	}
	/**
	 * 该方法主要用于把key1=value&key2=value2字符串转化成map
	 * @param param
	 * @return
	 */
	public static Map<String, String> transformParam(String param){
		Map<String, String> paramMap=new HashMap<String, String>();
		String[] arr=param.split("&");
		for (int i=0;i<arr.length;i++) {
			String[] array=arr[i].split("=");
			if(array.length>0){
				if(array.length==2){
					paramMap.put(array[0], array[1]);
				}else{
					paramMap.put(array[0], "");
				}
			}
		}
		return paramMap;
	}
	
	/**
	 * 该方法主要用于把{"name":"xxx","value":"xxx"}字符串转化成map
	 * @param aoData
	 * @return
	 * @throws JSONException 
	 */
	public static Map<String, String> transformData(String aoData) throws JSONException{
		Map<String, String> paramMap=new HashMap<String, String>();
		JSONArray jsonArray=new JSONArray(aoData);
		for(int i=0;i<jsonArray.length();i++){
			JSONObject obj=jsonArray.getJSONObject(i);
			paramMap.put(obj.get("name").toString(), obj.get("value").toString());
		}
		return paramMap;
	}
	public static String trimOrNullException(String source){
		if (source==null) {
			throw new RuntimeException("trimOrNullException(null)");
		}else {
			return source.trim();
		}
	}
	
	public static boolean isNumber(String str) {
		if (str.length() > 0) {
			for(int i=str.length();--i>=0;){
				int chr=str.charAt(i);
				if(chr<48 || chr>57)
					return false;
			}
			return true;
		}
		return false;
	}
}
