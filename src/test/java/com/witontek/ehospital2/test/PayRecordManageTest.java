package com.witontek.ehospital2.test;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.witontek.ehospital2.base.AssertUtils;
import com.witontek.ehospital2.base.BrowserUtils;
import com.witontek.ehospital2.base.DriverUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.business.AppraiseManage;
import com.witontek.ehospital2.business.PayRecordManage;
import com.witontek.ehospital2.page.LoginPage;

public class PayRecordManageTest {

	private WebDriver driver;

	// 缴费记录管理-导出缴费信息
	@Test(dataProvider = "downloadPayRecords", enabled = true)
	public void downloadPayRecords(String caseName, String expectedResult, Map<String, String> testData) {
		PayRecordManage payRecordManage = new PayRecordManage(driver);
		AssertUtils.assertActualEqualExpect(
				payRecordManage.downloadPayRecords(testData.get("execlFileName"), testData.get("line"),
						testData.get("column")), expectedResult, caseName);
	}

	@DataProvider(name = "downloadPayRecords")
	public Iterator<Object[]> downloadPayRecords() {
		return ExcelUtils.readTestDataExcel("payRecordManage", "downloadPayRecords");
	}
	
	// 缴费记录管理
	@Test(enabled = true)
	public void clickLast() {
		PayRecordManage payRecordManage = new PayRecordManage(driver);
		payRecordManage.clickLast();
	}

	@BeforeMethod
	public void beforeMethod() {
		LoginPage login = new LoginPage(driver);
		login.login(Global.USER_NAME, Global.PASSWORD, Global.VALIDATION);
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
