package com.witontek.ehospital2.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	private static WebDriver driver;
	
	private static Log log=new Log(DriverUtils.class);
	
	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", Global.CHROME_DRIVER_PATH);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		log.info("打开谷歌浏览器");
		
		return driver;
	}

}
