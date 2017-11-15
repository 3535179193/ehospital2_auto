package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.AppraiseManagePage;

public class AppraiseManage extends AppraiseManagePage{

	public AppraiseManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(AppraiseManage.class);
	
	//就医评价管理-新增评价问卷
	public String insertAppraise(String appraiseName,String appraiseDesc){
		clickAppraiseManageButton();
		clickAppManAddAppraiseButton();
		inputAddAppAppraiseNameInputBox(appraiseName);
		inputAddAppAppraiseDescInputBox(appraiseDesc);
		clickAddAppAppraiseTypeDropBox();
		clickAddAppAppraiseTypeButton();
		clickAddAppDraftStatusButton();
		clickAddAppSaveButton();
		clickAppManAlertCloseButton();
		return getAppManAppraiseName();
	}
	
	//就医评价管理-搜索评价问卷
	public String searchAppraise (String appraiseName){
		inputAppManAppraiseNameInputBox(appraiseName);
		clickAppManSearchButton();
		return getAppManAppraiseName();
	}
	
	//就医评价管理-编辑评价问卷
	public String updateAppraise(String appraiseName,String appraiseDesc){
		clickAppManEditButton();
		inputEdiAppAppraiseNameInputBox(appraiseName);
		inputEdiAppAppraiseDescInputBox(appraiseDesc);
		clickEdiAppAppraiseTypeDropBox();
		clickEdiAppAppraiseTypeButton();
		clickEdiAppPostedStatusButton();
		clickEdiAppSaveButton();
		clickAppManAlertCloseButton();
		return getAppManAppraiseName();
	}
	
	//就医评价管理-删除评价问卷
	public void deleteAppraise(){
		String beforeDeleteReconds=getAppManTotalRecorders();
		clickAppManDeleteButton();
		clickAppManAlertDeleteButton();
		clickAppManAlertCloseButton();
		String afterDeleteReconds=getAppManTotalRecorders();
		if(!beforeDeleteReconds.equals(afterDeleteReconds)){
			log.info("删除前评价问卷总数:"+beforeDeleteReconds+"，比删除后评价问卷总数:"+afterDeleteReconds+"多1，删除评价问卷成功");
		}else {
			log.errorShot("删除前评价问卷总数:"+beforeDeleteReconds+"，与删除后评价问卷总数:"+afterDeleteReconds+"相同，删除评价问卷失败", driver);
		}
	}
	
}
