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
		return ExcelUtils.readExcel("appraiseItem","insertAppraiseItem");
	}
	
	//删除文本评价项
	@Test(dependsOnMethods={"insertAppraiseItem"},enabled=true)
	public void deleteTextAppraiseItem() {
		AppraiseItem appraiseItem = new AppraiseItem(driver);
		appraiseItem.deleteTextAppraiseItem();
	}
	
	//从现有评价项中添加文本评价项
	@Test(dataProvider = "insertFromAppraiseItem",dependsOnMethods={"insertAppraiseItem"},enabled=true)
	public void insertFromAppraiseItem(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseItem appraiseItem = new AppraiseItem(driver);
		AssertUtils.assertActualEqualExpect(appraiseItem.insertFromAppraiseItem(),expectedResult, caseName);
	}

	@DataProvider(name = "insertFromAppraiseItem")
	public Iterator<Object[]> insertFromAppraiseItem() {
		return ExcelUtils.readExcel("appraiseItem","insertFromAppraiseItem");
	}

	//搜索现有文本评价项
	@Test(dataProvider = "searchFromAppraiseItem",dependsOnMethods={"insertFromAppraiseItem"},enabled=true)
	public void searchFromAppraiseItem(String caseName, String expectedResult,Map<String, String> testData) {
		AppraiseItem appraiseItem = new AppraiseItem(driver);
		AssertUtils.assertActualEqualExpect(appraiseItem.searchFromAppraiseItem(testData.get("appraiseItemName")),expectedResult, caseName);
	}

	@DataProvider(name = "searchFromAppraiseItem")
	public Iterator<Object[]> searchFromAppraiseItem() {
		return ExcelUtils.readExcel("appraiseItem","searchFromAppraiseItem");
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
