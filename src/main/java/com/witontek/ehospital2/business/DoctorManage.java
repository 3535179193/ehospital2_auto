package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.DateUtils;
import com.witontek.ehospital2.base.DatabaseUtils;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DoctorManagePage;

public class DoctorManage extends DoctorManagePage {

	public DoctorManage(WebDriver driver) {
		super(driver);
	}

	private Log log = new Log(DoctorManage.class);

	/**
	 * 医生管理-新增医生
	 * @param doctorName
	 * @param doctorCode
	 * @param phone
	 * @param shortNumber
	 * @param schoolName
	 * @param doctorSummary
	 * @param doctorSpecialty
	 * @param email
	 * @param medicalLicense
	 * @return
	 */
	public String insertDoctor(String doctorName, String doctorCode, String phone, String shortNumber, String schoolName, String doctorSummary,
			String doctorSpecialty, String email, String medicalLicense) {
		clickDoctorManageButton();
		clickDocManAddDoctorButton();
		inputAddDocDoctorCodeInputBoxx(doctorCode);
		inputAddDocDoctorNameInputBox(doctorName);
		clickAddDocSelectWorkJobDropBox();
		clickAddDocSelectWorkJobButton();
		inputAddDocPhoneInputBox(phone);
		clickAddDocSelectRightBelongDepartment();
		clickAddDocBelongDepartmentRightButton();
		inputAddDocShortNumInputBox(shortNumber);
		clickAddDocSelectGenderDropBox();
		clickAddDocSelectGenderButton();
		clickAddDocBirthSelector();
		clickMonthToggleButton();
		clickYearToggleButton();
		clickLeftButton();
		clickAddDocSelectBirthYearButton();
		clickAddDocSelectBirthMonthButton();
		clickAddDocSelectBirthDateButton();
		clickAddDocSelectTechnicalTitleDropBox();
		clickAddDocSelectTechnicalTitleButton();
		clickAddDocSelectPositionDropBox();
		clickAddDocSelectPositionButton();
		inputAddDocSchoolNameInputBox(schoolName);
		clickAddDocEnterHospitalTimeSelector();
		clickMonthToggleButton();
		clickYearToggleButton();
		clickAddDocSelectEnterHospitalYearButton();
		clickAddDocSelectEnterHospitalMonthButton();
		clickAddDocSelectEnterHospitalDateButton();
		inputAddDocDoctorSummaryInputBox(doctorSummary);
		inputAddDocDoctorSpecialtyInputBox(doctorSpecialty);
		clickAddDocAcademicTitleDropBox();
		clickAddDocAcademicTitleButton();
		inputAddDocEmailInputBox(email);
		inputAddDocMedicalLicenseInputBox(medicalLicense);
		clickAddDocHospitalTitleDropBox();
		clickAddDocHospitalTitleButton();
		clickAddDocSaveButton();
		clickAlertCloseButton();
		clickLastPageButton();
		return getDocManDoctorName();
	}

	/**
	 * 医生管理-置顶新增的医生
	 * @return
	 */
	public String moveTopDoctor() {
		clickLastPageButton();
		clickDocManMoveTopButton();
		clickAlertCloseButton();
		clickFirstPageButton();
		return getDocManFirstDoctorName();
	}

	/**
	 * 医生管理-编辑新增的医生
	 * @return
	 */
	public String editDoctor() {
		clickDocManEditButton();
		clickAddDocSaveButton();
		clickAlertCloseButton();
		return getDocManDoctorName();
	}

	/**
	 * 医生管理-下移新增的医生
	 * @param doctorName
	 * @param doctorCode
	 * @param phone
	 * @param shortNumber
	 * @param schoolName
	 * @param doctorSummary
	 * @param doctorSpecialty
	 * @param email
	 * @param medicalLicense
	 * @return
	 */
	public String moveDownDoctor(String doctorName, String doctorCode, String phone, String shortNumber, String schoolName, String doctorSummary,
			String doctorSpecialty, String email, String medicalLicense) {
		clickBusinessInformationButton();
		insertDoctor(doctorName, doctorCode, phone, shortNumber, schoolName, doctorSummary, doctorSpecialty, email, medicalLicense);
		clickDocManMoveTopButton();
		clickDocManMoveDownButton();
		clickAlertCloseButton();
		return getDocManSecondDoctorName();
	}

	/**
	 * 医生管理-上移新增的医生
	 * @return
	 */
	public String moveUpDoctor() {
		clickDocManMoveUpButton();
		clickAlertCloseButton();
		return getDocManFirstDoctorName();
	}

	/**
	 * 医生管理-搜索医生
	 * @param doctorName
	 * @return
	 */
	public String searchDoctor(String doctorName) {
		inputDocManDoctorNameInputBox(doctorName);
		clickDocManSearchDoctorNameButton();
		return getDocManFirstDoctorName();
	}

	/**
	 * 数据库操作-删除新增的医生
	 * @param sql
	 * @param doctorName
	 */
	public void deleteDoctor(String doctorName,String tableName,String conditionKey,String conditionValue) {
		clickDoctorManageButton();
		int beforeDeleteRecorders = Integer.parseInt(getTotalRecords());
		searchDoctor(doctorName);
		int shouldDeleteRecorders = Integer.parseInt(getTotalRecords());
		DatabaseUtils.deleteDate(tableName, conditionKey, conditionValue);
		int afterDeleteRecorders = Integer.parseInt(getTotalRecords());
		clickDoctorManageButton();
		if (beforeDeleteRecorders - afterDeleteRecorders == shouldDeleteRecorders) {
			log.info("通过数据库删除新增的医生成功");
		} else {
			log.error("通过数据库删除新增的医生失败");
		}
	}

}
