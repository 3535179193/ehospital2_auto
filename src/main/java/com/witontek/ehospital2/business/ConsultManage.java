package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.ConsultManagePage;

public class ConsultManage extends ConsultManagePage{

	public ConsultManage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(ConsultManage.class);
	
	/**
	 * 就医咨询管理-新增咨询科室
	 * @param departmentName
	 * @param doctorID
	 * @param password
	 * @return
	 */
	public String insertConsultDepartment(String departmentName,String doctorID,String password){
		clickConsultManageButton();
		clickConManAddConsultDepartmentButton();
		inputConBoxDepartmentNameInputBox(departmentName);
		inputConBoxDoctorIDInputBox(doctorID);
		inputConBoxPasswordInputBox(password);
		clickConBoxSaveButton();
		clickLastPageButton();
		return getConManDepartmentName();
	}
	
	/**
	 * 就医咨询管理-保存并继续新增咨询科室
	 * @param departmentName
	 * @param doctorID
	 * @param password
	 * @return
	 */
	public void insertAndContinueConsultDepartment(String departmentName,String doctorID,String password){
		int beforeInsert=Integer.parseInt(getTotalRecorders());
		clickConManAddConsultDepartmentButton();
		inputConBoxDepartmentNameInputBox(departmentName+"1");
		inputConBoxDoctorIDInputBox(String.valueOf(Integer.parseInt(doctorID)+1));
		inputConBoxPasswordInputBox(password);
		clickConBoxSaveAndAddButton();
		inputConBoxDepartmentNameInputBox(departmentName+"2");
		inputConBoxDoctorIDInputBox(String.valueOf(Integer.parseInt(doctorID)+2));
		inputConBoxPasswordInputBox(password);
		clickConBoxSaveButton();
		int afterInsert=Integer.parseInt(getTotalRecorders());
		if(afterInsert==beforeInsert+2){
			log.info("新增后总记录数（"+afterInsert+"）与新增前（"+beforeInsert+"）相差为2，就医咨询管理-保存并继续新增咨询科室成功");
		}else {
			log.error("新增后总记录数（"+afterInsert+"）与新增前（"+beforeInsert+"）相差不为2，就医咨询管理-保存并继续新增咨询科室失败");
		}
	}
	
	/**
	 * 就医咨询管理-搜索咨询科室
	 * @param departmentName
	 * @return
	 */
	public String searchConsultDepartment (String departmentName){
		inputConManDepartmentNameInputBox(departmentName);
		clickConManSearchButton();
		return getConManDepartmentName();
	}
	
	/**
	 * 就医咨询管理-编辑咨询科室
	 * @param departmentName
	 * @param doctorID
	 * @param password
	 * @return
	 */
	public String updateConsultDepartment(String departmentName,String doctorID,String password){
		clickLastPageButton();
		clickConManEditButton();
		editConBoxDepartmentNameInputBox(departmentName);
		editConBoxDoctorIDInputBox(doctorID);
		editConBoxPasswordInputBox(password);
		clickConBoxSaveButton();
		return getConManEditedConsultDepartmentName();
	}

	/**
	 * 就医咨询管理-删除咨询科室
	 */
	public void deleteConsultDepartment(String departmentName){
		clickConsultManageButton();
		inputConManDepartmentNameInputBox(departmentName);
		clickConManSearchButton();
		for (int i = 0; i < Integer.parseInt(getTotalRecorders());) {
			inputConManDepartmentNameInputBox(departmentName);
			clickConManSearchButton();
			clickConManDeleteButton();
			clickAlertCloseButton();
			inputConManDepartmentNameInputBox(departmentName);
			clickConManSearchButton();
			if (Integer.parseInt(getTotalRecorders()) == 0) {
				log.info("删除全部新增的咨询科室成功");
			} else {
				log.warn("未删除全部新增的咨询科室，继续删除");
			}
		}
	}
}
