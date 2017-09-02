package com.ofs.java.alosiyus.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectExample {

	public static void main(String[] args) {
		

		// creates three different Connection objects
		String databaseURL = "jdbc:mysql://192.168.16.109:3306/batch2";
		String user = "sabose";
		String password = "sabose";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(databaseURL, user, password);
			if (conn != null) {
				System.out.println("Connected to the database");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not find database driver class");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}
