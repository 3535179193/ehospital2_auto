package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.PayRecordManagePage;
import com.witontek.ehospital2.page.SubscriptionManagePage;

public class PayRecordManage extends PayRecordManagePage{

	public PayRecordManage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(PayRecordManage.class);
	
	//缴费记录管理-通过订单号查询
	public String seacheOrderNumber(String orderNumber){
		clickPayRecordManageButton();
		inputPayManOrderNumberInputBox(orderNumber);
		clickPayManSearchButton();
		if(getTotalRecorders().equals("0")){
			return null;
		}
		else{
			return getPayManOrderNumer();
		}

	}
	
	//缴费记录管理-通过就诊人查询
	public String seachePatientName(String patientName){
		inputPayManPatientInputBox(patientName);
		clickPayManSearchButton();
		return getPayManPatientName();
	}
	
	//缴费记录管理-通过日期查询
	public String seacheDepartment(String orderNumber){
		clickSelectStartDateButton();
		clickDateSelDefaultTodayButton();
		clickSelectEndDateButton();
		clickDateSelDefaultTodayButton();
		clickPayManSearchButton();
		return getPayManPayDate();
	}
	

}
