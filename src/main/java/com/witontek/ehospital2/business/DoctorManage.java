package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.DoctorManagePage;

public class DoctorManage extends DoctorManagePage{

	public DoctorManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(DoctorManage.class);
	
	public String searchDocManDoctor(String searchCondition){
		clickDoctorManageButton();
		searchDocManDoctorName(searchCondition);
		sleep(1);
		return getDocManDoctorName();
	}

}
