package com.witontek.ehospital2.test;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
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
import com.witontek.ehospital2.page.LoginPage;

public class DoctorManageTest {

	private WebDriver driver;

	@Test(dataProvider = "searchDocManDoctor")
	public void searchDocManDoctor(String caseName, String expectedResult,Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualContainExpect(doctorManage
				.searchDocManDoctor(testData.get("searchCondition")),
				expectedResult, caseName);
	}

	@DataProvider(name = "searchDocManDoctor")
	public Iterator<Object[]> searchDocManDoctor() {
		return ExcelUtils.readExcel("searchDocManDoctor");
	}

	@BeforeMethod
	public void beforeMethod() {
		LoginPage login = new LoginPage(driver);
		login.login(Global.USER_NAME, "admin", "1111");
	}

	@BeforeTest
	public void beforeTest() {
		driver = DriverUtils.getChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		BrowserUtils.sleep(3);
		BrowserUtils.quit();
	}

}
