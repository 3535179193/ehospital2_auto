package com.witontek.ehospital2.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {
	
	protected static WebDriver driver;
	
	private static Log log=new Log(BrowserUtils.class);
	
	public BrowserUtils(WebDriver driver){
		BrowserUtils.driver=driver;
	}
	
	public void getUrl(String url){
		driver.get(url);
		log.info("打开网址:"+url);
	}
	
	public static void quit(){
		driver.quit();
		log.info("退出浏览器");
	}
	
	public void close(){
		driver.close();
		log.info("关闭当前页面");
	}
	
	public static void sleep(int i){
		try {
			Thread.sleep(i*1000);
			log.info("等待"+i+"秒");
		} catch (Exception e) {
			log.error("线程休眠出错");
			e.printStackTrace();
		}
	}
	
	public static void wait(int i){
		try {
			Thread.sleep(i*100);
		} catch (Exception e) {
			log.error("线程休眠出错");
			e.printStackTrace();
		}
	}
	
	public String screenShot(){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		String time=dateFormat.format(Calendar.getInstance().getTime()).toString();
		
		File screenShotFile =null;
		File img=null;
		try{
			screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			img=new File(System.getProperty("user.dir")+"/screenShot/"+time+"-picture.png");
			FileUtils.copyFile(screenShotFile, img);
			log.info("截图成功");
		} catch (Exception e) {
			log.error("截图失败");
			e.printStackTrace();
		}
		return img.getAbsolutePath();
		
	}
	
	public void goBack(){
		driver.navigate().back();
		log.info("回退");
	}
	
	public void refresh(){
		driver.navigate().refresh();
		log.info("刷新");
	}

	public void forward(){
		driver.navigate().forward();
		log.info("前进");
	}
}
