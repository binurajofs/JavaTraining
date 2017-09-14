package com.ofs.java.soma.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
String url="jdbc:mysql://192.168.16.109:3306/batch2";
String username="sabose";
String password="sabose";
String driver="com.mysql.jdbc.Driver";
Connection connection=null;
Statement statement=null;
ResultSet resultset=null;
public  Database() {
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
        String sql="CREATE TABLE  Somu(subject varchar(20),marks int(3)) ";
       statement.executeUpdate(sql);
       System.out.println("table created");
    }
    catch(Exception e) {
        System.out.println(e.toString());
    }
}
public void insertData(String subject, int marks) {
    try {
        statement = connection.createStatement();
         statement
                .executeUpdate("INSERT INTO Somu(subject,marks) VALUES('" + subject + "'," + marks + ")");
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}
public void updateMark(String subject, int marks) {
    try {
        statement = connection.createStatement();
         statement
                .executeUpdate("UPDATE Somu SET marks=" + marks + " WHERE subject='" + subject + "'");
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}
public void deleteMark(String subject) {
    try {
        statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM Somu WHERE subject='" + subject + "'");
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}
public void display() {
    try{
       
       statement = connection.createStatement();
        resultset = statement.executeQuery("SELECT * FROM Somu");
        ResultSetMetaData res = resultset.getMetaData();
       int columnNumber=res.getColumnCount();
       while(resultset.next()) {
           for(int i=1;i<columnNumber;i++) {
               System.out.println(resultset.getString(i)+" "+resultset.getInt(i+1));
           }
       }
    }
    catch(Exception e) {
        System.out.println(e.toString());
    }
}
public void batchInsert() {
    try {
        String sql = "INSERT INTO Somu (subject,marks) VALUES(?,?)";
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
Database data=new Database();
data.createtable();
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
        data.insertData(subject, marks);
        break;
    case 2:
        System.out.println("Enter the Subject Name");
        subject=in.next();
        System.out.println("Enter the Updated Mark");
        marks = in.nextInt();
        data.updateMark(subject, marks);
        break;
    case 3:
        System.out.println("Enter the Subject Name to be deleted");
        subject=in.next();
        data.deleteMark(subject);
        break;
    case 4:
        data.display();
        break;
    case 5:
        exit=true;
        try {
            data.connection.close();
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
