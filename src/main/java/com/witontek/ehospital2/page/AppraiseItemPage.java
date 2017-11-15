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
	protected Locator appIteAppraiseItemNameInputBox=XmlUtils.readXml("AppraiseItemPage").get("appIteAppraiseItemNameInputBox");
	protected Locator appIteAppraiseItemTypeDropBox=XmlUtils.readXml("AppraiseItemPage").get("appIteAppraiseItemTypeDropBox");
	protected Locator appIteSelectTextTypeButton=XmlUtils.readXml("AppraiseItemPage").get("appIteSelectTextTypeButton");
	protected Locator appIteSelectStarTypeButton=XmlUtils.readXml("AppraiseItemPage").get("appIteSelectStarTypeButton");
	protected Locator appIteSaveButton=XmlUtils.readXml("AppraiseItemPage").get("appIteSaveButton");
	protected Locator appIteCancleButton=XmlUtils.readXml("AppraiseItemPage").get("appIteCancleButton");
	
	//就医评价管理-新增评价问卷按钮
	protected Locator appIteFromAppraiseAddButton=XmlUtils.readXml("AppraiseItemPage").get("appIteFromAppraiseAddButton");
		protected Locator froAppAppraiseNameInputBox=XmlUtils.readXml("AppraiseItemPage").get("froAppAppraiseNameInputBox");
		protected Locator froAppSearchInputButton=XmlUtils.readXml("AppraiseItemPage").get("froAppSearchInputButton");
		protected Locator froAppFirstMoreButton=XmlUtils.readXml("AppraiseItemPage").get("froAppFirstMoreButton");
		protected Locator froAppFirstAppraiseItemName=XmlUtils.readXml("AppraiseItemPage").get("froAppFirstAppraiseItemName");
		protected Locator froAppFirstAppraiseItemType=XmlUtils.readXml("AppraiseItemPage").get("froAppFirstAppraiseItemType");
		protected Locator froAppAddButton=XmlUtils.readXml("AppraiseItemPage").get("froAppAddButton");
		protected Locator froAppCloseButton=XmlUtils.readXml("AppraiseItemPage").get("addAppStopStatusButton");
		
		//现有评价项-每页显示数下拉框
		protected Locator froAppEachPageRecordersDropBox=XmlUtils.readXml("AppraiseItemPage").get("froAppEachPageRecordersDropBox");
		protected Locator froAppEachPageTenRecorders=XmlUtils.readXml("AppraiseItemPage").get("froAppEachPageTenRecorders");
		protected Locator froAppTotalRecorders=XmlUtils.readXml("AppraiseItemPage").get("froAppTotalRecorders");
		protected Locator froAppTotalPages=XmlUtils.readXml("AppraiseItemPage").get("froAppTotalPages");
		protected Locator froAppCurrentPage=XmlUtils.readXml("AppraiseItemPage").get("froAppCurrentPage");
		protected Locator froAppFirstPageButton=XmlUtils.readXml("AppraiseItemPage").get("froAppFirstPageButton");
		protected Locator froAppPreviousPageButton=XmlUtils.readXml("AppraiseItemPage").get("froAppPreviousPageButton");
		protected Locator froAppNextPageButton=XmlUtils.readXml("AppraiseItemPage").get("froAppNextPageButton");
		protected Locator froAppLastPageButton=XmlUtils.readXml("AppraiseItemPage").get("froAppLastPageButton");
		
	//已添加星级评价项-序号
	protected Locator appIteStarNumber=XmlUtils.readXml("AppraiseItemPage").get("appIteStarNumber");
	protected Locator appIteStarName=XmlUtils.readXml("AppraiseItemPage").get("appIteStarName");
	protected Locator appIteStarType=XmlUtils.readXml("AppraiseItemPage").get("appIteStarType");
	protected Locator appIteStarDeleteButton=XmlUtils.readXml("AppraiseItemPage").get("appIteStarDeleteButton");
	
	//已添加文本评价项-序号
	protected Locator appIteTextNumber=XmlUtils.readXml("AppraiseItemPage").get("appIteTextNumber");
	protected Locator appIteTextName=XmlUtils.readXml("AppraiseItemPage").get("appIteTextName");
	protected Locator appIteTextType=XmlUtils.readXml("AppraiseItemPage").get("appIteTextType");
	protected Locator appIteTextDeleteButton=XmlUtils.readXml("AppraiseItemPage").get("appIteTextDeleteButton");

	//已添加评价项-弹框关闭按钮
	protected Locator appIteAlertCloseButton=XmlUtils.readXml("AppraiseItemPage").get("appIteAlertCloseButton");
	protected Locator appIteAlertDeleteButton=XmlUtils.readXml("AppraiseItemPage").get("appIteAlertDeleteButton");
	protected Locator appIteAlertCancleButton=XmlUtils.readXml("AppraiseItemPage").get("appIteAlertCancleButton");

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
	
	//现有评价项-评价项名称输入框
	public void inputFroAppAppraiseNameInputBox(String appraiseItemName){
		input(froAppAppraiseNameInputBox, appraiseItemName);
	}
	
	//现有评价项-点击搜索按钮
	public void clickFroAppSearchInputButton(){
		click(froAppSearchInputButton);
	}
	
	//现有评价项-点击序号为1的多选按钮
	public void clickFroAppFirstMoreButton(){
		click(froAppFirstMoreButton);
	}
	
	//现有评价项-获取序号为1的评价项名称
	public String getFroAppFirstAppraiseItemName(){
		String appraiseItemName=getText(froAppFirstAppraiseItemName);
		log.info("现有评价项-序号为1的评价项名称："+appraiseItemName);
		return appraiseItemName;
	}
	
	//现有评价项-获取序号为1的评价项类型
	public String getFroAppFirstAppraiseItemType(){
		String appraiseItemType=getText(froAppFirstAppraiseItemType);
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
	
	//现有评价项-点击每页显示数下拉框
	public void clickFroAppEachPageRecordersDropBox(){
		click(froAppEachPageRecordersDropBox);
	}
	
	//现有评价项-选中每页显示10条
	public void clickFroAppEachPageTenRecorders(){
		click(froAppEachPageTenRecorders);
	}
	
	//现有评价项-获取总记录数
	public String getFroAppTotalRecorders(){
			String recorders=getText(froAppTotalRecorders);
			log.info("现有评价项-总记录数："+recorders);
			return recorders;
	}
	
	//现有评价项-获取总页数
	public String getFroAppTotalPages(){
		String pages=getText(froAppTotalPages);
		log.info("现有评价项-总页数："+pages);
		return pages;
	}
	
	//现有评价项-获取当前页数
	public String getFroAppCurrentPage(){
		String page=getText(froAppCurrentPage);
		log.info("现有评价项-当前页数："+page);
		return page;
	}
	
	//现有评价项-点击第一页按钮
	public void clickFroAppFirstPageButton(){
		click(froAppFirstPageButton);
	}
	
	//现有评价项-点击上一页按钮
	public void clickFroAppPreviousPageButton(){
		click(froAppPreviousPageButton);
	}
	
	//现有评价项-点击下一页按钮
	public void clickFroAppNextPageButton(){
		click(froAppNextPageButton);
	}
	
	//现有评价项-点击最末页按钮
	public void clickFroAppLastPageButton(){
		click(froAppLastPageButton);
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
	
	//已添加评价项-点击弹框关闭按钮
	public void clickAppIteAlertCloseButton(){
		wait(5);
		click(appIteAlertCloseButton);
		wait(5);
	}
	
	//已添加评价项-点击弹框确认删除按钮
	public void clickAppIteAlertDeleteButton(){
		wait(5);
		click(appIteAlertDeleteButton);
		wait(5);
	}
	
	//已添加评价项-点击弹框确认删除按钮
	public void clickAppIteAlertCancleButton(){
		wait(5);
		click(appIteAlertCancleButton);
		wait(5);
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
