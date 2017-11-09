package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;

public class DepartmentMange extends DepartmentManagePage{

	public DepartmentMange(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentMange.class);
	
	//科室管理-搜索一级科室
	public String searchDepartmentCategoryByName (String categoryName){
		clickDepartmentManageButton();
		inputDepManDepartmentName(categoryName);
		clickDepManSearchDepartmentButton();
		sleep(1);
		return getDepManCategoryName();
	}
	
	//新增一级科室
	public String insertDepartmentsCategory(String categoryName,String categoryCode){
		clickDepartmentManageButton();
		clickDepManAddFirstDepartmentButton();
		inputAddCateDepartmentNameInputBox(categoryName);
		inputAddCateDepartmentCodeInputBox(categoryCode);
		clickAddCateSaveButton();
		alertDismiss();
		clickDepManLastPageButton();
		return assertDepManAssertAddDepartmentCategory();
	}
	
}
