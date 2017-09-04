package com.ofs.java.day5;
import java.sql.*; 
public class TableCreation {
//JDBC DRIVER NAME AND DATABASE URL
	
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://192.168.16.109:3306/batch2";
	
	//DataBase Credentials
	static final String USER ="sabose";
	static final String PASS ="sabose";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn =null;
Statement stmt =null;


try {
	//REGISTER JDBC driver
	Class.forName("com.mysql.jdbc.Driver");
	
	// Open a Connection 
System.out.println("Connectiong to DB");
conn = DriverManager.getConnection(DB_URL, USER, PASS);
System.out.println("Connected database successfully...");

//EXECUTE QUERY
System.out.println("creating Statement.....");
stmt=conn.createStatement();
String sql="CREATE TABLE RAJKAMAL"+"(id INTEGER not NULL,"+"name VARCHAR(30),"+"age INTEGER," +"PRIMARY KEY(id))";

stmt.executeUpdate(sql);
System.out.println("Created Table in Given Database");
}
catch(SQLException se) {
	//HANDLE ERRORS FOR JDBC
	se.printStackTrace();
}
catch(Exception e) {
	//HANDLE ERRORS FOR JDBC
	e.printStackTrace();
}
//finally block used to close resources
try{
   if(stmt!=null)
      conn.close();
}catch(SQLException se){
}// do nothing
try{
   if(conn!=null)
      conn.close();
   System.out.println("Goodbye!");
}catch(SQLException se){
   se.printStackTrace();
}//end finally try
}//end try
}//end main