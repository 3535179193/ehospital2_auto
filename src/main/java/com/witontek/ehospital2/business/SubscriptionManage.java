package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.SubscriptionManagePage;

public class SubscriptionManage extends SubscriptionManagePage{

	public SubscriptionManage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(SubscriptionManage.class);
	
	//预约管理-查询科室成功
	public String seacheDepartment(String departmentName){
		clickSubscriptionManageButton();
		inputSubManDepartmentNameInputBox(departmentName);
		clickSubManSearchButton();
		return getSubManDepartmentName();
	}

	//预约管理-查询医生成功
	public String seacheDoctor(String doctorName){
		inputSubManDoctorNameInputBox(doctorName);
		clickSubManSearchButton();
		return getSubManDoctorName();
	}
	
	//预约管理-查询病人成功
	public String seachePatient(String patientName){
		clickSubscriptionManageButton();
		inputSubManPatientNameInputBox(patientName);
		clickSubManSearchButton();
		return getSubManPatientName();
	}
	
	
	
	
	
}
