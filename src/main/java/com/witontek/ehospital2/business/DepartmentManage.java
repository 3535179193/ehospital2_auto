package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.DatabaseUtils;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;

public class DepartmentManage extends DepartmentManagePage {

	public DepartmentManage(WebDriver driver) {
		super(driver);
	}

	private Log log = new Log(DepartmentManage.class);

	/**
	 * 二级科室管理-新增二级科室
	 * @param departmentName
	 * @param departmentCode
	 * @param departmentPhone
	 * @param departmentAddress
	 * @param departmentFeature
	 * @param departmentSummary
	 * @param Attention
	 * @return
	 */
	public String insertDepartment(String departmentName, String departmentCode, String departmentPhone, String departmentAddress,
			String departmentFeature, String departmentSummary, String Attention) {
		if(!getDepartmentCategoryManageButton().equals("科室管理")){
			clickDepartmentCategoryManageButton();
		}
		clickCateManViewDepartmentButton();
		clickDepManAddDepartmentButton();
		inputDepPageDepartmentNameInputBox(departmentName);
		inputDepPageDepartmentCodeInputBox(departmentCode);
		clickDepPageSelectBelongCategoryDropBox();
		clickDepPageSelectBelongCategoryButton();
		inputDepPageDepartmentPhoneInputBox(departmentPhone);
		inputDepPageDepartmentAddressInputBox(departmentAddress);
		inputDepPageDepartmentFeatureInputBox(departmentFeature);
		inputDepPageDepartmentSummaryInputBox(departmentSummary);
		inputDepPageAttentionInputBox(Attention);
		clickDepPageSaveButton();
		clickAlertCloseButton();
		return getDepManFirstDepartmentName();
	}

	/**
	 * 二级科室管理-编辑二级科室
	 * @param departmentName
	 * @param departmentCode
	 * @param departmentPhone
	 * @param departmentAddress
	 * @param departmentFeature
	 * @param departmentSummary
	 * @param Attention
	 * @return
	 */
	public String updateDepartment(String departmentName, String departmentCode, String departmentPhone, String departmentAddress,
			String departmentFeature, String departmentSummary, String Attention) {
		clickDepManEditButton();
		editDepPageDepartmentNameInputBox(departmentName );
		editDepPageDepartmentCodeInputBox(departmentCode);
		clickDepPageSelectBelongCategoryDropBox();
		clickDepPageSelectBelongCategoryButton();
		editDepPageDepartmentPhoneInputBox(departmentPhone);
		editDepPageDepartmentAddressInputBox(departmentAddress);
		editDepPageDepartmentFeatureInputBox(departmentFeature);
		editDepPageDepartmentSummaryInputBox(departmentSummary);
		editDepPageAttentionInputBox(Attention);
		clickDepPageUpdateButton();
		clickAlertCloseButton();
		return getDepManFirstDepartmentName();
	}

	/**
	 * 二级科室管理-搜索二级科室
	 * @param departmentName
	 * @return
	 */
	public String searchDepartment(String departmentName) {
		clickCateManViewDepartmentButton();
		inputDepManDepartmentNameInputBox(departmentName);
		clickDepManSearchButton();
		return getDepManFirstDepartmentName();
	}

	/**
	 * 二级科室管理-上移二级科室
	 */
	public void moveUpDepartment() {
		clickCateManViewDepartmentButton();
		String beforeMove = getDepManSecondDepartmentName();
		clickDepManMoveUpButton();
		clickAlertCloseButton();
		String afterMove = getDepManFirstDepartmentName();
		if (beforeMove.equals(afterMove)) {
			log.info("上移前二级科室（" + beforeMove + "）与上移后二级科室（" + afterMove + "）相同，二级科室管理-上移二级科室成功");
		} else {
			log.errorShot("上移前二级科室（" + beforeMove + "）与上移后二级科室（" + afterMove + "）不相同，二级科室管理-上移二级科室失败", driver);
		}
	}

	/**
	 * 二级科室管理-下移二级科室
	 */
	public void moveDownDepartment() {
		clickCateManViewDepartmentButton();
		String beforeMove= getDepManFirstDepartmentName();
		clickDepManMoveDownButton();
		clickAlertCloseButton();
		String afterMove= getDepManSecondDepartmentName();
		if (beforeMove.equals(afterMove)) {
			log.info("下移前二级科室（" + beforeMove + "）与下移后二级科室（" + afterMove + "）相同，二级科室管理-下移二级科室成功");
		} else {
			log.errorShot("下移前二级科室（" + beforeMove + "）与下移后二级科室（" + afterMove + "）不相同，二级科室管理-下移二级科室失败", driver);
		}
	}

	/**
	 * 二级科室管理-置顶二级科室
	 */
	public void moveTopDepartment() {
		clickCateManViewDepartmentButton();
		String beforeMove = getDepManSecondDepartmentName();
		clickDepManMoveTopButton();
		clickAlertCloseButton();
		String afterMove = getDepManFirstDepartmentName();
		if (beforeMove.equals(afterMove)) {
			log.info("置顶前二级科室（" + beforeMove + "）与置顶后二级科室（" + afterMove + "）相同，二级科室管理-置顶二级科室成功");
		} else {
			log.errorShot("置顶前二级科室（" + beforeMove + "）与置顶后二级科室（" + afterMove + "）不相同，二级科室管理-置顶二级科室失败", driver);
		}
	}

	/**
	 * 二级科室管理-隐藏二级科室
	 * @return
	 */
	public String hideDepartment() {
		clickCateManViewDepartmentButton();
		clickDepManHideButton();
		return getDepManHideButtonText();
	}

	/**
	 * 数据库操作-删除新增的二级科室
	 * @param sql
	 * @return
	 */
	public String deleteDepartment(String tableName, String conditionKey, String conditionValue) {
		DatabaseUtils.deleteDate(tableName, conditionKey, conditionValue);
		clickDepartmentCategoryManageButton();
		clickCateManViewDepartmentButton();
		return getTotalRecords();

	}
}
