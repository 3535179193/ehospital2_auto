package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class AppraiseManagePage extends MainPage{

	public AppraiseManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(AppraiseManagePage.class);
	
	//就医评价管理-问卷名称输入框
	protected Locator appManAppraiseNameInputBox=XmlUtils.readXml("AppraiseManagePage").get("appManAppraiseNameInputBox");
	protected Locator appManSearchButton=XmlUtils.readXml("AppraiseManagePage").get("appManSearchButton");
	
	//就医评价管理-新增评价问卷按钮
	protected Locator appManAddAppraiseButton=XmlUtils.readXml("AppraiseManagePage").get("appManAddAppraiseButton");
		protected Locator addAppAppraiseNameInputBox=XmlUtils.readXml("AppraiseManagePage").get("addAppAppraiseNameInputBox");
		protected Locator addAppAppraiseDescInputBox=XmlUtils.readXml("AppraiseManagePage").get("addAppAppraiseDescInputBox");
		protected Locator addAppAppraiseTypeDropBox=XmlUtils.readXml("AppraiseManagePage").get("addAppAppraiseTypeDropBox");
		protected Locator addAppAppraiseTypeButton=XmlUtils.readXml("AppraiseManagePage").get("addAppAppraiseTypeButton");
		protected Locator addAppDraftStatusButton=XmlUtils.readXml("AppraiseManagePage").get("addAppDraftStatusButton");
		protected Locator addAppPostedStatusButton=XmlUtils.readXml("AppraiseManagePage").get("addAppPostedStatusButton");
		protected Locator addAppStopStatusButton=XmlUtils.readXml("AppraiseManagePage").get("addAppStopStatusButton");
		protected Locator addAppSaveButton=XmlUtils.readXml("AppraiseManagePage").get("addAppSaveButton");
		protected Locator addAppSaveAndAddButton=XmlUtils.readXml("AppraiseManagePage").get("addAppSaveAndAddButton");
		protected Locator addAppCancleButton=XmlUtils.readXml("AppraiseManagePage").get("addAppCancleButton");
		
	//就医评价管理-序号
	protected Locator appManNumber=XmlUtils.readXml("AppraiseManagePage").get("appManNumber");
	protected Locator appManAppraiseName=XmlUtils.readXml("AppraiseManagePage").get("appManAppraiseName");
	protected Locator appManAppraiseType=XmlUtils.readXml("AppraiseManagePage").get("appManAppraiseType");
	protected Locator appManAuthor=XmlUtils.readXml("AppraiseManagePage").get("appManAuthor");
	protected Locator appManCreateDate=XmlUtils.readXml("AppraiseManagePage").get("appManCreateDate");
	protected Locator appManUpdateDate=XmlUtils.readXml("AppraiseManagePage").get("appManUpdateDate");
	protected Locator appManStatus=XmlUtils.readXml("AppraiseManagePage").get("appManStatus");
	protected Locator appManFillNumber=XmlUtils.readXml("AppraiseManagePage").get("appManFillNumber");
	protected Locator appManDeleteButton=XmlUtils.readXml("AppraiseManagePage").get("appManDeleteButton");
	
	//就医咨询管理-编辑按钮
	protected Locator appManEditButton=XmlUtils.readXml("AppraiseManagePage").get("appManEditButton");
		protected Locator ediAppAppraiseNameInputBox=XmlUtils.readXml("AppraiseManagePage").get("ediAppAppraiseNameInputBox");	
		protected Locator ediAppAppraiseDescInputBox=XmlUtils.readXml("AppraiseManagePage").get("ediAppAppraiseDescInputBox");
		protected Locator ediAppAppraiseTypeDropBox=XmlUtils.readXml("AppraiseManagePage").get("ediAppAppraiseTypeDropBox");
		protected Locator ediAppAppraiseTypeButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppAppraiseTypeButton");
		protected Locator ediAppDraftStatusButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppDraftStatusButton");
		protected Locator ediAppPostedStatusButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppPostedStatusButton");
		protected Locator ediAppStopStatusButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppStopStatusButton");
		protected Locator ediAppSaveButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppSaveButton");
		protected Locator ediAppEditAppraiseItemButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppEditAppraiseItemButton");
		protected Locator ediAppCancleButton=XmlUtils.readXml("AppraiseManagePage").get("ediAppCancleButton");
	
	//被验证的数据
	protected Locator conManAssertAddConsultDepartmentName=XmlUtils.readXml("AppraiseManagePage").get("conManAssertAddConsultDepartmentName");
	protected Locator conManAssertEditConsultDepartmentName=XmlUtils.readXml("AppraiseManagePage").get("conManAssertEditConsultDepartmentName");
	
	
	//就医评价管理-输入问卷名称
	public void inputAppManAppraiseNameInputBox(String appraiseName){
		input(appManAppraiseNameInputBox, appraiseName);
	}
	
	//就医评价管理-点击搜索按钮
	public void clickAppManSearchButton(){
		click(appManSearchButton);
	}
	
	//就医评价管理-点击新增评价问卷按钮
	public void clickAppManAddAppraiseButton(){
		click(appManAddAppraiseButton);
	}
	
	//新增评价问卷-输入问卷名称
	public void inputAddAppAppraiseNameInputBox(String appraiseName){
		input(addAppAppraiseNameInputBox, appraiseName);
	}
	
	//新增评价问卷-输入问卷说明
	public void inputAddAppAppraiseDescInputBox(String appraiseDesc){
		input(addAppAppraiseDescInputBox, appraiseDesc);
	}
	
	//新增评价问卷-点击问卷类型下拉框
	public void clickAddAppAppraiseTypeDropBox(){
		click(addAppAppraiseTypeDropBox);
	}
	
	//新增评价问卷-选择问卷类型按钮
	public void clickAddAppAppraiseTypeButton(){
		click(addAppAppraiseTypeButton);
	}
	
	//新增评价问卷-点击问卷状态单选按钮
	public void clickAddAppDraftStatusButton(){
		click(addAppDraftStatusButton);
	}
	
	//新增评价问卷-点击问卷状态单选按钮
	public void clickAddAppPostedStatusButton(){
		click(addAppPostedStatusButton);
	}
	
	//新增评价问卷-点击问卷状态单选按钮
	public void clickAddAppStopStatusButton(){
		click(addAppStopStatusButton);
	}
	
	//新增评价问卷-点击保存按钮
	public void clickAddAppSaveButton(){
		click(addAppSaveButton);
	}
	
	//新增评价问卷-点击保存后继续添加按钮
	public void clickAddAppSaveAndAddButton(){
		click(addAppSaveAndAddButton);
	}
	
	//新增评价问卷-点击取消按钮
	public void clickAddAppCancleButton(){
		click(addAppCancleButton);
	}
	
	//就医评价管理-获取序号
	public String getAppManNumber(){
		String number=getText(appManNumber);
		log.info("就医评价管理-序号："+number);
		return number;
	}
	
	//就医评价管理-获取评价问卷名称
	public String getAppManAppraiseName(){
		String appraiseName=getText(appManAppraiseName);
		log.info("就医评价管理-评价问卷名称："+appraiseName);
		return appraiseName;
	}
	
	//就医评价管理-获取评价问卷类型
	public String getAppManAppraiseType(){
		String appraiseType=getText(appManAppraiseType);
		log.info("就医评价管理-评价问卷类型："+appraiseType);
		return appraiseType;
	}
	
	//就医评价管理-获取创建人
	public String getAppManAuthor(){
		String author=getText(appManAuthor);
		log.info("就医评价管理-创建人："+author);
		return author;
	}
	
	//就医评价管理-获取创建日期
	public String getAppManCreateDate(){
		String createDate=getText(appManCreateDate);
		log.info("就医评价管理-创建日期："+createDate);
		return createDate;
	}
	
	//就医评价管理-获取更新日期
	public String getAppManUpdateDate(){
		String updateDate=getText(appManUpdateDate);
		log.info("就医评价管理-创建人："+updateDate);
		return updateDate;
	}
	
	//就医评价管理-获取状态
	public String getAppManStatus(){
		String status=getText(appManStatus);
		log.info("就医评价管理-状态："+status);
		return status;
	}
	
	//就医评价管理-获取填写数
	public String getAppManFillNumber(){
		String fillNumber=getText(appManFillNumber);
		log.info("就医评价管理-填写数："+fillNumber);
		return fillNumber;
	}
	
	//就医评价管理-点击删除按钮
	public void clickAppManDeleteButton(){
		click(appManDeleteButton);
	}
	
	//就医咨询管理-点击编辑按钮
	public void clickAppManEditButton(){
		click(appManEditButton);
	}
	
	//编辑评价问卷-输入问卷名称
	public void inputEdiAppAppraiseNameInputBox(String appraiseName){
		clearAndInput(ediAppAppraiseNameInputBox, appraiseName);
	}
	
	//编辑评价问卷-输入问卷说明
	public void inputEdiAppAppraiseDescInputBox(String appraiseDesc){
		clearAndInput(ediAppAppraiseDescInputBox, appraiseDesc);
	}
	
	//编辑评价问卷-点击问卷类型下拉框
	public void clickEdiAppAppraiseTypeDropBox(){
		click(ediAppAppraiseTypeDropBox);
	}
	
	//编辑评价问卷-选择问卷类型按钮
	public void clickEdiAppAppraiseTypeButton(){
		click(ediAppAppraiseTypeButton);
	}
	
	//编辑评价问卷-点击草稿问卷状态按钮
	public void clickEdiAppDraftStatusButton(){
		click(ediAppDraftStatusButton);
	}
	
	//编辑评价问卷-点击发布问卷状态按钮
	public void clickEdiAppPostedStatusButton(){
		click(ediAppPostedStatusButton);
	}
	
	//编辑评价问卷-点击暂停问卷状态按钮
	public void clickEdiAppStopStatusButton(){
		click(ediAppStopStatusButton);
	}
	
	//编辑评价问卷-点击保存按钮
	public void clickEdiAppSaveButton(){
		click(ediAppSaveButton);
	}
	
	//编辑评价问卷-点击编辑评价项按钮
	public void clickEdiAppEditAppraiseItemButton(){
		click(ediAppEditAppraiseItemButton);
	}
	
	//编辑评价问卷-点击取消按钮
	public void clickEdiAppCancleButton(){
		click(ediAppCancleButton);
	}
	
//	//就医咨询管理-被验证的新增咨询科室名称
//	public String getConManAssertAddConsultDepartmentName(){
//		String departmentName=getText(conManAssertAddConsultDepartmentName);
//		log.info("就医咨询管理-被验证的新增咨询科室名称："+departmentName);
//		return departmentName;		
//	}
//	
//	//就医咨询管理-被验证的编辑咨询科室名称
//	public String getConManAssertEditConsultDepartmentName(){
//		String departmentName=getText(conManAssertEditConsultDepartmentName);
//		log.info("就医咨询管理-被验证的编辑咨询科室名称："+departmentName);
//		return departmentName;		
//	}
	
}
