package com.witontek.ehospital2.base;

import org.openqa.selenium.WebDriver;

public class BasePage extends WebElementsUtils{
	
	private static Log log=new Log(BrowserUtils.class);
	
	public BasePage(WebDriver driver) {
		super(driver);
	}
	
}
