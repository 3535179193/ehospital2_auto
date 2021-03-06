package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.DatabaseUtils;
import com.witontek.ehospital2.base.ExcelUtils;
import com.witontek.ehospital2.base.FileUtils;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.PayRecordManagePage;

public class PayRecordManage extends PayRecordManagePage{

	public PayRecordManage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(PayRecordManage.class);
	
	/**
	 * 缴费记录管理-导出缴费信息
	 * @param execlFileName
	 * @param line
	 * @param column
	 * @return
	 */
	public String downloadPayRecords(String execlFileName, String line, String column){
		clickPayRecordManageButton();
		FileUtils.deleteDownloadExcel(execlFileName);
		clickPayManExportPayInfoButton();
		sleep(3);
		String excelCell=ExcelUtils.readDownloadExecl(execlFileName, line, column);
		FileUtils.deleteDownloadExcel(execlFileName);
		return excelCell;
	}
	
	/**
	 * 缴费记录管理-通过订单号查询
	 * @return
	 */
	public void seacheOrderNumber(){
		clickPayRecordManageButton();
		if(getTotalRecords().equals("0")){
			log.warn("无缴费订单，不执行此测试用例");
		}
		else{
			inputPayManOrderNumberInputBox(getPayManOrderNumber());
			clickPayManSearchButton();
			if(getTotalRecords().equals("1"))
				log.info("缴费记录管理-通过订单号查询成功");
			else
				log.errorShot("缴费记录管理-通过订单号查询失败", driver);
		}
	}
	
	/**
	 * 缴费记录管理-通过就诊人查询
	 * @param tableName
	 * @param conditionKey
	 */
	public void searchPatientName(String tableName,String conditionKey){
		inputPayManPatientInputBox(getPayManPatientName());
		clickPayManSearchButton();
		String totalRecord=DatabaseUtils.selectCountNumber(tableName, conditionKey, getPayManPatientName());
		wait(10);
		if(totalRecord.equals(getTotalRecords()))
			log.info("缴费记录管理-通过就诊人查询成功");
		else {
			log.errorShot("缴费记录管理-通过就诊人查询失败", driver);
		}
	}
	
	/**
	 * 缴费记录管理-通过日期查询
	 * @param orderNumber
	 * @return
	 */
	public String searchStartDate(){
		
		
		return getPayManPayDate();
	}
	
	
	
	
	/*
	 * 
	 */
	public void clickLast(){
		clickPayRecordManageButton();
		clickLastPageButton();
		clickPayManOrderPayInfoRadioButton();
		int i=Integer.parseInt(getTotalRecords())%(Integer.parseInt(getTotalPages())-1);
		
		click(Locator.replaceIndex(payManDetailButton, i*2));
		
	}

}
