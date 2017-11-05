package com.witontek.ehospital2.business;

import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Log;
import com.witontek.ehospital2.base.Global;
import com.witontek.ehospital2.page.LoginPage;
import com.witontek.ehospital2.page.MainPage;

public class Login extends LoginPage{

	public Login(WebDriver driver) {
		super(driver);
	}

	private Log log=new Log(Login.class);
	
	//登录成功，跳转到主页
	public MainPage loginSuccess(String userName,String password,String validation){
		login(userName, password, validation);
		return new MainPage(driver);
	}
	
	//登录失败，仍在登录界面
	public LoginPage loginFail(String userName,String password,String validation){
		login(userName, password, validation);
		return new LoginPage(driver);
	}
}
