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
		editDepPageDepartmentNameInputBox(departmentName + "（改）");
		editDepPageDepartmentCodeInputBox(String.valueOf(Integer.parseInt(departmentCode) + 1));
		clickDepPageSelectBelongCategoryDropBox();
		clickDepPageSelectBelongCategoryButton();
		editDepPageDepartmentPhoneInputBox(departmentPhone);
		editDepPageDepartmentAddressInputBox(departmentAddress + "（改）");
		editDepPageDepartmentFeatureInputBox(departmentFeature + "（改）");
		editDepPageDepartmentSummaryInputBox(departmentSummary + "（改）");
		editDepPageAttentionInputBox(Attention + "（改）");
		clickDepPageUpdateButton();
		clickAlertCloseButton();
		// 再新增二级科室，为后面的测试用例做铺垫
		clickBusinessInformationButton();
		insertDepartment(departmentName, departmentCode, departmentPhone, departmentAddress, departmentFeature, departmentSummary, Attention);
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
		String beforeMoveUpDepartmentName = getDepManSecondDepartmentName();
		clickDepManMoveUpButton();
		clickAlertCloseButton();
		String afterMoveUpDepartmentName = getDepManFirstDepartmentName();
		if (beforeMoveUpDepartmentName.equals(afterMoveUpDepartmentName)) {
			log.info("上移前二级科室（" + beforeMoveUpDepartmentName + "）与上移后二级科室（" + afterMoveUpDepartmentName + "）相同，二级科室管理-上移二级科室成功");
		} else {
			log.errorShot("上移前二级科室（" + beforeMoveUpDepartmentName + "）与上移后二级科室（" + afterMoveUpDepartmentName + "）不相同，二级科室管理-上移二级科室失败", driver);
		}
	}

	/**
	 * 二级科室管理-下移二级科室
	 */
	public void moveDownDepartment() {
		clickCateManViewDepartmentButton();
		String beforeMoveDownDepartmentName = getDepManFirstDepartmentName();
		clickDepManMoveDownButton();
		clickAlertCloseButton();
		String afterMoveDownDepartmentName = getDepManSecondDepartmentName();
		if (beforeMoveDownDepartmentName.equals(afterMoveDownDepartmentName)) {
			log.info("下移前二级科室（" + beforeMoveDownDepartmentName + "）与下移后二级科室（" + afterMoveDownDepartmentName + "）相同，二级科室管理-下移二级科室成功");
		} else {
			log.errorShot("下移前二级科室（" + beforeMoveDownDepartmentName + "）与下移后二级科室（" + afterMoveDownDepartmentName + "）不相同，二级科室管理-下移二级科室失败", driver);
		}
	}

	/**
	 * 二级科室管理-置顶二级科室
	 */
	public void moveTopDepartment() {
		clickCateManViewDepartmentButton();
		String beforeMoveTopDepartmentName = getDepManSecondDepartmentName();
		clickDepManMoveTopButton();
		clickAlertCloseButton();
		String afterMoveTopDepartmentName = getDepManFirstDepartmentName();
		if (beforeMoveTopDepartmentName.equals(afterMoveTopDepartmentName)) {
			log.info("置顶前二级科室（" + beforeMoveTopDepartmentName + "）与置顶后二级科室（" + afterMoveTopDepartmentName + "）相同，二级科室管理-置顶二级科室成功");
		} else {
			log.errorShot("置顶前二级科室（" + beforeMoveTopDepartmentName + "）与置顶后二级科室（" + afterMoveTopDepartmentName + "）不相同，二级科室管理-置顶二级科室失败", driver);
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
	public String deleteDepartment(String databaseName, String sql) {
		System.out.println(databaseName);
		DatabaseUtils.deleteDate(databaseName, sql);
		clickDepartmentCategoryManageButton();
		clickCateManViewDepartmentButton();
		return getTotalRecorders();

	}
}
