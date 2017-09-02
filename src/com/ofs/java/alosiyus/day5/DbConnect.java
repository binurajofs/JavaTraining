package com.ofs.java.alosiyus.day5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;


public class DbConnect {
String url="jdbc:mysql://192.168.16.109:3306/batch2";
String username="sabose";
String password="sabose";
String driver="com.mysql.jdbc.Driver";
Connection connection=null;
Statement statement=null;
ResultSet resultset=null;
public  DbConnect() {
try {
	Class.forName(driver);
	connection= DriverManager.getConnection(url,username,password);
	if(connection!=null) {
		System.out.println("connection established");
		
	}
}
	catch(Exception e) {
		System.out.println(e.toString());
	}

}
public void createtable() {
	try{
		statement=connection.createStatement();
	   resultset=statement.executeQuery("CREATE TABLE  Alosiyus(subject varchar(25),matks int(3)) ");
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
}
public void insertData(String subject, int marks) {
	try {
		statement = connection.createStatement();
		int result = statement
				.executeUpdate("INSERT INTO Alosiyus(Subjects,Marks) VALUES('" + subject + "'," + marks + ")");
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void updateMark(String subject, int marks) {
	try {
		statement = connection.createStatement();
		int result = statement
				.executeUpdate("UPDATE Alosiyus SET marks=" + marks + " WHERE Subjects='" + subject + "'");
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void deleteMark(String subject) {
	try {
		statement = connection.createStatement();
		int result = statement.executeUpdate("DELETE FROM Alosiyus WHERE Subjects='" + subject + "'");
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
public void display() {
	try{
	   
	   statement = connection.createStatement();
		resultset = statement.executeQuery("SELECT * FROM Alosiyus");
		ResultSetMetaData res = resultset.getMetaData();
	   int columnNumber=res.getColumnCount();
	   while(resultset.next()) {
		   for(int i=1;i<columnNumber;i++) {
			   System.out.println(resultset.getString(i)+"");
		   }
	   }
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
}
public void batchInsert() {
	try {
		String sql = "INSERT INTO Alosiyus (Subjects,Marks) VALUES(?,?)";
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
public static void main(String[] args) {
	// TODO Auto-generated method stub
DbConnect dbconnect=new DbConnect();
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
		dbconnect.insertData(subject, marks);
		break;
	case 2:
		System.out.println("Enter the Subject Name");
		subject=in.next();
		System.out.println("Enter the Updated Mark");
		marks = in.nextInt();
		dbconnect.updateMark(subject, marks);
		break;
	case 3:
		System.out.println("Enter the Subject Name to be deleted");
		subject=in.next();
		dbconnect.deleteMark(subject);
		break;
	case 4:
		dbconnect.display();
		break;
	case 5:
		exit=true;
		try {
			dbconnect.connection.close();
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

in.close();
}


}

