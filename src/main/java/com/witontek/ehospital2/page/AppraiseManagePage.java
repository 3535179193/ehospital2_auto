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
	protected Locator appManAppraiseNameInputBox=XmlUtils.getElementXml("AppraiseManagePage").get("appManAppraiseNameInputBox");
	protected Locator appManSearchButton=XmlUtils.getElementXml("AppraiseManagePage").get("appManSearchButton");
	
	//就医评价管理-新增评价问卷按钮
	protected Locator appManAddAppraiseButton=XmlUtils.getElementXml("AppraiseManagePage").get("appManAddAppraiseButton");
		protected Locator appBoxAppraiseNameInputBox=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxAppraiseNameInputBox");
		protected Locator appBoxAppraiseDescInputBox=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxAppraiseDescInputBox");
		protected Locator appBoxAppraiseTypeDropBox=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxAppraiseTypeDropBox");
		protected Locator appBoxAppraiseTypeButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxAppraiseTypeButton");
		protected Locator appBoxDraftStatusButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxDraftStatusButton");
		protected Locator appBoxPostedStatusButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxPostedStatusButton");
		protected Locator appBoxStopStatusButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxStopStatusButton");
		protected Locator appBoxSaveButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxSaveButton");
		protected Locator appBoxSaveAndAddButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxSaveAndAddButton");
		protected Locator appBoxCancleButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxCancleButton");
		
	//就医评价管理-序号
	protected Locator appManNumber=XmlUtils.getElementXml("AppraiseManagePage").get("appManNumber");
	protected Locator appManAppraiseName=XmlUtils.getElementXml("AppraiseManagePage").get("appManAppraiseName");
	protected Locator appManAppraiseType=XmlUtils.getElementXml("AppraiseManagePage").get("appManAppraiseType");
	protected Locator appManAuthor=XmlUtils.getElementXml("AppraiseManagePage").get("appManAuthor");
	protected Locator appManCreateDate=XmlUtils.getElementXml("AppraiseManagePage").get("appManCreateDate");
	protected Locator appManUpdateDate=XmlUtils.getElementXml("AppraiseManagePage").get("appManUpdateDate");
	protected Locator appManStatus=XmlUtils.getElementXml("AppraiseManagePage").get("appManStatus");
	protected Locator appManFillNumber=XmlUtils.getElementXml("AppraiseManagePage").get("appManFillNumber");
	protected Locator appManDeleteButton=XmlUtils.getElementXml("AppraiseManagePage").get("appManDeleteButton");
	
	//就医咨询管理-编辑按钮
	protected Locator appManEditButton=XmlUtils.getElementXml("AppraiseManagePage").get("appManEditButton");
		protected Locator appBoxEditAppraiseItemButton=XmlUtils.getElementXml("AppraiseManagePage").get("appBoxEditAppraiseItemButton");
	
	//被验证的数据
	protected Locator conManAssertAddConsultDepartmentName=XmlUtils.getElementXml("AppraiseManagePage").get("conManAssertAddConsultDepartmentName");
	protected Locator conManAssertEditConsultDepartmentName=XmlUtils.getElementXml("AppraiseManagePage").get("conManAssertEditConsultDepartmentName");
	
	
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
	
	//评价问卷框-输入问卷名称
	public void inputAppBoxAppraiseNameInputBox(String appraiseName){
		input(appBoxAppraiseNameInputBox, appraiseName);
	}
	
	//评价问卷框-输入问卷说明
	public void inputAppBoxAppraiseDescInputBox(String appraiseDesc){
		input(appBoxAppraiseDescInputBox, appraiseDesc);
	}
	
	//点击评价问卷框-问卷类型下拉框
	public void clickAppBoxAppraiseTypeDropBox(){
		click(appBoxAppraiseTypeDropBox);
	}
	
	//评价问卷框-选择问卷类型按钮
	public void clickAppBoxAppraiseTypeButton(){
		click(appBoxAppraiseTypeButton);
	}
	
	//点击评价问卷框-草稿问卷状态按钮
	public void clickAppBoxDraftStatusButton(){
		click(appBoxDraftStatusButton);
	}
	
	//点击评价问卷框-发布问卷状态按钮
	public void clickAppBoxPostedStatusButton(){
		click(appBoxPostedStatusButton);
	}
	
	//点击评价问卷框-暂停问卷状态按钮
	public void clickAppBoxStopStatusButton(){
		click(appBoxStopStatusButton);
	}
	
	//点击评价问卷框-保存按钮
	public void clickAppBoxSaveButton(){
		click(appBoxSaveButton);
	}
	
	//点击评价问卷框-保存后继续添加按钮
	public void clickAppBoxSaveAndAddButton(){
		click(appBoxSaveAndAddButton);
	}
	
	//点击评价问卷框-取消按钮
	public void clickAppBoxCancleButton(){
		click(appBoxCancleButton);
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
	
	//编辑评价问卷框-问卷名称输入框
	public void editAppBoxAppraiseNameInputBox(String appraiseName){
		clearAndInput(appBoxAppraiseNameInputBox, appraiseName);
	}
	
	//编辑评价问卷框-问卷说明输入框
	public void editAppBoxAppraiseDescInputBox(String appraiseDesc){
		clearAndInput(appBoxAppraiseDescInputBox, appraiseDesc);
	}

	//点击评价问卷框-编辑评价项按钮
	public void clickAppBoxEditAppraiseItemButton(){
		click(appBoxEditAppraiseItemButton);
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
