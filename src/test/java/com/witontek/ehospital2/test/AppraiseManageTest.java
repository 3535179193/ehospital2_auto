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
import com.witontek.ehospital2.page.LoginPage;

public class AppraiseManageTest {

	private WebDriver driver;


	//就医评价管理-新增评价问卷
	@Test(dataProvider = "insertAppraise",enabled=true)
	public void insertAppraise(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseManage appraiseManage = new AppraiseManage(driver);
		AssertUtils.assertActualEqualExpect(appraiseManage.insertAppraise(testData.get("appraiseName"),testData.get("appraiseDesc")),expectedResult, caseName);
	}

	@DataProvider(name = "insertAppraise")
	public Iterator<Object[]> insertAppraise() {
		return ExcelUtils.readExcel("appraiseManage/insertAppraise");
	}
	
	//就医评价管理-搜索评价问卷
	@Test(dataProvider = "searchAppraise",dependsOnMethods={"insertAppraise"},enabled=true)
	public void searchAppraise(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseManage appraiseManage = new AppraiseManage(driver);
		AssertUtils.assertActualContainExpect(appraiseManage.searchAppraise(testData.get("appraiseName")),expectedResult, caseName);
	}

	@DataProvider(name = "searchAppraise")
	public Iterator<Object[]> searchAppraise() {
		return ExcelUtils.readExcel("appraiseManage/searchAppraise");
	}

	//就医评价管理-编辑评价问卷
	@Test(dataProvider = "updateAppraise",dependsOnMethods={"searchAppraise"},enabled=false)
	public void updateAppraise(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseManage appraiseManage = new AppraiseManage(driver);
		AssertUtils.assertActualEqualExpect(appraiseManage.updateAppraise(testData.get("appraiseName"),testData.get("appraiseDesc")),expectedResult, caseName);
	}

	@DataProvider(name = "updateAppraise")
	public Iterator<Object[]> updateAppraise() {
		return ExcelUtils.readExcel("appraiseManage/updateAppraise");
	}
	
	//就医评价管理-删除评价问卷
	@Test(dependsOnMethods={"searchAppraise"},enabled=true)
	public void deleteAppraise() {
		AppraiseManage appraiseManage = new AppraiseManage(driver);
		appraiseManage.deleteAppraise();
	}

	@BeforeMethod
	public void beforeMethod() {
		LoginPage login = new LoginPage(driver);
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
