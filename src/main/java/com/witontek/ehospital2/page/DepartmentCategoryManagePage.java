package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class DepartmentCategoryManagePage extends MainPage{

	public DepartmentCategoryManagePage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentCategoryManagePage.class);
	
	//科室管理-导入科室信息按钮
	protected Locator cateManImportDepartmentInfoButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManImportDepartmentInfoButton");
	protected Locator cateManDownloadDepartmentExcelButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManDownloadDepartmentExcelButton");
	protected Locator cateManExportDepartmentInfoButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManExportDepartmentInfoButton");
	protected Locator cateManSynchronousDepartmentHISButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManSynchronousDepartmentHISButton");
	
	//科室管理-科室名称输入框
	protected Locator cateManCategoryNameInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManCategoryNameInputBox");
	protected Locator cateManSearchButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManSearchButton");
	
	//科室管理-新增一级科室按钮
	protected Locator cateManAddCategoryButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManAddCategoryButton");
	protected Locator cateManEditButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManEditButton");
		protected Locator catePageCategoryNameInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageCategoryNameInputBox");
		protected Locator catePageCategoryCodeInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageCategoryCodeInputBox");
		protected Locator catePageCategoryLogoButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageCategoryLogoButton");
		protected Locator catePageSaveButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageSaveButton");
		protected Locator catePageUpdateButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageUpdateButton");
		protected Locator catePageReturnButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("catePageReturnButton");
	
	//科室管理-序号
	protected Locator cateManNumber=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManNumber");
	protected Locator cateManFirstCategoryName=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManFirstCategoryName");
	protected Locator cateManSecondCategoryName=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManSecondCategoryName");
	protected Locator cateManContainDepartments=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManContainDepartments");
	
	//科室管理-删除按钮
	protected Locator cateManDeleteButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManDeleteButton");
	protected Locator cateManViewDepartmentButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManViewDepartmentButton");
	protected Locator cateManMoveUpButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManMoveUpButton");
	protected Locator cateManMoveDownButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManMoveDownButton");
	protected Locator cateManMoveTopButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManMoveTopButton");
	
	//新增的一级科室名称
	protected Locator cateManAddedCategoryName=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManAddedCategoryName");
	
	//点击科室管理-导入科室信息按钮
	public void clickCateManImportDepartmentInfoButton(){
		click(cateManImportDepartmentInfoButton);
	}
	
	//点击科室管理-下载科室表Excel模板按钮
	public void clickCateManDownloadDepartmentExcelButton(){
		click(cateManDownloadDepartmentExcelButton);
	}
	
	//点击科室管理-导出科室信息按钮
	public void clickCateManExportDepartmentInfoButton(){
		click(cateManExportDepartmentInfoButton);
	}
	
	//点击科室管理-同步科室HIS数据按钮
	public void clickCateManSynchronousDepartmentHISButton(){
		click(cateManSynchronousDepartmentHISButton);
	}
	
	//科室管理-输入科室名称
	public void inputCateManCategoryNameInputBox(String categoryName){
		clearAndInput(cateManCategoryNameInputBox, categoryName);
	}
	
	//点击科室管理-搜索按钮
	public void clickCateManSearchButton(){
		click(cateManSearchButton);
	}
	
	//点击科室管理-新增一级科室按钮
	public void clickCateManAddCategoryButton(){
		click(cateManAddCategoryButton);
	}
	
	//一级科室页面-输入科室名称
	public void inputCatePageCategoryNameInputBox(String categoryName){
		input(catePageCategoryNameInputBox, categoryName);
	}
	
	//一级科室页面-输入科室编码
	public void inputCatePageCategoryCodeInputBox(String categoryCode){
		input(catePageCategoryCodeInputBox, categoryCode);
	}
	
	//点击一级科室页面-科室LOGO按钮
	public void clickCatePageCategoryLogoButton(){
		click(catePageCategoryLogoButton);
	}
	
	//点击一级科室页面-保存按钮
	public void clickCatePageSaveButton(){
		click(catePageSaveButton);
	}
	
	//点击一级科室页面-返回按钮
	public void clickCatePageReturnButton(){
		click(catePageReturnButton);
	}
	
	//获取科室管理-序号
	public String getCateManNumber(){
		String number=getText(cateManNumber);
		log.info("科室管理-序号："+number);
		return number;
	}
	
	//获取科室管理-序号1的一级科室名称
	public String getCateManFirstCategoryName(){
		String categoryName=getText(cateManFirstCategoryName);
		log.info("科室管理-序号2的一级科室名称："+categoryName);
		return categoryName;
	}
	
	//获取科室管理-序号2的一级科室名称
	public String getCateManSecondCategoryName(){
		String categoryName=getText(cateManSecondCategoryName);
		log.info("科室管理-序号2的一级科室名称："+categoryName);
		return categoryName;
	}
	
	//获取科室管理-包含的二级科室
	public String getCateManContainDepartments(){
		String departments=getText(cateManContainDepartments);
		log.info("包含的二级科室："+departments);
		return departments;
	}
	
	//点击科室管理-编辑按钮
	public void clickCateManEditButton(){
		click(cateManEditButton);
	}
	
	//编辑一级科室-编辑科室名称
	public void editCatePageCategoryNameInputBox(String categoryName){
		clearAndInput(catePageCategoryNameInputBox, categoryName);
	}
	
	//编辑一级科室-编辑科室编码
	public void editCatePageCategoryCodeInputBox(String categoryCode){
		clearAndInput(catePageCategoryCodeInputBox, categoryCode);
	}
	
	//点击一级科室页面-保存按钮
	public void clickCatePageUpdateButton(){
		click(catePageUpdateButton);
	}
	
	//点击科室管理-删除按钮
	public void clickCateManDeleteButton(){
		click(cateManDeleteButton);
	}
	
	//点击科室管理-查看二级科室按钮
	public void clickCateManViewDepartmentButton(){
		click(cateManViewDepartmentButton);
	}
	
	//点击科室管理-上移按钮
	public void clickCateManMoveUpButton(){
		click(cateManMoveUpButton);
	}
	
	//点击科室管理-下移按钮
	public void clickCateManMoveDownButton(){
		click(cateManMoveDownButton);
	}
	
	//点击科室管理-置顶按钮
	public void clickCateManMoveTopButton(){
		click(cateManMoveTopButton);
	}
	
	/**
	 * 获取科室管理-新增的一级科室名称
	 * @return
	 */
	public String getCateManAddedCategoryName(){
		String categoryName=getText(cateManAddedCategoryName);
		log.info("科室管理-新增的一级科室名称："+categoryName);
		return categoryName;		
	}
}
