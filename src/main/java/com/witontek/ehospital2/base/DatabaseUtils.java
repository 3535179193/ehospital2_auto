package com.witontek.ehospital2.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class DatabaseUtils {

	private static Log log = new Log(DatabaseUtils.class);

	private static Connection connection = null;
	private static Statement statement = null;

	/**
	 * 通过jdbc执行delete sql语句
	 * @param tableName
	 * @param conditionKey
	 * @param conditionValue
	 */
	public static void deleteDate(String tableName, String conditionKey, String conditionValue) {
		log.info("Parameters：数据库名（" + Global.DATABASE_NAME + "）、表名（" + tableName + "）、hospital_id（" + Global.USER_NAME + "）、删除的字段名（" + conditionKey
				+ "）、删除的条件：（" + conditionValue + "）");
		connectionDatabase();
		try {
			statement.executeUpdate("delete from " + tableName + " where hospital_id='" + Global.USER_NAME + "' and " + conditionKey + " like '"
					+ conditionValue + "%';");
			log.info("执行SQL：delete from " + tableName + " where hospital_id='" + Global.USER_NAME + "' and " + conditionKey + " like '"
					+ conditionValue + "%';");
			connection.commit();
			statement.close();
			connection.close();
		} catch (Exception e) {
			log.error("从数据库删除数据出错，报错信息：" + e.getMessage());
			e.printStackTrace();
			System.exit(0);						// 终止虚拟机，退出Java程序
		}
		log.info("从数据库删除数据成功");
	}

	/**
	 * 从数据库查询统计数
	 * @param tableName
	 * @param conditionKey
	 * @param conditionValue
	 * @return
	 */
	public static String selectCountNumber(String tableName, String conditionKey, String conditionValue) {
		log.info("Parameters：数据库名（" + Global.DATABASE_NAME + "）、表名（" + tableName + "）、hospital_id（" + Global.USER_NAME + "）、字段名（" + conditionKey
				+ "）、条件：（" + conditionValue + "）");
		String countNumber = null;
		connectionDatabase();
		try {
			ResultSet resultSet = statement.executeQuery("SELECT count(*) as countNumber from " + tableName + " where hospital_id='"
					+ Global.USER_NAME + "' and " + conditionKey + " = '" + conditionValue + "';");
			log.info("执行SQL：SELECT count(*) as countNumber from " + tableName + " where hospital_id='" + Global.USER_NAME + "' and " + conditionKey
					+ " = '" + conditionValue + "';");
			resultSet.next();
			countNumber = resultSet.getString("countNumber");
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			log.error("从数据库查询统计数失败"+e.getMessage());
			e.printStackTrace();
			System.exit(0); 				
		}
		log.info("从数据库查询统计数成功，countNumber（" + countNumber + "）");
		return countNumber;
	}

	/**
	 * 连接数据库
	 */
	public static void connectionDatabase() {
		try {
			Class.forName(XmlUtils.getDataBaseXml().get(Global.DATABASE_NAME).getDriver());
			connection = DriverManager.getConnection(XmlUtils.getDataBaseXml().get(Global.DATABASE_NAME).getUrl(),
					XmlUtils.getDataBaseXml().get(Global.DATABASE_NAME).getUsername(), XmlUtils.getDataBaseXml().get(Global.DATABASE_NAME)
							.getPassword());
			connection.setAutoCommit(false);
			statement = connection.createStatement();
		} catch (Exception e) {
			log.error("连接数据库失败"+e.getMessage());
			e.printStackTrace();
		}
	}

}
