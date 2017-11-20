package com.witontek.ehospital2.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils{
	
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String getDates(long day){
		Date date = new Date();
		long timeStamp=date.getTime()+day*1000*60*60*24;
		Date dates=new Date(timeStamp);
		return format.format(dates);
	}

}
