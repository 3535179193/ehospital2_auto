package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class MainPage extends LoginPage{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(MainPage.class);

	protected Locator userName=XmlUtils.getElementXml("MainPage").get("userName");
	protected Locator modifyPassword=XmlUtils.getElementXml("MainPage").get("modifyPasswordButton");
	protected Locator loginOut=XmlUtils.getElementXml("MainPage").get("loginOutButton");

	//医院配置
	protected Locator hospitalConfigButton=XmlUtils.getElementXml("MainPage").get("hospitalConfigButton");
	protected Locator wechatConfigButton=XmlUtils.getElementXml("MainPage").get("wechatConfigButton");
	protected Locator alipayConfigButton=XmlUtils.getElementXml("MainPage").get("alipayConfigButton");
	protected Locator menuConfigButton=XmlUtils.getElementXml("MainPage").get("menuConfigButton");
	protected Locator parameterConfigButton=XmlUtils.getElementXml("MainPage").get("parameterConfigButton");
	protected Locator templateConfigButton=XmlUtils.getElementXml("MainPage").get("templateConfigButton");
	protected Locator permissionManageButton=XmlUtils.getElementXml("MainPage").get("permissionManageButton");
	
	//微官网
	protected Locator miniWebsiteButton=XmlUtils.getElementXml("MainPage").get("miniWebsiteButton");
	protected Locator hospitalInformationButton=XmlUtils.getElementXml("MainPage").get("hospitalInformationButton");
	protected Locator contentManagementButton=XmlUtils.getElementXml("MainPage").get("contentManagementButton");
	protected Locator categoryButton=XmlUtils.getElementXml("MainPage").get("categoryButton");
	
	//业务信息管理
	protected Locator businessInformationButton=XmlUtils.getElementXml("MainPage").get("businessInformationButton");
	protected Locator departmentCategoryManageButton=XmlUtils.getElementXml("MainPage").get("departmentCategoryManageButton");
	protected Locator dutyRoomManageButton=XmlUtils.getElementXml("MainPage").get("dutyRoomManageButton");
	protected Locator doctorManageButton=XmlUtils.getElementXml("MainPage").get("doctorManageButton");
	protected Locator scheduleManageButton=XmlUtils.getElementXml("MainPage").get("scheduleManageButton");
	protected Locator subscriptionManageButton=XmlUtils.getElementXml("MainPage").get("subscriptionManageButton");
	protected Locator lineUpManageButton=XmlUtils.getElementXml("MainPage").get("lineUpManageButton");
	protected Locator consultManageButton=XmlUtils.getElementXml("MainPage").get("consultManageButton");
	protected Locator appraiseManageButton=XmlUtils.getElementXml("MainPage").get("appraiseManageButton");
	protected Locator registerManageButton=XmlUtils.getElementXml("MainPage").get("registerManageButton");
	protected Locator smartGuideButton=XmlUtils.getElementXml("MainPage").get("smartGuideButton");
	protected Locator departmentBusyButton=XmlUtils.getElementXml("MainPage").get("departmentBusyButton");
	protected Locator payItemButton=XmlUtils.getElementXml("MainPage").get("payItemButton");
	
	//统计分析
	protected Locator analysisButton=XmlUtils.getElementXml("MainPage").get("analysisButton");
	protected Locator loginLogButton=XmlUtils.getElementXml("MainPage").get("loginLogButton");
	protected Locator registerUserManageButton=XmlUtils.getElementXml("MainPage").get("registerUserManageButton");
	protected Locator patientManagementButton=XmlUtils.getElementXml("MainPage").get("patientManagementButton");
	protected Locator inspectReportAnalysisButton=XmlUtils.getElementXml("MainPage").get("inspectReportAnalysisButton");
	protected Locator payRecordManageButton=XmlUtils.getElementXml("MainPage").get("payRecordManageButton");
	protected Locator automaticCheckAccountButton=XmlUtils.getElementXml("MainPage").get("automaticCheckAccountButton");
	
	//公共元素-每页显示数下拉框
	protected Locator eachPageRecordsDropBox=XmlUtils.getElementXml("MainPage").get("eachPageRecordsDropBox");
	protected Locator eachPageTwentyRecords=XmlUtils.getElementXml("MainPage").get("eachPageTwentyRecords");
	protected Locator totalRecords=XmlUtils.getElementXml("MainPage").get("totalRecords");
	protected Locator totalPages=XmlUtils.getElementXml("MainPage").get("totalPages");
	protected Locator currentPage=XmlUtils.getElementXml("MainPage").get("currentPage");
	protected Locator firstPageButton=XmlUtils.getElementXml("MainPage").get("firstPageButton");
	protected Locator upPageButton=XmlUtils.getElementXml("MainPage").get("upPageButton");
	protected Locator nextPageButton=XmlUtils.getElementXml("MainPage").get("nextPageButton");
	protected Locator lastPageButton=XmlUtils.getElementXml("MainPage").get("lastPageButton");
	
	//公共元素-弹框关闭按钮
	protected Locator alertCloseButton=XmlUtils.getElementXml("MainPage").get("alertCloseButton");
	protected Locator alertDeleteButton=XmlUtils.getElementXml("MainPage").get("alertDeleteButton");
	protected Locator alertCancleButton=XmlUtils.getElementXml("MainPage").get("alertCancleButton");
	protected Locator alertAcceptButton=XmlUtils.getElementXml("MainPage").get("alertAcceptButton");
	
	//选择起始日期按钮
	protected Locator selectStartDateButton=XmlUtils.getElementXml("MainPage").get("selectStartDateButton");
	protected Locator selectEndDateButton=XmlUtils.getElementXml("MainPage").get("selectEndDateButton");
	protected Locator dateSelTodayButton=XmlUtils.getElementXml("MainPage").get("dateSelTodayButton");
	protected Locator dateSelDeleteButton=XmlUtils.getElementXml("MainPage").get("dateSelDeleteButton");
	protected Locator dateSelGiveUpButton=XmlUtils.getElementXml("MainPage").get("dateSelGiveUpButton");
	protected Locator dateSelDefaultTodayButton=XmlUtils.getElementXml("MainPage").get("dateSelDefaultTodayButton");
	protected Locator defaultDateButton=XmlUtils.getElementXml("MainPage").get("defaultDateButton");
	protected Locator defaultMonthButton=XmlUtils.getElementXml("MainPage").get("defaultMonthButton");
	protected Locator monthToggleButton=XmlUtils.getElementXml("MainPage").get("monthToggleButton");
	protected Locator yearToggleButton=XmlUtils.getElementXml("MainPage").get("yearToggleButton");
	protected Locator leftButton=XmlUtils.getElementXml("MainPage").get("leftButton");
	protected Locator rightButton=XmlUtils.getElementXml("MainPage").get("rightButton");

	//得到用户名
	public String getUserName(){
		return getText(userName);
	}
	
	//点击医院配置
	public void clickHospitalConfigButton(){
		click(hospitalConfigButton);
	}
	
	//点击微官网管理
	public void clickMiniWebsiteButton(){
		click(miniWebsiteButton);
	}
	
	//点击医院基本信息
	public void clickHospitalInformationButton(){
		clickMiniWebsiteButton();
		click(hospitalInformationButton);
	}
	
	//点击内容管理
	public void clickContentManagementButton(){
		clickMiniWebsiteButton();
		click(contentManagementButton);
	}
	
	//点击分类管理
	public void clickCategoryManageButton(){
		clickMiniWebsiteButton();
		click(categoryButton);
	}
	
	//点击业务信息管理
	public void clickBusinessInformationButton(){
		click(businessInformationButton);
	}
	
	//点击科室管理
	public void clickDepartmentCategoryManageButton(){
		clickBusinessInformationButton();
		click(departmentCategoryManageButton);
	}
	
	//获取科室管理菜单文本信息
	public String getDepartmentCategoryManageButton(){
		String menuText=getText(departmentCategoryManageButton);
		log.info("科室管理菜单文本信息："+menuText);
		return menuText;
	}
	
	//点击值班室管理
	public void clickDutyRoomManageButton(){
		clickBusinessInformationButton();
		click(dutyRoomManageButton);
	}
	
	//点击医生管理
	public void clickDoctorManageButton(){
		clickBusinessInformationButton();
		click(doctorManageButton);
	}
	
	//点击排班管理	
	public void clickScheduleManageButton(){
		clickBusinessInformationButton();
		click(scheduleManageButton);
	}
	
	//点击预约管理
	public void clickSubscriptionManageButton(){
		clickBusinessInformationButton();
		click(subscriptionManageButton);
	}
	
	//点击排队管理
	public void clickLineUpManageButton(){
		clickBusinessInformationButton();
		click(lineUpManageButton);
	}
	
	//点击就医咨询管理
	public void clickConsultManageButton(){
		clickBusinessInformationButton();
		click(consultManageButton);
	}
	
	//点击就医评价管理
	public void clickAppraiseManageButton(){
		clickBusinessInformationButton();
		click(appraiseManageButton);
	}
	
	//点击挂号管理
	public void clickRegisterManageButton(){
		clickBusinessInformationButton();
		click(registerManageButton);
	}
	
	//点击智能导诊
	public void clickSmartGuideButton(){
		clickBusinessInformationButton();
		click(smartGuideButton);
	}
	
	//点击科室繁忙度
	public void clickDepartmentBusyButton(){
		clickBusinessInformationButton();
		click(departmentBusyButton);
	}
	
	//点击收费项目
	public void clickPayItemButton(){
		clickBusinessInformationButton();
		click(payItemButton);
	}
	
	//点击统计分析
	public void clickAnalysisButton(){
		click(analysisButton);
	}
	
	//点击登录日志
	public void clickLoginLogButton(){
		clickAnalysisButton();
		click(loginLogButton);
	}
	
	//点击注册用户管理
	public void clickRegisterUserManageButton(){
		clickAnalysisButton();
		click(registerUserManageButton);
	}
	
	//点击就诊人管理
	public void clickPatientManagementButton(){
		clickAnalysisButton();
		click(patientManagementButton);
	}
	
	//点击检查报告统计
	public void clickInspectReportAnalysisButton(){
		clickAnalysisButton();
		click(inspectReportAnalysisButton);
	}
	
	//点击缴费记录管理
	public void clickPayRecordManageButton(){
		clickAnalysisButton();
		click(payRecordManageButton);
	}
	
	//点击自动对账管理
	public void clickAutomaticCheckAccountButton(){
		clickAnalysisButton();
		click(automaticCheckAccountButton);
	}
	
	//点击每页显示数下拉框
	public void clickEachPageRecordsDropBox(){
		click(eachPageRecordsDropBox);
	}
	
	//选中每页显示20条
	public void clickEachPageTwentyRecords(){
		click(eachPageTwentyRecords);
	}
	
	//获取总记录数
	public String getTotalRecords(){
			String records=getText(totalRecords);
			log.info("总记录数："+records);
			return records;
	}
	
	//获取总页数
	public String getTotalPages(){
		String pages=getText(totalPages);
		log.info("总页数："+pages);
		return pages;
	}
	
	//获取当前页数
	public String getCurrentPage(){
		String page=getText(currentPage);
		log.info("当前页数："+page);
		return page;
	}
	
	//点击第一页按钮
	public void clickFirstPageButton(){
		click(firstPageButton);
	}
	
	//点击上一页按钮
	public void clickUpPageButton(){
		click(upPageButton);
	}
	
	//点击下一页按钮
	public void clickNextPageButton(){
		click(nextPageButton);
	}
	
	//点击最末页按钮
	public void clickLastPageButton(){
		click(lastPageButton);
	}
	
	//点击弹框关闭按钮
	public void clickAlertCloseButton(){
		wait(5);
		click(alertCloseButton);
		wait(5);
	}
	
	//点击弹框确认删除按钮
	public void clickAlertDeleteButton(){
		wait(5);
		click(alertDeleteButton);
		wait(5);
	}
	
	//点击弹框确认删除按钮
	public void clickAlertCancleButton(){
		wait(5);
		click(alertCancleButton);
		wait(5);
	}
	
	//点击弹框确认删除按钮
	public void clickAlertAcceptButton(){
		wait(5);
		click(alertAcceptButton);
		wait(5);
	}
	
	//点击选择起始日期按钮
	public void clickSelectStartDateButton(){
		click(selectStartDateButton);
	}
	
	//获取起始日期
	public String getStartDate(){
		String startDate=getText(selectStartDateButton);
		log.info("起始日期："+startDate);
		return startDate;
	}
	
	//点击选择结束日期按钮
	public void clickSelectEndDateButton(){
		click(selectEndDateButton);
	}
	
	//获取结束日期
	public String getEndDate(){
		String endDate=getText(selectEndDateButton);
		log.info("结束日期："+endDate);
		return endDate;
	}
	
	//点击日期选择器-今天按钮
	public void clickDateSelTodayButton(){
		click(dateSelTodayButton);
	}
	
	//点击日期选择器-删除按钮
	public void clickDateSelDeleteButton(){
		click(dateSelDeleteButton);
	}
	
	//点击日期选择器-放弃按钮
	public void clickDateSelGiveUpButton(){
		click(dateSelGiveUpButton);
	}
	
	//点击日期选择器-默认当天按钮
	public void clickDateSelDefaultTodayButton(){
		click(dateSelDefaultTodayButton);
	}
	
	//点击日期选择器-默认日期按钮
	public void clickDefaultDateButton(){
		click(defaultDateButton);
	}
	
	//点击日期选择器-默认月份按钮
	public void clickDefaultMonthButton(){
		click(defaultMonthButton);
	}
	
	//点击日期选择器-月份切换按钮
	public void clickMonthToggleButton(){
		click(monthToggleButton);
	}
	
	//点击日期选择器-年份切换按钮
	public void clickYearToggleButton(){
		click(yearToggleButton);
	}
	
	//点击日期选择器-左移按钮
	public void clickLeftButton(){
		click(leftButton);
	}
	
	//点击日期选择器-右移按钮
	public void clickRightButton(){
		click(rightButton);
	}
}
