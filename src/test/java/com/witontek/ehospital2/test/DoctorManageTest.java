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
import com.witontek.ehospital2.business.DoctorManage;
import com.witontek.ehospital2.page.LoginPage;

public class DoctorManageTest {

	private WebDriver driver;

	// 新增医生
	@Test(dataProvider = "addDoctor", enabled = true)
	public void addDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.addDoctor(testData.get("doctorName"), testData.get("doctorCode"), testData.get("phone"),
				testData.get("shortNumber"), testData.get("schoolName"), testData.get("doctorSummary"), testData.get("doctorSpecialty"),
				testData.get("email"), testData.get("medicalLicense")), expectedResult, caseName);
	}

	@DataProvider(name = "addDoctor")
	public Iterator<Object[]> addDoctor() {
		return ExcelUtils.readExcel("doctorManage/addDoctor");
	}

	// 置顶医生
	@Test(dataProvider = "moveTopDoctor", dependsOnMethods = {"addDoctor"}, enabled = true)
	public void moveTopDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.moveTopDoctor(), expectedResult, caseName);
	}

	@DataProvider(name = "moveTopDoctor")
	public Iterator<Object[]> moveTopDoctor() {
		return ExcelUtils.readExcel("doctorManage/moveTopDoctor");
	}

	// 下移医生
	@Test(dataProvider = "moveDownDoctor", dependsOnMethods = {"moveTopDoctor"}, enabled = true)
	public void moveDownDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.moveDownDoctor(), expectedResult, caseName);
	}

	@DataProvider(name = "moveDownDoctor")
	public Iterator<Object[]> moveDownDoctor() {
		return ExcelUtils.readExcel("doctorManage/moveDownDoctor");
	}

	// 上移医生
	@Test(dataProvider = "moveUpDoctor", dependsOnMethods = {"moveDownDoctor"}, enabled = false)
	public void moveUpDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.moveUpDoctor(), expectedResult, caseName);
	}

	@DataProvider(name = "moveUpDoctor")
	public Iterator<Object[]> moveUpDoctor() {
		return ExcelUtils.readExcel("doctorManage/moveUpDoctor");
	}

	// 搜索医生
	@Test(dataProvider = "searchDoctor", dependsOnMethods = {"moveTopDoctor"}, enabled = true)
	public void searchDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.searchDoctor(testData.get("doctorName")), expectedResult, caseName);
	}

	@DataProvider(name = "searchDoctor")
	public Iterator<Object[]> searchDoctor() {
		return ExcelUtils.readExcel("doctorManage/searchDoctor");
	}

	// 编辑医生
	@Test(dataProvider = "editDoctor", dependsOnMethods = {"moveTopDoctor"}, enabled = false)
	public void editDoctor(String caseName, String expectedResult, Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualEqualExpect(doctorManage.editDoctor(), expectedResult, caseName);
	}

	@DataProvider(name = "editDoctor")
	public Iterator<Object[]> editDoctor() {
		return ExcelUtils.readExcel("doctorManage/editDoctor");
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
