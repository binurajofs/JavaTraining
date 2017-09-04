package com.ofs.java.vini.Day5;

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
			String query = "CREATE TABLE vinitha(name VARCHAR(10), id INT(3))";
			statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void insertData(String name, int id) {
		try {
			statement = connection.createStatement();
			
			statement.executeUpdate("INSERT INTO vinitha(name,id) VALUES('" + name + "'," + id + ")");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void updateMark(String name, int id) {
		try {
			statement = connection.createStatement();
			statement.executeUpdate("UPDATE vinitha SET id=" + id + " WHERE name='" + name+ "'");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void deleteMark(String name) {
		try {
			statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM vinitha WHERE name='" + name + "'");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void display() {
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM vinitha");
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
			String sql = "INSERT INTO vinitha (name,id) VALUES(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<5;i++) {
				preparedStatement.setString(1, "Batch"+i);
				preparedStatement.setInt(2, 10+i);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}	
	
}