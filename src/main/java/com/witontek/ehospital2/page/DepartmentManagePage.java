package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class DepartmentManagePage extends MainPage{

	public DepartmentManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentManagePage.class);
	
	protected Locator depManImportDepartmentInfoButton=XmlUtils.readXml("DepartmentManagePage").get("depManImportDepartmentInfoButton");
	protected Locator depManDownloadDepartmentExcelButton=XmlUtils.readXml("DepartmentManagePage").get("depManDownloadDepartmentExcelButton");
	protected Locator depManExportDepartmentInfoButton=XmlUtils.readXml("DepartmentManagePage").get("depManExportDepartmentInfoButton");
	protected Locator depManSynchronousDepartmentHISButton=XmlUtils.readXml("DepartmentManagePage").get("depManSynchronousDepartmentHISButton");
	
	protected Locator depManDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentNameInputBox");
	protected Locator depManSearchDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManSearchDepartmentButton");
	protected Locator depManAddFirstDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManAddFirstDepartmentButton");
	
	protected Locator depManCategory=XmlUtils.readXml("DepartmentManagePage").get("depManCategory");
	protected Locator depManContainDepartments=XmlUtils.readXml("DepartmentManagePage").get("depManContainDepartments");
	
	protected Locator depManEditButton=XmlUtils.readXml("DepartmentManagePage").get("depManEditButton");
	protected Locator depManDeleteButton=XmlUtils.readXml("DepartmentManagePage").get("depManDeleteButton");
	protected Locator depManViewDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManViewDepartmentButton");
	protected Locator depManMoveUpButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveUpButton");
	protected Locator depManMoveDownButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveDownButton");
	protected Locator depManMoveTopButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveTopButton");

	protected Locator depManEachPageRecordersDropBox=XmlUtils.readXml("DepartmentManagePage").get("depManEachPageRecordersDropBox");
	protected Locator depManTotalRecorders=XmlUtils.readXml("DepartmentManagePage").get("depManTotalRecorders");
	protected Locator depManTotalPages=XmlUtils.readXml("DepartmentManagePage").get("depManTotalPages");
	protected Locator depManCurrentPages=XmlUtils.readXml("DepartmentManagePage").get("depManCurrentPages");
	protected Locator depManFirstPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManFirstPageButton");
	protected Locator depManPreviousPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManPreviousPageButton");
	protected Locator depManNextPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManNextPageButton");
	protected Locator depManLastPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManLastPageButton");
	
	
	//搜索科室名称
	public void searchDepManDepartmentName(String searchCondition){
		input(depManDepartmentNameInputBox, searchCondition);
		click(depManSearchDepartmentButton);
	}
	
	//获取一级科室名称
	public String getDepManCategory(){
		String category=getText(depManCategory);
		log.info("一级科室名称："+category);
		return category;
	}
	
	//获取包含的二级科室
	public String getDepManContainDepartments(){
		String departments=getText(depManContainDepartments);
		log.info("包含的二级科室："+departments);
		return departments;
	}
	
	//一级科室总数
	public String getDepManTotalRecorders(){
		String recorders=getText(depManTotalRecorders);
		log.info("一级科室总数："+recorders);
		return recorders;
	}
}
