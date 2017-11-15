package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;
import com.witontek.ehospital2.page.SecondLevelDepartmentPage;

public class SecondLevelDepartment extends SecondLevelDepartmentPage{

	public SecondLevelDepartment(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(SecondLevelDepartment.class);
	
	//新增二级科室
	public String insertDepartment(String categoryName,String categoryCode,String departmentName,String departmentCode,String departmentPhone,String departmentAddress,String departmentFeature,String departmentSummary,String Attention){
		clickDepartmentManageButton();
		clickDepManAddFirstDepartmentButton();
		inputAddCateDepartmentNameInputBox(categoryName);
		inputAddCateDepartmentCodeInputBox(categoryCode);
		clickAddCateSaveButton();
		clickDepManCloseButton();
		clickDepManLastPageButton();
		clickDepManViewDepartmentButton();
		clickSecLevAddDepartmentButton();
		inputAddDepDepartmentNameInputBox(departmentName);
		inputAddDepDepartmentCodeInputBox(departmentCode);
		clickAddDepSelectBelongDepartmentDropBox();
		clickAddDepSelectBelongDepartmentButton();
		inputAddDepDepartmentPhoneInputBox(departmentPhone);
		inputAddDepDepartmentAddressInputBox(departmentAddress);
		inputAddDepDepartmentFeatureInputBox(departmentFeature);
		inputAddDepDepartmentSummaryInputBox(departmentSummary);
		inputAddDepAttentionInputBox(Attention);
		clickAddDepSaveButton();
		clickSecLevCloseButton();
		//再新增一个二级科室
		clickSecLevAddDepartmentButton();
		inputAddDepDepartmentNameInputBox(departmentName+"1");
		inputAddDepDepartmentCodeInputBox(departmentCode+"1");
		clickAddDepSelectBelongDepartmentDropBox();
		clickAddDepSelectBelongDepartmentButton();
		inputAddDepDepartmentPhoneInputBox(departmentPhone);
		inputAddDepDepartmentAddressInputBox(departmentAddress);
		inputAddDepDepartmentFeatureInputBox(departmentFeature);
		inputAddDepDepartmentSummaryInputBox(departmentSummary);
		inputAddDepAttentionInputBox(Attention);
		clickAddDepSaveButton();
		clickSecLevCloseButton();
		return getSecLevFirstDepartmentName();
	}
	
	//置顶二级科室
	public void moveTopDepartment(){
//		clickDepartmentManageButton();
		clickDepManLastPageButton();
		clickDepManViewDepartmentButton();
		String beforeMoveTopDepartmentName=getSecLevSecondDepartmentName();
		clickSecLevMoveTopButton();
		clickSecLevCloseButton();
		String afterMoveTopDepartmentName=getSecLevFirstDepartmentName();
		if(beforeMoveTopDepartmentName.equals(afterMoveTopDepartmentName)){
			log.info("置顶前二级科室名称:"+beforeMoveTopDepartmentName+"，与置顶后二级科室名称:"+afterMoveTopDepartmentName+"相同，置顶二级科室成功");
		}else {
			log.errorShot("置顶前二级科室名称:"+beforeMoveTopDepartmentName+"，与置顶后二级科室名称:"+afterMoveTopDepartmentName+"不相同，置顶二级科室失败",driver);
		}
	}
	
	//编辑二级科室
	public String updateDepartment(String departmentName,String departmentCode,String departmentPhone,String departmentAddress,String departmentFeature,String departmentSummary,String Attention){
		clickDepManLastPageButton();
		clickDepManViewDepartmentButton();
		clickSecLevEditButton();
		updateEdiDepDepartmentNameInputBox(departmentName);
		updateEdiDepDepartmentCodeInputBox(departmentCode);

		clickEdiDepSelectBelongDepartmentDropBox();
		clickEdiDepSelectBelongDepartmentButton();
		updateEdiDepDepartmentPhoneInputBox(departmentPhone);
		updateEdiDepDepartmentAddressInputBox(departmentAddress);
		updateEdiDepDepartmentFeatureInputBox(departmentFeature);
		updateEdiDepDepartmentSummaryInputBox(departmentSummary);
		updateEdiDepAttentionInputBox(Attention);
		clickEdiDepSaveButton();
		clickSecLevCloseButton();

		return getSecLevFirstDepartmentName();
	}
	
	//下移二级科室
	public void moveDownDepartment(){
//		clickDepartmentManageButton();
		clickDepManViewDepartmentButton();
		String beforeMoveDownDepartmentName=getSecLevFirstDepartmentName();
		clickSecLevMoveDownButton();
		clickSecLevCloseButton();
		String afterMoveDownDepartmentName=getSecLevSecondDepartmentName();
		if(beforeMoveDownDepartmentName.equals(afterMoveDownDepartmentName)){
			log.info("下移前二级科室名称:"+beforeMoveDownDepartmentName+"，与下移后二级科室名称:"+afterMoveDownDepartmentName+"相同，下移二级科室成功");
		}else {
			log.errorShot("下移前二级科室名称:"+beforeMoveDownDepartmentName+"，与下移后二级科室名称:"+afterMoveDownDepartmentName+"不相同，下移二级科室失败",driver);
		}
	}
	
	//上移二级科室
	public void moveUpDepartment(){
		clickDepManViewDepartmentButton();
		String beforeMoveUpDepartmentName=getSecLevFirstDepartmentName();
		clickSecLevMoveUpButton();
		clickSecLevCloseButton();
		String afterMoveUpDepartmentName=getSecLevSecondDepartmentName();
		if(beforeMoveUpDepartmentName.equals(afterMoveUpDepartmentName)){
			log.info("上移前二级科室名称:"+beforeMoveUpDepartmentName+"，与上移后二级科室名称:"+afterMoveUpDepartmentName+"相同，上移二级科室成功");
		}else {
			log.errorShot("上移前二级科室名称:"+beforeMoveUpDepartmentName+"，与上移后二级科室名称:"+afterMoveUpDepartmentName+"不相同，上移二级科室失败",driver);
		}
	}
	
	//科室管理-搜索二级科室
	public String searchDepartmentsByName (String departmentName){
//		clickDepartmentManageButton();
		clickDepManViewDepartmentButton();
		inputSecLevDepartmentNameInputBox(departmentName);
		clickSecLevSearchDepartmentButton();
		return getSecLevFirstDepartmentName();
	}
	
	//隐藏二级科室
//	public void clickSecLevHideButton(){
//		String beforeDeleteReconds=getDepManTotalRecorders();
//		clickDepManDeleteButton();
//		clickDepManCloseButton();
//		String afterDeleteReconds=getDepManTotalRecorders();
//		if(!beforeDeleteReconds.equals(afterDeleteReconds)){
//			log.info("删除后一级科室总数与删除前不一致，删除一级科室成功");
//		}else {
//			log.errorShot("删除前后科室总数仍然一致，删除一级科室失败", driver);
//		}
//	}
	
}
