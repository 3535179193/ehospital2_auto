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
	
	//科室管理-导入科室信息按钮
	protected Locator depManImportDepartmentInfoButton=XmlUtils.readXml("DepartmentManagePage").get("depManImportDepartmentInfoButton");
	protected Locator depManDownloadDepartmentExcelButton=XmlUtils.readXml("DepartmentManagePage").get("depManDownloadDepartmentExcelButton");
	protected Locator depManExportDepartmentInfoButton=XmlUtils.readXml("DepartmentManagePage").get("depManExportDepartmentInfoButton");
	protected Locator depManSynchronousDepartmentHISButton=XmlUtils.readXml("DepartmentManagePage").get("depManSynchronousDepartmentHISButton");
	
	//科室管理-科室名称输入框
	protected Locator depManDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("depManDepartmentNameInputBox");
	protected Locator depManSearchDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManSearchDepartmentButton");
	
	//科室管理-新增一级科室按钮
	protected Locator depManAddFirstDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManAddFirstDepartmentButton");
		protected Locator addCateDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("addCateDepartmentNameInputBox");
		protected Locator addCateDepartmentCodeInputBox=XmlUtils.readXml("DepartmentManagePage").get("addCateDepartmentCodeInputBox");
		protected Locator addCateDepartmentLogoButton=XmlUtils.readXml("DepartmentManagePage").get("addCateDepartmentLogoButton");
		protected Locator addCateSaveButton=XmlUtils.readXml("DepartmentManagePage").get("addCateSaveButton");
		protected Locator addCateReturnButton=XmlUtils.readXml("DepartmentManagePage").get("addCateReturnButton");
	
	//科室管理-序号
	protected Locator depManNumber=XmlUtils.readXml("DepartmentManagePage").get("depManNumber");
	protected Locator depManFirstCategoryName=XmlUtils.readXml("DepartmentManagePage").get("depManFirstCategoryName");
	protected Locator depManSecondCategoryName=XmlUtils.readXml("DepartmentManagePage").get("depManSecondCategoryName");
	protected Locator depManContainDepartments=XmlUtils.readXml("DepartmentManagePage").get("depManContainDepartments");
	
	//科室管理-编辑一级科室按钮
	protected Locator depManEditButton=XmlUtils.readXml("DepartmentManagePage").get("depManEditButton");
		protected Locator ediCateDepartmentNameInputBox=XmlUtils.readXml("DepartmentManagePage").get("ediCateDepartmentNameInputBox");
		protected Locator ediCateDepartmentCodeInputBox=XmlUtils.readXml("DepartmentManagePage").get("ediCateDepartmentCodeInputBox");
		protected Locator ediCateDepartmentLogoButton=XmlUtils.readXml("DepartmentManagePage").get("ediCateDepartmentLogoButton");
		protected Locator ediCateEditButton=XmlUtils.readXml("DepartmentManagePage").get("ediCateEditButton");
		protected Locator ediCateReturnButton=XmlUtils.readXml("DepartmentManagePage").get("ediCateReturnButton");
	
	//科室管理-删除按钮
	protected Locator depManDeleteButton=XmlUtils.readXml("DepartmentManagePage").get("depManDeleteButton");
	protected Locator depManViewDepartmentButton=XmlUtils.readXml("DepartmentManagePage").get("depManViewDepartmentButton");
	protected Locator depManMoveUpButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveUpButton");
	protected Locator depManMoveDownButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveDownButton");
	protected Locator depManMoveTopButton=XmlUtils.readXml("DepartmentManagePage").get("depManMoveTopButton");

	//科室管理-每页显示数下拉框
	protected Locator depManEachPageRecordersDropBox=XmlUtils.readXml("DepartmentManagePage").get("depManEachPageRecordersDropBox");
	protected Locator depManEachPageTenRecorders=XmlUtils.readXml("DepartmentManagePage").get("depManEachPageTenRecorders");	
	protected Locator depManTotalRecorders=XmlUtils.readXml("DepartmentManagePage").get("depManTotalRecorders");
	protected Locator depManTotalPages=XmlUtils.readXml("DepartmentManagePage").get("depManTotalPages");
	protected Locator depManCurrentPage=XmlUtils.readXml("DepartmentManagePage").get("depManCurrentPage");
	protected Locator depManFirstPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManFirstPageButton");
	protected Locator depManPreviousPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManPreviousPageButton");
	protected Locator depManNextPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManNextPageButton");
	protected Locator depManLastPageButton=XmlUtils.readXml("DepartmentManagePage").get("depManLastPageButton");
	
	//弹框
	protected Locator depManAlertBox=XmlUtils.readXml("DepartmentManagePage").get("depManAlertBox");
	protected Locator depManCloseButton=XmlUtils.readXml("DepartmentManagePage").get("depManCloseButton");
	
	//被验证的数据
	protected Locator depManAssertAddDepartmentCategory=XmlUtils.readXml("DepartmentManagePage").get("depManAssertAddDepartmentCategory");
	
	//点击导入科室信息
	public void clickDepManImportDepartmentInfoButton(){
		click(depManImportDepartmentInfoButton);
	}
	
	//点击下载科室表Excel模板
	public void clickDepManDownloadDepartmentExcelButton(){
		click(depManDownloadDepartmentExcelButton);
	}
	
	//点击导出科室信息
	public void clickDepManExportDepartmentInfoButton(){
		click(depManExportDepartmentInfoButton);
	}
	
	//点击同步HIS数据
	public void clickDepManSynchronousDepartmentHISButton(){
		click(depManSynchronousDepartmentHISButton);
	}
	
	//输入一级科室名称
	public void inputDepManDepartmentName(String searchCondition){
		input(depManDepartmentNameInputBox, searchCondition);
	}
	
	//点击搜索科室
	public void clickDepManSearchDepartmentButton(){
		click(depManSearchDepartmentButton);
	}
	
	//点击新增一级科室
	public void clickDepManAddFirstDepartmentButton(){
		click(depManAddFirstDepartmentButton);
	}
	
	//新增一级科室-输入科室名称
	public void inputAddCateDepartmentNameInputBox(String categoryName){
		input(addCateDepartmentNameInputBox, categoryName);
	}
	
	//新增一级科室-输入科室名称
	public void inputAddCateDepartmentCodeInputBox(String categoryCode){
		input(addCateDepartmentCodeInputBox, categoryCode);
	}
	
	//新增一级科室-点击科室LOGO
	public void clickAddCateDepartmentLogoButton(){
		click(addCateDepartmentLogoButton);
	}
	
	//新增一级科室-点击保存按钮
	public void clickAddCateSaveButton(){
		click(addCateSaveButton);
	}
	
	//新增一级科室-点击返回按钮
	public void clickAddCateReturnButton(){
		click(addCateReturnButton);
	}
	
	//获取序号
	public String getDepManNumber(){
		String number=getText(depManNumber);
		log.info("序号："+number);
		return number;
	}
	
	//获取序号为1的一级科室名称
	public String getDepManFirstCategoryName(){
		String category1=getText(depManFirstCategoryName);
		log.info("序号为1的一级科室名称："+category1);
		return category1;
	}
	
	//获取序号为2的一级科室名称
	public String getDepManSecondCategoryName(){
		String category2=getText(depManSecondCategoryName);
		log.info("序号为2的一级科室名称："+category2);
		return category2;
	}
	
	//获取包含的二级科室
	public String getDepManContainDepartments(){
		String departments=getText(depManContainDepartments);
		log.info("包含的二级科室："+departments);
		return departments;
	}
	
	//点击编辑
	public void clickDepManEditButton(){
		click(depManEditButton);
	}
	
	//编辑一级科室-编辑科室名称
	public void updateEdiCateDepartmentNameInputBox(String departmentName){
		clearAndInput(ediCateDepartmentNameInputBox, departmentName);
	}
	
	//编辑一级科室-编辑科室编码
	public void updateEdiCateDepartmentCodeInputBox(String departmentCode){
		clearAndInput(ediCateDepartmentCodeInputBox, departmentCode);
	}
	
	//编辑一级科室-点击科室LOGO
	public void clickEdiCateDepartmentLogoButton(){
		click(ediCateDepartmentLogoButton);
	}
	
	//编辑一级科室-点击保存按钮
	public void clickEdiCateEditButton(){
		click(ediCateEditButton);
	}
	
	//编辑一级科室-点击返回按钮
	public void clickEdiCateReturnButton(){
		click(ediCateReturnButton);
	}
	
	//点击删除
	public void clickDepManDeleteButton(){
		click(depManDeleteButton);
	}
	
	//点击查看二级科室
	public void clickDepManViewDepartmentButton(){
		click(depManViewDepartmentButton);
	}
	
	//点击上移
	public void clickDepManMoveUpButton(){
		click(depManMoveUpButton);
	}
	
	//点击下移
	public void clickDepManMoveDownButton(){
		click(depManMoveDownButton);
	}
	
	//点击置顶
	public void clickDepManMoveTopButton(){
		click(depManMoveTopButton);
	}
	
	//点击每页显示条数下拉框
	public void clickDepManEachPageRecordersDropBox(){
		click(depManEachPageRecordersDropBox);
	}
	
	//选中每页显示10条
	public void clickDepManEachPageTenRecorders(){
		click(depManEachPageTenRecorders);
	}
	
	//总记录数
	public String getDepManTotalRecorders(){
		String recorders=getText(depManTotalRecorders);
		log.info("一级科室总数："+recorders);
		return recorders;
	}
	
	//总页数
	public String getDepManTotalPages(){
		String pages=getText(depManTotalPages);
		log.info("一级科室列表总页数："+pages);
		return pages;
	}
	
	//当前页数
	public String getDepManCurrentPage(){
		String page=getText(depManCurrentPage);
		log.info("一级科室列表当前页数："+page);
		return page;
	}
	
	//点击第一页
	public void clickDepManFirstPageButton(){
		click(depManFirstPageButton);
	}
	
	//点击上一页
	public void clickDepManPreviousPageButton(){
		click(depManPreviousPageButton);
	}
	
	//点击下一页
	public void clickDepManNextPageButton(){
		click(depManNextPageButton);
	}
	
	//点击最末页
	public void clickDepManLastPageButton(){
		click(depManLastPageButton);
	}
	
	//点击弹框的关闭按钮
	public void clickDepManCloseButton(){
		click(depManCloseButton);
		sleep(1);
	}
	
	//被验证的新增一级科室名称
	public String assertDepManAddDepartmentCategory(){
		String departmentCategory=getText(depManAssertAddDepartmentCategory);
		log.info("被验证的新增一级科室名称："+departmentCategory);
		return departmentCategory;		
	}
}
