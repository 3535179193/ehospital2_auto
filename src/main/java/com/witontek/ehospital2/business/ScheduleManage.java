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
	
	//排班管理-查询科室名称查询排班
	public String searchScheduleByDepartment (String departmentName){
		clickScheduleManageButton();
		inputSchManDepartmentInputBox(departmentName);
		clickSchManSearchButton();
		return getSchManDepartmentName();
	}
	
	//排班管理-通过医生姓名查询排班
	public String searchScheduleByDoctor (String doctorName){
		inputSchManDoctorInputBox(doctorName);
		clickSchManSearchButton();
		return getSchManDoctor();
	}
	
	//排班管理-查询专家门诊的排班
	public String searchScheduleBySpecialistClinic (){
		clickSchManClinicTypeDropBox();
		clickSchManSelectSpecialistClinic();
		clickSchManSearchButton();
		return getSchManClinicType();
	}
	
	//排班管理-查询普通门诊的排班
	public String searchScheduleByGeneralClinic (){
		clickSchManClinicTypeDropBox();
		clickSchManSelectGeneralClinic();
		clickSchManSearchButton();
		return getSchManClinicType();
	}

	//排班管理-查询挂号号源
	public String searchScheduleByRegisterResource (){
		clickSchManResourceTypeDropBox();
		clickSchManSelectRegisterResource();
		clickSchManSearchButton();
		return getSchManResourseType();
	}
	
	//排班管理-查询预约号源的排班
	public String searchScheduleBySubscriptionResource (){
		clickSchManResourceTypeDropBox();
		clickSchManSelectSubscriptionResource();
		clickSchManSearchButton();
		return getSchManResourseType();
	}
	
//	排班管理-查询默认日期的排班
	public String searchScheduleByDefaultDate (){
		
		return getSchManResourseType();
	}

	
}
