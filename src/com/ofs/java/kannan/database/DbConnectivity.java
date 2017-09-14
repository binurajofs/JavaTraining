package com.ofs.java.kannan.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DbConnectivity {

	String url = "jdbc:mysql://192.168.16.109:3306/batch2";
	String username = "sabose";
	String password = "sabose";
	String driver = "com.mysql.jdbc.Driver";
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;

	public DbConnectivity() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				System.out.println("Success");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void createTable() {
		try {
			statement = connection.createStatement();
			String query = "CREATE TABLE Kannan(Subjects VARCHAR(10), Marks INT(3))";
			int result = statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void insertData(String subject, int marks) {
		try {
			statement = connection.createStatement();
			int result = statement
					.executeUpdate("INSERT INTO Kannan(Subjects,Marks) VALUES('" + subject + "'," + marks + ")");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void updateMark(String subject, int marks) {
		try {
			statement = connection.createStatement();
			int result = statement
					.executeUpdate("UPDATE Kannan SET marks=" + marks + " WHERE Subjects='" + subject + "'");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void deleteMark(String subject) {
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate("DELETE FROM Kannan WHERE Subjects='" + subject + "'");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void display() {
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM Kannan");
			ResultSetMetaData rsmd = resultset.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (resultset.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					System.out.print(resultset.getString(i) + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void batchInsert() {
		try {
			String sql = "INSERT INTO Kannan (Subjects,Marks) VALUES(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (int i = 1; i < 5; i++) {
				preparedStatement.setString(1, "Batch" + i);
				preparedStatement.setInt(2, 10 + i);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
