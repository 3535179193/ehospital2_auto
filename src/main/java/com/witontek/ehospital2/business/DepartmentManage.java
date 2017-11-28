package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.DatabaseUtils;
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
		clickDepartmentCategoryManageButton();
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
		editDepPageDepartmentNameInputBox(departmentName);
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
	 * 二级科室管理-上移二级科室
	 * @param departmentName
	 * @param departmentCode
	 * @param departmentPhone
	 * @param departmentAddress
	 * @param departmentFeature
	 * @param departmentSummary
	 * @param Attention
	 * @return
	 */
	public String moveUpDepartment(String departmentName, String departmentCode, String departmentPhone, String departmentAddress,
			String departmentFeature, String departmentSummary, String Attention) {
		clickBusinessInformationButton();
		insertDepartment(departmentName, departmentCode, departmentPhone, departmentAddress, departmentFeature, departmentSummary, Attention);
		clickDepManMoveUpButton();
		clickAlertCloseButton();
		return getDepManFirstDepartmentName();
	}

	/**
	 * 二级科室管理-下移二级科室
	 * @return
	 */
	public String moveDownDepartment() {
		clickCateManViewDepartmentButton();
		clickDepManMoveDownButton();
		clickAlertCloseButton();
		return getDepManSecondDepartmentName();
	}

	/**
	 * 二级科室管理-置顶二级科室
	 * @return
	 */
	public String moveTopDepartment() {
		clickCateManViewDepartmentButton();
		clickDepManMoveTopButton();
		clickAlertCloseButton();
		return getDepManFirstDepartmentName();
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
	public String deleteDepartment(String sql) {
		DatabaseUtils.deleteDate(sql);
		clickDepartmentCategoryManageButton();
		clickCateManViewDepartmentButton();
		return getTotalRecorders();

	}
}
