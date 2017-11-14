package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.win32.WinUser.INPUT;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class DoctorManagePage extends MainPage{

	public DoctorManagePage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(DoctorManagePage.class);

	/** 医生管理-导入医生信息按钮 */
	protected Locator docManImportDoctorInfoButton=XmlUtils.readXml("DoctorManagePage").get("docManImportDoctorInfoButton");
	protected Locator docManDownloadDoctorExcelButton=XmlUtils.readXml("DoctorManagePage").get("docManDownloadDoctorExcelButton");
	protected Locator docManExportDoctorInfoButton=XmlUtils.readXml("DoctorManagePage").get("docManExportDoctorInfoButton");
	protected Locator docManSynchronousDoctorHISButton=XmlUtils.readXml("DoctorManagePage").get("docManSynchronousDoctorHISButton");
	
	/** 医生管理-医生名称输入框 */
	protected Locator docManDoctorNameInputBox=XmlUtils.readXml("DoctorManagePage").get("docManDoctorNameInputBox");
	protected Locator docManSearchDoctorNameButton=XmlUtils.readXml("DoctorManagePage").get("docManSearchDoctorNameButton");

	/** 医生管理-新增医生信息按钮 */
	protected Locator docManAddDoctorButton=XmlUtils.readXml("DoctorManagePage").get("docManAddDoctorButton");
		protected Locator addDocDoctorCodeInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocDoctorCodeInputBox");	
		protected Locator addDocDoctorNameInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocDoctorNameInputBox");
		protected Locator addDocSelectWorkJobDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocSelectWorkJobDropBox");
		protected Locator addDocSelectWorkJobButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectWorkJobButton");
		protected Locator addDocPhoneInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocPhoneInputBox");
		
		protected Locator addDocSelectRightBelongDepartment=XmlUtils.readXml("DoctorManagePage").get("addDocSelectRightBelongDepartment");
		protected Locator addDocBelongDepartmentRightButton=XmlUtils.readXml("DoctorManagePage").get("addDocBelongDepartmentRightButton");
		protected Locator addDocSelectLeftBelongDepartment=XmlUtils.readXml("DoctorManagePage").get("addDocSelectLeftBelongDepartment");
		protected Locator addDocBelongDepartmentLeftButton=XmlUtils.readXml("DoctorManagePage").get("addDocBelongDepartmentLeftButton");	
		
		protected Locator addDocShortNumInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocShortNumInputBox");
		protected Locator addDocSelectHeadPhotoButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectHeadPhotoButton");
		protected Locator addDocSelectGenderDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocSelectGenderDropBox");
		protected Locator addDocSelectGenderButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectGenderButton");	
		
		protected Locator addDocBirthSelector=XmlUtils.readXml("DoctorManagePage").get("addDocBirthSelector");
		protected Locator addDocBirthMonthToggleButton=XmlUtils.readXml("DoctorManagePage").get("addDocBirthMonthToggleButton");
		protected Locator addDocBirthYearToggleButton=XmlUtils.readXml("DoctorManagePage").get("addDocBirthYearToggleButton");
		protected Locator addDocBirthYearLeftButton=XmlUtils.readXml("DoctorManagePage").get("addDocBirthYearLeftButton");	
		protected Locator addDocSelectBirthYearButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectBirthYearButton");
		protected Locator addDocSelectBirthMonthButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectBirthMonthButton");
		protected Locator addDocSelectBirthDateButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectBirthDateButton");
		
		protected Locator addDocSelectTechnicalTitleDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocSelectTechnicalTitleDropBox");		
		protected Locator addDocSelectTechnicalTitleBUTTON=XmlUtils.readXml("DoctorManagePage").get("addDocSelectTechnicalTitleBUTTON");
		protected Locator addDocSelectPositionDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocSelectPositionDropBox");
		protected Locator addDocSelectPositionButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectPositionButton");
		protected Locator addDocSchoolNameInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocSchoolNameInputBox");	
		
		protected Locator addDocEnterHospitalTimeSelector=XmlUtils.readXml("DoctorManagePage").get("addDocEnterHospitalTimeSelector");
		protected Locator addDocEnterHospitalMonthToggleButton=XmlUtils.readXml("DoctorManagePage").get("addDocEnterHospitalMonthToggleButton");
		protected Locator addDocEnterHospitalYearToggleButton=XmlUtils.readXml("DoctorManagePage").get("addDocEnterHospitalYearToggleButton");
		protected Locator addDocSelectEnterHospitalYearButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectEnterHospitalYearButton");	
		protected Locator addDocSelectEnterHospitalMonthButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectEnterHospitalMonthButton");
		protected Locator addDocSelectEnterHospitalDateButton=XmlUtils.readXml("DoctorManagePage").get("addDocSelectEnterHospitalDateButton");
		
		protected Locator addDocDoctorSummaryInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocDoctorSummaryInputBox");
		protected Locator addDocDoctorSpecialtyInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocDoctorSpecialtyInputBox");		
		protected Locator addDocAcademicTitleDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocAcademicTitleDropBox");
		protected Locator addDocAcademicTitleButton=XmlUtils.readXml("DoctorManagePage").get("addDocAcademicTitleButton");
		protected Locator addDocEmailInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocEmailInputBox");
		protected Locator addDocMedicalLicenseInputBox=XmlUtils.readXml("DoctorManagePage").get("addDocMedicalLicenseInputBox");	
		protected Locator addDocHospitalTitleDropBox=XmlUtils.readXml("DoctorManagePage").get("addDocHospitalTitleDropBox");		
		protected Locator addDocHospitalTitleButton=XmlUtils.readXml("DoctorManagePage").get("addDocHospitalTitleButton");
		protected Locator addDocSaveButton=XmlUtils.readXml("DoctorManagePage").get("addDocSaveButton");
		protected Locator addDocRetuenButton=XmlUtils.readXml("DoctorManagePage").get("addDocRetuenButton");
	
	/** 医生管理-工号 */
	protected Locator docManDoctorCode=XmlUtils.readXml("DoctorManagePage").get("docManDoctorCode");	
	protected Locator docManDoctorName=XmlUtils.readXml("DoctorManagePage").get("docManDoctorName");
	protected Locator docManBelongToDepartment=XmlUtils.readXml("DoctorManagePage").get("docManBelongToDepartment");
	protected Locator docManPersonalType=XmlUtils.readXml("DoctorManagePage").get("docManPersonalType");
	protected Locator docManHospitalTitle=XmlUtils.readXml("DoctorManagePage").get("docManHospitalTitle");
	protected Locator docManPostion=XmlUtils.readXml("DoctorManagePage").get("docManPostion");
	protected Locator docManAcademicTitle=XmlUtils.readXml("DoctorManagePage").get("docManAcademicTitle");
	
	/** 医生管理-编辑按钮 */
	protected Locator docManEditButton=XmlUtils.readXml("DoctorManagePage").get("docManEditButton");
	protected Locator docManDeleteButton=XmlUtils.readXml("DoctorManagePage").get("docManDeleteButton");	
	protected Locator docManResetPasswordButton=XmlUtils.readXml("DoctorManagePage").get("docManResetPasswordButton");
	protected Locator docManMoveUpButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveUpButton");
	protected Locator docManMoveDownButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveDownButton");
	protected Locator docManMoveTopButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveTopButton");	
	
	/** 医生管理-每页显示数下拉框 */
	protected Locator docManEachPageRecordersDropBox=XmlUtils.readXml("DoctorManagePage").get("docManEachPageRecordersDropBox");
	protected Locator docManTotalRecorders=XmlUtils.readXml("DoctorManagePage").get("docManTotalRecorders");
	protected Locator docManTotalPages=XmlUtils.readXml("DoctorManagePage").get("docManTotalPages");
	protected Locator docManCurrentPages=XmlUtils.readXml("DoctorManagePage").get("docManCurrentPages");	
	protected Locator docManFirstPageButton=XmlUtils.readXml("DoctorManagePage").get("docManFirstPageButton");
	protected Locator docManPreviousPageButton=XmlUtils.readXml("DoctorManagePage").get("docManPreviousPageButton");
	protected Locator docManNextPageButton=XmlUtils.readXml("DoctorManagePage").get("docManNextPageButton");
	protected Locator docManLastPageButton=XmlUtils.readXml("DoctorManagePage").get("docManLastPageButton");		
	
	//点击导入医生信息
	public void cliclDocManImportDoctorInfoButton(){
		click(docManImportDoctorInfoButton);
	}
	
	//点击下载医生表Excle模板
	public void cliclDocManDownloadDoctorExcelButton(){
		click(docManDownloadDoctorExcelButton);
	}
	
	//点击导出医生信息
	public void cliclDocManExportDoctorInfoButton(){
		click(docManExportDoctorInfoButton);
	}
	
	//点击同步HIS数据
	public void cliclDocManSynchronousDoctorHISButton(){
		click(docManSynchronousDoctorHISButton);
	}
	
	//输入需要搜索的医生姓名
	public void inputDocManDoctorNameInputBox(String doctorName){
		input(docManDoctorNameInputBox, doctorName);
	}
	
	//点击搜索医生的搜索按钮
	public void clickDocManSearchDoctorNameButton(){
		click(docManSearchDoctorNameButton);
	}
	
	//点击新增医生信息按钮
	public void clickDocManAddDoctorButton(){
		click(docManAddDoctorButton);
	}
	
	//新增医生-输入工号
	public void inputAddDocDoctorCodeInputBoxx(String doctorCode){
		input(addDocDoctorCodeInputBox, doctorCode);
	}
	
	//新增医生-输入医生姓名
	public void inputAddDocDoctorNameInputBox(String doctorName){
		input(addDocDoctorNameInputBox, doctorName);
	}
	
	//新增医生-点击选择人员类别下拉框
	public void clickAddDocSelectWorkJobDropBox(){
		click(addDocSelectWorkJobDropBox);
	}
	
	//新增医生-点击选择人员类别按钮
	public void clickAddDocSelectWorkJobButton(){
		click(addDocSelectWorkJobButton);
	}
	
	//新增医生-输入手机号码
	public void inputAddDocPhoneInputBox(String phone){
		input(addDocPhoneInputBox,phone);
	}
	
	//新增医生-点击选定右移所属科室
	public void clickAddDocSelectRightBelongDepartment(){
		click(addDocSelectRightBelongDepartment);
	}
	
	//新增医生-点击所属科室右移按钮
	public void clickAddDocBelongDepartmentRightButton(){
		click(addDocBelongDepartmentRightButton);
	}
	
	//新增医生-点击选定右移所属科室
	public void clickAddDocSelectLeftBelongDepartment(){
		click(addDocSelectLeftBelongDepartment);
	}
	
	//新增医生-点击所属科室左移按钮
	public void clickAddDocBelongDepartmentLeftButton(){
		click(addDocBelongDepartmentLeftButton);
	}
	
	//新增医生-输入短号
	public void inputAddDocShortNumInputBox(String shortNumber){
		input(addDocShortNumInputBox,shortNumber);
	}
	
	//新增医生-点击选择头像按钮
	public void clickAddDocSelectHeadPhotoButton(){
		click(addDocSelectHeadPhotoButton);
	}
	
	//新增医生-点击选择性别下拉框
	public void clickAddDocSelectGenderDropBox(){
		click(addDocSelectGenderDropBox);
	}
	
	//新增医生-点击选择性别按钮
	public void clickAddDocSelectGenderButton(){
		click(addDocSelectGenderButton);
	}
	
	//新增医生-点击出生年月选择器
	public void clickAddDocBirthSelector(){
		click(addDocBirthSelector);
	}
	
	//点击出生年月-月份切换按钮
	public void clickAddDocBirthMonthToggleButton(){
		click(addDocBirthMonthToggleButton);
	}
	
	//点击出生年月-年份切换按钮
	public void clickAddDocBirthYearToggleButton(){
		click(addDocBirthYearToggleButton);
	}
	
	//点击出生年月-年份左移按钮
	public void clickAddDocBirthYearLeftButton(){
		click(addDocBirthYearLeftButton);
	}
	
	//点击出生年月-选定年份按钮
	public void clickAddDocSelectBirthYearButton(){
		click(addDocSelectBirthYearButton);
	}
	
	//点击出生年月-选定月份按钮
	public void clickAddDocSelectBirthMonthButton(){
		click(addDocSelectBirthMonthButton);
	}
	
	//点击出生年月-选定日期按钮
	public void clickAddDocSelectBirthDateButton(){
		click(addDocSelectBirthDateButton);
	}
	
	//新增医生-点击选择职称下拉框
	public void clickAddDocSelectTechnicalTitleDropBox(){
		click(addDocSelectTechnicalTitleDropBox);
	}
	
	//新增医生-点击选择职称按钮
	public void clickAddDocSelectTechnicalTitleButton(){
		click(addDocSelectTechnicalTitleBUTTON);
	}
	
	//新增医生-点击选择职位下拉框
	public void clickAddDocSelectPositionDropBox(){
		click(addDocSelectPositionDropBox);
	}
	
	//新增医生-点击选择职位按钮
	public void clickAddDocSelectPositionButton(){
		click(addDocSelectPositionButton);
	}
	
	//新增医生-输入毕业院校输入框
	public void inputAddDocSchoolNameInputBox(String schoolName){
		input(addDocSchoolNameInputBox,schoolName);
	}
	
	//新增医生-点击进院时间选择器
	public void clickAddDocEnterHospitalTimeSelector(){
		click(addDocEnterHospitalTimeSelector);
	}
	
	//点击进院时间-月份切换按钮
	public void clickAddDocEnterHospitalMonthToggleButton(){
		click(addDocEnterHospitalMonthToggleButton);
	}
	
	//点击进院时间-年份切换按钮
	public void clickAddDocEnterHospitalYearToggleButton(){
		click(addDocEnterHospitalYearToggleButton);
	}
	
	//点击进院时间-选定年份按钮
	public void clickAddDocSelectEnterHospitalYearButton(){
		click(addDocSelectEnterHospitalYearButton);
	}
	
	//点击进院时间-选定月份按钮
	public void clickAddDocSelectEnterHospitalMonthButton(){
		click(addDocSelectEnterHospitalMonthButton);
	}
	
	//点击进院时间-选定日期按钮
	public void clickAddDocSelectEnterHospitalDateButton(){
		click(addDocSelectEnterHospitalDateButton);
	}
	
	//新增医生-输入医生简介
	public void inputAddDocDoctorSummaryInputBox(String doctorSummary){
		input(addDocDoctorSummaryInputBox,doctorSummary);
	}
	
	//新增医生-输入医生擅长
	public void inputAddDocDoctorSpecialtyInputBox(String doctorSpecialty){
		input(addDocDoctorSpecialtyInputBox,doctorSpecialty);
	}
	
	//新增医生-点击学术职称下拉框
	public void clickAddDocAcademicTitleDropBox(){
		click(addDocAcademicTitleDropBox);
	}
	
	//新增医生-点击学术职称按钮
	public void clickAddDocAcademicTitleButton(){
		click(addDocAcademicTitleButton);
	}
	
	//新增医生-输入医生邮箱
	public void inputAddDocEmailInputBox(String email){
		input(addDocEmailInputBox,email);
	}
	
	//新增医生-输入行医执照号
	public void inputAddDocMedicalLicenseInputBox(String medicalLicense){
		input(addDocMedicalLicenseInputBox,medicalLicense);
	}
	
	//新增医生-点击医院职称下拉框
	public void clickAddDocHospitalTitleDropBox(){
		click(addDocHospitalTitleDropBox);
	}
	
	//新增医生-点击医院职称按钮
	public void clickAddDocHospitalTitleButton(){
		click(addDocHospitalTitleButton);
	}
	
	//新增医生-点击保存按钮
	public void clickAddDocSaveButton(){
		click(addDocSaveButton);
	}
	
	//新增医生-点击返回按钮
	public void clickAddDocRetuenButton(){
		click(addDocRetuenButton);
	}
	
	
	
	
	//获取工号（医生编号）
	public String getDocManDoctorCode(){
		String code=getText(docManDoctorCode);
		log.info("医生编号：\""+code+"\"");
		return code;
	}
	
	//获取医生姓名
	public String getDocManDoctorName(){
		String name=getText(docManDoctorName);
		log.info("医生姓名：\""+name+"\"");
		return name;
	}
	
	//点击置顶
	public void clickDocManageMoveTopButton(){
		click(docManMoveTopButton);
	}
	
	//获取总医生数
	public String getDocManTotalRecorders(){
		String recorders=getText(docManTotalRecorders);
		log.info("总医生数："+recorders);
		return recorders;
	}
}
