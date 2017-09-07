package com.ofs.java.soma.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class Task1to5 {
	public static void main(String args[])
	{
		int[] result = null;
		try {
			Class.forName("");
			Connection con= DriverManager.getConnection("");
			Statement smt = (Statement)con.createStatement();
			String str="CREATE TABLE somu(id integet, firstName VARCHAR(15), lastName VARCHAR(15))";
			smt.executeUpdate(str);
			str= "INSERT INTO somu (id,firstName,lastName) VALUES(111,'soma','sundaresh')";
			smt.executeUpdate(str);
			str= "INSERT INTO somu (id,firstName,lastName) VALUES(112,'arun','Kaushik')";
            smt.executeUpdate(str);
            str= "INSERT INTO somu (id,firstName,lastName) VALUES(113,'saravana','Kumar')";
            smt.executeUpdate(str);
            str= "DELETE firstName FROM somu WHERE id=100";
            smt.executeUpdate(str);
            str= "UPDATE somu SET firstName=soma WHERE id=100";
            smt.executeUpdate(str);
            str= "ALTER TABLE somu add address VARCHAR(50)";
            smt.executeUpdate(str);
            str= "UPDATE somu SET address= palayankottai, TVL WHERE id=111";
            smt.executeUpdate(str);
            str= "UPDATE somu SET address= Maharj Nagar, TVL WHERE id=112";
            smt.executeUpdate(str);
            str= "UPDATE somu SET address= vellakovil, TIR WHERE id=113";
            smt.executeUpdate(str);
            result = smt.executeBatch();
            ResultSet rs= smt.executeQuery(str);
            ResultSetMetaData resultsetmetadata= (ResultSetMetaData) rs.getMetaData();
            while(rs.next()) {
            	int id= rs.getInt("id");
            	String first= rs.getString("firstName");
            	String last= rs.getString("lastName");
            	System.out.println("id is"+id);
            	System.out.println("first name is"+  first);
            	System.out.println("second name is" + last);
            }
            System.out.println("the total no. of column is"+resultsetmetadata);
		}catch(ClassNotFoundException e1) {
			System.out.println(""+e1);
		}catch (Exception e) {
			System.out.println("Exception "+e);
            }
            


            		

 
            
		}
		
	}


