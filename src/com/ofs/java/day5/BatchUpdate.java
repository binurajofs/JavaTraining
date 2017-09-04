package com.ofs.java.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class BatchUpdate {

	public static void main(String a[]){
		
		Connection con = null;
		int[] result = null;
		  
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.
					getConnection("jdbc:mysql://192.168.16.109:3306/batch2"
						,"sabose","sabose");
			Statement stmt = (Statement) con.createStatement();
		
			
			con.setAutoCommit(false); // Setting auto-commit off
			String SQL = "update RAJKAMAL set name='Raj' where id=5";
			stmt.addBatch(SQL); // add statement to Batch
			SQL = "update RAJKAMAL set name='kamal' where id=6";
			stmt.addBatch(SQL); // add second statement to Batch
			result = stmt.executeBatch(); // execute the Batch
			System.out.println("UPDATED");
			con.commit(); // commit
			
			
			
		} catch (ClassNotFoundException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally{
			try{
				if(pst != null) pst.close();
				if(con != null) con.close();
			} catch(Exception ex){}
		}
	}
}