package com.infosys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest {

	public void databaseDetails() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		try {
			// loading driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "Password@123");
			// Prepared statement
			ps = con.prepareStatement(
					"insert into register(firstName, lastName,username, password, city, mail_id, mobile_Number) values(?,?,?,?,?,?,?)");
			System.out.println("Enter the First Name : ");
			ps.setString(1, sc.nextLine());
			System.out.println("Enter the Last Name : ");
			ps.setString(2, sc.nextLine());
			System.out.println("Enter the username : ");
			ps.setString(3, sc.nextLine());
			System.out.println("Enter the Password : ");
			ps.setString(4, sc.nextLine());
			System.out.println("Enter the City : ");
			ps.setString(5, sc.nextLine());
			System.out.println("Enter the Mail ID : ");
			ps.setString(6, sc.nextLine());
			System.out.println("Enter the Mobile Number : ");
			ps.setString(7, sc.nextLine());

//		submit the sql statement to database connection
			int a = ps.executeUpdate();
			System.out.println("record updated" + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
		}
	}
}
