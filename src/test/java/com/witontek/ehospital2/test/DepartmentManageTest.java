package com.witontek.ehospital2.test;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.witontek.ehospital2.base.AssertUtils;
import com.witontek.ehospital2.base.BrowserUtils;
import com.witontek.ehospital2.base.DriverUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.business.DepartmentManage;
import com.witontek.ehospital2.page.LoginPage;

public class DepartmentManageTest {

	private WebDriver driver;

	/**
	 * 二级科室管理-新增二级科室
	 */
	@Test(dataProvider = "insertDepartment", enabled = true)
	public void insertDepartment(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		AssertUtils.assertActualContainExpect(departmentManage.insertDepartment(testData.get("departmentName"), testData.get("departmentCode"),
				testData.get("departmentPhone"), testData.get("departmentAddress"), testData.get("departmentFeature"),
				testData.get("departmentSummary"), testData.get("Attention")), expectedResult, caseName);
	}

	@DataProvider(name = "insertDepartment")
	public Iterator<Object[]> insertDepartment() {
		return ExcelUtils.readTestDataExcel("DepartmentManage", "insertDepartment");
	}

	/**
	 * 二级科室管理-编辑二级科室
	 */
	@Test(dataProvider = "updateDepartment", dependsOnMethods = {"insertDepartment"}, enabled = false)
	public void updateDepartment(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		AssertUtils.assertActualEqualExpect(departmentManage.updateDepartment(testData.get("departmentName"), testData.get("departmentCode"),
				testData.get("departmentPhone"), testData.get("departmentAddress"), testData.get("departmentFeature"),
				testData.get("departmentSummary"), testData.get("Attention")), expectedResult, caseName);
	}

	@DataProvider(name = "updateDepartment")
	public Iterator<Object[]> updateDepartment() {
		return ExcelUtils.readTestDataExcel("DepartmentManage", "updateDepartment");
	}

	/**
	 * 二级科室管理-搜索二级科室
	 */
	@Test(dataProvider = "searchDepartment", dependsOnMethods = {"insertDepartment"}, enabled = true)
	public void searchDepartment(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		AssertUtils.assertActualContainExpect(departmentManage.searchDepartment(testData.get("departmentName")), expectedResult, caseName);
	}

	@DataProvider(name = "searchDepartment")
	public Iterator<Object[]> searchDepartment() {
		return ExcelUtils.readTestDataExcel("DepartmentManage", "searchDepartment");
	}

	/**
	 * 二级科室管理-上移二级科室
	 */
	@Test(dependsOnMethods = {"insertDepartment"}, enabled = true)
	public void moveUpDepartment() {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		departmentManage.moveUpDepartment();
	}

	/**
	 * 二级科室管理-下移二级科室
	 */
	@Test(dependsOnMethods = {"insertDepartment"}, enabled = true)
	public void moveDownDepartment() {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		departmentManage.moveDownDepartment();
	}

	/**
	 * 二级科室管理-置顶二级科室
	 */
	@Test(dependsOnMethods = {"insertDepartment"}, enabled = true)
	public void moveTopDepartment() {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		departmentManage.moveTopDepartment();
	}

	/**
	 * 二级科室管理-隐藏二级科室
	 */
	@Test(dataProvider = "hideDepartment", dependsOnMethods = {"insertDepartment"}, enabled = false)
	public void hideDepartment(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		AssertUtils.assertActualEqualExpect(departmentManage.hideDepartment(), expectedResult, caseName);
	}

	@DataProvider(name = "hideDepartment")
	public Iterator<Object[]> hideDepartment() {
		return ExcelUtils.readTestDataExcel("DepartmentManage", "hideDepartment");
	}

	/**
	 * 数据库操作-删除新增的二级科室
	 */
	@Test(dataProvider = "deleteDepartment", enabled = true)
	public void deleteDepartment(String caseName, String expectedResult, Map<String, String> testData) {
		DepartmentManage departmentManage = new DepartmentManage(driver);
		AssertUtils.assertActualEqualExpect(departmentManage.deleteDepartment(testData.get("tableName"), testData.get("conditionKey"), testData.get("conditionValue")), expectedResult,
				caseName);
	}

	@DataProvider(name = "deleteDepartment")
	public Iterator<Object[]> deleteDepartment() {
		return ExcelUtils.readTestDataExcel("departmentManage", "deleteDepartment");
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
