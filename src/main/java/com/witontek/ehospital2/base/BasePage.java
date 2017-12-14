package com.witontek.ehospital2.base;

import org.openqa.selenium.WebDriver;

public class BasePage extends WebElementsUtils{
	
	private static Log log=new Log(BrowserUtils.class);
	
	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	Locator replace=XmlUtils.getElementXml("BasePage").get("replace");
	
	//替换属性值的属性
	public Locator replaceAttributeValue(String textAttribute){
		return Locator.replaceAttributeValue(replace, textAttribute);
	}
	

}
