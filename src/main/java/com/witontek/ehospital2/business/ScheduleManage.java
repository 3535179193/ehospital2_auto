package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;
import com.witontek.ehospital2.page.ScheduleManagePage;

public class ScheduleManage extends ScheduleManagePage{

	public ScheduleManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(ScheduleManage.class);
	
	//排班管理-查询排班科室
	public String searchDepartment (String departmentName){
		clickScheduleManageButton();
		inputSchManDepartmentInputBox(departmentName);
		clickSchManSearchButton();
		return getSchManDepartmentName();
	}
	
	//排班管理-查询排班科室
	public String searchDoctor (String doctorName){
		inputSchManDoctorInputBox(doctorName);
		clickSchManSearchButton();
		return getSchManDoctor();
	}
	
	//排班管理-查询专家门诊
	public String selectSpecialistClinic (){
		clickSchManClinicTypeDropBox();
		clickSchManSelectSpecialistClinic();
		clickSchManSearchButton();
		return getSchManClinicType();
	}
	
	//排班管理-查询普通门诊
	public String selectGeneralClinic (){
		clickSchManClinicTypeDropBox();
		clickSchManSelectGeneralClinic();
		clickSchManSearchButton();
		return getSchManClinicType();
	}

	//排班管理-查询挂号号源
	public String selectRegisterResource (){
		clickSchManResourceTypeDropBox();
		clickSchManSelectRegisterResource();
		clickSchManSearchButton();
		return getSchManResourseType();
	}
	
	//排班管理-查询预约号源
	public String selectSubscriptionResource (){
		clickSchManResourceTypeDropBox();
		clickSchManSelectSubscriptionResource();
		clickSchManSearchButton();
		return getSchManResourseType();
	}
	
	//排班管理-查询默认时间
//	public String selectSubscriptionResource (){
//		clickSchManResourceTypeDropBox();
//		clickSchManSelectSubscriptionResource();
//		clickSchManSearchButton();
//		return getSchManResourseType();
//	}

	
}
