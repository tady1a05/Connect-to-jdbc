package com.toby.test;
import java.sql.Connection;
import java.sql.DriverManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to jdbc" + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection successful!");
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
