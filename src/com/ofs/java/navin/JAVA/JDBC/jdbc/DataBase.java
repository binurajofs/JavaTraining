package com.ofs.java.navin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;



public class DataBase {
	String url="jdbc:mysql://192.168.16.109:3306/batch2";
	String username="sabose";
	String password="sabose";
	String driver="com.mysql.jdbc.Driver";
	Connection connection= null;
	Statement statement= null;
	ResultSet resultset=null;

	public  DataBase() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			if(connection!=null) {
				System.out.println("Success");
			}
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void createTable() {
		try {
			statement = connection.createStatement();
			String query = "CREATE TABLE Navin(Subjects VARCHAR(10), Marks INT(3))";
			statement.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println(e.toString());
			
		}
		
	}
	public void insertDATA(String subject, int marks) {
		try {
			statement= connection.createStatement();
			statement.executeUpdate("INSERT INTO Navin(Subjects,Marks) VALUES('"+ subject +"',"+marks+")");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void updateMark(String subject, int marks) {
		try {
			statement = connection.createStatement();
			statement.executeUpdate("UPDATE Navin SET marks = "+ marks+ " WHERE Subjects= '" + subject + "' ");
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void deleteMark(String subject) {
		try {
			statement =connection.createStatement();
			statement.executeUpdate("DELETE FROM Navin WHERE Subjects='"+subject+ "'");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void display() {
		try {
			statement=connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM Navin");
			ResultSetMetaData rsmd = resultset.getMetaData();
			int colCount=rsmd.getColumnCount();
			while(resultset.next()) {
			for (int i=1; i<=colCount; i++) {
				System.out.print(resultset.getString(i)+ " ");
			}
			System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void batchInsert() {
		try {
			String sql="INSERT INTO Navin (Subjects,Marks) VALUES(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (int i=1;i<5;i++) {
				preparedStatement.setString(1, "Batch"+i);
				preparedStatement.setInt(2, 10+i);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		DataBase database =new DataBase();
		String subject="";
		int marks;
		Scanner in = new Scanner(System.in);
		boolean exit=false;
		do {
			System.out.println("Enter Value");
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Update");
			System.out.println("Press 3 for Delete");
			System.out.println("Press 4 for Display");
			System.out.println("Press 5 to exit");
			int response=in.nextInt();
			switch(response) {
			case 1:
				System.out.println("Enter the Subject Name");
				subject=in.next();
				System.out.println("Enter the Mark");
				marks = in.nextInt();
				database.insertDATA(subject, marks);
				break;
			case 2:
				System.out.println("Enter the Subject Name");
				subject=in.next();
				System.out.println("Enter the Updated Mark");
				marks = in.nextInt();
				database.updateMark(subject, marks);
				break;
			case 3:
				System.out.println("Enter the Subject Name to be deleted");
				subject=in.next();
				database.deleteMark(subject);
				break;
			case 4:
				database.display();
				break;
			case 5:
				database.batchInsert();
				exit=true;
				try {
				database.connection.close();
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
				break;
				
			default:
				System.out.println("Enter a valid Number");
				break;
			}
		}while(!exit);
	}


}
