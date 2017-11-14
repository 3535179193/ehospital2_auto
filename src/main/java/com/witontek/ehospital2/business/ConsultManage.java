package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.ConsultManagePage;

public class ConsultManage extends ConsultManagePage{

	public ConsultManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(ConsultManage.class);
	
	//就医咨询管理-新增咨询科室
	public String insertConsultDepartment(String departmentName,String departmentID,String password){
		clickConsultManageButton();
		clickConManAddDepartmentConsultButton();
		inputAddConDepartmentNameInputBox(departmentName);
		inputAddConDepartmentIDInputBox(departmentID);
		inputAddConPasswordInputBox(password);
		clickAddConSaveButton();
		return getConManAssertAddConsultDepartmentName();
	}
	
	//就医咨询管理-搜索咨询科室
	public String searchConsultDepartment (String departmentName){
		inputConManDepartmentNameInputBox(departmentName);
		clickConManSearchButton();
		return getConManDepartmentName();
	}
	
	//就医咨询管理-编辑咨询科室
	public String updateConsultDepartment(String departmentName,String departmentID,String password){
		clickConManEditButton();
		inputEdiConDepartmentNameInputBox(departmentName);
		inputEdiConDepartmentIDInputBox(departmentID);
		inputEdiConPasswordInputBox(password);
		clickEdiConSaveButton();
		return getConManAssertEditConsultDepartmentName();
	}
	
	//就医咨询管理-删除咨询科室
	public void deleteConsultDepartment(){
		String beforeDeleteReconds=getConManTotalRecorders();
		clickConManDeleteButton();
		clickConManCloseButton();
		String afterDeleteReconds=getConManTotalRecorders();
		if(!beforeDeleteReconds.equals(afterDeleteReconds)){
			log.info("删除后科室咨询总数与删除前不一致，删除科室咨询成功");
		}else {
			log.errorShot("删除前后科室咨询总数仍然一致，删除一级科室失败", driver);
		}
	}
	
}
