package com.witontek.ehospital2.base;

import com.witontek.ehospital2.page.PayRecordManagePage;

public class Locator {

	private static Log log = new Log(Locator.class);

	public enum LocatorWays {
		XPATH, CSS, ID, NAME, LINK,
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

	public Locator(String name, LocatorWays locatorWay, int waitTime, String attributeValue) {
		this.name = name;
		this.locatorWay = locatorWay;
		this.waitTime = waitTime;
		this.attributeValue = attributeValue;
	}

	public Locator(String name, LocatorWays locatorWay, int waitTime, String attributeValue, int index) {
		this.name = name;
		this.locatorWay = locatorWay;
		this.waitTime = waitTime;
		this.attributeValue = attributeValue;
		this.index = index;
	}

	public Locator(String name, String driver, String url, String username, String password) {
		this.name = name;
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public LocatorWays getLocatorWay() {
		return locatorWay;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public int getIndex() {
		return index;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * 替换索引index
	 * @param locator
	 * @param index
	 * @return
	 */
	public static Locator replaceIndex(Locator locator, int index) {
		log.info("替换定位的索引为："+index);
		return new Locator(locator.getName(), locator.getLocatorWay(), locator.getWaitTime(), locator.getAttributeValue(), index - 1);
	}
	
	/**
	 * 替换属性值
	 * @param locator
	 * @param attributeValue
	 * @return
	 */
	public static Locator replaceAttributeValue(Locator locator, String attributeValue) {
		log.info("替换定位的属性值为："+attributeValue);
		return new Locator(locator.getName(), locator.getLocatorWay(), locator.getWaitTime(), "//li[contains(.,'"+attributeValue+"')]", locator.getIndex());
	}

}
