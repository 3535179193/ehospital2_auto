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
import com.witontek.ehospital2.business.DepartmentMange;
import com.witontek.ehospital2.page.LoginPage;

public class DepartmentManageTest {

	private WebDriver driver;

	//科室管理-搜索一级科室
	@Test(dataProvider = "searchDepartmentCategoryByName",enabled=false)
	public void searchDepartmentCategoryByName(String caseName, String expectedResult,Map<String, String> testData) {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		AssertUtils.assertActualContainExpect(departmentMange.searchDepartmentCategoryByName(testData.get("categoryName")),expectedResult, caseName);
	}

	@DataProvider(name = "searchDepartmentCategoryByName")
	public Iterator<Object[]> searchDepartmentCategoryByName() {
		return ExcelUtils.readExcel("searchDepartmentCategoryByName");
	}
	
	//科室管理-下移一级科室
	@Test(enabled=false)
	public void moveDownDepartmentCategory() {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		departmentMange.moveDownDepartmentCategory();
	}
	
	//科室管理-上移一级科室
	@Test(dependsOnMethods={"moveDownDepartmentCategory"},enabled=false)
	public void moveUpDepartmentCategory() {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		departmentMange.moveUpDepartmentCategory();
	}
	
	//科室管理-新增一级科室
	@Test(dataProvider = "insertDepartmentsCategory",enabled=true)
	public void insertDepartmentsCategory(String caseName, String expectedResult,Map<String, String> testData) {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		AssertUtils.assertActualEqualExpect(departmentMange.insertDepartmentsCategory(testData.get("categoryName"),testData.get("categoryCode")),expectedResult, caseName);
	}

	@DataProvider(name = "insertDepartmentsCategory")
	public Iterator<Object[]> insertDepartmentsCategory() {
		return ExcelUtils.readExcel("insertDepartmentsCategory");
	}
	
	//科室管理-置顶一级科室
	@Test(dependsOnMethods={"insertDepartmentsCategory"},enabled=true)
	public void moveTopDepartmentCategory() {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		departmentMange.moveTopDepartmentCategory();
	}
	
	//科室管理-编辑一级科室
	@Test(dataProvider = "updateDepartmentCategory",dependsOnMethods={"moveTopDepartmentCategory"},enabled=true)
	public void updateDepartmentCategory(String caseName, String expectedResult,Map<String, String> testData) {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		AssertUtils.assertActualEqualExpect(departmentMange.updateDepartmentCategory(testData.get("categoryName"),testData.get("categoryCode")),expectedResult, caseName);
	}

	@DataProvider(name = "updateDepartmentCategory")
	public Iterator<Object[]> updateDepartmentCategory() {
		return ExcelUtils.readExcel("updateDepartmentCategory");
	}
	
	//科室管理-删除一级科室
	@Test(dependsOnMethods={"updateDepartmentCategory"},enabled=true)
	public void deleteDepartmentCategory() {
		DepartmentMange departmentMange = new DepartmentMange(driver);
		departmentMange.deleteDepartmentCategory();
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
