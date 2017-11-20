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
	
	//jdbc连接test服务器中ehospital_test数据库
	public static final String DATABASE=globalProperties.propertiesValue("DATABASE");
	
	//ehospital_test数据库用户名
	public static final String DATABASE_USERNAME=globalProperties.propertiesValue("DATABASE_USERNAME");
	
	//ehospital_test数据库密码
	public static final String DATABASE_PASSWORD=globalProperties.propertiesValue("DATABASE_PASSWORD");


}
