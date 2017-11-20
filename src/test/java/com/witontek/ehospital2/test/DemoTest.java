//package com.witontek.ehospital2.test;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Sleeper;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.witontek.ehospital2.base.BrowserUtils;
//import com.witontek.ehospital2.base.DateUtils;
//import com.witontek.ehospital2.base.DriverUtils;
//import com.witontek.ehospital2.base.Global;
//import com.witontek.ehospital2.page.LoginPage;
//
//public class DemoTest {
//	
//public static void main(String[] args) {
//	System.out.println(DateUtils.getDates(20));
//}
//	
////	private WebDriver driver;
////
////	@Test
////	public void beforeMethod() {
////		LoginPage login = new LoginPage(driver);
////		login.login(Global.USER_NAME, "admin", "1111");
////		driver.findElement(By.xpath("//span[contains(.,'业务信息管理')]")).click();
////		BrowserUtils.sleep(1);
////		driver.findElement(By.xpath("//li[@class='submenu slide-show']/div[1]/span")).click();
////		BrowserUtils.sleep(3);
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
////		BrowserUtils.sleep(5);
////		BrowserUtils.quit();
////	}
//
//}
