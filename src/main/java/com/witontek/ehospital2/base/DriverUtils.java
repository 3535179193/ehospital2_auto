package com.witontek.ehospital2.base;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {
	
	private static WebDriver driver;
	
	private static Log log=new Log(DriverUtils.class);
	
	/*
	 * 1.获取ChromeDriver
	 * 2.设置谷歌的默认下载路径，且禁止弹出下载窗口
	 * 3.开启谷歌浏览器的无头模式	PS：开启谷歌浏览器的模式后，（1）不能下载文件（2）图片尺寸不对；所以一般不开启
	 * 4.处理不信任证书的情况		PS:由于暂时没有遇见过，先不开启
	 */
	public static WebDriver getChromeDriver(){
		String downloadPath = System.getProperty("user.dir")+"\\downloadPath";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);		//设置下载窗口：0为禁止弹出下载窗口
        chromePrefs.put("download.default_directory", downloadPath);		//设置默认下载路径
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs);
//		options.addArguments("test-type");									//ignore certificate errors
//		options.addArguments("--headless");									//开启谷歌浏览器的无头模式：使谷歌浏览器在后台运行
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);			//处理SSL Certificate Error
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Global.CHROME_DRIVER_PATH);
		driver=new ChromeDriver(cap);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.info("打开谷歌浏览器");
		
		return driver;
	}
	

}
