package com.witontek.ehospital2.base;

public class Global {

	public static PropertiesUtils globalProperties=new PropertiesUtils("Global"); 
	
	//ChromeDriver的路径
	public static final String CHROME_DRIVER_PATH=globalProperties.propertiesValue("CHROME_DRIVER_PATH");
	
	//新医路通后台url
	public static final String LOGIN_URL=globalProperties.propertiesValue("LOGIN_URL");
	
	//新后台url
	public static final String NEW_LOGIN_URL=globalProperties.propertiesValue("NEW_LOGIN_URL");
	
	//后台登录的用户名
	public static final String USER_NAME=globalProperties.propertiesValue("USER_NAME");
	
	//后台登录的密码
	public static final String PASSWORD=globalProperties.propertiesValue("PASSWORD");
	
	//后台登录的验证码
	public static final String VALIDATION=globalProperties.propertiesValue("VALIDATION");
	
	//数据库名
	public static final String DATABASE_NAME=globalProperties.propertiesValue("DATABASE_NAME");



}
