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

	/*** 医生管理-导入医生信息按钮 */
	protected Locator docManImportDoctorInfoButton=XmlUtils.getElementXml("DoctorManagePage").get("docManImportDoctorInfoButton");
	protected Locator docManDownloadDoctorExcelButton=XmlUtils.getElementXml("DoctorManagePage").get("docManDownloadDoctorExcelButton");
	protected Locator docManExportDoctorInfoButton=XmlUtils.getElementXml("DoctorManagePage").get("docManExportDoctorInfoButton");
	protected Locator docManSynchronousDoctorHISButton=XmlUtils.getElementXml("DoctorManagePage").get("docManSynchronousDoctorHISButton");
	
	/*** 医生管理-医生名称输入框 */
	protected Locator docManDoctorNameInputBox=XmlUtils.getElementXml("DoctorManagePage").get("docManDoctorNameInputBox");
	protected Locator docManSearchDoctorNameButton=XmlUtils.getElementXml("DoctorManagePage").get("docManSearchDoctorNameButton");

	/*** 医生管理-新增医生信息按钮 */
	protected Locator docManAddDoctorButton=XmlUtils.getElementXml("DoctorManagePage").get("docManAddDoctorButton");
		protected Locator addDocDoctorCodeInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocDoctorCodeInputBox");	
		protected Locator addDocDoctorNameInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocDoctorNameInputBox");
		protected Locator addDocSelectWorkJobDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectWorkJobDropBox");
		protected Locator addDocSelectWorkJobButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectWorkJobButton");
		protected Locator addDocPhoneInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocPhoneInputBox");
		
		/*** 新增医生-选定右移所属科室 */
		protected Locator addDocSelectRightBelongDepartment=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectRightBelongDepartment");
		protected Locator addDocBelongDepartmentRightButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocBelongDepartmentRightButton");
		protected Locator addDocSelectLeftBelongDepartment=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectLeftBelongDepartment");
		protected Locator addDocBelongDepartmentLeftButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocBelongDepartmentLeftButton");	
		
		/*** 新增医生-短号输入框 */
		protected Locator addDocShortNumInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocShortNumInputBox");
		protected Locator addDocSelectHeadPhotoButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectHeadPhotoButton");
		protected Locator addDocSelectGenderDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectGenderDropBox");
		protected Locator addDocSelectGenderButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectGenderButton");	
		
		/*** 新增医生-出生年月选择器 */
		protected Locator addDocBirthSelector=XmlUtils.getElementXml("DoctorManagePage").get("addDocBirthSelector");
		protected Locator addDocSelectBirthYearButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectBirthYearButton");
		protected Locator addDocSelectBirthMonthButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectBirthMonthButton");
		protected Locator addDocSelectBirthDateButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectBirthDateButton");
		
		/*** 新增医生-选择职称下拉框 */
		protected Locator addDocSelectTechnicalTitleDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectTechnicalTitleDropBox");		
		protected Locator addDocSelectTechnicalTitleBUTTON=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectTechnicalTitleBUTTON");
		protected Locator addDocSelectPositionDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectPositionDropBox");
		protected Locator addDocSelectPositionButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectPositionButton");
		protected Locator addDocSchoolNameInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocSchoolNameInputBox");	
		
		/*** 新增医生-进入本院时间选择器 */
		protected Locator addDocEnterHospitalTimeSelector=XmlUtils.getElementXml("DoctorManagePage").get("addDocEnterHospitalTimeSelector");
		protected Locator addDocSelectEnterHospitalYearButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectEnterHospitalYearButton");	
		protected Locator addDocSelectEnterHospitalMonthButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectEnterHospitalMonthButton");
		protected Locator addDocSelectEnterHospitalDateButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSelectEnterHospitalDateButton");
		
		/*** 新增医生-医生简介输入框 */
		protected Locator addDocDoctorSummaryInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocDoctorSummaryInputBox");
		protected Locator addDocDoctorSpecialtyInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocDoctorSpecialtyInputBox");		
		protected Locator addDocAcademicTitleDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocAcademicTitleDropBox");
		protected Locator addDocAcademicTitleButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocAcademicTitleButton");
		protected Locator addDocEmailInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocEmailInputBox");
		protected Locator addDocMedicalLicenseInputBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocMedicalLicenseInputBox");	
		protected Locator addDocHospitalTitleDropBox=XmlUtils.getElementXml("DoctorManagePage").get("addDocHospitalTitleDropBox");		
		protected Locator addDocHospitalTitleButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocHospitalTitleButton");
		protected Locator addDocSaveButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocSaveButton");
		protected Locator addDocRetuenButton=XmlUtils.getElementXml("DoctorManagePage").get("addDocRetuenButton");
	
	/*** 医生管理-序号 */
	protected Locator docManNumber=XmlUtils.getElementXml("DoctorManagePage").get("docManNumber");
	protected Locator docManDoctorCode=XmlUtils.getElementXml("DoctorManagePage").get("docManDoctorCode");	
	protected Locator docManDoctorName=XmlUtils.getElementXml("DoctorManagePage").get("docManDoctorName");
	protected Locator docManFirstDoctorName=XmlUtils.getElementXml("DoctorManagePage").get("docManFirstDoctorName");
	protected Locator docManSecondDoctorName=XmlUtils.getElementXml("DoctorManagePage").get("docManSecondDoctorName");
	protected Locator docManBelongToDepartment=XmlUtils.getElementXml("DoctorManagePage").get("docManBelongToDepartment");
	protected Locator docManPersonalType=XmlUtils.getElementXml("DoctorManagePage").get("docManPersonalType");
	protected Locator docManHospitalTitle=XmlUtils.getElementXml("DoctorManagePage").get("docManHospitalTitle");
	protected Locator docManPostion=XmlUtils.getElementXml("DoctorManagePage").get("docManPostion");
	protected Locator docManAcademicTitle=XmlUtils.getElementXml("DoctorManagePage").get("docManAcademicTitle");
	
	/*** 医生管理-编辑按钮 */
	protected Locator docManEditButton=XmlUtils.getElementXml("DoctorManagePage").get("docManEditButton");
	protected Locator docManMoveUpButton=XmlUtils.getElementXml("DoctorManagePage").get("docManMoveUpButton");
	protected Locator docManMoveDownButton=XmlUtils.getElementXml("DoctorManagePage").get("docManMoveDownButton");
	protected Locator docManMoveTopButton=XmlUtils.getElementXml("DoctorManagePage").get("docManMoveTopButton");	
	protected Locator docManHideButton=XmlUtils.getElementXml("DoctorManagePage").get("docManHideButton");	
	
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
	
	//医生管理-获取序号
	public String getDocManNumber(){
		String number=getText(docManNumber);
		log.info("医生管理-序号："+number);
		return number;
	}
	
	//医生管理-获取工号
	public String getDocManDoctorCode(){
		String doctorCode=getText(docManDoctorCode);
		log.info("医生管理-工号："+doctorCode);
		return doctorCode;
	}
	
	//医生管理-获取医生姓名
	public String getDocManDoctorName(){
		String doctorName=getText(docManDoctorName);
		log.info("医生管理-医生姓名："+doctorName);
		return doctorName;
	}
	
	//医生管理-获取序号为1的医生姓名
	public String getDocManFirstDoctorName(){
		String doctorName=getText(docManFirstDoctorName);
		log.info("医生管理-序号为1的医生姓名："+doctorName);
		return doctorName;
	}
	
	//医生管理-获取序号为2的医生姓名
	public String getDocManSecondDoctorName(){
		String doctorName=getText(docManSecondDoctorName);
		log.info("医生管理-序号为2的医生姓名："+doctorName);
		return doctorName;
	}
	
	//医生管理-获取所属科室
	public String getDocManBelongToDepartment(){
		String belongToDepartment=getText(docManBelongToDepartment);
		log.info("医生管理-所属科室："+belongToDepartment);
		return belongToDepartment;
	}
	
	//医生管理-获取人员类别
	public String getDocManPersonalType(){
		String personalType=getText(docManPersonalType);
		log.info("医生管理-人员类别："+personalType);
		return personalType;
	}
	
	//医生管理-获取医院职称
	public String getDocManHospitalTitle(){
		String hospitalTitle=getText(docManHospitalTitle);
		log.info("医生管理-医院职称："+hospitalTitle);
		return hospitalTitle;
	}
	
	//医生管理-获取职位
	public String getDocManPostion(){
		String postion=getText(docManPostion);
		log.info("医生管理-职位："+postion);
		return postion;
	}
	
	//医生管理-获取学术职称
	public String getDocManAcademicTitle(){
		String academicTitle=getText(docManAcademicTitle);
		log.info("医生管理-学术职称："+academicTitle);
		return academicTitle;
	}
	
	//医生管理-点击编辑按钮
	public void clickDocManEditButton(){
		click(docManEditButton);
	}
	
	//医生管理-点击上移按钮
	public void clickDocManMoveUpButton(){
		click(docManMoveUpButton);
	}
	
	//医生管理-点击下移按钮
	public void clickDocManMoveDownButton(){
		click(docManMoveDownButton);
	}
	
	//医生管理-点击置顶按钮
	public void clickDocManMoveTopButton(){
		click(docManMoveTopButton);
	}
	
	//医生管理-点击隐藏按钮
	public void clickDocManHideButton(){
		click(docManHideButton);
	}

}
