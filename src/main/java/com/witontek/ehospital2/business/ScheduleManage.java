package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.DateUtils;
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
	public void searchScheduleByDefaultDate (){
		clickScheduleManageButton();
		clickSelectStartDateButton();
		clickMonthToggleButton();
		clickDefaultMonthButton();
		clickDefaultDateButton();
		clickSelectEndDateButton();
		clickMonthToggleButton();
		clickDefaultMonthButton();
		clickDefaultDateButton();
		clickSchManSearchButton();
		String clinicTimeString=getSchManClinicTime();
		if(clinicTimeString.equals(DateUtils.getDates(9))){
			log.info("查询接下来一周的排班成功");
		}
		else {
			log.errorShot("查询接下来一周的排班失败，或者一周内无排班", driver);
		}
	}

	
}
