package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DepartmentManagePage;

public class DepartmentMange extends DepartmentManagePage{

	public DepartmentMange(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DepartmentMange.class);
	
	//科室管理-搜索科室
	public String searchDepManDepartment(String searchCondition){
		clickDepartmentManageButton();
		inputDepManDepartmentName(searchCondition);
		clickDepManSearchDepartmentButton();
		sleep(1);
		return getDepManContainDepartments();
	}
	
	
}
