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
import com.witontek.ehospital2.business.HospitalInformation;
import com.witontek.ehospital2.business.SubscriptionManage;
import com.witontek.ehospital2.page.LoginPage;

public class SubscriptionManageTest {

	private WebDriver driver;

	// 预约管理-查询科室成功
	@Test(dataProvider = "seacheDepartment")
	public void seacheDepartment(String caseName, String expectedResult,Map<String, String> testData) {
		SubscriptionManage subscriptionManage = new SubscriptionManage(driver);
		AssertUtils.assertActualContainExpect(subscriptionManage.seacheDepartment(testData.get("departmentName")),expectedResult, caseName);
	}

	@DataProvider(name = "seacheDepartment")
	public Iterator<Object[]> seacheDepartment() {
		return ExcelUtils.readTestDataExcel("subscriptionManage","seacheDepartment");
	}

	// 预约管理-查询医生成功
	@Test(dataProvider = "seacheDoctor")
	public void seacheDoctor(String caseName, String expectedResult,Map<String, String> testData) {
		SubscriptionManage subscriptionManage = new SubscriptionManage(driver);
		AssertUtils.assertActualContainExpect(subscriptionManage.seacheDoctor(testData.get("doctorName")),expectedResult, caseName);
	}

	@DataProvider(name = "seacheDoctor")
	public Iterator<Object[]> seacheDoctor() {
		return ExcelUtils.readTestDataExcel("subscriptionManage","seacheDoctor");
	}
	
	// 预约管理-查询病人成功
	@Test(dataProvider = "seachePatient")
	public void seachePatient(String caseName, String expectedResult,Map<String, String> testData) {
		SubscriptionManage subscriptionManage = new SubscriptionManage(driver);
		AssertUtils.assertActualContainExpect(subscriptionManage.seachePatient(testData.get("patientName")),expectedResult, caseName);
	}

	@DataProvider(name = "seachePatient")
	public Iterator<Object[]> seachePatient() {
		return ExcelUtils.readTestDataExcel("subscriptionManage","seachePatient");
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
