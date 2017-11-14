package com.witontek.ehospital2.test;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.witontek.ehospital2.base.AssertUtils;
import com.witontek.ehospital2.base.BrowserUtils;
import com.witontek.ehospital2.base.DriverUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.business.Login;
import com.witontek.ehospital2.page.MainPage;

public class LoginTest {
	
	public WebDriver driver;

	@Test(dataProvider = "loginSuccess")
	public void loginSuccess(String caseName,String expectedResult,Map<String,String> testData) {
		Login login=new Login(driver);
		MainPage mainPage=login.loginSuccess(Global.USER_NAME, testData.get("password"), testData.get("validation"));
		AssertUtils.assertActualEqualExpect(mainPage.getUserName(), expectedResult, caseName);
	}

	@DataProvider(name="loginSuccess")
	  public Iterator<Object[]> loginSuccess(){
		return ExcelUtils.readExcel("login/loginSuccess");
	  }

	@BeforeClass
	public void beforeClass() {
		driver=DriverUtils.getChromeDriver();
		
	}

	@AfterClass
	public void afterClass() {
		BrowserUtils.sleep(3);
		BrowserUtils.quit();
	}

}
