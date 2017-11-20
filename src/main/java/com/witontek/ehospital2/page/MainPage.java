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

	protected Locator userName=XmlUtils.readXml("MainPage").get("userName");
	protected Locator modifyPassword=XmlUtils.readXml("MainPage").get("modifyPasswordButton");
	protected Locator loginOut=XmlUtils.readXml("MainPage").get("loginOutButton");

	//医院配置
	protected Locator hospitalConfigButton=XmlUtils.readXml("MainPage").get("hospitalConfigButton");
	protected Locator wechatConfigButton=XmlUtils.readXml("MainPage").get("wechatConfigButton");
	protected Locator alipayConfigButton=XmlUtils.readXml("MainPage").get("alipayConfigButton");
	protected Locator menuConfigButton=XmlUtils.readXml("MainPage").get("menuConfigButton");
	protected Locator parameterConfigButton=XmlUtils.readXml("MainPage").get("parameterConfigButton");
	protected Locator templateConfigButton=XmlUtils.readXml("MainPage").get("templateConfigButton");
	protected Locator permissionManageButton=XmlUtils.readXml("MainPage").get("permissionManageButton");
	
	//微官网
	protected Locator miniWebsiteButton=XmlUtils.readXml("MainPage").get("miniWebsiteButton");
	protected Locator hospitalInformationButton=XmlUtils.readXml("MainPage").get("hospitalInformationButton");
	protected Locator contentManagementButton=XmlUtils.readXml("MainPage").get("contentManagementButton");
	protected Locator categoryButton=XmlUtils.readXml("MainPage").get("categoryButton");
	
	//业务信息管理
	protected Locator businessInformationButton=XmlUtils.readXml("MainPage").get("businessInformationButton");
	protected Locator departmentManageButton=XmlUtils.readXml("MainPage").get("departmentManageButton");
	protected Locator dutyRoomManageButton=XmlUtils.readXml("MainPage").get("dutyRoomManageButton");
	protected Locator doctorManageButton=XmlUtils.readXml("MainPage").get("doctorManageButton");
	protected Locator scheduleManageButton=XmlUtils.readXml("MainPage").get("scheduleManageButton");
	protected Locator subscriptionManageButton=XmlUtils.readXml("MainPage").get("subscriptionManageButton");
	protected Locator lineUpManageButton=XmlUtils.readXml("MainPage").get("lineUpManageButton");
	protected Locator consultManageButton=XmlUtils.readXml("MainPage").get("consultManageButton");
	protected Locator appraiseManageButton=XmlUtils.readXml("MainPage").get("appraiseManageButton");
	protected Locator registerManageButton=XmlUtils.readXml("MainPage").get("registerManageButton");
	protected Locator smartGuideButton=XmlUtils.readXml("MainPage").get("smartGuideButton");
	protected Locator departmentBusynessButton=XmlUtils.readXml("MainPage").get("departmentBusynessButton");
	protected Locator payItemButton=XmlUtils.readXml("MainPage").get("payItemButton");
	
	//统计分析
	protected Locator analysisButton=XmlUtils.readXml("MainPage").get("analysisButton");
	protected Locator loginLogButton=XmlUtils.readXml("MainPage").get("loginLogButton");
	protected Locator registerUserManageButton=XmlUtils.readXml("MainPage").get("registerUserManageButton");
	protected Locator patientManagementButton=XmlUtils.readXml("MainPage").get("patientManagementButton");
	protected Locator inspectReportAnalysisButton=XmlUtils.readXml("MainPage").get("inspectReportAnalysisButton");
	protected Locator payRecordManageButton=XmlUtils.readXml("MainPage").get("payRecordManageButton");
	protected Locator automaticCheckAccountButton=XmlUtils.readXml("MainPage").get("automaticCheckAccountButton");
	
	//公共元素-每页显示数下拉框
	protected Locator eachPageRecordersDropBox=XmlUtils.readXml("MainPage").get("eachPageRecordersDropBox");
	protected Locator eachPageTenRecorders=XmlUtils.readXml("MainPage").get("eachPageTenRecorders");
	protected Locator totalRecorders=XmlUtils.readXml("MainPage").get("totalRecorders");
	protected Locator totalPages=XmlUtils.readXml("MainPage").get("totalPages");
	protected Locator currentPage=XmlUtils.readXml("MainPage").get("currentPage");
	protected Locator firstPageButton=XmlUtils.readXml("MainPage").get("firstPageButton");
	protected Locator upPageButton=XmlUtils.readXml("MainPage").get("upPageButton");
	protected Locator nextPageButton=XmlUtils.readXml("MainPage").get("nextPageButton");
	protected Locator lastPageButton=XmlUtils.readXml("MainPage").get("lastPageButton");
	
	//公共元素-弹框关闭按钮
	protected Locator alertCloseButton=XmlUtils.readXml("MainPage").get("alertCloseButton");
	protected Locator alertDeleteButton=XmlUtils.readXml("MainPage").get("alertDeleteButton");
	protected Locator alertCancleButton=XmlUtils.readXml("MainPage").get("alertCancleButton");
	
	//选择起始日期按钮
	protected Locator selectStartDateButton=XmlUtils.readXml("MainPage").get("selectStartDateButton");
	protected Locator selectEndDateButton=XmlUtils.readXml("MainPage").get("selectEndDateButton");
	protected Locator defaultStartDateButton=XmlUtils.readXml("MainPage").get("defaultStartDateButton");
	protected Locator defaultEndDateButton=XmlUtils.readXml("MainPage").get("defaultEndDateButton");
	protected Locator monthToggleButton=XmlUtils.readXml("MainPage").get("monthToggleButton");
	protected Locator yearToggleButton=XmlUtils.readXml("MainPage").get("yearToggleButton");
	protected Locator leftButton=XmlUtils.readXml("MainPage").get("leftButton");
	protected Locator rightButton=XmlUtils.readXml("MainPage").get("rightButton");

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
	public void clickDepartmentManageButton(){
		clickBusinessInformationButton();
		click(departmentManageButton);
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
	public void clickDepartmentBusynessButton(){
		clickBusinessInformationButton();
		click(departmentBusynessButton);
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
	public void clickEachPageRecordersDropBox(){
		click(eachPageRecordersDropBox);
	}
	
	//选中每页显示10条
	public void clickEachPageTenRecorders(){
		click(eachPageTenRecorders);
	}
	
	//获取总记录数
	public String getTotalRecorders(){
			String recorders=getText(totalRecorders);
			log.info("总记录数："+recorders);
			return recorders;
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
	
	//点击选择起始日期按钮
	public void clickSelectStartDateButton(){
		click(selectStartDateButton);
	}
	
	//获取默认起始日期
	public String getStartDate(){
		String startDate=getText(selectStartDateButton);
		log.info("起始日期："+startDate);
		return startDate;
	}
	
	//点击选择结束日期按钮
	public void clickSelectEndDateButton(){
		click(selectEndDateButton);
	}
	
	//获取默认结束日期
	public String getEndDate(){
		String endDate=getText(selectEndDateButton);
		log.info("结束日期："+endDate);
		return endDate;
	}
	
	//点击日期选择器-默认起始日期按钮
	public void clickDefaultStartDateButton(){
		click(defaultStartDateButton);
	}
	
	//点击日期选择器-默认结束月份按钮
	public void clickDefaultEndDateButton(){
		click(defaultEndDateButton);
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
