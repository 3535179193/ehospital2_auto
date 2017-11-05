package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.SubscriptionManagePage;

public class SubscriptionManage extends SubscriptionManagePage{

	public SubscriptionManage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(Login.class);
	
	public void selectSubscriptionDate(){
		clickSubscriptionManageButton();
		clickSubManSubscriptionStartDateSelector();
		clickSubManYearMonthSelector();
		clickSubManYearMonthSelector();
		clickSubManDefaultYearButton();
		clickSubManDefaultMonthButton();
		clickSubManDefaultDayButton();
	}

}
