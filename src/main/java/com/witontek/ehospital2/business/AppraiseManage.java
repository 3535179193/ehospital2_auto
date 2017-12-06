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
		inputAppBoxAppraiseNameInputBox(appraiseName);
		inputAppBoxAppraiseDescInputBox(appraiseDesc);
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxAppraiseTypeButton();
		clickAppBoxPostedStatusButton();
		clickAppBoxSaveButton();
		clickAlertCloseButton();
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
		editAppBoxAppraiseNameInputBox(appraiseName);
		editAppBoxAppraiseDescInputBox(appraiseDesc);
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxAppraiseTypeButton();
		clickAppBoxPostedStatusButton();
		clickAppBoxSaveButton();
		clickAlertCloseButton();
		return getAppManAppraiseName();
	}
	
	//就医评价管理-删除评价问卷
	public void deleteAppraise(String appraiseName){
		clickAppraiseManageButton();
		inputAppManAppraiseNameInputBox(appraiseName);
		clickAppManSearchButton();
		int j=0;
		for (int i = 0; i < Integer.parseInt(getTotalRecords());j++) {
			inputAppManAppraiseNameInputBox(appraiseName);
			clickAppManSearchButton();
			clickAppManDeleteButton();
			clickAlertDeleteButton();
			clickAlertCloseButton();
			inputAppManAppraiseNameInputBox(appraiseName);
			clickAppManSearchButton();
			if (Integer.parseInt(getTotalRecords()) == 0) {
				log.info("删除全部新增的评价问卷成功");
			}else if(j>6){
				log.errorShot("就医咨询管理-删除评价问卷失败", driver);
			} else {
				log.warn("未删除全部新增的评价问卷，继续删除");
			}
		}
	}
	
}
