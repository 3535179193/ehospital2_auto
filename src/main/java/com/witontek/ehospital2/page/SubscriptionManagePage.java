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
	
	private Log log=new Log(SubscriptionManagePage.class);

	//预约管理-起始预约日期选择器
	protected Locator subManSubscriptionStartDateSelector=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSubscriptionStartDateSelector");
	
	protected Locator subManSubscriptionEndDateSelector=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSubscriptionEndDateSelector");
	
	protected Locator subManClinicStartDateSelector=XmlUtils.getElementXml("SubscriptionManagePage").get("subManClinicStartDateSelector");
	
	protected Locator subManClinicEndDateSelector=XmlUtils.getElementXml("SubscriptionManagePage").get("subManClinicEndDateSelector");
	
	//预约管理-科室名称输入框
	protected Locator subManDepartmentNameInputBox=XmlUtils.getElementXml("SubscriptionManagePage").get("subManDepartmentNameInputBox");
	protected Locator subManDoctorNameInputBox=XmlUtils.getElementXml("SubscriptionManagePage").get("subManDoctorNameInputBox");
	protected Locator subManPatientNameInputBox=XmlUtils.getElementXml("SubscriptionManagePage").get("subManPatientNameInputBox");
	
	//预约管理-预约状态下拉框
	protected Locator subManSelectStateDropBox=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSelectStateDropBox");
	protected Locator subManWaitRegisterButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManWaitRegisterButton");	
	protected Locator subManWaitClinicButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManWaitClinicButton");
	protected Locator subManAlreadyClinicButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManAlreadyClinicButton");
	protected Locator subManAlreadyCancleButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManAlreadyCancleButton");
	protected Locator subManAlreadyDefaultButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManAlreadyDefaultButton");
	protected Locator subManAlreadyRegisterButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManAlreadyRegisterButton");
	protected Locator subManWaitPayButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManWaitPayButton");
	protected Locator subManAlreadyPayButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManAlreadyPayButton");
	
	//预约管理-搜索按钮
	protected Locator subManSearchButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSearchButton");
	protected Locator subManExportSearchResultButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManExportSearchResultButton");	
	protected Locator subManExportWorkDaySubscriptionButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subManExportWorkDaySubscriptionButton");
	
	//预约管理-序号
	protected Locator subManNumber=XmlUtils.getElementXml("SubscriptionManagePage").get("subManNumber");
	protected Locator subManDepartmentName=XmlUtils.getElementXml("SubscriptionManagePage").get("subManDepartmentName");
	protected Locator subManDoctorName=XmlUtils.getElementXml("SubscriptionManagePage").get("subManDoctorName");	
	protected Locator subManSubscriptionType=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSubscriptionType");
	protected Locator subManPatientName=XmlUtils.getElementXml("SubscriptionManagePage").get("subManPatientName");
	protected Locator subManClinicTime=XmlUtils.getElementXml("SubscriptionManagePage").get("subManClinicTime");
	protected Locator subManSubscriptionDate=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSubscriptionDate");	
	protected Locator subManSubscriptionState=XmlUtils.getElementXml("SubscriptionManagePage").get("subManSubscriptionState");
	
	//预约管理-查看按钮
	protected Locator subManView=XmlUtils.getElementXml("SubscriptionManagePage").get("subManView");
		protected Locator subInfDepartmentName=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfDepartmentName");
		protected Locator subInfSubscriptionType=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfSubscriptionType");		
		protected Locator subInfDoctorName=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfDoctorName");
		protected Locator subInfPatientName=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfPatientName");	
		protected Locator subInfIdCard=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfIdCard");
		protected Locator subInfPatientCard=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfPatientCard");	
		protected Locator subInfClinicDate=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfClinicDate");
		protected Locator subInfSubscriptionID=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfSubscriptionID");	
		protected Locator subInfSubscriptionTimePeriod=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfSubscriptionTimePeriod");
		protected Locator subInfSubscriptionTime=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfSubscriptionTime");	
		protected Locator subInfSubscriptionState=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfSubscriptionState");
		protected Locator subInfPhone=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfPhone");	
		protected Locator subInfCloseButton=XmlUtils.getElementXml("SubscriptionManagePage").get("subInfCloseButton");	

	//点击预约管理-起始预约日期选择器
	public void clickSubManSubscriptionStartDateSelector(){
		click(subManSubscriptionStartDateSelector);
	}

	//点击预约管理-结束预约日期选择器
	public void clickSubManSubscriptionEndDateSelector(){
		click(subManSubscriptionEndDateSelector);
	}
	
	//点击预约管理-起始就诊日期选择器
	public void clickSubManClinicStartDateSelector(){
		click(subManClinicStartDateSelector);
	}
	
	//点击预约管理-结束就诊日期选择器
	public void clickSubManClinicEndDateSelector(){
		click(subManClinicEndDateSelector);
	}

	//预约管理-输入科室名称
	public void inputSubManDepartmentNameInputBox(String departmentNam){
		input(subManDepartmentNameInputBox, departmentNam);
	}
	
	//预约管理-输入医生姓名
	public void inputSubManDoctorNameInputBox(String doctorName){
		input(subManDoctorNameInputBox, doctorName);
	}
	
	//预约管理-输入病人姓名
	public void inputSubManPatientNameInputBox(String patientName){
		input(subManPatientNameInputBox, patientName);
	}
	
	//点击预约管理-预约状态下拉框
	public void clickSubManSelectStateDropBox(){
		click(subManSelectStateDropBox);
	}
	
	//预约管理-选择待挂号状态
	public void clickSubManWaitRegisterButton(){
		click(subManWaitRegisterButton);
	}
	
	//预约管理-选择待就诊状态
	public void clickSubManWaitClinicButton(){
		click(subManWaitClinicButton);
	}
	
	//预约管理-选择已就诊状态
	public void clickSubManAlreadyClinicButton(){
		click(subManAlreadyClinicButton);
	}
	
	//预约管理-选择已取消状态
	public void clickSubManAlreadyCancleButton(){
		click(subManAlreadyCancleButton);
	}
	
	//预约管理-选择已爽约状态
	public void clickSubManAlreadyDefaultButton(){
		click(subManAlreadyDefaultButton);
	}
	
	//预约管理-选择已挂号状态
	public void clickSubManAlreadyRegisterButton(){
		click(subManAlreadyRegisterButton);
	}
	
	//预约管理-选择待支付状态
	public void clickSubManWaitPayButton(){
		click(subManWaitPayButton);
	}
	
	//预约管理-选择已支付状态
	public void clickSubManAlreadyPayButton(){
		click(subManAlreadyPayButton);
	}
	
	//点击预约管理-搜索按钮
	public void clickSubManSearchButton(){
		click(subManSearchButton);
	}
	
	//点击预约管理-导出搜索结果按钮
	public void clickSubManExportSearchResultButton(){
		click(subManExportSearchResultButton);
	}
	
	//点击预约管理-导出后一工作日预约按钮
	public void clickSubManExportWorkDaySubscriptionButton(){
		click(subManExportWorkDaySubscriptionButton);
	}

	//获取预约管理-序号
	public String getSubManNumber(){
		String number=getText(subManNumber);
		log.info("预约管理-序号："+number);
		return number;
	}
	
	//获取预约管理-科室名称
	public String getSubManDepartmentName(){
		String departmentName=getText(subManDepartmentName);
		log.info("预约管理-科室名称："+departmentName);
		return departmentName;
	}
	
	//获取预约管理-医生姓名
	public String getSubManDoctorName(){
		String doctorName=getText(subManDoctorName);
		log.info("预约管理-医生姓名："+doctorName);
		return doctorName;
	}
	
	//获取预约管理-预约类型
	public String getSubManSubscriptionType(){
		String subscriptionType=getText(subManSubscriptionType);
		log.info("预约管理-预约类型："+subscriptionType);
		return subscriptionType;
	}
	
	//获取预约管理-病人姓名
	public String getSubManPatientName(){
		String patientName=getText(subManPatientName);
		log.info("预约管理-病人姓名："+patientName);
		return patientName;
	}
	
	//获取预约管理-就诊时间
	public String getSubManClinicTime(){
		String clinicTime=getText(subManClinicTime);
		log.info("预约管理-就诊时间："+clinicTime);
		return clinicTime;
	}
	
	//获取预约管理-预约日期
	public String getSubManSubscriptionDate(){
		String subscriptionDate=getText(subManSubscriptionDate);
		log.info("预约管理-预约日期："+subscriptionDate);
		return subscriptionDate;
	}
	
	//获取预约管理-预约状态
	public String getSubManSubscriptionState(){
		String subscriptionState=getText(subManSubscriptionState);
		log.info("预约管理-预约状态："+subscriptionState);
		return subscriptionState;
	}
	
	//点击预约管理-查看按钮
	public void clickSubManView(){
		click(subManView);
	}
	
	//获取预约信息-科室名称
	public String getSubInfDepartmentName(){
		String departmentName=getText(subInfDepartmentName);
		log.info("预约信息-科室名称："+departmentName);
		return departmentName;
	}
	
	//获取预约信息-预约类型
	public String getSubInfSubscriptionType(){
		String subscriptionType=getText(subInfSubscriptionType);
		log.info("预约信息-预约类型："+subscriptionType);
		return subscriptionType;
	}
	
	//获取预约信息-医生姓名
	public String getSubInfDoctorName(){
		String doctorName=getText(subInfDoctorName);
		log.info("预约信息-医生姓名："+doctorName);
		return doctorName;
	}
	
	//获取预约信息-病人姓名
	public String getSubInfPatientName(){
		String patientName=getText(subInfPatientName);
		log.info("预约信息-病人姓名："+patientName);
		return patientName;
	}
	
	//获取预约信息-身份证号
	public String getSubInfIdCard(){
		String IdCard=getText(subInfIdCard);
		log.info("预约信息-身份证号："+IdCard);
		return IdCard;
	}
	
	//获取预约信息-病历卡号
	public String getSubInfPatientCard(){
		String patientCard=getText(subInfPatientCard);
		log.info("预约信息-病历卡号："+patientCard);
		return patientCard;
	}
	
	//获取预约信息-就诊日期
	public String getSubInfClinicDate(){
		String clinicDate=getText(subInfClinicDate);
		log.info("预约信息-就诊日期："+clinicDate);
		return clinicDate;
	}
	
	//获取预约信息-预约号码
	public String getSubInfSubscriptionID(){
		String subscriptionID=getText(subInfSubscriptionID);
		log.info("预约信息-预约号码："+subscriptionID);
		return subscriptionID;
	}
	
	//获取预约信息-预约时间段
	public String getSubInfSubscriptionTimePeriod(){
		String subscriptionTimePeriod=getText(subInfSubscriptionTimePeriod);
		log.info("预约信息-预约时间段："+subscriptionTimePeriod);
		return subscriptionTimePeriod;
	}
	
	//获取预约信息-预约时间
	public String getSubInfSubscriptionTime(){
		String subscriptionTime=getText(subInfSubscriptionTime);
		log.info("预约信息-预约时间："+subscriptionTime);
		return subscriptionTime;
	}
	
	//获取预约信息-预约状态
	public String getSubInfSubscriptionState(){
		String subscriptionTime=getText(subInfSubscriptionState);
		log.info("预约信息-预约状态："+subscriptionTime);
		return subscriptionTime;
	}
	
	//获取预约信息-手机号码
	public String getSubInfPhone(){
		String phone=getText(subInfPhone);
		log.info("预约信息-手机号码："+phone);
		return phone;
	}
	
	//点击预约信息-关闭按钮
	public void clickSubInfCloseButton(){
		click(subInfCloseButton);
	}
	
	
	
}
