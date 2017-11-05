package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.page.HospitalInformationPage;

public class HospitalInformation extends HospitalInformationPage{

	public HospitalInformation(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(HospitalInformation.class);
	
	public void updateHospitalInformation(String hospitalName,String numberAddress,String cardAddress,
			String hospitalLevel,String hospitalAddress,String website,String hospitalPhone,String hospitalTraffic,String hospitalSummary,String longitude,
			String latitude){
		clickHospitalInformationButton();
		inputHosInfHospitalNameInputBox(hospitalName);
		inputHosInfNumberAddressInputBox(numberAddress);
		inputHosInfCardAddressInputBox(cardAddress);
		inputHosInfHospitalLevelInputBox(hospitalLevel);
		selectHosInfSelectProvince();
		selectHosInfSelectCity();
		inputHosInfHospitalAddressInputBox(hospitalAddress);
		inputHosInfWebsiteInputBox(website);
		inputHosInfHospitalPhoneInputBox(hospitalPhone);
		inputHosInfHospitalTrafficInputBox(hospitalTraffic);
		inputHosInfHospitalSummaryInputBox(hospitalSummary);
		inputHosInfLongitudeInputBox(longitude);
		inputHosInfLatitudeInputBox(latitude);

	}
	

}
