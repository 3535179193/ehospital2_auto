package com.witontek.ehospital2.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils{
	
	/**
	 * 获取日期
	 * @param day
	 * @return
	 */
	public static String getDates(long day){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		long timeStamp=date.getTime()+day*1000*60*60*24;
		Date dates=new Date(timeStamp);
		return format.format(dates);
	}
	
	/**
	 * 获取当前系统时间
	 * @return
	 */
	public static String getSystemTime(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date date = new Date();
		return format.format(date.getTime());
	}

}
