package com.ofs.java.day5;
//STEP 1. Import required packages
	import java.sql.*;

public class UpdateRecordDB {

	 // JDBC driver name and database URL
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://192.168.16.109:3306/batch2";

	 //  Database credentials
	 static final String USER = "sabose";
	 static final String PASS = "sabose";
	 
	 public static void main(String[] args) {
	 Connection conn = null;
	 Statement stmt = null;
	 try{
	    //STEP 2: Register JDBC driver
	    Class.forName("com.mysql.jdbc.Driver");

	    //STEP 3: Open a connection
	    System.out.println("Connecting to a selected database...");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    System.out.println("Connected database successfully...");
	    
	    //STEP 4: Execute a query
	    System.out.println("Updating records into the table...");
	    stmt = conn.createStatement();
	    
	    String sql = "UPDATE RAJKAMAL SET age = 23 WHERE id in (4)";
   stmt.executeUpdate(sql);

	    System.out.println("Updated records into the table...");

	 }catch(SQLException se){
	    //Handle errors for JDBC
	    se.printStackTrace();
	 }catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }finally{
	    //finally block used to close resources
	    try{
	       if(stmt!=null)
	          conn.close();
	    }catch(SQLException se){
	    }// do nothing
	    try{
	       if(conn!=null)
	          conn.close();
	    }catch(SQLException se){
	       se.printStackTrace();
	    }//end finally try
	 }//end try
	 System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample