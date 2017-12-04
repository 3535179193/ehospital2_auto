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
import com.witontek.ehospital2.page.LoginPage;

public class HospitalInformationTest {

	private WebDriver driver;

	@Test(dataProvider = "updateHospitalInformation")
	public void updateHospitalInformation(String caseName,String expectedResult, Map<String, String> testData) {
		HospitalInformation hospitalInformation = new HospitalInformation(
				driver);
		// AssertUtils.assertStringContains(hospitalInformation.updateHospitalInformation(testData.get("userName"),
		// testData.get("password"), testData.get("validation"),
		// testData.get("hospitalName"),testData.get("numberAddress"),testData.get("cardAddress"),
		// testData.get("hospitalLevel"), testData.get("hospitalAddress"),
		// testData.get("website"),testData.get("hospitalPhone"),
		// testData.get("hospitalTraffic"),
		// testData.get("hospitalSummary"),testData.get("longitude"),
		// testData.get("latitude")),expectedResult, caseName);
		hospitalInformation.updateHospitalInformation(
				testData.get("hospitalName"), testData.get("numberAddress"),
				testData.get("cardAddress"), testData.get("hospitalLevel"),
				testData.get("hospitalAddress"), testData.get("website"),
				testData.get("hospitalPhone"), testData.get("hospitalTraffic"),
				testData.get("hospitalSummary"), testData.get("longitude"),
				testData.get("latitude"));
	}

	@DataProvider(name = "updateHospitalInformation")
	public Iterator<Object[]> updateHospitalInformation() {
		return ExcelUtils.readExcel("hospitalInformation","updateHospitalInformation");
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
