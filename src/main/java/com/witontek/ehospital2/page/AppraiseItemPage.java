package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class AppraiseItemPage extends AppraiseManagePage{

	public AppraiseItemPage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(AppraiseItemPage.class);
	
	//新增评价项-评价项名称输入框
	protected Locator appIteAppraiseItemNameInputBox=XmlUtils.getElementXml("AppraiseItemPage").get("appIteAppraiseItemNameInputBox");
	protected Locator appIteAppraiseItemTypeDropBox=XmlUtils.getElementXml("AppraiseItemPage").get("appIteAppraiseItemTypeDropBox");
	protected Locator appIteSelectTextTypeButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteSelectTextTypeButton");
	protected Locator appIteSelectStarTypeButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteSelectStarTypeButton");
	protected Locator appIteSaveButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteSaveButton");
	protected Locator appIteCancleButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteCancleButton");
	
	//就医评价管理-新增评价问卷按钮
	protected Locator appIteFromAppraiseAddButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteFromAppraiseAddButton");
		protected Locator froAppAppraiseNameInputBox=XmlUtils.getElementXml("AppraiseItemPage").get("froAppAppraiseNameInputBox");
		protected Locator froAppSearchInputButton=XmlUtils.getElementXml("AppraiseItemPage").get("froAppSearchInputButton");
		protected Locator froAppMoreButton=XmlUtils.getElementXml("AppraiseItemPage").get("froAppMoreButton");
		protected Locator froAppAppraiseItemName=XmlUtils.getElementXml("AppraiseItemPage").get("froAppAppraiseItemName");
		protected Locator froAppAppraiseItemType=XmlUtils.getElementXml("AppraiseItemPage").get("froAppAppraiseItemType");
		protected Locator froAppAddButton=XmlUtils.getElementXml("AppraiseItemPage").get("froAppAddButton");
		protected Locator froAppCloseButton=XmlUtils.getElementXml("AppraiseItemPage").get("addAppStopStatusButton");
		
	//已添加星级评价项-序号
	protected Locator appIteStarNumber=XmlUtils.getElementXml("AppraiseItemPage").get("appIteStarNumber");
	protected Locator appIteStarName=XmlUtils.getElementXml("AppraiseItemPage").get("appIteStarName");
	protected Locator appIteStarType=XmlUtils.getElementXml("AppraiseItemPage").get("appIteStarType");
	protected Locator appIteStarDeleteButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteStarDeleteButton");
	
	//已添加文本评价项-序号
	protected Locator appIteTextNumber=XmlUtils.getElementXml("AppraiseItemPage").get("appIteTextNumber");
	protected Locator appIteTextName=XmlUtils.getElementXml("AppraiseItemPage").get("appIteTextName");
	protected Locator appIteTextType=XmlUtils.getElementXml("AppraiseItemPage").get("appIteTextType");
	protected Locator appIteTextDeleteButton=XmlUtils.getElementXml("AppraiseItemPage").get("appIteTextDeleteButton");


	//新增评价项-输入评价项名称
	public void inputAppIteAppraiseItemNameInputBox(String appraiseItemName){
		input(appIteAppraiseItemNameInputBox, appraiseItemName);
	}
	
	//新增评价项-点击评价项类型下拉框
	public void clickAppIteAppraiseItemTypeDropBox(){
		click(appIteAppraiseItemTypeDropBox);
	}
	
	//新增评价项-选择文本类型按钮
	public void clickAppIteSelectTextTypeButton(){
		click(appIteSelectTextTypeButton);
	}
	
	//新增评价项-选择星级类型按钮
	public void clickAppIteSelectStarTypeButton(){
		click(appIteSelectStarTypeButton);
	}
	
	//新增评价项-点击保存按钮
	public void clickAppIteSaveButton(){
		click(appIteSaveButton);
	}
	
	//新增评价项-点击取消按钮
	public void clickAppIteCancleButton(){
		click(appIteCancleButton);
	}
	
	//新增评价项-点击从现有评价项添加按钮
	public void clickAppIteFromAppraiseAddButton(){
		click(appIteFromAppraiseAddButton);
	}
	
	//现有评价项-输入评价项名称
	public void inputFroAppAppraiseNameInputBox(String appraiseItemName){
		input(froAppAppraiseNameInputBox, appraiseItemName);
	}
	
	//现有评价项-点击搜索按钮
	public void clickFroAppSearchInputButton(){
		click(froAppSearchInputButton);
	}
	
	//现有评价项-点击序号为1的多选按钮
	public void clickFroAppMoreButton(){
		click(froAppMoreButton);
	}
	
	//现有评价项-获取序号为1的评价项名称
	public String getFroAppAppraiseItemName(){
		String appraiseItemName=getText(froAppAppraiseItemName);
		log.info("现有评价项-序号为1的评价项名称："+appraiseItemName);
		return appraiseItemName;
	}
	
	//现有评价项-获取序号为1的评价项类型
	public String getFroAppAppraiseItemType(){
		String appraiseItemType=getText(froAppAppraiseItemType);
		log.info("现有评价项-序号为1的评价项类型："+appraiseItemType);
		return appraiseItemType;
	}
	
	//现有评价项-点击添加按钮
	public void clickFroAppAddButton(){
		click(froAppAddButton);
	}
	
	//现有评价项-点击关闭按钮
	public void clickFroAppCloseButton(){
		click(froAppCloseButton);
	}
	
	//已添加星级评价项-获取序号
	public String getAppIteStarNumber(){
		String number=getText(appIteStarNumber);
		log.info("已添加星级评价项-序号："+number);
		return number;
	}
	
	//已添加星级评价项-获取评价问卷名称
	public String getAppIteStarName(){
		String appraiseItemName=getText(appIteStarName);
		log.info("已添加星级评价项-评价项名称："+appraiseItemName);
		return appraiseItemName;
	}
	
	//已添加星级评价项-获取评价项类型
	public String getAppIteStarType(){
		String appraiseItemType=getText(appIteStarType);
		log.info("已添加星级评价项-评价项类型："+appraiseItemType);
		return appraiseItemType;
	}
	
	//已添加星级评价项-点击移除按钮
	public void clickAppIteStarDeleteButton(){
		click(appIteStarDeleteButton);
	}
	
	//已添加文本评价项-获取序号
	public String getAppIteTextNumber(){
		String number=getText(appIteTextNumber);
		log.info("已添加星级评价项-序号："+number);
		return number;
	}
	
	//已添加文本评价项-获取评价项名称
	public String getAppIteTextName(){
		String appraiseItemName=getText(appIteTextName);
		log.info("已添加星级评价项-评价项名称："+appraiseItemName);
		return appraiseItemName;
	}
	
	//已添加文本评价项-获取评价项类型
	public String getAppIteTextType(){
		String appraiseItemType=getText(appIteTextType);
		log.info("已添加星级评价项-评价项类型："+appraiseItemType);
		return appraiseItemType;
	}
	
	//已添加文本评价项-点击移除按钮
	public void clickAppIteTextDeleteButton(){
		click(appIteTextDeleteButton);
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
