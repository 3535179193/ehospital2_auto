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
import com.witontek.ehospital2.business.ConsultManage;
import com.witontek.ehospital2.business.DepartmentCategoryManage;
import com.witontek.ehospital2.page.LoginPage;

public class ConsultManageTest {

	private WebDriver driver;


	//就医咨询管理-新增咨询科室
	@Test(dataProvider = "insertConsultDepartment",enabled=false)
	public void insertConsultDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		ConsultManage consultManage = new ConsultManage(driver);
		AssertUtils.assertActualEqualExpect(consultManage.insertConsultDepartment(testData.get("departmentName"),testData.get("departmentID"),testData.get("password")),expectedResult, caseName);
	}

	@DataProvider(name = "insertConsultDepartment")
	public Iterator<Object[]> insertConsultDepartment() {
		return ExcelUtils.readExcel("consultManage/insertConsultDepartment");
	}
	
	//就医咨询管理-搜索咨询科室
	@Test(dataProvider = "searchConsultDepartment",dependsOnMethods={"insertConsultDepartment"},enabled=false)
	public void searchConsultDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		ConsultManage consultManage = new ConsultManage(driver);
		AssertUtils.assertActualEqualExpect(consultManage.searchConsultDepartment(testData.get("departmentName")),expectedResult, caseName);
	}

	@DataProvider(name = "searchConsultDepartment")
	public Iterator<Object[]> searchConsultDepartment() {
		return ExcelUtils.readExcel("consultManage/searchConsultDepartment");
	}

	//就医咨询管理-编辑咨询科室
	@Test(dataProvider = "updateConsultDepartment",dependsOnMethods={"searchConsultDepartment"},enabled=false)
	public void updateConsultDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		ConsultManage consultManage = new ConsultManage(driver);
		AssertUtils.assertActualEqualExpect(consultManage.updateConsultDepartment(testData.get("departmentName"),testData.get("departmentID"),testData.get("password")),expectedResult, caseName);
	}

	@DataProvider(name = "updateConsultDepartment")
	public Iterator<Object[]> updateConsultDepartment() {
		return ExcelUtils.readExcel("consultManage/updateConsultDepartment");
	}
	
	//科室管理-删除一级科室
	@Test(dependsOnMethods={"updateConsultDepartment"},enabled=false)
	public void deleteConsultDepartment() {
		ConsultManage consultManage = new ConsultManage(driver);
		consultManage.deleteConsultDepartment();
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
