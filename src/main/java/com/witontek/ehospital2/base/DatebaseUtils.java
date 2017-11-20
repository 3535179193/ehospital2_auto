package com.witontek.ehospital2.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class DatebaseUtils{

	private static Log log=new Log(DatebaseUtils.class);
	
	public static void deleteDate(String sql){
	    Connection c = null;
	    Statement stmt = null;
	    try {
	    Class.forName("org.postgresql.Driver");
	      c = DriverManager.getConnection(Global.DATABASE,Global.DATABASE_USERNAME,Global.DATABASE_PASSWORD);
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      stmt.executeUpdate(sql);
	      c.commit();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      log.error("删除数据库出错，报错信息："+e.getMessage());
	      System.exit(0);
	    }
	    log.info("删除数据库成功");
	}
	
//	public void selectDate(String sql){
//	    Connection c = null;
//	    Statement stmt = null;
//	    try {
//		Class.forName("org.postgresql.Driver");
//			c = DriverManager.getConnection(
//						"jdbc:postgresql://121.40.154.101:5432/jnyxyfsyyadmin","postgres", "P0stgreSql");
//			c.setAutoCommit(false);
//			stmt = c.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				String doctor_code = rs.getString("doctor_code");
//			}
//			rs.close();
//			stmt.close();
//			c.close();
//	    } catch ( Exception e ) {
//	      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//	      System.exit(0);
//	    }
//		return doctor_code;
//	}


}
