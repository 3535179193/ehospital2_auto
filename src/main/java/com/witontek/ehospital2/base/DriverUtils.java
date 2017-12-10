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
	
	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Global.CHROME_DRIVER_PATH);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.info("打开谷歌浏览器");
		
		return driver;
	}

	public static WebDriver getChromeDriver(DesiredCapabilities cap){
		String downloadPath = System.getProperty("user.dir")+"\\downloadPath";
        
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
        options.setExperimentalOption("prefs",chromePrefs);
        options.addArguments("--test-type");
        cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Global.CHROME_DRIVER_PATH);
		driver=new ChromeDriver(cap);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.info("打开谷歌浏览器");
		
		return driver;
	}
}
