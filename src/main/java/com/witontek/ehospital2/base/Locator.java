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

}
