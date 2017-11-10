package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;

public class DepartmentMange extends DepartmentManagePage{

	public DepartmentMange(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentMange.class);
	
	//科室管理-搜索一级科室
	public String searchDepartmentCategoryByName (String categoryName){
		clickDepartmentManageButton();
		inputDepManDepartmentName(categoryName);
		clickDepManSearchDepartmentButton();
		return getDepManFirstCategoryName();
	}
	
	//下移一级科室
	public void moveDownDepartmentCategory(){
		clickDepartmentManageButton();
		String beforeMoveDownCategoryName=getDepManFirstCategoryName();
		clickDepManMoveDownButton();
		clickDepManCloseButton();
		String afterMoveDownCategoryName=getDepManSecondCategoryName();
		if(beforeMoveDownCategoryName.equals(afterMoveDownCategoryName)){
			log.info("下移一级科室成功");
		}else {
			log.errorShot("下移一级科室失败",driver);
		}
	}
	
	//上移一级科室
	public void moveUpDepartmentCategory(){
		String beforeMoveUpCategoryName=getDepManFirstCategoryName();
		clickDepManMoveUpButton();
		clickDepManCloseButton();
		String afterMoveUpCategoryName=getDepManSecondCategoryName();
		if(beforeMoveUpCategoryName.equals(afterMoveUpCategoryName)){
			log.info("上移一级科室成功");
		}else {
			log.errorShot("上移一级科室失败",driver);
		}
	}
	
	//新增一级科室
	public String insertDepartmentsCategory(String categoryName,String categoryCode){
		clickDepartmentManageButton();
		clickDepManAddFirstDepartmentButton();
		inputAddCateDepartmentNameInputBox(categoryName);
		inputAddCateDepartmentCodeInputBox(categoryCode);
		clickAddCateSaveButton();
		clickDepManCloseButton();
		clickDepManLastPageButton();
		return assertDepManAddDepartmentCategory();
	}
	
	//置顶一级科室
	public void moveTopDepartmentCategory(){
		String beforeMoveTopCategoryName=getDepManFirstCategoryName();
		clickDepManLastPageButton();
		clickDepManMoveTopButton();
		clickDepManCloseButton();
		clickDepManFirstPageButton();
		sleep(1);
		String afterMoveTopCategoryName=getDepManFirstCategoryName();
		if(!afterMoveTopCategoryName.equals(beforeMoveTopCategoryName)){
			log.info("置顶一级科室成功");
		}else {
			log.errorShot("置顶一级科室失败",driver);
		}
	}
	
	//编辑一级科室
	public String updateDepartmentCategory(String categoryName,String categoryCode){
		clickDepManEditButton();
		updateEdiCateDepartmentNameInputBox(categoryName);
		updateEdiCateDepartmentCodeInputBox(categoryCode);
		clickEdiCateEditButton();
		clickDepManCloseButton();
		return getDepManFirstCategoryName();
	}
	
	//删除一级科室
	public void deleteDepartmentCategory(){
		String beforeDeleteReconds=getDepManTotalRecorders();
		clickDepManDeleteButton();
		clickDepManCloseButton();
		String afterDeleteReconds=getDepManTotalRecorders();
		if(!beforeDeleteReconds.equals(afterDeleteReconds)){
			log.info("删除后一级科室总数与删除前不一致，删除一级科室成功");
		}else {
			log.errorShot("删除前后科室总数仍然一致，删除一级科室失败", driver);
		}
	}
	
}
