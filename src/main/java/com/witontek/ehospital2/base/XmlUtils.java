package com.witontek.ehospital2.base;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator.LocatorWays;

public class XmlUtils extends BasePage {

	public XmlUtils(WebDriver driver) {
		super(driver);
	}

	private static Log log = new Log(XmlUtils.class);

	/**
	 * 获取xml文件中的存放的页面元素
	 * 
	 * @param pageName
	 * @return
	 */
	public static Map<String, Locator> getElementXml(String pageName) {
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(new File(System.getProperty("user.dir")
					+ "/src/main/java/com/witontek/ehospital2/xml/" + pageName + ".xml"));
		} catch (Exception e) {
			log.error("将" + pageName + ".xml文件转换为Document类型失败,报错信息：" + e.getMessage());
			e.printStackTrace();
		}
		Element rootElement = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> subelements = rootElement.elements("Locator");
		Map<String, Locator> map = new HashMap<String, Locator>();
		Locator locator;
		try {
			for (Element subelement : subelements) {
				String name = subelement.attributeValue("name");
				LocatorWays locatorWay = switchLocatorWays(subelement.attributeValue("locatorWay"));
				int waitTime = Integer.parseInt(subelement.attributeValue("waitTime"));
				String attributeValue = subelement.attributeValue("attributeValue");
				String text = subelement.getText();
				if (subelement.attributeValue("index") == null) {
					int index = 999;
					locator = new Locator(name, locatorWay, waitTime, attributeValue, index);
				} else {
					int index = Integer.parseInt(subelement.attributeValue("index"));
					locator = new Locator(name, locatorWay, waitTime, attributeValue, index);
				}
				map.put(text, locator);
			}
		} catch (Exception e) {
			log.error("读取" + pageName + ".xml文件失败,报错信息：" + e.getMessage());
		}
		return map;
	}

	/**
	 * 将字符串类型转换成枚举类型LocatorWays
	 * 
	 * @param way
	 * @return
	 */
	public static LocatorWays switchLocatorWays(String way) {
		LocatorWays locatorWay = null;
		switch (way) {
		case "CSS":
			locatorWay = LocatorWays.CSS;
			break;
		case "XPATH":
			locatorWay = LocatorWays.XPATH;
			break;
		case "ID":
			locatorWay = LocatorWays.ID;
			break;
		case "NAME":
			locatorWay = LocatorWays.NAME;
			break;
		}
		return locatorWay;
	}

	/**
	 * 获取xml文件中的存放的数据库信息
	 * @param DataBaseName
	 * @return
	 */
	public Map<String,Locator> getDataBaseXml() {
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(new File(System.getProperty("user.dir")
					+ "/src/main/java/com/witontek/ehospital2/config/jdbc.xml"));
		} catch (Exception e) {
			log.error("将jdbc.xml文件转换为Document类型失败,报错信息：" + e.getMessage());
			e.printStackTrace();
		}
		Map<String,Locator> map=new HashMap<String,Locator>();
		Element rootElement = document.getRootElement();
		List<Element> subelements = rootElement.elements("Server");
		for(Element subelement:subelements){
			List<Element> subeles = subelement.elements("DateBase");
			for(Element subele:subeles){
				String text=subele.getText();
				String name=subele.attributeValue("name");
				String driver=subele.attributeValue("driver");
				String url=subele.attributeValue("url");
				String username=subele.attributeValue("username");
				String password=subele.attributeValue("password");
				map.put(text, new Locator(name,driver,url,username,password));
			}
		}
		return map;
	}

}
