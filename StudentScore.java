package com.infosys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentScore implements Score {

	@Override
	public void studentScore() throws SQLException {
		//by entering user id is student will get his score
				//this is for future reference
				System.out.print("Enter Student ID: ");
				Scanner sc1 = new Scanner(System.in);
				int stu_id = sc1.nextInt();
		         //sc1.nextLine() with this method we scan user email id and fetch his score
				/*String mailid dont forget take same variable with match with database 
				column to store user input*/
				
				Connection connec = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				try {
			          //loading connection
			          Class.forName("com.mysql.jdbc.Driver");
			          //established connection with database
			          connec = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", "Password@123");
			         // prepared statement to get data from database
			          ps = connec.prepareStatement("SELECT score FROM studentdetails WHERE student_id=?");
			          ps.setInt(1, stu_id);

			          rs = ps.executeQuery();

			          if (rs.next()) {
			        	  int score = rs.getInt("score");
			        	  System.out.println("Quiz score for " + stu_id + ": " + score);
			          } else {
			        	  System.out.println("No quiz score found for " + stu_id);
			          }
				}catch(Exception e) {
					e.printStackTrace();
				} finally {
				   connec.close();
				   ps.close();
				   rs.close();
				}
		
	}

}
