package com.witontek.ehospital2.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsUtils extends BrowserUtils{
	
	private Log log=new Log(WebElementsUtils.class);

	public WebElementsUtils(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 定位页面元素
	 * @param locator
	 * @return
	 */
	public WebElement getElement(Locator locator){
		WebElement webElement = null;
		if(locator.getIndex()==999)
			try{
				switch(locator.getLocatorWay()){
				case XPATH:webElement=driver.findElement(By.xpath(locator.getAttributeValue()));break;
				case CSS:webElement=driver.findElement(By.cssSelector(locator.getAttributeValue()));break;
				case ID:webElement=driver.findElement(By.id(locator.getAttributeValue()));break;
				case NAME:webElement=driver.findElement(By.name(locator.getAttributeValue()));break;
				case LINK:webElement=driver.findElement(By.partialLinkText(locator.getAttributeValue()));break;
				}
				}catch(Exception e){
					log.errorShot("查找"+locator.getName()+"的网页元素时出错,报错信息："+e.getMessage(), driver);
					
				}
		else
			try{
				switch(locator.getLocatorWay()){
				//查找一组元素并选择其中一个，当选择这组元素中第一个是"index=0"
				case XPATH:webElement=driver.findElements(By.xpath(locator.getAttributeValue())).get(locator.getIndex());break;
				case CSS:webElement=driver.findElements(By.cssSelector(locator.getAttributeValue())).get(locator.getIndex());break;
				case ID:webElement=driver.findElements(By.id(locator.getAttributeValue())).get(locator.getIndex());break;
				case NAME:webElement=driver.findElements(By.name(locator.getAttributeValue())).get(locator.getIndex());break;
				case LINK:webElement=driver.findElements(By.partialLinkText(locator.getAttributeValue())).get(locator.getIndex());break;
				}
				}catch(Exception e){
					log.errorShot("查找"+locator.getName()+"带索引的网页元素时出错,报错信息："+e.getMessage(), driver);
				}
		return webElement;
	}
	
	/**
	 * 每定位一个元素都加上一个显示等待
	 * @param locator
	 * @return
	 */
	public WebElement findElement(final Locator locator){
		wait(4);		//等待0.4秒，防止虽然已定位到页面元素，但是页面还没展开
		WebElement webElement=null;
		WebDriverWait wait=new WebDriverWait(driver, locator.getWaitTime());
		
		try{webElement=wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return getElement(locator);
			}
		});}catch(Exception e){
			log.errorShot("查找"+locator.getName()+"的网页元素时超时显示等待时间,报错信息："+e.getMessage(), driver);
		}
		return webElement;
	}

	/**
	 * 点击
	 * @param locator
	 */
	public void click(Locator locator){
		try{
			
			findElement(locator).click();
		}catch(Exception e){
			log.errorShot("未定位到页面元素，点击"+locator.getName()+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("点击"+locator.getName());
	}
	
	/**
	 * 先清空输入框再输入
	 * @param locator
	 * @param content
	 */
	public void clearAndInput(Locator locator,String content){
		try{
			findElement(locator).clear();
		}catch(Exception e){
			log.errorShot("未定位到页面元素，清空"+locator.getName()+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("清空"+locator.getName());
		
		try{
			findElement(locator).sendKeys(content);
		}catch(Exception e){
			log.errorShot("未定位到页面元素，在"+locator.getName()+"输入："+content+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("在"+locator.getName()+"输入："+content);
	}
	
	/**
	 * 输入
	 * @param locator
	 * @param content
	 */
	public void input(Locator locator,String content){
		try{
			findElement(locator).sendKeys(content);
		}catch(Exception e){
			log.errorShot("未定位到页面元素，在"+locator.getName()+"输入："+content+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("在"+locator.getName()+"输入："+content);
	}
	
	/**
	 * 提交
	 * @param locator
	 */
	public void submit(Locator locator){
		try{
			findElement(locator).submit();
		}catch(Exception e){
			log.errorShot("未定位到页面元素，提交"+locator.getName()+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("提交"+locator.getName());
	}
	
	/**
	 * 获取页面元素文本信息
	 * @param locator
	 * @return
	 */
	public String getText(Locator locator){
		String text=null;
		try{
			text=findElement(locator).getText();
		}catch(Exception e){
			log.errorShot("未定位到页面元素，获取"+locator.getName()+"的文本信息失败,报错信息："+e.getMessage(), driver);
		}
		log.info("获取"+locator.getName()+"的文本信息");
		return text;
	}
	
	/**
	 * 弹框-确认
	 */
	public void alertAccept(){
		sleep(1);
		driver.switchTo().alert().accept();
		log.info("点击弹框的确认按钮");
	}
	
	/**
	 * 弹框-取消
	 */
	public void alertDismiss(){
		sleep(1);
		driver.switchTo().alert().dismiss();
		log.info("点击弹框的取消按钮");
	}
	
	/**
	 * 获取弹框文本
	 * @return
	 */
	public String alertText(){
		sleep(1);
		String text=driver.switchTo().alert().getText();
		log.info("获取弹框文本");
		return text;
	}
	
	/**
	 * 向弹框输入文本信息
	 * @param text
	 */
	public void inputAlertText(String text){
		sleep(1);
		driver.switchTo().alert().sendKeys(text);
		log.info("向弹框输入文本信息:"+text);
	}
	
	/**
	 * 跳转frame
	 * @param locator
	 */
	public void switchToFrame(Locator locator){
		try{
			driver.switchTo().frame(findElement(locator));
		}catch(Exception e){
			log.errorShot("未定位到页面元素，跳转至"+locator.getName()+"失败,报错信息："+e.getMessage(), driver);
		}
		log.info("跳转至"+locator.getName());
	}
	
	/**
	 * 返回上一级frame
	 */
	public void switchToDefault(){
		driver.switchTo().defaultContent();
		log.info("返回上一级表单");
	}
}
