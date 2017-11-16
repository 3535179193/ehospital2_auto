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
	protected Locator conManDepartmentNameInputBox=XmlUtils.readXml("ConsultManagePage").get("conManDepartmentNameInputBox");
	protected Locator conManSearchButton=XmlUtils.readXml("ConsultManagePage").get("conManSearchButton");
	
	//就医咨询管理-新增科室咨询按钮
	protected Locator conManAddDepartmentConsultButton=XmlUtils.readXml("ConsultManagePage").get("conManAddDepartmentConsultButton");
		protected Locator addConDepartmentNameInputBox=XmlUtils.readXml("ConsultManagePage").get("addConDepartmentNameInputBox");
		protected Locator addConDepartmentIDInputBox=XmlUtils.readXml("ConsultManagePage").get("addConDepartmentIDInputBox");
		protected Locator addConPasswordInputBox=XmlUtils.readXml("ConsultManagePage").get("addConPasswordInputBox");
		protected Locator addConSaveButton=XmlUtils.readXml("ConsultManagePage").get("addConSaveButton");
		protected Locator addConSaveAndAddButton=XmlUtils.readXml("ConsultManagePage").get("addConSaveAndAddButton");
		protected Locator addConCancleButton=XmlUtils.readXml("ConsultManagePage").get("addConCancleButton");
		
	//就医咨询管理-序号
	protected Locator conManNumber=XmlUtils.readXml("ConsultManagePage").get("conManNumber");
	protected Locator conManDepartmentName=XmlUtils.readXml("ConsultManagePage").get("conManDepartmentName");
	protected Locator conManDepartmentID=XmlUtils.readXml("ConsultManagePage").get("conManDepartmentID");
	protected Locator conManPassword=XmlUtils.readXml("ConsultManagePage").get("conManPassword");
	protected Locator conManDeleteButton=XmlUtils.readXml("ConsultManagePage").get("conManDeleteButton");
	
	//就医咨询管理-编辑按钮
	protected Locator conManEditButton=XmlUtils.readXml("ConsultManagePage").get("conManEditButton");
		protected Locator ediConDepartmentNameInputBox=XmlUtils.readXml("ConsultManagePage").get("ediConDepartmentNameInputBox");
		protected Locator ediConDepartmentIDInputBox=XmlUtils.readXml("ConsultManagePage").get("ediConDepartmentIDInputBox");
		protected Locator ediConPasswordInputBox=XmlUtils.readXml("ConsultManagePage").get("ediConPasswordInputBox");
		protected Locator ediConSaveButton=XmlUtils.readXml("ConsultManagePage").get("ediConSaveButton");
		protected Locator ediConCancleButton=XmlUtils.readXml("ConsultManagePage").get("ediConCancleButton");
	
	//被验证的数据
	protected Locator conManAssertAddConsultDepartmentName=XmlUtils.readXml("ConsultManagePage").get("conManAssertAddConsultDepartmentName");
	protected Locator conManAssertEditConsultDepartmentName=XmlUtils.readXml("ConsultManagePage").get("conManAssertEditConsultDepartmentName");
	
	
	//就医咨询管理-输入科室名称
	public void inputConManDepartmentNameInputBox(String departmentName){
		input(conManDepartmentNameInputBox, departmentName);
	}
	
	//就医咨询管理-点击搜索按钮
	public void clickConManSearchButton(){
		click(conManSearchButton);
	}
	
	//就医咨询管理-点击新增科室咨询按钮
	public void clickConManAddDepartmentConsultButton(){
		click(conManAddDepartmentConsultButton);
	}
	
	//新增科室咨询-输入科室名称
	public void inputAddConDepartmentNameInputBox(String departmentName){
		input(addConDepartmentNameInputBox, departmentName);
	}
	
	//新增科室咨询-输入医生ID
	public void inputAddConDepartmentIDInputBox(String departmentID){
		input(addConDepartmentIDInputBox, departmentID);
	}
	
	//新增科室咨询-输入咨询密码
	public void inputAddConPasswordInputBox(String password){
		input(addConPasswordInputBox, password);
	}
	
	//新增科室咨询-点击保存按钮
	public void clickAddConSaveButton(){
		click(addConSaveButton);
	}
	
	//新增科室咨询-点击保存并继续添加按钮
	public void clickAddConSaveAndAddButton(){
		click(addConSaveAndAddButton);
	}
	
	//新增科室咨询-点击取消按钮
	public void clickAddConCancleButton(){
		click(addConCancleButton);
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
	public String getConManDepartmentID(){
		String departmentID=getText(conManDepartmentID);
		log.info("就医咨询管理-咨询医生ID："+departmentID);
		return departmentID;
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
	
	//编辑科室咨询-输入科室名称
	public void inputEdiConDepartmentNameInputBox(String departmentName){
		clearAndInput(ediConDepartmentNameInputBox, departmentName);
	}
	
	//编辑科室咨询-输入咨询医生ID
	public void inputEdiConDepartmentIDInputBox(String departmentID){
		clearAndInput(ediConDepartmentIDInputBox, departmentID);
	}
	
	//编辑科室咨询-输入咨询密码
	public void inputEdiConPasswordInputBox(String password){
		clearAndInput(ediConPasswordInputBox,password);
	}
	
	//编辑科室咨询-点击保存按钮
	public void clickEdiConSaveButton(){
		click(ediConSaveButton);
	}
	
	//编辑科室咨询-点击取消按钮
	public void clickEdiConCancleButton(){
		click(ediConCancleButton);
	}
	
	//就医咨询管理-被验证的新增咨询科室名称
	public String getConManAssertAddConsultDepartmentName(){
		String departmentName=getText(conManAssertAddConsultDepartmentName);
		log.info("就医咨询管理-被验证的新增咨询科室名称："+departmentName);
		return departmentName;		
	}
	
	//就医咨询管理-被验证的编辑咨询科室名称
	public String getConManAssertEditConsultDepartmentName(){
		String departmentName=getText(conManAssertEditConsultDepartmentName);
		log.info("就医咨询管理-被验证的编辑咨询科室名称："+departmentName);
		return departmentName;		
	}
}
