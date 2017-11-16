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
import com.witontek.ehospital2.business.SecondLevelDepartment;
import com.witontek.ehospital2.page.LoginPage;

public class SecondLevelDepartmentTest {

	private WebDriver driver;
	
	//二级科室管理-新增二级科室
	@Test(dataProvider = "insertDepartment",enabled=false)
	public void insertDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		AssertUtils.assertActualEqualExpect(secondLevelDepartment.insertDepartment(testData.get("categoryName"), testData.get("categoryCode"), testData.get("departmentName"), testData.get("departmentCode"), testData.get("departmentPhone"), testData.get("departmentAddress"), testData.get("departmentFeature"), testData.get("departmentSummary"), testData.get("Attention")),expectedResult, caseName);
	}

	@DataProvider(name = "insertDepartment")
	public Iterator<Object[]> insertDepartment() {
		return ExcelUtils.readExcel("secondLevelDepartment/insertDepartment");
	}
	
	//二级科室管理-置顶二级科室
	@Test(enabled=false)
	public void moveTopDepartment() {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		secondLevelDepartment.moveTopDepartment();
	}
	
	//二级科室管理-编辑二级科室
	@Test(dataProvider = "updateDepartment",dependsOnMethods={"insertDepartment"},enabled=false)
	public void updateDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		AssertUtils.assertActualEqualExpect(secondLevelDepartment.updateDepartment(testData.get("departmentName"), testData.get("departmentCode"), testData.get("departmentPhone"), testData.get("departmentAddress"), testData.get("departmentFeature"), testData.get("departmentSummary"), testData.get("Attention")),expectedResult, caseName);
	}

	@DataProvider(name = "updateDepartment")
	public Iterator<Object[]> updateDepartment() {
		return ExcelUtils.readExcel("secondLevelDepartment/updateDepartment");
	}

	//二级科室管理-下移二级科室
	@Test(enabled=false)
	public void moveDownDepartment() {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		secondLevelDepartment.moveDownDepartment();
	}
	
	//二级科室管理-上移二级科室
	@Test(dependsOnMethods={"moveDownDepartment"},enabled=false)
	public void moveUpDepartment() {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		secondLevelDepartment.moveUpDepartment();
	}
	
	//二级科室管理-搜索二级科室
	@Test(dataProvider = "searchDepartmentsByName",enabled=true)
	public void searchDepartmentsByName(String caseName, String expectedResult,Map<String, String> testData) {
		SecondLevelDepartment secondLevelDepartment = new SecondLevelDepartment(driver);
		AssertUtils.assertActualEqualExpect(secondLevelDepartment.searchDepartmentsByName(testData.get("departmentName")),expectedResult, caseName);
	}

	@DataProvider(name = "searchDepartmentsByName")
	public Iterator<Object[]> searchDepartmentsByName() {
		return ExcelUtils.readExcel("secondLevelDepartment/searchDepartmentsByName");
	}
	
//	//科室管理-删除一级科室
//	@Test(dependsOnMethods={"updateDepartmentCategory"},enabled=true)
//	public void deleteDepartmentCategory() {
//		DepartmentMange departmentMange = new DepartmentMange(driver);
//		departmentMange.deleteDepartmentCategory();
//	}

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
