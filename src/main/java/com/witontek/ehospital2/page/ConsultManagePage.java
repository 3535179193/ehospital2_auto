package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class ConsultManagePage extends MainPage{

	public ConsultManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(ConsultManagePage.class);
	
	//就医咨询管理-科室名称输入框
	protected Locator conManDepartmentNameInputBox=XmlUtils.getElementXml("ConsultManagePage").get("conManDepartmentNameInputBox");
	protected Locator conManSearchButton=XmlUtils.getElementXml("ConsultManagePage").get("conManSearchButton");
	
	//就医咨询管理-新增科室咨询按钮
	protected Locator conManAddConsultDepartmentButton=XmlUtils.getElementXml("ConsultManagePage").get("conManAddConsultDepartmentButton");
		protected Locator conBoxDepartmentNameInputBox=XmlUtils.getElementXml("ConsultManagePage").get("conBoxDepartmentNameInputBox");
		protected Locator conBoxDoctorIDInputBox=XmlUtils.getElementXml("ConsultManagePage").get("conBoxDoctorIDInputBox");
		protected Locator conBoxPasswordInputBox=XmlUtils.getElementXml("ConsultManagePage").get("conBoxPasswordInputBox");
		protected Locator conBoxSaveButton=XmlUtils.getElementXml("ConsultManagePage").get("conBoxSaveButton");
		protected Locator conBoxSaveAndAddButton=XmlUtils.getElementXml("ConsultManagePage").get("conBoxSaveAndAddButton");
		protected Locator conBoxCancleButton=XmlUtils.getElementXml("ConsultManagePage").get("conBoxCancleButton");
		
	//就医咨询管理-序号
	protected Locator conManNumber=XmlUtils.getElementXml("ConsultManagePage").get("conManNumber");
	protected Locator conManDepartmentName=XmlUtils.getElementXml("ConsultManagePage").get("conManDepartmentName");
	protected Locator conManDoctorID=XmlUtils.getElementXml("ConsultManagePage").get("conManDoctorID");
	protected Locator conManPassword=XmlUtils.getElementXml("ConsultManagePage").get("conManPassword");
	protected Locator conManDeleteButton=XmlUtils.getElementXml("ConsultManagePage").get("conManDeleteButton");
	
	//就医咨询管理-编辑按钮
	protected Locator conManEditButton=XmlUtils.getElementXml("ConsultManagePage").get("conManEditButton");
	
	//就医咨询管理-编辑后的咨询科室名称
	protected Locator conManEditedConsultDepartmentName=XmlUtils.getElementXml("ConsultManagePage").get("conManEditedConsultDepartmentName");
	
	
	//就医咨询管理-输入科室名称
	public void inputConManDepartmentNameInputBox(String departmentName){
		clearAndInput(conManDepartmentNameInputBox, departmentName);
	}
	
	//就医咨询管理-点击搜索按钮
	public void clickConManSearchButton(){
		click(conManSearchButton);
	}
	
	//就医咨询管理-点击新增科室咨询按钮
	public void clickConManAddConsultDepartmentButton(){
		click(conManAddConsultDepartmentButton);
	}
	
	//新增科室咨询-输入科室名称
	public void inputConBoxDepartmentNameInputBox(String departmentName){
		input(conBoxDepartmentNameInputBox, departmentName);
	}
	
	//新增科室咨询-输入医生ID
	public void inputConBoxDoctorIDInputBox(String departmentID){
		input(conBoxDoctorIDInputBox, departmentID);
	}
	
	//新增科室咨询-输入咨询密码
	public void inputConBoxPasswordInputBox(String password){
		input(conBoxPasswordInputBox, password);
	}
	
	//新增科室咨询-点击保存按钮
	public void clickConBoxSaveButton(){
		click(conBoxSaveButton);
		wait(5);
	}
	
	//新增科室咨询-点击保存并继续添加按钮
	public void clickConBoxSaveAndAddButton(){
		click(conBoxSaveAndAddButton);
	}
	
	//新增科室咨询-点击取消按钮
	public void clickConBoxCancleButton(){
		click(conBoxCancleButton);
		wait(5);
	}
	
	//就医咨询管理-获取序号
	public String getConManNumber(){
		String number=getText(conManNumber);
		log.info("就医咨询管理-序号："+number);
		return number;
	}
	
	//就医咨询管理-获取科室名称
	public String getConManDepartmentName(){
		String departmentName=getText(conManDepartmentName);
		log.info("就医咨询管理-科室名称："+departmentName);
		return departmentName;
	}
	
	//就医咨询管理-获取咨询医生ID
	public String getConManDoctorID(){
		String doctorID=getText(conManDoctorID);
		log.info("就医咨询管理-咨询医生ID："+doctorID);
		return doctorID;
	}
	
	//就医咨询管理-获取注册密码
	public String getConManPassword(){
		String password=getText(conManPassword);
		log.info("就医咨询管理-注册密码："+password);
		return password;
	}
	
	//就医咨询管理-点击删除按钮
	public void clickConManDeleteButton(){
		click(conManDeleteButton);
	}
	
	//就医咨询管理-点击编辑按钮
	public void clickConManEditButton(){
		click(conManEditButton);
	}
	
	//科室咨询框-编辑科室名称
	public void editConBoxDepartmentNameInputBox(String departmentName){
		clearAndInput(conBoxDepartmentNameInputBox, departmentName);
	}
	
	//编辑科室咨询-编辑咨询医生ID
	public void editConBoxDoctorIDInputBox(String departmentID){
		clearAndInput(conBoxDoctorIDInputBox, departmentID);
	}
	
	//编辑科室咨询-编辑咨询密码
	public void editConBoxPasswordInputBox(String password){
		clearAndInput(conBoxPasswordInputBox,password);
	}
	
	//获取就医咨询管理-编辑后的咨询科室名称
	public String getConManEditedConsultDepartmentName(){
		String departmentName=getText(conManEditedConsultDepartmentName);
		log.info("就医咨询管理-编辑后的咨询科室名称："+departmentName);
		return departmentName;		
	}
}
