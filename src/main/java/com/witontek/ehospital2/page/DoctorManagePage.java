package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class DoctorManagePage extends MainPage{

	public DoctorManagePage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(DoctorManagePage.class);

	protected Locator docManImportDoctorInfoButton=XmlUtils.readXml("DoctorManagePage").get("docManImportDoctorInfoButton");
	protected Locator docManAddDoctorInfoButton=XmlUtils.readXml("DoctorManagePage").get("docManAddDoctorInfoButton");
	protected Locator docManDownloadDoctorExcelButton=XmlUtils.readXml("DoctorManagePage").get("docManDownloadDoctorExcelButton");
	protected Locator docManExportDoctorInfoButton=XmlUtils.readXml("DoctorManagePage").get("docManExportDoctorInfoButton");
	protected Locator docManSynchronousDoctorHISButton=XmlUtils.readXml("DoctorManagePage").get("docManSynchronousDoctorHISButton");
	
	protected Locator docManDoctorNameInputBox=XmlUtils.readXml("DoctorManagePage").get("docManDoctorNameInputBox");
	protected Locator docManSearchDoctorNameButton=XmlUtils.readXml("DoctorManagePage").get("docManSearchDoctorNameButton");
	
	protected Locator docManDoctorCode=XmlUtils.readXml("DoctorManagePage").get("docManDoctorCode");	
	protected Locator docManDoctorName=XmlUtils.readXml("DoctorManagePage").get("docManDoctorName");
	protected Locator docManBelongToDepartment=XmlUtils.readXml("DoctorManagePage").get("docManBelongToDepartment");
	protected Locator docManPersonalType=XmlUtils.readXml("DoctorManagePage").get("docManPersonalType");
	protected Locator docManHospitalTitle=XmlUtils.readXml("DoctorManagePage").get("docManHospitalTitle");
	protected Locator docManPostion=XmlUtils.readXml("DoctorManagePage").get("docManPostion");
	protected Locator docManAcademicTitle=XmlUtils.readXml("DoctorManagePage").get("docManAcademicTitle");
	
	protected Locator docManEditButton=XmlUtils.readXml("DoctorManagePage").get("docManEditButton");
	protected Locator docManDeleteButton=XmlUtils.readXml("DoctorManagePage").get("docManDeleteButton");	
	protected Locator docManResetPasswordButton=XmlUtils.readXml("DoctorManagePage").get("docManResetPasswordButton");
	protected Locator docManMoveUpButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveUpButton");
	protected Locator docManMoveDownButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveDownButton");
	protected Locator docManMoveTopButton=XmlUtils.readXml("DoctorManagePage").get("docManMoveTopButton");	
	
	protected Locator docManEachPageRecordersDropBox=XmlUtils.readXml("DoctorManagePage").get("docManEachPageRecordersDropBox");
	protected Locator docManTotalRecorders=XmlUtils.readXml("DoctorManagePage").get("docManTotalRecorders");
	protected Locator docManTotalPages=XmlUtils.readXml("DoctorManagePage").get("docManTotalPages");
	protected Locator docManCurrentPages=XmlUtils.readXml("DoctorManagePage").get("docManCurrentPages");	
	protected Locator docManFirstPageButton=XmlUtils.readXml("DoctorManagePage").get("docManFirstPageButton");
	protected Locator docManPreviousPageButton=XmlUtils.readXml("DoctorManagePage").get("docManPreviousPageButton");
	protected Locator docManNextPageButton=XmlUtils.readXml("DoctorManagePage").get("docManNextPageButton");
	protected Locator docManLastPageButton=XmlUtils.readXml("DoctorManagePage").get("docManLastPageButton");		
	
	//搜索医生
	public void searchDocManDoctorName(String searchCondition){
		input(docManDoctorNameInputBox, searchCondition);
		click(docManSearchDoctorNameButton);
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
