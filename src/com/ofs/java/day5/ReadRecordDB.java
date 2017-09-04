package com.ofs.java.day5;
//STEP 1. Import required packages
	import java.sql.*;

public class ReadRecordDB {
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
	    System.out.println("Reading records into the table...");
	    stmt = conn.createStatement();
	    
	    String sql = "SELECT * FROM RAJKAMAL";
	    ResultSet rs = stmt.executeQuery(sql);
	  //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("id");
	         String name = rs.getString("name");
	         int age = rs.getInt("age");
	         
	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", NAME: " + name);
	  	     System.out.println(", AGE: " + age);
	      }
	      rs.close();
	    System.out.println("Read Operation is Done from the records From the table...");

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