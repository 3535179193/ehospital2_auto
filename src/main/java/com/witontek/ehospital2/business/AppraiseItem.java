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
		clickEdiAppEditAppraiseItemButton();
		inputAppIteAppraiseItemNameInputBox(appraiseItemName);
		clickAppIteAppraiseItemTypeDropBox();
		clickAppIteSelectTextTypeButton();
		clickAppIteSaveButton();
		clickAppManAlertCloseButton();
		return getAppIteTextName();
	}
	
//	//就医评价管理-搜索评价问卷
//	public String searchAppraise (String appraiseName){
//		inputAppManAppraiseNameInputBox(appraiseName);
//		clickAppManSearchButton();
//		return getAppManAppraiseName();
//	}
//	
//	//就医咨询管理-编辑评价问卷
//	public String updateAppraise(String appraiseName,String appraiseDesc){
//		clickAppManEditButton();
//		inputEdiAppAppraiseNameInputBox(appraiseName);
//		inputEdiAppAppraiseDescInputBox(appraiseDesc);
//		clickEdiAppAppraiseTypeDropBox();
//		clickEdiAppAppraiseTypeButton();
//		clickEdiAppPostedStatusButton();
//		clickEdiAppSaveButton();
//		clickAppManAlertCloseButton();
//		return getAppManAppraiseName();
//	}
	
	//删除文本评价项
	public void deleteAppraiseItem(){
		clickAppManEditButton();
		clickEdiAppEditAppraiseItemButton();
		clickAppIteTextDeleteButton();
		clickAppManAlertDeleteButton();
	}
	
}
