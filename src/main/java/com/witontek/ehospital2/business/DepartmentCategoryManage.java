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
	 * 
	 * @param categoryName
	 *            ,categoryCode
	 * @return
	 */
	public String insertCategory(String categoryName, String categoryCode) {
		clickDepartmentCategoryManageButton();
		clickCateManAddCategoryButton();
		inputAddCateCategoryNameInputBox(categoryName);
		inputAddCateCategoryCodeInputBox(categoryCode);
		clickAddCateSaveButton();
		clickAlertCloseButton();
		clickLastPageButton();
		return getCateManAddedCategoryName();
	}

	/**
	 * 搜索一级科室
	 * 
	 * @param categoryName
	 * @return
	 */
	public String searchCategory(String categoryName) {
		inputCateManCategoryNameInputBox(categoryName);
		clickCateManSearchButton();
		return getCateManFirstCategoryName();
	}

	// //下移一级科室
	// public void moveDownDepartmentCategory(){
	// // clickDepartmentManageButton();
	// String beforeMoveDownCategoryName=getDepManFirstCategoryName();
	// clickDepManMoveDownButton();
	// clickAlertCloseButton();
	// String afterMoveDownCategoryName=getDepManSecondCategoryName();
	// if(beforeMoveDownCategoryName.equals(afterMoveDownCategoryName)){
	// log.info("下移前一级科室名称:"+beforeMoveDownCategoryName+"，与下移后一级科室名称:"+afterMoveDownCategoryName+"相同，下移一级科室成功");
	// }else {
	// log.errorShot("下移前一级科室名称:"+beforeMoveDownCategoryName+"，与下移后一级科室名称:"+afterMoveDownCategoryName+"不相同，下移一级科室失败",driver);
	// }
	// }
	//
	// //上移一级科室
	// public void moveUpDepartmentCategory(){
	// String beforeMoveUpCategoryName=getDepManFirstCategoryName();
	// clickDepManMoveUpButton();
	// clickAlertCloseButton();
	// String afterMoveUpCategoryName=getDepManSecondCategoryName();
	// if(beforeMoveUpCategoryName.equals(afterMoveUpCategoryName)){
	// log.info("上移前一级科室名称:"+beforeMoveUpCategoryName+"，与上移后一级科室名称:"+afterMoveUpCategoryName+"相同，上移一级科室成功");
	// }else {
	// log.errorShot("上移前一级科室名称:"+beforeMoveUpCategoryName+"，与上移后一级科室名称:"+afterMoveUpCategoryName+"不相同，上移一级科室失败",driver);
	// }
	// }
	//
	// //置顶一级科室
	// public void moveTopDepartmentCategory(){
	// String beforeMoveTopCategoryName=getDepManFirstCategoryName();
	// clickLastPageButton();
	// clickDepManMoveTopButton();
	// clickAlertCloseButton();
	// clickFirstPageButton();
	// sleep(1);
	// String afterMoveTopCategoryName=getDepManFirstCategoryName();
	// if(!afterMoveTopCategoryName.equals(beforeMoveTopCategoryName)){
	// log.info("置顶前一级科室名称:"+beforeMoveTopCategoryName+"，与置顶后一级科室名称:"+afterMoveTopCategoryName+"相同，置顶一级科室成功");
	// }else {
	// log.errorShot("置顶前一级科室名称:"+beforeMoveTopCategoryName+"，与置顶后一级科室名称:"+afterMoveTopCategoryName+"不相同，置顶一级科室失败",driver);
	// }
	// }
	//
	// //编辑一级科室
	// public String updateDepartmentCategory(String categoryName,String
	// categoryCode){
	// clickDepManEditButton();
	// updateEdiCateDepartmentNameInputBox(categoryName);
	// updateEdiCateDepartmentCodeInputBox(categoryCode);
	// clickEdiCateEditButton();
	// clickAlertCloseButton();
	// return getDepManFirstCategoryName();
	// }
	//

	/**
	 * 删除所有新增的一级科室
	 * 
	 * @return
	 */
	public void deleteCategory(String categoryName) {
		clickDepartmentCategoryManageButton();
		inputCateManCategoryNameInputBox(categoryName);
		clickCateManSearchButton();
		for (int i = 0; i < Integer.parseInt(getTotalRecorders()); i++) {
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			clickCateManDeleteButton();
			clickAlertCloseButton();
			inputCateManCategoryNameInputBox(categoryName);
			clickCateManSearchButton();
			if (Integer.parseInt(getTotalRecorders()) == 0) {
				log.info("删除一级科室成功");
			}

		}
	}
}
