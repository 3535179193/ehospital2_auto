package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DoctorManagePage;

public class DoctorManage extends DoctorManagePage{

	public DoctorManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DoctorManage.class);
	
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
		clickAddDocBirthMonthToggleButton();
		clickAddDocBirthYearToggleButton();
		clickAddDocBirthYearLeftButton();
		clickAddDocSelectBirthYearButton();
		clickAddDocSelectBirthMonthButton();
		clickAddDocSelectBirthDateButton();
		clickAddDocSelectTechnicalTitleDropBox();
		clickAddDocSelectTechnicalTitleButton();
		clickAddDocSelectPositionDropBox();
		clickAddDocSelectPositionButton();
		inputAddDocSchoolNameInputBox(schoolName);
		clickAddDocEnterHospitalTimeSelector();
		clickAddDocEnterHospitalMonthToggleButton();
		clickAddDocEnterHospitalYearToggleButton();
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
		return null;
	}

	public String searchDoctor(String doctorName){
		inputDocManDoctorNameInputBox(doctorName);
		clickDocManSearchDoctorNameButton();
		return getDocManDoctorName();
	}
	
	
	
	
	
	
	
}
