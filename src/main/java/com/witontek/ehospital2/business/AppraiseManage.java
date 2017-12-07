package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.AppraiseManagePage;

public class AppraiseManage extends AppraiseManagePage{

	public AppraiseManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(AppraiseManage.class);
	
	/**
	 * 就医评价管理-新增医院评价
	 * @param appraiseName
	 * @param appraiseDesc
	 * @return
	 */
	public String insertAppraise(String appraiseName,String appraiseDesc){
		clickAppraiseManageButton();
		clickAppManAddAppraiseButton();
		inputAppBoxAppraiseNameInputBox(appraiseName);
		inputAppBoxAppraiseDescInputBox(appraiseDesc);
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxHospitalAppraise();
		clickAppBoxPostedStatusButton();
		clickAppBoxSaveButton();
		clickAlertCloseButton();
		return getAppManAppraiseName();
	}
	
	/**
	 * 就医评价管理-保存并继续添加医院评价
	 * @param appraiseName
	 * @param appraiseDesc
	 */
	public void insertAndContinueAppraise(String appraiseName,String appraiseDesc){
		int beforeInsert=Integer.parseInt(getTotalRecords());
		clickAppraiseManageButton();
		clickAppManAddAppraiseButton();
		inputAppBoxAppraiseNameInputBox(appraiseName+"1");
		inputAppBoxAppraiseDescInputBox(appraiseDesc+"1");
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxHospitalAppraise();
		clickAppBoxDraftStatusButton();
		clickAppBoxSaveAndAddButton();
		clickAlertCloseButton();
		inputAppBoxAppraiseNameInputBox(appraiseName+"2");
		inputAppBoxAppraiseDescInputBox(appraiseDesc+"2");
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxHospitalAppraise();
		clickAppBoxStopStatusButton();
		clickAppBoxSaveButton();
		clickAlertCloseButton();
		int afterInsert=Integer.parseInt(getTotalRecords());
		if(afterInsert==beforeInsert+2){
			log.info("新增后总记录数（"+afterInsert+"）与新增前（"+beforeInsert+"）相差为2，就医评价管理-保存并继续添加就医评价成功");
		}else {
			log.error("新增后总记录数（"+afterInsert+"）与新增前（"+beforeInsert+"）相差不为2，就医评价管理-保存并继续添加就医评价失败");
		}
	}
	
	/**
	 * 就医评价管理-搜索评价问卷
	 * @param appraiseName
	 * @return
	 */
	public String searchAppraise (String appraiseName){
		inputAppManAppraiseNameInputBox(appraiseName);
		clickAppManSearchButton();
		return getAppManAppraiseName();
	}
	
	/**
	 * 就医评价管理-编辑医院评价
	 * @param appraiseName
	 * @param appraiseDesc
	 * @return
	 */
	public String updateAppraise(String appraiseName,String appraiseDesc){
		clickAppManEditButton();
		editAppBoxAppraiseNameInputBox(appraiseName);
		editAppBoxAppraiseDescInputBox(appraiseDesc);
		clickAppBoxAppraiseTypeDropBox();
		clickAppBoxHospitalAppraise();
		clickAppBoxPostedStatusButton();
		clickAppBoxSaveButton();
		clickAlertCloseButton();
		return getAppManAppraiseName();
	}
	
	/**
	 * 就医评价管理-删除评价问卷
	 * @param appraiseName
	 */
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
