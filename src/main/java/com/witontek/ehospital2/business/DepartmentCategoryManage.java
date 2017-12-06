package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentCategoryManagePage;

public class DepartmentCategoryManage extends DepartmentCategoryManagePage {

	public DepartmentCategoryManage(WebDriver driver) {
		super(driver);
	}

	private Log log = new Log(DepartmentCategoryManage.class);

	/**
	 * 新增一级科室
	 * @param categoryName,categoryCode
	 * @return
	 */
	public String insertCategory(String categoryName, String categoryCode) {
		if(!getDepartmentCategoryManageButton().equals("科室管理")){
			clickDepartmentCategoryManageButton();
		}
		clickCateManAddCategoryButton();
		inputCatePageCategoryNameInputBox(categoryName);
		inputCatePageCategoryCodeInputBox(categoryCode);
		clickCatePageSaveButton();
		clickAlertCloseButton();
		clickCatePageReturnButton();
		clickLastPageButton();
		return getCateManAddedCategoryName();
	}
	
	/**
	 * 搜索一级科室
	 * @param categoryName
	 * @return
	 */
	public String searchCategory(String categoryName) {
		inputCateManCategoryNameInputBox(categoryName);
		clickCateManSearchButton();
		return getCateManFirstCategoryName();
	}


	/**
	 * 置顶新增的一级科室
	 * @return
	 */
	public String moveTopCategory() {
		if(Integer.parseInt(getTotalRecords())>11){
			clickLastPageButton();
			clickCateManMoveTopButton();
		}else{
			clickEachPageRecordsDropBox();
			clickEachPageTwentyRecords();
			clickCateManSecondMoveTopButton();
		}
		clickAlertCloseButton();
		clickFirstPageButton();
		return getCateManFirstCategoryName();
	}
	
	/**
	 * 编辑新增的一级科室
	 * @param categoryName
	 * @param categoryCode
	 * @return
	 */
	public String updateCategory(String categoryName, String categoryCode) {
		clickCateManEditButton();
		editCatePageCategoryNameInputBox(categoryName);
		editCatePageCategoryCodeInputBox(categoryCode);
		clickCatePageUpdateButton();
		clickAlertCloseButton();
		return getCateManFirstCategoryName();
	}

	/**
	 * 下移一级科室
	 */
	public void moveDownCategory() {
		String beforeMove=getCateManFirstCategoryName();
		clickCateManMoveDownButton();
		clickAlertCloseButton();
		String afterMove=getCateManSecondCategoryName();
		if(beforeMove.equals(afterMove)){
			log.info("下移前首行一级科室名称（"+beforeMove+"）与下移后第二行名称（"+afterMove+"）相等，下移一级科室成功");
		}else{
			log.errorShot("下移前首行一级科室名称（"+beforeMove+"）与下移后第二行名称（"+afterMove+"）不相等，下移一级科室失败", driver);
		}
	}

	/**
	 * 上移一级科室
	 */
	public void moveUpCategory() {
		String beforeMove=getCateManSecondCategoryName();
		clickCateManMoveUpButton();
		clickAlertCloseButton();
		String afterMove=getCateManFirstCategoryName();
		if(beforeMove.equals(afterMove)){
			log.info("上移前第二行一级科室名称（"+beforeMove+"）与上移后首行名称（"+afterMove+"）相等，下移一级科室成功");
		}else{
			log.errorShot("上移前第二行一级科室名称（"+beforeMove+"）与上移后首行名称（"+afterMove+"）不相等，下移一级科室失败", driver);
		}
	}

	/**
	 * 删除所有新增的一级科室
	 * @param categoryName
	 * @return
	 */
	public void deleteCategory(String categoryName) {
		clickDepartmentCategoryManageButton();
		inputCateManCategoryNameInputBox(categoryName);
		clickCateManSearchButton();
		for (int i = 0; i < Integer.parseInt(getTotalRecords());) {
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			clickCateManDeleteButton();
			clickAlertCloseButton();
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			if (Integer.parseInt(getTotalRecords()) == 0) {
				log.info("删除全部新增的一级科室成功");
			} else {
				log.warn("未删除全部的一级科室，继续删除");
			}
		}
	}
}
