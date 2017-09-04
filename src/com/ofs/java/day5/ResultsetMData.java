package com.ofs.java.day5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
 public class ResultsetMData { 
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://192.168.16.109:3306/batch2","sabose","sabose");  
  
PreparedStatement ps=con.prepareStatement("select * from RAJKAMAL");  
ResultSet rs=ps.executeQuery();  
java.sql.ResultSetMetaData ResultsetMData=rs.getMetaData();  
  
System.out.println("Total columns: "+ResultsetMData.getColumnCount());  
System.out.println("Column Name of 1st column: "+ResultsetMData.getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+ResultsetMData.getColumnTypeName(1));  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  