package com.ai.buildp.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class Constant {
	public	static String passwdConstant ;
	public	static String nagiosHome ;
	public	static String nagiosClientHome ;
	public	static String nrpeCfgLocation ;
	public	static String nagiosUser ;
	public	static String nagiosPwd ;
	public	static String smsExecLocation ;
	public	static String ip ;
	public	static int port ;
	static{
		Properties properties = new Properties();
		InputStream fis;
		try {
			
			//String path =Thread.currentThread().getContextClassLoader().getResource("/").getPath()+"common/constant.properties";
			String path = CommonUtils.getRootPath();
			path+="WEB-INF/classes/common/constant.properties";
			fis = new  FileInputStream(path);
			properties.load(fis);
			fis.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
         passwdConstant = properties.getProperty("passwordConstant");
         nagiosHome = properties.getProperty("nagiosHome");
         nagiosClientHome = properties.getProperty("nagiosClientHome");
         nrpeCfgLocation = properties.getProperty("nrpeCfgLocation");
         nagiosUser = properties.getProperty("nagiosUser");
         nagiosPwd = properties.getProperty("nagiosPwd");
         smsExecLocation = properties.getProperty("smsExecLocation");
         ip = properties.getProperty("ip");
         port = Integer.parseInt(properties.getProperty("port"));
           
	}
}
