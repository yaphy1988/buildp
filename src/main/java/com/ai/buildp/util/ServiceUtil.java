package com.ai.buildp.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ServiceUtil {
	//服务名称  需要以钟摆形式展示健康度
	private static List<String> rates = new ArrayList<String>();
	
	public synchronized static void  reloadRates(){
		InputStreamReader read = null;
		BufferedReader br = null;
		List<String> temp = new ArrayList<String>();
		try {
			File file = new File(ServiceUtil.class
					.getResource("/common/serviceRate.txt").toURI());
//			fr = new FileReader(file);// 建立FileReader对象，并实例化为fr
			read = new InputStreamReader (new FileInputStream(file),"UTF-8");
			br = new BufferedReader(read);// 建立BufferedReader对象，并实例化为br
			String line = br.readLine();// 从文件读取一行字符串
			while (line != null) {
				if(!"".equals(line)){
					temp.add(line);
				}
				line = br.readLine();// 从文件中继续读取一行数据
			}
			System.out.println("123456");
			rates.clear();
			rates.addAll(temp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();// 关闭BufferedReader对象
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (read != null)
					read.close();// 关闭文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<String> getRates() {
		if(rates==null)
			rates = new ArrayList<String>();
		if(rates.size()==0)
			reloadRates();
		return rates;
	}

	
	

}
