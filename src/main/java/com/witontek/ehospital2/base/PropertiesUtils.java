package com.witontek.ehospital2.base;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
	
	private String propertiesName;
	private Properties properties;
	
	private Log log=new Log(PropertiesUtils.class);
	
	public PropertiesUtils(String propertiesName) {
		this.propertiesName=propertiesName;
	}
	
	public String propertiesValue(String key){
		InputStream in=PropertiesUtils.class.getClassLoader().getResourceAsStream("com/witontek/ehospital2/config/"+propertiesName+".properties");
		
//		String classpath = Thread.currentThread().getContextClassLoader().getResource("/").getPath();  
//		String fileName = classpath + "config.properties";
//		Properties p = new Properties();
//		FileInputStream fis = new FileInputStream(fileName);
//		p.load(fis);
		
//		InputStream in = lnew BufferedInputStream(new FileInputStream(commConfigFilePath));   

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
			log.error("读取"+propertiesName+".properties文件中的"+key+"失败");
		}
		try {
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
