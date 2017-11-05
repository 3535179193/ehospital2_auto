package com.witontek.ehospital2.base;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebDriver;

import com.witontek.ehospital2.base.Locator.LocatorWays;

public class XmlUtils extends BasePage{
	
	public XmlUtils(WebDriver driver) {
		super(driver);
	}
	private static Log log=new Log(XmlUtils.class);
	
	public static Map<String,Locator> readXml(String pageName){
		SAXReader reader=new SAXReader();
		Document document = null;
		try {
			document=reader.read(new File(System.getProperty("user.dir")+"/src/main/java/com/witontek/ehospital2/xml/"+pageName+".xml"));
		} catch (Exception e) {
			log.error("将"+pageName+".xml文件转换为Document类型失败");
			e.printStackTrace();
		}
		Element rootElement=document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> subelements=rootElement.elements("Locator");
		Map<String, Locator> map=new HashMap<String,Locator>();
		Locator locator;
		try{
		for(Element subelement:subelements){
			String name=subelement.attributeValue("name");
			LocatorWays locatorWay=switchLocatorWays(subelement.attributeValue("locatorWay"));
			int waitTime=Integer.parseInt(subelement.attributeValue("waitTime"));
			String attributeValue=subelement.attributeValue("attributeValue");
			String text=subelement.getText();
			if(subelement.attributeValue("index")==null){
				int index=999;
				locator=new Locator(name, locatorWay, waitTime, attributeValue, index);
				}
			else{
				int index=Integer.parseInt(subelement.attributeValue("index"));
				locator=new Locator(name, locatorWay, waitTime, attributeValue, index);
				}
			map.put(text, locator);
		}
		}catch(Exception e){
			log.error("读取"+pageName+".xml文件失败");
		}
		return map;
		
	}
	
	public static LocatorWays switchLocatorWays(String way){
		LocatorWays locatorWay = null;
		switch(way){
		case "CSS":locatorWay=LocatorWays.CSS;break;
		case "XPATH":locatorWay=LocatorWays.XPATH;break;
		case "ID":locatorWay=LocatorWays.ID;break;
		case "NAME":locatorWay=LocatorWays.NAME;break;
		}
		
		return locatorWay;
		
	}
}
