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
import com.witontek.ehospital2.business.AppraiseItem;
import com.witontek.ehospital2.business.AppraiseManage;
import com.witontek.ehospital2.page.LoginPage;

public class AppraiseItemTest {

	private WebDriver driver;


	//新增文本评价项
	@Test(dataProvider = "insertAppraiseItem",enabled=true)
	public void insertAppraiseItem(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseItem appraiseItem = new AppraiseItem(driver);
		AssertUtils.assertActualEqualExpect(appraiseItem.insertAppraiseItem(testData.get("appraiseItemName")),expectedResult, caseName);
	}

	@DataProvider(name = "insertAppraiseItem")
	public Iterator<Object[]> insertAppraiseItem() {
		return ExcelUtils.readExcel("AppraiseItem/insertAppraiseItem");
	}
	
//	//就医评价管理-搜索评价问卷
//	@Test(dataProvider = "searchAppraise",dependsOnMethods={"insertAppraise"},enabled=true)
//	public void searchAppraise(String caseName, String expectedResult,Map<String, String> testData) {
//		AppraiseManage appraiseManage = new AppraiseManage(driver);
//		AssertUtils.assertActualContainExpect(appraiseManage.searchAppraise(testData.get("appraiseName")),expectedResult, caseName);
//	}
//
//	@DataProvider(name = "searchAppraise")
//	public Iterator<Object[]> searchAppraise() {
//		return ExcelUtils.readExcel("appraiseManage/searchAppraise");
//	}
//
//	//就医评价管理-编辑评价问卷
//	@Test(dataProvider = "updateAppraise",dependsOnMethods={"searchAppraise"},enabled=false)
//	public void updateAppraise(String caseName, String expectedResult,Map<String, String> testData) {
//		AppraiseManage appraiseManage = new AppraiseManage(driver);
//		AssertUtils.assertActualEqualExpect(appraiseManage.updateAppraise(testData.get("appraiseName"),testData.get("appraiseDesc")),expectedResult, caseName);
//	}
//
//	@DataProvider(name = "updateAppraise")
//	public Iterator<Object[]> updateAppraise() {
//		return ExcelUtils.readExcel("appraiseManage/updateAppraise");
//	}
	
	//就医评价管理-删除评价问卷
	@Test(dependsOnMethods={"insertAppraiseItem"},enabled=true)
	public void deleteAppraiseItem() {
		AppraiseItem appraiseItem = new AppraiseItem(driver);
		appraiseItem.deleteAppraiseItem();
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
