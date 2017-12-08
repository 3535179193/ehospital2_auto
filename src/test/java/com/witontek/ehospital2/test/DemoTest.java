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
//
//        String downloadFilepath = "D:\\java";
//        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//        chromePrefs.put("profile.default_content_settings.popups", 0);
//        chromePrefs.put("download.default_directory", downloadFilepath);
//        ChromeOptions options = new ChromeOptions();
//        HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
//        options.setExperimentalOption("prefs",chromePrefs);
//        options.addArguments("--test-type");
//        DesiredCapabilities cap = DesiredCapabilities.chrome();
//        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
//        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        cap.setCapability(ChromeOptions.CAPABILITY, options);
//        
//        WebDriver driver = new ChromeDriver(cap);
//
//        driver.get("https://www.baidu.com");
//        driver.findElement(By.id("kw")).click();
//        driver.findElement(By.id("su")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("普通下载")).click();
//	}
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
////	}
//	
//	
//	
////	private WebDriver driver;
////
////	@Test
////	public void beforeMethod() {
////		String downloadPath=System.getProperty("usr.dir")+"/downloadFilePath";
////		
////		
////		
////		
////		LoginPage login = new LoginPage(driver);
////		login.login("http://web.witontek.com/ehospital4web/web/refund.html?!#!/", "qdcyrmyyadmin", "admin");
////		driver.findElement(By.xpath("//button[@ng-click='$ctrl.exportPaymentInfo()']")).click();
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
