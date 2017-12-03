package com.witontek.ehospital2.base;

public class Locator {
	
	public enum LocatorWays{
		XPATH,CSS,ID,NAME,LINK,
	}
	
	private String name;
	private LocatorWays locatorWay;
	private int waitTime;
	private String attributeValue;
	private int index;
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public Locator(String name,LocatorWays locatorWay,int waitTime,String attributeValue){
		this.name=name;
		this.locatorWay=locatorWay;
		this.waitTime=waitTime;
		this.attributeValue=attributeValue;
	}
	
	public Locator(String name,LocatorWays locatorWay,int waitTime,String attributeValue,int index){
		this.name=name;
		this.locatorWay=locatorWay;
		this.waitTime=waitTime;
		this.attributeValue=attributeValue;
		this.index=index;
	}
	
	public Locator(String name,String driver,String url,String username,String password){
		this.name=name;
		this.driver=driver;
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public String getName(){
		return name;
	}
	
	public LocatorWays getLocatorWay(){
		return locatorWay;
	}
	
	public int getWaitTime(){
		return waitTime;
	}
	
	public String getAttributeValue(){
		return attributeValue;
	}
	
	public int getIndex(){
		return index;
	}
	
	public String getDriver(){
		return driver;
	}
	
	public String getUrl(){
		return url;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	
}
