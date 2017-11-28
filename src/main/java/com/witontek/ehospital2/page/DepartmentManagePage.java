package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class DepartmentManagePage extends DepartmentCategoryManagePage{

	public DepartmentManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentManagePage.class);
	
	//二级科室管理-科室名称输入框
	protected Locator depManDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentNameInputBox");
	protected Locator depManSearchButton=XmlUtils.readXml("DepartmentManagePage").get("depManSearchButton");
	
	//二级科室管理-新增一级科室按钮
	protected Locator depManAddDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManAddDepartmentButton");
	protected Locator depManEditButton=XmlUtils.readXml("DepartmentManagePage").get("depManEditButton");	
		protected Locator depPageDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentNameInputBox");
		protected Locator depPageDepartmentCodeInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentCodeInputBox");
		protected Locator depPageSelectBelongCategoryDropBox=XmlUtils.readXml("DepartmentManagePage").get("depPageSelectBelongCategoryDropBox");
		protected Locator depPageSelectBelongCategoryButton=XmlUtils.readXml("DepartmentManagePage").get("depPageSelectBelongCategoryButton");
		protected Locator depPageDepartmentLogoButton=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentLogoButton");
		protected Locator depPageDepartmentPhoneInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentPhoneInputBox");
		protected Locator depPageDepartmentAddressInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentAddressInputBox");
		protected Locator depPageDepartmentFeatureInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentFeatureInputBox");
		protected Locator depPageDepartmentSummaryInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageDepartmentSummaryInputBox");
		protected Locator depPageAttentionInputBox=XmlUtils.readXml("DepartmentManagePage").get("depPageAttentionInputBox");
		protected Locator depPageSaveButton=XmlUtils.readXml("DepartmentManagePage").get("depPageSaveButton");
		protected Locator depPageUpdateButton=XmlUtils.readXml("DepartmentManagePage").get("depPageUpdateButton");
		protected Locator depPageReturnButton=XmlUtils.readXml("DepartmentManagePage").get("depPageReturnButton");
	
	//二级科室管理-序号
	protected Locator depManNumber=XmlUtils.readXml("DepartmentManagePage").get("depManNumber");
	protected Locator depManFirstDepartmentName=XmlUtils.readXml("DepartmentManagePage").get("depManFirstDepartmentName");
	protected Locator depManSecondDepartmentName=XmlUtils.readXml("DepartmentManagePage").get("depManSecondDepartmentName");
	protected Locator depManDepartmentAddress=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentAddress");
	protected Locator depManDepartmentFeature=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentFeature");
	protected Locator depManDepartmentSummary=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentSummary");
	
	//二级科室管理-上移按钮
	protected Locator depManMoveUpButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveUpButton");
	protected Locator depManMoveDownButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveDownButton");
	protected Locator depManMoveTopButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveTopButton");
	protected Locator depManHideButton=XmlUtils.readXml("DepartmentManagePage").get("depManHideButton");
	
	
	//二级科室管理-输入科室名称
	public void inputDepManDepartmentNameInputBox(String departmentName){
		input(depManDepartmentNameInputBox, departmentName);
	}
	
	//点击二级科室管理-搜索科室按钮
	public void clickDepManSearchButton(){
		click(depManSearchButton);
	}
	
	//点击二级科室管理-新增二级科室按钮
	public void clickDepManAddDepartmentButton(){
		click(depManAddDepartmentButton);
	}
	
	//新二级科室页面-输入科室名称
	public void inputDepPageDepartmentNameInputBox(String departmentName){
		input(depPageDepartmentNameInputBox, departmentName);
	}
	
	//二级科室页面-输入科室编码
	public void inputDepPageDepartmentCodeInputBox(String departmentCode){
		input(depPageDepartmentCodeInputBox, departmentCode);
	}
	
	//点击二级科室页面-选择所属一级科室下拉框
	public void clickDepPageSelectBelongCategoryDropBox(){
		click(depPageSelectBelongCategoryDropBox);
	}
	
	//二级科室页面-选择所属一级科室按钮
	public void clickDepPageSelectBelongCategoryButton(){
		click(depPageSelectBelongCategoryButton);
	}
	
	//点击二级科室页面-科室LOGO按钮
	public void clickDepPageDepartmentLogoButton(){
		click(depPageDepartmentLogoButton);
	}
	
	//二级科室页面-输入科室电话
	public void inputDepPageDepartmentPhoneInputBox(String departmentPhone){
		input(depPageDepartmentPhoneInputBox, departmentPhone);
	}
	
	//二级科室页面-输入科室地址
	public void inputDepPageDepartmentAddressInputBox(String departmentAddress){
		input(depPageDepartmentAddressInputBox, departmentAddress);
	}
	
	//二级科室页面-输入科室特色
	public void inputDepPageDepartmentFeatureInputBox(String departmentFeature){
		input(depPageDepartmentFeatureInputBox, departmentFeature);
	}
	
	//二级科室页面-输入科室简介
	public void inputDepPageDepartmentSummaryInputBox(String departmentSummary){
		input(depPageDepartmentSummaryInputBox, departmentSummary);
	}
	
	//二级科室页面-输入注意事项
	public void inputDepPageAttentionInputBox(String Attention){
		input(depPageAttentionInputBox, Attention);
	}
	
	//点击二级科室页面-保存按钮
	public void clickDepPageSaveButton(){
		click(depPageSaveButton);
	}
	
	//点击二级科室页面-返回按钮
	public void clickDepPageReturnButton(){
		click(depPageReturnButton);
	}
	
	//获取二级科室管理-序号
	public String getDepManNumber(){
		String number=getText(depManNumber);
		log.info("二级科室管理-序号："+number);
		return number;
	}
	
	//获取二级科室管理-序号1的二级科室名称
	public String getDepManFirstDepartmentName(){
		String firstDepartmentName=getText(depManFirstDepartmentName);
		log.info("二级科室管理-序号1的二级科室名称："+firstDepartmentName);
		return firstDepartmentName;
	}
	
	//获取二级科室管理-序号2的二级科室名称
	public String getDepManSecondDepartmentName(){
		String secondDepartmentName=getText(depManSecondDepartmentName);
		log.info("二级科室管理-序号2的二级科室名称："+secondDepartmentName);
		return secondDepartmentName;
	}
	
	//获取二级科室管理-科室地址
	public String getDepManDepartmentAddress(){
		String departmentAddress=getText(depManDepartmentAddress);
		log.info("二级科室管理-科室地址："+departmentAddress);
		return departmentAddress;
	}
	
	//获取二级科室管理-科室特色
	public String getDepManDepartmentFeature(){
		String departmentFeature=getText(depManDepartmentFeature);
		log.info("二级科室管理-科室特色："+departmentFeature);
		return departmentFeature;
	}
	
	//获取二级科室管理-科室简介
	public String getDepManDepartmentSummary(){
		String departmentSummary=getText(depManDepartmentSummary);
		log.info("二级科室管理-科室简介："+departmentSummary);
		return departmentSummary;
	}
	
	//点击二级科室管理-编辑按钮
	public void clickDepManEditButton(){
		click(depManEditButton);
	}
	
	//二级科室页面-编辑科室名称
	public void editDepPageDepartmentNameInputBox(String departmentName){
		clearAndInput(depPageDepartmentNameInputBox, departmentName);
	}
	
	//二级科室页面-编辑科室编码
	public void editDepPageDepartmentCodeInputBox(String departmentCode){
		clearAndInput(depPageDepartmentCodeInputBox, departmentCode);
	}
	
	//二级科室页面-编辑科室电话
	public void editDepPageDepartmentPhoneInputBox(String departmentPhone){
		clearAndInput(depPageDepartmentPhoneInputBox, departmentPhone);
	}
	
	//二级科室页面-编辑科室地址
	public void editDepPageDepartmentAddressInputBox(String departmentAddress){
		clearAndInput(depPageDepartmentAddressInputBox, departmentAddress);
	}
	
	//二级科室页面-编辑科室特色
	public void editDepPageDepartmentFeatureInputBox(String departmentFeature){
		clearAndInput(depPageDepartmentFeatureInputBox, departmentFeature);
	}
	
	//二级科室页面-编辑科室简介
	public void editDepPageDepartmentSummaryInputBox(String departmentSummary){
		clearAndInput(depPageDepartmentSummaryInputBox, departmentSummary);
	}
	
	//二级科室页面-编辑注意事项
	public void editDepPageAttentionInputBox(String Attention){
		clearAndInput(depPageAttentionInputBox, Attention);
	}
	
	//点击二级科室页面-修改按钮
	public void clickDepPageUpdateButton(){
		click(depPageUpdateButton);
	}
	
	//点击二级科室管理-上移按钮
	public void clickDepManMoveUpButton(){
		click(depManMoveUpButton);
	}
	
	//点击二级科室管理-下移按钮
	public void clickDepManMoveDownButton(){
		click(depManMoveDownButton);
	}
	
	//点击二级科室管理-置顶按钮
	public void clickDepManMoveTopButton(){
		click(depManMoveTopButton);
	}

	//点击二级科室管理-隐藏按钮
	public void clickDepManHideButton(){
		click(depManHideButton);
	}
	
	//获取二级科室管理-隐藏按钮文本
	public String getDepManHideButtonText(){
		String text=getText(depManHideButton);
		log.info("二级科室管理-隐藏按钮文本："+text);
		return text;
	}
	

}
