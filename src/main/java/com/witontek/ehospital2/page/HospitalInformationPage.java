package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.XmlUtils;

public class HospitalInformationPage extends MainPage{

	public HospitalInformationPage(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(HospitalInformationPage.class);

	protected Locator hosInfHospitalNameInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalNameInputBox");
	protected Locator hosInfNumberAddressInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfNumberAddressInputBox");
	protected Locator hosInfCardAddressInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfCardAddressInputBox");
	protected Locator hosInfHospitalLevelInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalLevelInputBox");
	
	protected Locator hosInfSelectProvinceDropBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfSelectProvinceDropBox");
	protected Locator hosInfSelectProvinceButton=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfSelectProvinceButton");
	protected Locator hosInfSelectCityDropBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfSelectCityDropBox");
	protected Locator hosInfSelectCityButton=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfSelectCityButton");
	
	protected Locator hosInfHospitalAddressInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalAddressInputBox");
	protected Locator hosInfWebsiteInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfWebsiteInputBox");	
	protected Locator hosInfHospitalPhoneInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalPhoneInputBox");
	protected Locator hosInfHospitalTrafficInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalTrafficInputBox");
	protected Locator hosInfHospitalSummaryInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfHospitalSummaryInputBox");
	protected Locator hosInfLongitudeInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfLongitudeInputBox");
	protected Locator hosInfLatitudeInputBox=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfLatitudeInputBox");

	protected Locator hosInfUpLoadPicture=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfUpLoadPicture");
	protected Locator hosInfUpLoadLogo=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfUpLoadLogo");	
	protected Locator hosInfSaveButton=XmlUtils.getElementXml("HospitalInformationPage").get("hosInfSaveButton");

	//输入医院信息-医院名称
	public void inputHosInfHospitalNameInputBox(String hospitalName){
		clearAndInput(hosInfHospitalNameInputBox, hospitalName);
	}
	
	//输入医院信息-取号地点
	public void inputHosInfNumberAddressInputBox(String numberAddress){
		clearAndInput(hosInfNumberAddressInputBox, numberAddress);
	}
	
	//输入医院信息-取卡地点
	public void inputHosInfCardAddressInputBox(String cardAddress){
		clearAndInput(hosInfCardAddressInputBox, cardAddress);
	}
	
	//输入医院信息-医院等级
	public void inputHosInfHospitalLevelInputBox(String hospitalLevel){
		clearAndInput(hosInfHospitalLevelInputBox, hospitalLevel);
	}
	
	//医院信息-选择省
	public void selectHosInfSelectProvince(){
		click(hosInfSelectProvinceDropBox);
		click(hosInfSelectProvinceButton);
	}
	
	//医院信息-选择市
	public void selectHosInfSelectCity(){
		click(hosInfSelectCityDropBox);
		click(hosInfSelectCityButton);
	}
	
	//输入医院信息-医院地址
	public void inputHosInfHospitalAddressInputBox(String hospitalAddress){
		clearAndInput(hosInfHospitalAddressInputBox, hospitalAddress);
	}

	//输入医院信息-官方网站
	public void inputHosInfWebsiteInputBox(String website){
		clearAndInput(hosInfWebsiteInputBox, website);
	}
	
	//输入医院信息-医院电话
	public void inputHosInfHospitalPhoneInputBox(String hospitalPhone){
		clearAndInput(hosInfHospitalPhoneInputBox, hospitalPhone);
	}
	
	//输入医院信息-医院交通
	public void inputHosInfHospitalTrafficInputBox(String hospitalTraffic){
		clearAndInput(hosInfHospitalTrafficInputBox, hospitalTraffic);
	}
	
	//输入医院信息-医院介绍
	public void inputHosInfHospitalSummaryInputBox(String hospitalSummary){
		clearAndInput(hosInfHospitalSummaryInputBox, hospitalSummary);
	}
	
	//输入医院信息-经度
	public void inputHosInfLongitudeInputBox(String longitude){
		clearAndInput(hosInfLongitudeInputBox, longitude);
	}
	
	//输入医院信息-纬度
	public void inputHosInfLatitudeInputBox(String latitude){
		clearAndInput(hosInfLatitudeInputBox, latitude);
	}

	//提交医院信息-保存按钮
	public void submitHosInfSaveButton(){
		submit(hosInfSaveButton);
	}
}
