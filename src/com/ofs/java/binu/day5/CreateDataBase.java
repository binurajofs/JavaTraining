package com.ofs.java.binu.day5;

import java.sql.*;

public class CreateDataBase {
	// JDBC drive name and DB URl
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://192.168.16.109:3306/batch2";
	// database credentials
	static final String USER = "sabose";
	static final String PASS = "sabose";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// registering JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// execute a query
			stmt = conn.createStatement();
			String sql = "CREATE TABLE UDAYKUMAR" + "(id INTEGER not NULL," + "first VARCHAR(255),"
					+ "last VARCHAR(255)," + "age INTEGER," + "PRIMARY KEY (id))";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO UDAYKUMAR " + "VALUES (1344,'uday','kumar',22)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO UDAYKUMAR " + "VALUES (1346,'uday','kumar',23)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO UDAYKUMAR " + "VALUES (1347,'uday','kumar',24)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO UDAYKUMAR " + "VALUES (1348,'uday','kumar',25)";
			// updating the record
			stmt.executeUpdate(sql);
			sql = "UPDATE UDAYKUMAR" + "SET age = 30 WHERE id in (1344,1347)";
			// deleting record from UDAYKUMAR(table)
			stmt.executeUpdate(sql);
			sql = "DELETE FROM UDAYKUMAR" + "WHERE id = 1344";
			stmt.executeUpdate(sql);
			// get Results using ResultSetMetaData
			sql = "SELECT id,first,last,age FROM UDAYKUMAR";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");
				// displaying values
				System.out.println("ID:" + id);
				System.out.println("Age:" + age);
				System.out.println("first:" + first);
				System.out.println("last:" + last);
			}
			rs.close();
			// batch update.
			conn.setAutoCommit(false);
			sql = "INSERT INTO UDAYKUMAR(id,first,last,age)" + "VALUES(1433,'kannan','raj',23)";
			stmt.addBatch(sql);
			sql = "INSERT INTO UDAYKUMAR(id,first,last,age)" + "VALUES(1434,'Somu','raj',23)";
			stmt.addBatch(sql);
			sql = "INSERT INTO UDAYKUMAR(id,first,last,age)" + "VALUES(1436,'yuraj','raj',23)";
			stmt.addBatch(sql);
			int[] count = stmt.executeBatch();
			conn.commit();

		} catch (ClassNotFoundException e) {
			System.out.println("Exception:" + e);
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();

				}
			} catch (SQLException se2) {
				System.out.println("Exception:" + se2);
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se2) {
				System.out.println("Exception:" + se2);
			}
		}
	}
}
