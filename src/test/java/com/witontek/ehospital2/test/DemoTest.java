package com.witontek.ehospital2.test;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.XMLUtils;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;
import com.witontek.ehospital2.base.BrowserUtils;
import com.witontek.ehospital2.base.DateUtils;
import com.witontek.ehospital2.base.DriverUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.FileUtils;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;
import com.witontek.ehospital2.page.LoginPage;

public class DemoTest {
	
	public static void main(String[] args){

//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String string="2017-12-12 16:50:01";
//		String string2="2017-12-12 16:50:00";
//		Date date=null;
//		Date date2=null;
//		try {
//			date=simpleDateFormat.parse(string);
//			date2=simpleDateFormat.parse(string2);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		long timeStamp=date.getTime();
//		long timeStamp2=date2.getTime();
//		System.out.println(timeStamp);
//		System.out.println(timeStamp2);
//	}
		int i=266%26;
		System.out.println(i);
		
	}
}
//	    Connection c = null;
//	    Statement stmt = null;
//	    try {
//				Class.forName(locator.getDriver());
//				c = DriverManager.getConnection(locator.getUrl(),locator.getUsername(), locator.getPassword());
//				c.setAutoCommit(false);
//				stmt = c.createStatement();
//				ResultSet rs = stmt.executeQuery("SELECT *FROM doctors WHERE hospital_id = 'sqsfcyyadmin' and doctor_name like '李%';");
//				while (rs.next()) {
//					String doctor_name = rs.getString("doctor_code");
//					System.out.println(doctor_name);
//				}
//				rs.close();
//				stmt.close();
//				c.close();
//	    } catch ( Exception e ) {
//	      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//	      System.exit(0);
//	    }
		
		
//	}
	
	
	
//	private WebDriver driver;
//
//	@Test
//	public void beforeMethod() {
//		String downloadPath=System.getProperty("usr.dir")+"/downloadFilePath";
//		
//		
//		
//		
//		LoginPage login = new LoginPage(driver);
//		login.login("http://web.witontek.com/ehospital4web/web/refund.html?!#!/", "qdcyrmyyadmin", "admin");
//		driver.findElement(By.xpath("//button[@ng-click='$ctrl.exportPaymentInfo()']")).click();
//		
//	
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//		driver = DriverUtils.getChromeDriver();
//	}
//
//	@AfterTest
//	public void afterTest() {
//		BrowserUtils.sleep(3);
//		BrowserUtils.quit();
//	}


