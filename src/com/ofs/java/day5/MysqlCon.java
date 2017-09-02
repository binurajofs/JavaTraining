package com.ofs.java.day5;

import java.sql.*;

class MysqlCon{
public static void main(String args[]){

try{
  Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://192.168.16.109:3306/batch2","sabose","sabose");

System.out.println("connect");


con.close();

}catch(Exception e){ System.out.println(e);}

}
}