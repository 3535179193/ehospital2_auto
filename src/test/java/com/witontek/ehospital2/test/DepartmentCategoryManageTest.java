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
import com.witontek.ehospital2.business.DepartmentCategoryManage;
import com.witontek.ehospital2.page.LoginPage;

public class DepartmentCategoryManageTest {

	private WebDriver driver;

	/**
	 * 科室管理-新增一级科室
	 */
	@Test(dataProvider = "insertCategory", enabled = true)
	public void insertCategory(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		AssertUtils.assertActualContainExpect(departmentCategoryManage.insertCategory(testData.get("categoryName"), testData.get("categoryCode")),
				expectedResult, caseName);
	}

	@DataProvider(name = "insertCategory")
	public Iterator<Object[]> insertCategory() {
		return ExcelUtils.readExcel("departmentCategoryManage","insertCategory");
	}

	/**
	 * 科室管理-置顶一级科室
	 */
	@Test(dataProvider = "moveTopCategory", dependsOnMethods = {"insertCategory"}, enabled = true)
	public void moveTopCategory(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		AssertUtils.assertActualContainExpect(departmentCategoryManage.moveTopCategory(), expectedResult, caseName);
	}

	@DataProvider(name = "moveTopCategory")
	public Iterator<Object[]> moveTopCategory() {
		return ExcelUtils.readExcel("departmentCategoryManage","moveTopCategory");
	}

	/**
	 * 科室管理-搜索一级科室
	 */
	@Test(dataProvider = "searchCategory", dependsOnMethods = {"insertCategory"}, enabled = true)
	public void searchCategory(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		AssertUtils.assertActualContainExpect(departmentCategoryManage.searchCategory(testData.get("categoryName")), expectedResult, caseName);
	}

	@DataProvider(name = "searchCategory")
	public Iterator<Object[]> searchCategory() {
		return ExcelUtils.readExcel("departmentCategoryManage","searchCategory");
	}

	/**
	 * 科室管理-编辑新增的一级科室
	 */
	@Test(dataProvider = "updateCategory", dependsOnMethods = {"moveTopCategory"}, enabled = true)
	public void updateCategory(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		AssertUtils.assertActualEqualExpect(departmentCategoryManage.updateCategory(testData.get("categoryName"), testData.get("categoryCode")),
				expectedResult, caseName);
	}

	@DataProvider(name = "updateCategory")
	public Iterator<Object[]> updateCategory() {
		return ExcelUtils.readExcel("departmentCategoryManage","updateCategory");
	}

	/**
	 * 科室管理-下移一级科室
	 */
	@Test(dependsOnMethods = {"moveTopCategory"}, enabled = true)
	public void moveDownCategory() {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		departmentCategoryManage.moveDownCategory();
	}
	
	/**
	 * 科室管理-上移一级科室
	 */
	@Test(dependsOnMethods = {"moveTopCategory"}, enabled = true)
	public void moveUpCategory() {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		departmentCategoryManage.moveUpCategory();
	}


	/**
	 * 科室管理-删除一级科室
	 */
	@Test(dataProvider = "deleteCategory", enabled = true)
	public void deleteCategory(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentCategoryManage departmentCategoryManage = new DepartmentCategoryManage(driver);
		departmentCategoryManage.deleteCategory(testData.get("categoryName"));
	}

	@DataProvider(name = "deleteCategory")
	public Iterator<Object[]> deleteCategory() {
		return ExcelUtils.readExcel("departmentCategoryManage","deleteCategory");
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
