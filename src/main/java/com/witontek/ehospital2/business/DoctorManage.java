package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DoctorManagePage;

public class DoctorManage extends DoctorManagePage{

	public DoctorManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DoctorManage.class);
	
	//新增医生
	public String addDoctor(String doctorName,String doctorCode,String phone,String shortNumber,String schoolName,String doctorSummary,String doctorSpecialty,String email,String medicalLicense){
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
	
	//置顶医生
	public String moveTopDoctor(){
		clickLastPageButton();
		clickDocManMoveTopButton();
		clickAlertCloseButton();
		clickFirstPageButton();
		return getDocManFirstDoctorName();
	}
	
	//下移医生
	public String moveDownDoctor(){
		clickDocManMoveTopButton();
		clickAlertCloseButton();
		return getDocManSecondDoctorName();
	}
	
	//上移医生
	public String moveUpDoctor(){
		clickDocManMoveUpButton();
		clickAlertCloseButton();
		return getDocManFirstDoctorName();
	}
	
	//搜索医生
	public String searchDoctor(String doctorName){
		inputDocManDoctorNameInputBox(doctorName);
		clickDocManSearchDoctorNameButton();
		return getDocManFirstDoctorName();
	}
	
	//编辑医生
	public String editDoctor(){
		clickDocManEditButton();
		clickAddDocSaveButton();
		clickAlertCloseButton();
		return getDocManDoctorName();
	}
	

	
	
	
	
	
	
	
}
