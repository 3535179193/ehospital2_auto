package com.witontek.ehospital2.page;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.BasePage;
import com.witontek.ehospital2.base.Locator;
import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.base.XmlUtils;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private Log log=new Log(LoginPage.class);
	
	protected Locator userNameInputBox=XmlUtils.getElementXml("LoginPage").get("userNameInputBox");
	protected Locator passwordInputBox=XmlUtils.getElementXml("LoginPage").get("passwordInputBox");
	protected Locator validationInputBox=XmlUtils.getElementXml("LoginPage").get("validationInputBox");
	protected Locator loginButton=XmlUtils.getElementXml("LoginPage").get("loginButton");
	
	public void login(String userName,String password,String validation){
		getUrl(Global.NEW_LOGIN_URL);
		input(userNameInputBox, userName);
		input(passwordInputBox, password);
//		input(validationInputBox, validation);
		click(loginButton);
		
	}
}
