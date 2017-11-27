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
		protected Locator addCateCategoryNameInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("addCateCategoryNameInputBox");
		protected Locator addCateCategoryCodeInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("addCateCategoryCodeInputBox");
		protected Locator addCateCategoryLogoButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("addCateCategoryLogoButton");
		protected Locator addCateSaveButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("addCateSaveButton");
		protected Locator addCateReturnButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("addCateReturnButton");
	
	//科室管理-序号
	protected Locator cateManNumber=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManNumber");
	protected Locator cateManFirstCategoryName=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManFirstCategoryName");
	protected Locator cateManSecondCategoryName=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManSecondCategoryName");
	protected Locator cateManContainDepartments=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManContainDepartments");
	
	//科室管理-编辑一级科室按钮
	protected Locator cateManEditButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("cateManEditButton");
		protected Locator ediCateCategoryNameInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("ediCateCategoryNameInputBox");
		protected Locator ediCateCategoryCodeInputBox=XmlUtils.readXml("DepartmentCategoryManagePage").get("ediCateCategoryCodeInputBox");
		protected Locator ediCateCategoryLogoButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("ediCateCategoryLogoButton");
		protected Locator ediCateEditButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("ediCateEditButton");
		protected Locator ediCateReturnButton=XmlUtils.readXml("DepartmentCategoryManagePage").get("ediCateReturnButton");
	
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
	
	//新增一级科室-输入科室名称
	public void inputAddCateCategoryNameInputBox(String categoryName){
		input(addCateCategoryNameInputBox, categoryName);
	}
	
	//新增一级科室-输入科室编码
	public void inputAddCateCategoryCodeInputBox(String categoryCode){
		input(addCateCategoryCodeInputBox, categoryCode);
	}
	
	//点击新增一级科室-科室LOGO按钮
	public void clickAddCateCategoryLogoButton(){
		click(addCateCategoryLogoButton);
	}
	
	//点击保新增一级科室-保存按钮
	public void clickAddCateSaveButton(){
		click(addCateSaveButton);
	}
	
	//点击新增一级科室-返回按钮
	public void clickAddCateReturnButton(){
		click(addCateReturnButton);
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
	public void updateEdiCateCategoryNameInputBox(String categoryName){
		clearAndInput(ediCateCategoryNameInputBox, categoryName);
	}
	
	//编辑一级科室-编辑科室编码
	public void updateEdiCateCategoryCodeInputBox(String categoryCode){
		clearAndInput(ediCateCategoryCodeInputBox, categoryCode);
	}
	
	//点击编辑一级科室-科室LOGO按钮
	public void clickEdiCateCategoryLogoButton(){
		click(ediCateCategoryLogoButton);
	}
	
	//点击编辑一级科室-修改按钮
	public void clickEdiCateEditButton(){
		click(ediCateEditButton);
	}
	
	//点击编辑一级科室-返回按钮
	public void clickEdiCateReturnButton(){
		click(ediCateReturnButton);
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
