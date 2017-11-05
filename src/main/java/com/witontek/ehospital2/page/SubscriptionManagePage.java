package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;
import com.witontek.ehospital2.business.Login;

public class SubscriptionManagePage extends MainPage{

	public SubscriptionManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(Login.class);
	
	protected Locator subManSubscriptionStartDateSelector=XmlUtils.readXml("SubscriptionManagePage").get("subManSubscriptionStartDateSelector");
	protected Locator subManSubscriptionEndDateSelector=XmlUtils.readXml("SubscriptionManagePage").get("subManSubscriptionEndDateSelector");
	protected Locator subManClinicStartDateSelector=XmlUtils.readXml("SubscriptionManagePage").get("subManClinicStartDateSelector");
	protected Locator subManClinicEndDateSelector=XmlUtils.readXml("SubscriptionManagePage").get("subManClinicEndDateSelector");
	
	protected Locator subManYearMonthSelector=XmlUtils.readXml("SubscriptionManagePage").get("subManYearMonthSelector");
	protected Locator subManDefaultYearButton=XmlUtils.readXml("SubscriptionManagePage").get("subManDefaultYearButton");
	protected Locator subManDefaultMonthButton=XmlUtils.readXml("SubscriptionManagePage").get("subManDefaultMonthButton");
	protected Locator subManDefaultDayButton=XmlUtils.readXml("SubscriptionManagePage").get("subManDefaultDayButton");
	
//	protected Locator docManDoctorCode=XmlUtils.readXml("SubscriptionManagePage").get("docManDoctorCode");	
//	protected Locator docManDoctorName=XmlUtils.readXml("SubscriptionManagePage").get("docManDoctorName");
//	protected Locator docManBelongToDepartment=XmlUtils.readXml("SubscriptionManagePage").get("docManBelongToDepartment");
//	protected Locator docManPersonalType=XmlUtils.readXml("SubscriptionManagePage").get("docManPersonalType");
//	protected Locator docManHospitalTitle=XmlUtils.readXml("SubscriptionManagePage").get("docManHospitalTitle");
//	protected Locator docManPostion=XmlUtils.readXml("SubscriptionManagePage").get("docManPostion");
//	protected Locator docManAcademicTitle=XmlUtils.readXml("SubscriptionManagePage").get("docManAcademicTitle");
//	
//	protected Locator docManEditButton=XmlUtils.readXml("SubscriptionManagePage").get("docManEditButton");
//	protected Locator docManDeleteButton=XmlUtils.readXml("SubscriptionManagePage").get("docManDeleteButton");	
//	protected Locator docManResetPasswordButton=XmlUtils.readXml("SubscriptionManagePage").get("docManResetPasswordButton");
//	protected Locator docManMoveUpButton=XmlUtils.readXml("SubscriptionManagePage").get("docManMoveUpButton");
//	protected Locator docManMoveDownButton=XmlUtils.readXml("SubscriptionManagePage").get("docManMoveDownButton");
//	protected Locator docManMoveTopButton=XmlUtils.readXml("SubscriptionManagePage").get("docManMoveTopButton");	
//	
//	protected Locator docManEachPageRecordersDropBox=XmlUtils.readXml("SubscriptionManagePage").get("docManEachPageRecordersDropBox");
//	protected Locator docManTotalRecorders=XmlUtils.readXml("SubscriptionManagePage").get("docManTotalRecorders");
//	protected Locator docManTotalPages=XmlUtils.readXml("SubscriptionManagePage").get("docManTotalPages");
//	protected Locator docManCurrentPages=XmlUtils.readXml("SubscriptionManagePage").get("docManCurrentPages");	
//	protected Locator docManFirstPageButton=XmlUtils.readXml("SubscriptionManagePage").get("docManFirstPageButton");
//	protected Locator docManPreviousPageButton=XmlUtils.readXml("SubscriptionManagePage").get("docManPreviousPageButton");
//	protected Locator docManNextPageButton=XmlUtils.readXml("SubscriptionManagePage").get("docManNextPageButton");
//	protected Locator docManLastPageButton=XmlUtils.readXml("SubscriptionManagePage").get("docManLastPageButton");		
	
	
	//搜索预约日期中的起始日期
	public void clickSubManSubscriptionStartDateSelector(){
		click(subManSubscriptionStartDateSelector);
	}
	
	//点击年/月份选择器，点击一次进入月份选择器，点击两次进入到年份选择器
	public void clickSubManYearMonthSelector(){
		click(subManYearMonthSelector);
	}
	
	//点击默认的年
	public void clickSubManDefaultYearButton(){
		click(subManDefaultYearButton);
	}
	
	//点击默认的月
	public void clickSubManDefaultMonthButton(){
		click(subManDefaultMonthButton);
	}
	
	//点击默认的日期
	public void clickSubManDefaultDayButton(){
		click(subManDefaultDayButton);
	}
	

	


}
