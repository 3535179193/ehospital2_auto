package com.witontek.ehospital2.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class DatabaseUtils{

	private static Log log=new Log(DatabaseUtils.class);
	
	/**
	 * 通过jdbc执行delete sql语句
	 * @param databaseName
	 * @param sql
	 */
	public static void deleteDate(String databaseName,String sql){
	    Connection c = null;
	    Statement stmt = null;
	    try {
	    Class.forName(XmlUtils.getDataBaseXml().get("databaseName").getDriver());
	      c = DriverManager.getConnection(XmlUtils.getDataBaseXml().get("databaseName").getUrl(),
	    		  XmlUtils.getDataBaseXml().get("databaseName").getUsername(),
	    		  XmlUtils.getDataBaseXml().get("databaseName").getPassword());
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      stmt.executeUpdate(sql);
	      c.commit();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      log.error("从数据库删除数据出错，报错信息："+e.getMessage());
	      e.printStackTrace();
	      System.exit(0);
	    }
	    log.info("从数据库删除数据成功");
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
