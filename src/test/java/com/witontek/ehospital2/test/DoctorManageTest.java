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
	
	@Test(dataProvider = "addDoctor")
	public void addDoctor(String caseName, String expectedResult,Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualContainExpect(doctorManage
				.addDoctor(testData.get("doctorName"), testData.get("doctorCode"), testData.get("phone"), testData.get("shortNumber"), testData.get("schoolName"), testData.get("doctorSummary"), testData.get("doctorSpecialty"), testData.get("email"), testData.get("medicalLicense"))
				, expectedResult, caseName);
	}

	@DataProvider(name = "addDoctor")
	public Iterator<Object[]> addDoctor() {
		return ExcelUtils.readExcel("doctorManage/addDoctor");
	}

	@Test(dataProvider = "searchDoctor")
	public void searchDoctor(String caseName, String expectedResult,Map<String, String> testData) {
		DoctorManage doctorManage = new DoctorManage(driver);
		AssertUtils.assertActualContainExpect(doctorManage
				.searchDoctor(testData.get("searchCondition")),
				expectedResult, caseName);
	}

	@DataProvider(name = "searchDoctor")
	public Iterator<Object[]> searchDoctor() {
		return ExcelUtils.readExcel("doctorManage/searchDoctor");
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
