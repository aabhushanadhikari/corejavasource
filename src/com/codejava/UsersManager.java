package com.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManager{
	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="";
		String username="Aabhushan";
		String password="password";
		String email="aaabhushan@gmail.com";
		String fullname="Aabhushan Adhikari";
		
		try {
			System.out.println("Username"+username);
			Connection connection=DriverManager.getConnection(jdbcURL,dbusername,dbpassword);
			String sql=("INSERT INTO users (username,password,fullname,email)"+" VALUES ('Aabhushan', 'Adhikari', 'aaabhushan10@gmail.com', '12345')");
			Statement stm=connection.createStatement();
			
			int rows=stm.executeUpdate(sql);
		
			if(rows>0) {
				System.out.println("New Row added");
			}
			
				connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
