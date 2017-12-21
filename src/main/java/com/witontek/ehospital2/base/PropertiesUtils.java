package com.witontek.ehospital2.base;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
	
	private String propertiesName;
	private Properties properties;
	
	private Log log=new Log(PropertiesUtils.class);
	
	public PropertiesUtils(String propertiesName) {
		this.propertiesName=propertiesName;
	}
	
	/**
	 * 读取properties文件中的值
	 * @param key
	 * @return
	 */
	public String propertiesValue(String key){
//		InputStream in=PropertiesUtils.class.getClassLoader().getResourceAsStream("com/witontek/ehospital2/config/"+propertiesName+".properties");
		
		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/witontek/ehospital2/config/"+propertiesName+".properties"));
		} catch (Exception e) {
			log.error("读取配置文件"+propertiesName+".properties失败,报错信息："+e.getMessage());
		}   

		properties=new Properties();
		try {
			properties.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String value=null;
		try{
		value=properties.getProperty(key);
		}catch(Exception e){
			log.error("读取"+propertiesName+".properties文件中的"+key+"失败,报错信息："+e.getMessage());
		}
		try {
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
