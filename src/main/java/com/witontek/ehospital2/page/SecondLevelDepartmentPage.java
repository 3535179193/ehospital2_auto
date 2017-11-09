package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class SecondLevelDepartmentPage extends MainPage{

	public SecondLevelDepartmentPage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(SecondLevelDepartmentPage.class);
	
	//二级科室管理-科室名称输入框
	protected Locator secLevDepartmentNameInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevDepartmentNameInputBox");
	protected Locator secLevSearchDepartmentButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevSearchDepartmentButton");
	
	//二级科室管理-新增一级科室按钮
	protected Locator secLevAddFirstDepartmentButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevAddFirstDepartmentButton");
		protected Locator addDepDepartmentNameInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentNameInputBox");
		protected Locator addDepDepartmentCodeInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentCodeInputBox");
		protected Locator addDepSelectBelongDepartmentDropBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepSelectBelongDepartmentDropBox");
		protected Locator addDepSelectBelongDepartmentButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepSelectBelongDepartmentButton");
		protected Locator addDepDepartmentLogoButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentLogoButton");
		protected Locator addDepDepartmentPhoneInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentPhoneInputBox");
		protected Locator addDepDepartmentAddressInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentAddressInputBox");
		protected Locator addDepDepartmentFeatureInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentFeatureInputBox");
		protected Locator addDepDepartmentSummaryInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepDepartmentSummaryInputBox");
		protected Locator addDepAttentionInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepAttentionInputBox");
		protected Locator addDepSaveButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepSaveButton");
		protected Locator addDepReturnButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("addDepReturnButton");
	
	//二级科室管理-序号
	protected Locator secLevNumber=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevNumber");
	protected Locator secLevDepartmentName=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevDepartmentName");
	protected Locator secLevDepartmentAddress=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevDepartmentAddress");
	protected Locator secLevDepartmentFeature=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevDepartmentFeature");
	protected Locator secLevDepartmentSummary=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevDepartmentSummary");
	
	//二级科室管理-编辑按钮
	protected Locator secLevEditButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevEditButton");	
		protected Locator ediDepDepartmentNameInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentNameInputBox");
		protected Locator ediDepDepartmentCodeInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentCodeInputBox");
		protected Locator ediDepSelectBelongDepartmentDropBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepSelectBelongDepartmentDropBox");
		protected Locator ediDepSelectBelongDepartmentButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepSelectBelongDepartmentButton");
		protected Locator ediDepDepartmentLogoButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentLogoButton");
		protected Locator ediDepDepartmentPhoneInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentPhoneInputBox");
		protected Locator ediDepDepartmentAddressInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentAddressInputBox");	
		protected Locator ediDepDepartmentFeatureInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentFeatureInputBox");
		protected Locator ediDepDepartmentSummaryInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepDepartmentSummaryInputBox");
		protected Locator ediDepAttentionInputBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepAttentionInputBox");
		protected Locator ediDepSaveButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepSaveButton");
		protected Locator ediDepReturnButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("ediDepReturnButton");
	
	//二级科室管理-上移按钮
	protected Locator secLevMoveUpButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevMoveUpButton");
	protected Locator secLevMoveDownButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevMoveDownButton");
	protected Locator secLevMoveTopButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevMoveTopButton");
	protected Locator secLevViewDepartmentButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevViewDepartmentButton");
		
	//二级科室管理-每页显示数下拉框
	protected Locator secLevEachPageRecordersDropBox=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevEachPageRecordersDropBox");
	protected Locator secLevEachPageTenRecorders=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevEachPageTenRecorders");
	protected Locator secLevTotalRecorders=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevTotalRecorders");
	protected Locator secLevTotalPages=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevTotalPages");
	protected Locator secLevCurrentPage=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevCurrentPage");
	protected Locator secLevFirstPageButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevFirstPageButton");
	protected Locator secLevPreviousPageButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevPreviousPageButton");
	protected Locator secLevNextPageButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevNextPageButton");
	protected Locator secLevLastPageButton=XmlUtils.readXml("SecondLevelDepartmentPage").get("secLevLastPageButton");

	
	
	//输入二级科室名称
	public void inputSecLevDepartmentNameInputBox(String secLevDepartmentName){
		input(secLevDepartmentNameInputBox, secLevDepartmentName);
	}
	
	//点击搜索科室
	public void clickSecLevSearchDepartmentButton(){
		click(secLevSearchDepartmentButton);
	}
	
	//点击新增二级科室
	public void clickSecLevAddFirstDepartmentButton(){
		click(secLevAddFirstDepartmentButton);
	}
	
	//新增二级科室-输入科室名称
	public void inputAddDepDepartmentNameInputBox(String departmentName){
		input(addDepDepartmentNameInputBox, departmentName);
	}
	
	//新增二级科室-输入科室编码
	public void inputAddDepDepartmentCodeInputBox(String departmentCode){
		input(addDepDepartmentCodeInputBox, departmentCode);
	}
	
	//新增二级科室-点击选择所属一级科室下拉框
	public void clickAddDepSelectBelongDepartmentDropBox(){
		click(addDepSelectBelongDepartmentDropBox);
	}
	
	//新增二级科室-点击选择所属一级科室按钮
	public void clickAddDepSelectBelongDepartmentButton(){
		click(addDepSelectBelongDepartmentButton);
	}
	
	//新增二级科室-点击科室LOGO
	public void clickAddDepDepartmentLogoButton(){
		click(addDepDepartmentLogoButton);
	}
	
	//新增二级科室-输入科室电话
	public void inputAddDepDepartmentPhoneInputBox(String departmentPhone){
		input(addDepDepartmentPhoneInputBox, departmentPhone);
	}
	
	//新增二级科室-输入科室地址
	public void inputAddDepDepartmentAddressInputBox(String departmentAddress){
		input(addDepDepartmentAddressInputBox, departmentAddress);
	}
	
	//新增二级科室-输入科室特色
	public void inputAddDepDepartmentFeatureInputBox(String departmentFeature){
		input(addDepDepartmentFeatureInputBox, departmentFeature);
	}
	
	//新增二级科室-输入科室简介
	public void inputAddDepDepartmentSummaryInputBox(String departmentSummary){
		input(addDepDepartmentSummaryInputBox, departmentSummary);
	}
	
	//新增二级科室-输入注意事项
	public void inputAddDepAttentionInputBox(String Attention){
		input(addDepAttentionInputBox, Attention);
	}
	
	//新增二级科室-点击保存按钮
	public void clickAddDepSaveButton(){
		click(addDepSaveButton);
	}
	
	//新增二级科室-点击返回按钮
	public void clickAddDepReturnButton(){
		click(addDepReturnButton);
	}
	
	//获取序号
	public String getSecLevNumber(){
		String number=getText(secLevNumber);
		log.info("序号："+number);
		return number;
	}
	
	//获取二级科室名称
	public String getSecLevDepartmentName(){
		String departmentName=getText(secLevDepartmentName);
		log.info("二级科室名称："+departmentName);
		return departmentName;
	}
	
	//获取二级科室地址
	public String getSecLevDepartmentAddress(){
		String departmentAddress=getText(secLevDepartmentAddress);
		log.info("二级科室地址："+departmentAddress);
		return departmentAddress;
	}
	
	//获取二级科室特色
	public String getSecLevDepartmentFeature(){
		String departmentFeature=getText(secLevDepartmentFeature);
		log.info("二级科室特色："+departmentFeature);
		return departmentFeature;
	}
	
	//获取二级科室简介
	public String getSecLevDepartmentSummary(){
		String departmentSummary=getText(secLevDepartmentSummary);
		log.info("二级科室简介："+departmentSummary);
		return departmentSummary;
	}
	
	//点击编辑
	public void clickSecLevEditButton(){
		click(secLevEditButton);
	}
	
	//编辑二级科室-编辑科室名称
	public void inputEdiDepDepartmentNameInputBox(String departmentName){
		clearAndInput(ediDepDepartmentNameInputBox, departmentName);
	}
	
	//编辑二级科室-编辑科室编码
	public void inputEdiDepDepartmentCodeInputBox(String departmentCode){
		clearAndInput(ediDepDepartmentCodeInputBox, departmentCode);
	}
	
	//编辑二级科室-点击选择所属一级科室下拉框
	public void clickEdiDepSelectBelongDepartmentDropBox(){
		click(ediDepSelectBelongDepartmentDropBox);
	}
	
	//新增二级科室-点击选择所属一级科室按钮
	public void clickEdiDepSelectBelongDepartmentButton(){
		click(ediDepSelectBelongDepartmentButton);
	}
	
	//新增二级科室-点击科室LOGO
	public void clickEdiDepDepartmentLogoButton(){
		click(ediDepDepartmentLogoButton);
	}
	
	//新增二级科室-编辑科室电话
	public void inputEdiDepDepartmentPhoneInputBox(String departmentPhone){
		clearAndInput(ediDepDepartmentPhoneInputBox, departmentPhone);
	}
	
	//新增二级科室-编辑科室地址
	public void inputEdiDepDepartmentAddressInputBox(String departmentAddress){
		clearAndInput(ediDepDepartmentAddressInputBox, departmentAddress);
	}
	
	//新增二级科室-编辑科室特色
	public void inputEdiDepDepartmentFeatureInputBox(String departmentFeature){
		clearAndInput(ediDepDepartmentFeatureInputBox, departmentFeature);
	}
	
	//新增二级科室-编辑科室简介
	public void inputEdiDepDepartmentSummaryInputBox(String departmentSummary){
		clearAndInput(ediDepDepartmentSummaryInputBox, departmentSummary);
	}
	
	//新增二级科室-编辑注意事项
	public void inputEdiDepAttentionInputBox(String Attention){
		clearAndInput(ediDepAttentionInputBox, Attention);
	}
	
	//新增二级科室-点击保存按钮
	public void clickEdiDepSaveButton(){
		click(ediDepSaveButton);
	}
	
	//新增二级科室-点击返回按钮
	public void clickEdiDepReturnButton(){
		click(ediDepReturnButton);
	}
	
	//点击上移
	public void clickSecLevMoveUpButton(){
		click(secLevMoveUpButton);
	}
	
	//点击下移
	public void clickSecLevMoveDownButton(){
		click(secLevMoveDownButton);
	}
	
	//点击置顶
	public void clickSecLevMoveTopButton(){
		click(secLevMoveTopButton);
	}
	
	//点击每页显示条数下拉框
	public void clickDepManEachPageRecordersDropBox(){
		click(secLevMoveTopButton);
	}
	
	//点击隐藏按钮
	public void clickSecLevViewDepartmentButton(){
		click(secLevViewDepartmentButton);
	}
	
	//选中每页显示10条
	public void clickSecLevEachPageTenRecorders(){
		click(secLevEachPageRecordersDropBox);
		click(secLevEachPageTenRecorders);
	}
	
	//总记录数
	public String getSecLevTotalRecorders(){
		String recorders=getText(secLevTotalRecorders);
		log.info("二级科室总数："+recorders);
		return recorders;
	}
	
	//总页数
	public String getSecLevTotalPages(){
		String pages=getText(secLevTotalPages);
		log.info("二级科室列表总页数："+pages);
		return pages;
	}
	
	//当前页数
	public String getSecLevCurrentPage(){
		String page=getText(secLevCurrentPage);
		log.info("二级科室列表当前页数："+page);
		return page;
	}
	
	//点击第一页
	public void clickSecLevFirstPageButton(){
		click(secLevFirstPageButton);
	}
	
	//点击上一页
	public void clickSecLevPreviousPageButton(){
		click(secLevPreviousPageButton);
	}
	
	//点击下一页
	public void clickSecLevNextPageButton(){
		click(secLevNextPageButton);
	}
	
	//点击最末页
	public void clickSecLevLastPageButton(){
		click(secLevLastPageButton);
	}
	
}
