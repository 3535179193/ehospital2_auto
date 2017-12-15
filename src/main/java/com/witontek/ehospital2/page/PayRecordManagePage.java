package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;
import com.witontek.ehospital2.business.Login;

public class PayRecordManagePage extends MainPage{

	public PayRecordManagePage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(PayRecordManagePage.class);

	//缴费记录管理-订单号输入框
	protected Locator payManOrderNumberInputBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderNumberInputBox");
	protected Locator payManPatientInputBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManPatientInputBox");
	protected Locator payManSearchButton=XmlUtils.getElementXml("PayRecordManagePage").get("payManSearchButton");
	protected Locator payManExportPayInfoButton=XmlUtils.getElementXml("PayRecordManagePage").get("payManExportPayInfoButton");
	
	//缴费记录管理-订单状态-全选多选框
	protected Locator payManOrderStateAllSelectCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderStateAllSelectCheckBox");
	protected Locator payManWaitPayCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManWaitPayCheckBox");
	protected Locator payManAlreadyPayNoInformHisCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManAlreadyPayNoInformHisCheckBox");
	protected Locator payManAlreadyRefundCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManAlreadyRefundCheckBox");
	protected Locator payManPayFailCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManPayFailCheckBox");	
	protected Locator payManIsPayCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManIsPayCheckBox");
	protected Locator payManAlreadyPayInformHisFailCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManAlreadyPayInformHisFailCheckBox");
	protected Locator payManAlreadyPayInformHisSuccessCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManAlreadyPayInformHisSuccessCheckBox");
	
	//缴费记录管理-支付类型-全选多选框
	protected Locator payManPayTypeAllSelectCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManPayTypeAllSelectCheckBox");
	protected Locator payManWeChatCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManWeChatCheckBox");	
	protected Locator payManAlipayCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManAlipayCheckBox");
	protected Locator payManMobilePhoneWeChatCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManMobilePhoneWeChatCheckBox");
	protected Locator payManMobilePhoneAlipayCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManMobilePhoneAlipayCheckBox");
	protected Locator payManMinipayWeChatCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManMinipayWeChatCheckBox");
	protected Locator payManMinipayAlipayCheckBox=XmlUtils.getElementXml("PayRecordManagePage").get("payManMinipayAlipayCheckBox");

	//缴费记录管理-默认列表单选按钮
	protected Locator payManDefaultListRadioButton=XmlUtils.getElementXml("PayRecordManagePage").get("payManDefaultListRadioButton");
	protected Locator payManOrderPayInfoRadioButton=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderPayInfoRadioButton");	
	protected Locator payManTotalAmount=XmlUtils.getElementXml("PayRecordManagePage").get("payManTotalAmount");
		protected Locator payManOrderNumber=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderNumber");
		protected Locator payManOrderAmount=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderAmount");
		protected Locator payManOrderState=XmlUtils.getElementXml("PayRecordManagePage").get("payManOrderState");	
		protected Locator payManClinicCard=XmlUtils.getElementXml("PayRecordManagePage").get("payManClinicCard");
		protected Locator payManClinicNumber=XmlUtils.getElementXml("PayRecordManagePage").get("payManClinicNumber");
		protected Locator payManPatientName=XmlUtils.getElementXml("PayRecordManagePage").get("payManPatientName");
		protected Locator payManGender=XmlUtils.getElementXml("PayRecordManagePage").get("payManGender");	
		protected Locator payManAge=XmlUtils.getElementXml("PayRecordManagePage").get("payManAge");
		protected Locator payManIDCard=XmlUtils.getElementXml("PayRecordManagePage").get("payManIDCard");
		protected Locator payManClinicDepartment=XmlUtils.getElementXml("PayRecordManagePage").get("payManClinicDepartment");
		protected Locator payManPayType=XmlUtils.getElementXml("PayRecordManagePage").get("payManPayType");
		protected Locator payManFeeType=XmlUtils.getElementXml("PayRecordManagePage").get("payManFeeType");	
		protected Locator payManPayDate=XmlUtils.getElementXml("PayRecordManagePage").get("payManPayDate");
		protected Locator payManDetailButton=XmlUtils.getElementXml("PayRecordManagePage").get("payManDetailButton");

	//缴费记录管理-详情按钮
	protected Locator payMan=XmlUtils.getElementXml("PayRecordManagePage").get("payMan");

	
	//缴费记录管理-输入订单号
	public void inputPayManOrderNumberInputBox(String orderNumber){
		input(payManOrderNumberInputBox, orderNumber);
	}
	
	//缴费记录管理-输入就诊人
	public void inputPayManPatientInputBox(String patientName){
		input(payManPatientInputBox, patientName);
	}
	
	//点击缴费记录管理-搜索按钮
	public void clickPayManSearchButton(){
		click(payManSearchButton);
	}

	//点击缴费记录管理-导出缴费信息按钮
	public void clickPayManExportPayInfoButton(){
		click(payManExportPayInfoButton);
	}
	
	//点击缴费记录管理-订单状态-全选多选框
	public void clickPayManOrderStateAllSelectCheckBox(){
		click(payManOrderStateAllSelectCheckBox);
	}
	
	//点击缴费记录管理-订单状态-待支付多选框
	public void clickPayManWaitPayCheckBox(){
		click(payManWaitPayCheckBox);
	}
	
	//点击缴费记录管理-订单状态-已支付（未通知HIS）多选框
	public void clickPayManAlreadyPayNoInformHisCheckBox(){
		click(payManAlreadyPayNoInformHisCheckBox);
	}
	
	//点击缴费记录管理-订单状态-已退款多选框
	public void clickPayManAlreadyRefundCheckBox(){
		click(payManAlreadyRefundCheckBox);
	}

	//点击缴费记录管理-订单状态-支付失败多选框
	public void clickPayManPayFailCheckBox(){
		click(payManPayFailCheckBox);
	}

	//点击缴费记录管理-订单状态-支付中多选框
	public void clickPayManIsPayCheckBox(){
		click(payManIsPayCheckBox);
	}

	//点击缴费记录管理-订单状态-已支付（通知HIS失败）多选框
	public void clickPayManAlreadyPayInformHisFailCheckBox(){
		click(payManAlreadyPayInformHisFailCheckBox);
	}

	//点击缴费记录管理-订单状态-已支付（通知HIS成功）多选框
	public void clickPayManAlreadyPayInformHisSuccessCheckBox(){
		click(payManAlreadyPayInformHisSuccessCheckBox);
	}

	//点击缴费记录管理-支付类型-全选多选框
	public void clickPayManPayTypeAllSelectCheckBox(){
		click(payManPayTypeAllSelectCheckBox);
	}

	//点击缴费记录管理-支付类型-微信公众号多选框
	public void clickPayManWeChatCheckBox(){
		click(payManWeChatCheckBox);
	}

	//点击缴费记录管理-支付类型-支付宝窗口多选框
	public void clickPayManAlipayCheckBox(){
		click(payManAlipayCheckBox);
	}

	//点击缴费记录管理-支付类型-手机支付宝支付多选框
	public void clickPayManMobilePhoneWeChatCheckBox(){
		click(payManMobilePhoneWeChatCheckBox);
	}

	//点击缴费记录管理-支付类型-手机微信支付多选框
	public void clickPayManMobilePhoneAlipayCheckBox(){
		click(payManMobilePhoneAlipayCheckBox);
	}

	//点击缴费记录管理-支付类型-Minipay微信支付多选框
	public void clickPayManMinipayWeChatCheckBox(){
		click(payManMinipayWeChatCheckBox);
	}

	//点击缴费记录管理-支付类型-Minipay支付宝支付多选框
	public void clickpPayManMinipayAlipayCheckBox(){
		click(payManMinipayAlipayCheckBox);
	}

	//点击缴费记录管理-默认列表单选按钮
	public void clickPayManDefaultListRadioButton(){
		click(payManDefaultListRadioButton);
	}

	//点击缴费记录管理-订单缴费信息单选按钮
	public void clickPayManOrderPayInfoRadioButton(){
		click(payManOrderPayInfoRadioButton);
	}

	//获取缴费记录管理-总金额
	public String getPayManTotalAmount(){
		String totalAmount=getText(payManTotalAmount);
		log.info("缴费记录管理-总金额："+totalAmount);
		return totalAmount;
	}
	
	//获取缴费记录管理-订单号
	public String getPayManOrderNumber(){
		String orderNumber=getText(payManOrderNumber);
		log.info("缴费记录管理-订单号："+orderNumber);
		return orderNumber;
	}
	
	//获取缴费记录管理-订单金额
	public String getPayManOrderAmount(){
		String orderAmoun=getText(payManOrderAmount);
		log.info("缴费记录管理-订单金额："+orderAmoun);
		return orderAmoun;
	}
	
	//获取缴费记录管理-订单状态
	public String getPayManOrderState(){
		String orderState=getText(payManOrderState);
		log.info("缴费记录管理-订单状态："+orderState);
		return orderState;
	}
	
	//获取缴费记录管理-就诊卡号
	public String getPayManClinicCard(){
		String clinicCard=getText(payManClinicCard);
		log.info("缴费记录管理-就诊卡号："+clinicCard);
		return clinicCard;
	}
	
	//获取缴费记录管理-门诊号
	public String getPayManClinicNumber(){
		String clinicNumber=getText(payManClinicNumber);
		log.info("缴费记录管理-门诊号："+clinicNumber);
		return clinicNumber;
	}
	
	//获取缴费记录管理-就诊人姓名
	public String getPayManPatientName(){
		String patientName=getText(payManPatientName);
		log.info("缴费记录管理-就诊人姓名："+patientName);
		return patientName;
	}
	
	//获取缴费记录管理-性别
	public String getPayManGender(){
		String gender=getText(payManGender);
		log.info("缴费记录管理-性别："+gender);
		return gender;
	}
	
	//获取缴费记录管理-年龄
	public String getPayManAge(){
		String age=getText(payManAge);
		log.info("缴费记录管理-年龄："+age);
		return age;
	}
	
	//获取缴费记录管理-身份证号
	public String getPayManIDCard(){
		String IDCard=getText(payManIDCard);
		log.info("缴费记录管理-身份证号："+IDCard);
		return IDCard;
	}
	
	//获取缴费记录管理-就诊科室
	public String getPayManClinicDepartment(){
		String clinicDepartment=getText(payManClinicDepartment);
		log.info("缴费记录管理-就诊科室："+clinicDepartment);
		return clinicDepartment;
	}
	
	//获取缴费记录管理-支付类型
	public String getPayManPayType(){
		String payType=getText(payManPayType);
		log.info("缴费记录管理-支付类型："+payType);
		return payType;
	}
	
	//获取缴费记录管理-费用类型
	public String getPayManFeeType(){
		String feeType=getText(payManFeeType);
		log.info("缴费记录管理-费用类型："+feeType);
		return feeType;
	}
	
	//获取缴费记录管理-缴费日期
	public String getPayManPayDate(){
		String payDate=getText(payManPayDate);
		log.info("缴费记录管理-缴费日期："+payDate);
		return payDate;
	}
	
	//点击缴费记录管理-详情按钮
	public void clickPayManDetailButton(){
		click(payManDetailButton);
	}
	
}
