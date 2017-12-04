//package com.witontek.ehospital2.test;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Sleeper;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.reporters.XMLUtils;
//
//import com.witontek.ehospital2.base.BrowserUtils;
//import com.witontek.ehospital2.base.DateUtils;
//import com.witontek.ehospital2.base.DriverUtils;
//import com.witontek.ehospital2.base.Global;
//import com.witontek.ehospital2.base.Locator;
//import com.witontek.ehospital2.base.Log;
//import com.witontek.ehospital2.base.XmlUtils;
//import com.witontek.ehospital2.page.LoginPage;
//
//public class DemoTest {
//	
//	public static void main(String[] args){
//		System.out.println(XmlUtils.getDataBaseXml().get("ehospital2").getDriver());
//					
//
//		
//		
////	    Connection c = null;
////	    Statement stmt = null;
////	    try {
////				Class.forName(locator.getDriver());
////				c = DriverManager.getConnection(locator.getUrl(),locator.getUsername(), locator.getPassword());
////				c.setAutoCommit(false);
////				stmt = c.createStatement();
////				ResultSet rs = stmt.executeQuery("SELECT *FROM doctors WHERE hospital_id = 'sqsfcyyadmin' and doctor_name like '李%';");
////				while (rs.next()) {
////					String doctor_name = rs.getString("doctor_code");
////					System.out.println(doctor_name);
////				}
////				rs.close();
////				stmt.close();
////				c.close();
////	    } catch ( Exception e ) {
////	      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
////	      System.exit(0);
////	    }
//		
//		
//	}
//	
//	
//	
////	private WebDriver driver;
////
////	@Test
////	public void beforeMethod() {
////		LoginPage login = new LoginPage(driver);
////		login.login(Global.USER_NAME, Global.PASSWORD, Global.VALIDATION);
////		driver.findElement(By.xpath("//span[contains(.,'业务信息管理')]")).click();
////		BrowserUtils.sleep(1);
////		driver.findElement(By.xpath("//li[@class='submenu slide-show']/div[1]/span")).click();
////		BrowserUtils.sleep(1);
////		driver.findElement(By.xpath("//div[@class='department-management']/page/div/div[2]/a[4]/parent::div/a[4]")).click();
////		
////	
////	}
////
////	@BeforeTest
////	public void beforeTest() {
////		driver = DriverUtils.getChromeDriver();
////	}
////
////	@AfterTest
////	public void afterTest() {
////		BrowserUtils.sleep(3);
////		BrowserUtils.quit();
////	}
//
//}
