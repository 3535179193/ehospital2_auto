package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.AppraiseItemPage;

public class AppraiseItem extends AppraiseItemPage{

	public AppraiseItem(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(AppraiseItem.class);
	
	//新增文本评价项
	public String insertAppraiseItem(String appraiseItemName){
		clickAppraiseManageButton();
		clickAppManEditButton();
		clickAppBoxEditAppraiseItemButton();
		inputAppIteAppraiseItemNameInputBox(appraiseItemName);
		clickAppIteAppraiseItemTypeDropBox();
		clickAppIteSelectTextTypeButton();
		clickAppIteSaveButton();
		clickAlertCloseButton();
		return getAppIteTextName();
	}
	
	//删除文本评价项
	public void deleteTextAppraiseItem(){
		clickAppManEditButton();
		clickAppBoxEditAppraiseItemButton();
		clickAppIteTextDeleteButton();
		clickAlertDeleteButton();
		clickAlertCloseButton();
	}
	
	//从现有评价项中添加文本评价项
	public String insertFromAppraiseItem(){
		clickAppManEditButton();
		clickAppBoxEditAppraiseItemButton();
		clickAppIteFromAppraiseAddButton();
		clickLastPageButton();
		clickFroAppMoreButton();
		clickFroAppAddButton();
		clickAlertCloseButton();
		goBack();
		return getAppIteTextName();
	}
	
	//搜索现有文本评价项
	public String searchFromAppraiseItem (String appraiseItemName){
		clickAppManEditButton();
		clickAppBoxEditAppraiseItemButton();
		clickAppIteFromAppraiseAddButton();
		inputFroAppAppraiseNameInputBox(appraiseItemName);
		clickFroAppSearchInputButton();
		return getFroAppAppraiseItemName();
	}
	
}
