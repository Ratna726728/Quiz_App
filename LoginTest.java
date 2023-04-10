package com.infosys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.infosys.quizapp.ApplicationImpl;

public class LoginTest {
	public void loginDetails() throws SQLException {
		Connection connectionL = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Scanner sc = new Scanner(System.in);

		try {
//			loading the driver class
			Class.forName("com.mysql.jdbc.Driver");
//			connection Establishing
			connectionL = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","Password@123");
//			prepared Statement
			preparedStatement = connectionL.prepareStatement("select password from register where student_id = ? and username = ?");
			
//			take student id from user
			System.out.println("Enter the student ID : ");
			preparedStatement.setString(1, sc.next());
			
			System.out.println("Enter the student username : ");
			preparedStatement.setString(2, sc.next());
			
//			store the result set
			resultSet = preparedStatement.executeQuery();
			
//			
//			System.out.println("Password"+ resultSet.next());
//			
//			taking while loop to print the result
			
			while(resultSet.next()) {
				String student_id = resultSet.getString(1);
				
//				System.out.println("student_id>>" + student_id);
				String username = resultSet.getString(2);
//				System.out.println("Username>>" + username);
				String password = resultSet.getString(3);
//				System.out.println("Password>>" + password);
								
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectionL.close();
			preparedStatement.close();
			resultSet.close();

		}
	}
	
//	public static void main(String[] args) throws SQLException {
//		LoginTest loginTest = new LoginTest();
//		loginTest.loginDetails();
//	}

}
