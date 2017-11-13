package com.witontek.ehospital2.test;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.witontek.ehospital2.base.AssertUtils;
import com.witontek.ehospital2.base.BrowserUtils;
import com.witontek.ehospital2.base.DriverUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.business.DoctorManage;
import com.witontek.ehospital2.business.HospitalInformation;
import com.witontek.ehospital2.business.SubscriptionManage;
import com.witontek.ehospital2.page.LoginPage;

public class SubscriptionManageTest {

	private WebDriver driver;

	@Test(dataProvider = "selectSubscriptionDate")
	public void selectSubscriptionDate(String caseName,String expectedResult,Map<String,String> testData) {
		SubscriptionManage subscriptionManage=new SubscriptionManage(driver);
//		AssertUtils.assertStringContains(subscriptionManage.selectSubscriptionDate(Global.USER_NAME, testData.get("password"), testData.get("validation"));
		
		subscriptionManage.selectSubscriptionDate();

	}

	@DataProvider(name="selectSubscriptionDate")
	  public Iterator<Object[]> selectSubscriptionDate(){
		return ExcelUtils.readExcel("selectSubscriptionDate");
	  }

	@BeforeMethod
	public void beforeMethod() {
		LoginPage login=new LoginPage(driver);
		login.login(Global.USER_NAME, "admin", "1111");
	}
	  
	@BeforeClass
	public void beforeClass() {
		driver = DriverUtils.getChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		BrowserUtils.sleep(3);
		BrowserUtils.quit();
	}

}
