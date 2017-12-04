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
		clickDepartmentCategoryManageButton();
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
	 * 置顶新增的一级科室
	 * @return
	 */
	public String moveTopCategory() {
		clickLastPageButton();
		clickCateManMoveTopButton();
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
		editCatePageCategoryNameInputBox(categoryName+"（改）");
		editCatePageCategoryCodeInputBox(String.valueOf(Integer.parseInt(categoryCode)+1));
		clickCatePageUpdateButton();
		clickAlertCloseButton();
		//再新增一个一级科室，为后面的测试用例做铺垫
		clickBusinessInformationButton();
		insertCategory(categoryName, categoryCode);
		moveTopCategory();
		return getCateManSecondCategoryName();
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
	 * 下移一级科室
	 * @param categoryName ,categoryCode
	 * @return
	 */
	public String moveDownCategory(String categoryName, String categoryCode) {
		clickCateManMoveDownButton();
		clickAlertCloseButton();
		return getCateManSecondCategoryName();
	}

	/**
	 * 上移一级科室
	 * @return
	 */
	public String moveUpCategory() {
		clickCateManMoveUpButton();
		clickAlertCloseButton();
		return getCateManFirstCategoryName();
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
		for (int i = 0; i < Integer.parseInt(getTotalRecorders());) {
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			clickCateManDeleteButton();
			clickAlertCloseButton();
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			if (Integer.parseInt(getTotalRecorders()) == 0) {
				log.info("删除全部新增的一级科室成功");
			} else {
				log.warn("未删除全部的一级科室，继续删除");
			}
		}
	}
}
