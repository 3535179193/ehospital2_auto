package com.witontek.ehospital2.base;

import org.openqa.selenium.WebDriver;

public class AssertUtils extends BasePage {

	public AssertUtils(WebDriver driver) {
		super(driver);
	}

	private static Log log = new Log(AssertUtils.class);

	public static void assertActualEqualExpect(String actual,String expectedResult, String caseName) {
		if (actual.equals(expectedResult)) {
			log.info("实际结果（" + actual + "）与预期结果（" + expectedResult + "）相等，"+ caseName);
		} else if (actual.equals(null)) {
			log.error("查询后总记录数为0，未查询到相应信息");
		} else {
			log.errorShot("实际结果（" + actual + "）与预期结果（" + expectedResult + "）不相等，" + caseName, driver);
		}
	}

	public static void assertActualContainExpect(String actual,String expectedResult, String caseName) {
		if (actual.contains(expectedResult)) {
			log.info("实际结果（" + actual + "）包含预期结果（" + expectedResult + "），"+ caseName);
		} else {
			log.errorShot("实际结果（" + actual + "）不包含预期结果（" + expectedResult + "），" + caseName, driver);
		}
	}

	public static void assertExpectContainActual(String actual,String expectedResult, String caseName) {
		if (expectedResult.contains(actual)) {
			log.info("预期结果（" + actual + "）包好实际结果（" + expectedResult + "），"+ caseName);
		} else {
			log.errorShot("预期结果（" + actual + "）不包含实际结果（" + expectedResult+ "），" + caseName, driver);
		}
	}

}
