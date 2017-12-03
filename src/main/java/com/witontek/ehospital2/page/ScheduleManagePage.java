package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.BasePage;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class ScheduleManagePage extends MainPage{

	public ScheduleManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(ScheduleManagePage.class);
	
	//排班管理-导入专家排班
	protected Locator schManImportSpecialistScheduleButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManImportSpecialistScheduleButton");
	protected Locator schManImportNumberAndFeeButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManImportNumberAndFeeButton");
	protected Locator schManImportGeneralScheduleButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManImportGeneralScheduleButton");
	protected Locator schManDownloadAllExcelButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManDownloadAllExcelButton");
	protected Locator schManGetScheduleButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManGetScheduleButton");
	protected Locator schManBatchStopMedicalButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManBatchStopMedicalButton");
	protected Locator schManBatchStartMedicalButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManBatchStartMedicalButton");
	
	//排班管理-科室名称输入框
	protected Locator schManDepartmentInputBox=XmlUtils.getElementXml("ScheduleManagePage").get("schManDepartmentInputBox");
	protected Locator schManDoctorInputBox=XmlUtils.getElementXml("ScheduleManagePage").get("schManDoctorInputBox");
	protected Locator schManClinicTypeDropBox=XmlUtils.getElementXml("ScheduleManagePage").get("schManClinicTypeDropBox");
	protected Locator schManSelectSpecialistClinic=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectSpecialistClinic");
	protected Locator schManSelectGeneralClinic=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectGeneralClinic");
	protected Locator schManResourceTypeDropBox=XmlUtils.getElementXml("ScheduleManagePage").get("schManResourceTypeDropBox");
	protected Locator schManSelectRegisterResource=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectRegisterResource");
	protected Locator schManSelectSubscriptionResource=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectSubscriptionResource");
	protected Locator schManSearchButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManSearchButton");
	protected Locator schManExportScheduleInfoButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManExportScheduleInfoButton");
		
	//排班管理-全选按钮
	protected Locator schManSelectAllButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectAllButton");
	protected Locator schManSelectFirstCheckBox=XmlUtils.getElementXml("ScheduleManagePage").get("schManSelectFirstCheckBox");
	protected Locator schManNumber=XmlUtils.getElementXml("ScheduleManagePage").get("schManNumber");
	protected Locator schManDepartmentName=XmlUtils.getElementXml("ScheduleManagePage").get("schManDepartmentName");
	protected Locator schManAddress=XmlUtils.getElementXml("ScheduleManagePage").get("schManAddress");
	protected Locator schManClinicType=XmlUtils.getElementXml("ScheduleManagePage").get("schManClinicType");
	protected Locator schManDoctor=XmlUtils.getElementXml("ScheduleManagePage").get("schManDoctor");
	protected Locator schManClinicTime=XmlUtils.getElementXml("ScheduleManagePage").get("schManClinicTime");
	protected Locator schManClinicTimePeriod=XmlUtils.getElementXml("ScheduleManagePage").get("schManClinicTimePeriod");
	protected Locator schManResourse=XmlUtils.getElementXml("ScheduleManagePage").get("schManResourse");
	protected Locator schManResourseType=XmlUtils.getElementXml("ScheduleManagePage").get("schManResourseType");
	
	//排班管理-查看
	protected Locator schManViewButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManViewButton");
		protected Locator schInfDepartmentID=XmlUtils.getElementXml("ScheduleManagePage").get("schInfDepartmentID");
		protected Locator schInfDepartmentName=XmlUtils.getElementXml("ScheduleManagePage").get("schInfDepartmentName");
		protected Locator schInfClinicType=XmlUtils.getElementXml("ScheduleManagePage").get("schInfClinicType");
		protected Locator schInfDoctor=XmlUtils.getElementXml("ScheduleManagePage").get("schInfDoctor");
		protected Locator schInfResource=XmlUtils.getElementXml("ScheduleManagePage").get("schInfResource");
		protected Locator schInfClinicTime=XmlUtils.getElementXml("ScheduleManagePage").get("schInfClinicTime");
		protected Locator schInfSaveButton=XmlUtils.getElementXml("ScheduleManagePage").get("schInfSaveButton");
		protected Locator schInfCancelButton=XmlUtils.getElementXml("ScheduleManagePage").get("schInfCancelButton");

	//排班管理-查看
	protected Locator schManStopMedicalButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManStopMedicalButton");
	protected Locator schManViewLogButton=XmlUtils.getElementXml("ScheduleManagePage").get("schManViewLogButton");


	//点击排班管理-导入专家排班按钮
	public void clickSchManImportSpecialistScheduleButton(){
		click(schManImportSpecialistScheduleButton);
	}
	
	//点击排班管理-导入专家排班号源与挂号费用按钮
	public void clickSchManImportNumberAndFeeButton(){
		click(schManImportNumberAndFeeButton);
	}
	
	//点击排班管理-导入普通排班按钮
	public void clickSchManImportGeneralScheduleButton(){
		click(schManImportGeneralScheduleButton);
	}
	
	//点击排班管理-下载所有EXCEL模板按钮
	public void clickSchManDownloadAllExcelButton(){
		click(schManDownloadAllExcelButton);
	}
	
	//点击排班管理-获取排班按钮
	public void clickSchManGetScheduleButton(){
		click(schManGetScheduleButton);
	}

	//点击排班管理-批量停诊按钮
	public void clickSchManBatchStopMedicalButton(){
		click(schManBatchStopMedicalButton);
	}
	
	//点击排班管理-批量开诊按钮
	public void clickSchManBatchStartMedicalButton(){
		click(schManBatchStartMedicalButton);
	}
	
	//排班管理-输入科室名称
	public void inputSchManDepartmentInputBox(String departmentName){
		input(schManDepartmentInputBox, departmentName);
	}
	
	//排班管理-输入医生姓名
	public void inputSchManDoctorInputBox(String doctorName){
		input(schManDoctorInputBox, doctorName);
	}
	
	//点击排班管理-门诊类型下拉框
	public void clickSchManClinicTypeDropBox(){
		click(schManClinicTypeDropBox);
	}
	
	//排班管理-选择专家门诊
	public void clickSchManSelectSpecialistClinic(){
		click(schManSelectSpecialistClinic);
	}
	
	//排班管理-选择普通门诊
	public void clickSchManSelectGeneralClinic(){
		click(schManSelectGeneralClinic);
	}
	
	//点击排班管理-号源类型下拉框
	public void clickSchManResourceTypeDropBox(){
		click(schManResourceTypeDropBox);
	}
	
	//排班管理-选择挂号号源
	public void clickSchManSelectRegisterResource(){
		click(schManSelectRegisterResource);
	}
	
	//排班管理-选择预约号源
	public void clickSchManSelectSubscriptionResource(){
		click(schManSelectSubscriptionResource);
	}
	
	//点击排班管理-搜索按钮
	public void clickSchManSearchButton(){
		click(schManSearchButton);
	}
	
	//点击排班管理-导出排班信息按钮
	public void clickSchManExportScheduleInfoButton(){
		click(schManExportScheduleInfoButton);
	}
	
	//点击排班管理-全选按钮
	public void clickSchManSelectAllButton(){
		click(schManSelectAllButton);
	}
	
	//点击排班管理-序号为1的复选框
	public void clickSchManSelectFirstCheckBox(){
		click(schManSelectFirstCheckBox);
	}
	
	//获取排班管理-序号
	public String getSchManNumber(){
		String number=getText(schManNumber);
		log.info("排班管理-序号："+number);
		return number;
	}
	
	//获取排班管理-科室名称
	public String getSchManDepartmentName(){
		String departmentName=getText(schManDepartmentName);
		log.info("排班管理-科室名称："+departmentName);
		return departmentName;
	}
	
	//获取排班管理-地点
	public String getSchManAddress(){
		String address=getText(schManAddress);
		log.info("排班管理-地点："+address);
		return address;
	}
	
	//获取排班管理-就诊类型
	public String getSchManClinicType(){
		String clinicType=getText(schManClinicType);
		log.info("排班管理-就诊类型："+clinicType);
		return clinicType;
	}
	
	//获取排班管理-医生
	public String getSchManDoctor(){
		String doctor=getText(schManDoctor);
		log.info("排班管理-医生："+doctor);
		return doctor;
	}
	
	//获取排班管理-就诊时间
	public String getSchManClinicTime(){
		String clinicTime=getText(schManClinicTime);
		log.info("排班管理-就诊时间："+clinicTime);
		return clinicTime;
	}
	
	//获取排班管理-时间段
	public String getSchManClinicTimePeriod(){
		String clinicTimePeriod=getText(schManClinicTimePeriod);
		log.info("排班管理-时间段："+clinicTimePeriod);
		return clinicTimePeriod;
	}
	
	//获取排班管理-号源
	public String getSchManResourse(){
		String resourse=getText(schManResourse);
		log.info("排班管理-号源："+resourse);
		return resourse;
	}
	
	//获取排班管理-号源类型
	public String getSchManResourseType(){
		String resourseType=getText(schManResourseType);
		log.info("排班管理-号源类型："+resourseType);
		return resourseType;
	}
	
	//点击排班管理-查看
	public void clickSchManViewButton(){
		click(schManViewButton);
	}
	
	//获取排班信息-排班ID
	public String getSchInfDepartmentID(){
		String departmentID=getText(schInfDepartmentID);
		log.info("排班信息-排班ID："+departmentID);
		return departmentID;
	}
	
	//获取排班信息-科室
	public String getSchInfDepartmentName(){
		String departmentName=getText(schInfDepartmentName);
		log.info("排班信息-科室："+departmentName);
		return departmentName;
	}
	
	//获取排班管理-就诊类型
	public String getSchInfClinicType(){
		String clinicType=getText(schInfClinicType);
		log.info("排班信息-就诊类型："+clinicType);
		return clinicType;
	}
	
	//获取排班管理-医生
	public String getSchInfDoctor(){
		String doctor=getText(schInfDoctor);
		log.info("排班信息-医生："+doctor);
		return doctor;
	}
	
	//获取排班管理-号源
	public String getSchInfResource(){
		String resource=getText(schInfResource);
		log.info("排班信息-号源："+resource);
		return resource;
	}
	
	//获取排班管理-就诊时间
	public String getSchInfClinicTime(){
		String clinicTime=getText(schInfClinicTime);
		log.info("排班信息-就诊时间："+clinicTime);
		return clinicTime;
	}
	
	//点击排班信息-保存按钮
	public void clickSchInfSaveButton(){
		click(schInfSaveButton);
	}
	
	//点击排班信息-取消按钮
	public void clickSchInfCancelButton(){
		click(schInfCancelButton);
	}
	
	
	//点击排班管理-停诊
	public void clickSchManStopMedicalButton(){
		click(schManStopMedicalButton);
	}
	
	//点击排班管理-日志
	public void clickSchManViewLogButton(){
		click(schManViewLogButton);
	}

}
