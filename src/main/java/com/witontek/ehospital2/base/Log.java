package com.witontek.ehospital2.base;

import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Log {
	
	private Class<?> clazz;
	private Logger log;
	
	public Log(Class<?> clazz){
		this.clazz=clazz;
		try {
			Configurator.initialize(null,new ConfigurationSource(new FileInputStream(System.getProperty("user.dir")+
					"/src/main/java/com/witontek/ehospital2/config/log4j2.xml")));
		} catch (Exception e) {
			log.error("读取配置文件log4j2.xml失败,报错信息："+e.getMessage());
		}
		this.log=LogManager.getLogger();
		System.setProperty("org.uncommons.reportng.escape-output","false");
	}
	
	public void fatal(String content){
		log.fatal(DateUtils.getSystemTime()+" [FATAL] "+clazz.getCanonicalName()+":"+content);
		Reporter.log("<span style='color:#ff0000'>"+DateUtils.getSystemTime()+" [FATAL] "+clazz.getCanonicalName()+":"+content+"</span><br />");
	}
	
	public void error(String content){
		log.error(DateUtils.getSystemTime()+" [ERROR] "+clazz.getCanonicalName()+":"+content);
		Reporter.log("<span style='color:red'>"+DateUtils.getSystemTime()+" [ERROR] "+clazz.getCanonicalName()+":"+content+"</span><br />");

	}
	
	public void errorShot(String content,WebDriver driver){
		log.error(DateUtils.getSystemTime()+" [ERROR] "+clazz.getCanonicalName()+":"+content);
		Reporter.log("<span style='color:red'>"+DateUtils.getSystemTime()+" [ERROR] "+clazz.getCanonicalName()+":"+content+"</span><br />");
		BrowserUtils browser=new BrowserUtils(driver);
		String path=browser.screenShot();
		int width=500;
        Reporter.log("<a target='_blank' href='" + path + "'><img width='" + width + "' src='" + path + "' /></a>");
        Reporter.log("<span style='color:blue'>【图片地址】"+path+"</span><br />");
        Assert.assertEquals(1,2,"故意断言失败，并中断执行此用例");
	}
	
	public void warn(String content){
		log.warn(DateUtils.getSystemTime()+" [WARN] "+clazz.getCanonicalName()+":"+content);
		Reporter.log("<span style='color:orange'>"+DateUtils.getSystemTime()+" [WARN] "+clazz.getCanonicalName()+":"+content+"</span><br />");
	}
	
	public void info(String content){
		log.info(DateUtils.getSystemTime()+" [INFO] "+clazz.getCanonicalName()+":"+content);
		Reporter.log("<span style='color:blue'>"+DateUtils.getSystemTime()+" [INFO] "+clazz.getCanonicalName()+":"+content+"</span><br />");
	}
	
	public void debug(String content){
		log.debug(DateUtils.getSystemTime()+" [DEBUG] "+clazz.getCanonicalName()+":"+content);
		Reporter.log(DateUtils.getSystemTime()+" [DEBUG] "+clazz.getCanonicalName()+":"+content+"<br />");
	}
	
	public void trace(String content){
		log.trace(DateUtils.getSystemTime()+" [TRACE] "+clazz.getCanonicalName()+":"+content);
		Reporter.log(DateUtils.getSystemTime()+" [TRACE] "+clazz.getCanonicalName()+":"+content+"<br />");
	}
	
}
