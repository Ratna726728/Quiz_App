package com.infosys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class DisplayQuestions implements Quiz{

	@Override
	public void getDisplayQuestions() {
		int score = 0;
		
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root",
					"Password@123");
			Scanner sc = new Scanner(System.in);
            // we use prepared statement to fetch question from database
			
			PreparedStatement ps3 = conne.prepareStatement("SELECT * FROM questiontable");
			ResultSet resultSet = ps3.executeQuery();

			while (resultSet.next()) {
				
				/*with resultset method we display question which is 
				fetch from database*/
				
				String question = resultSet.getString("question");
				String option1 = resultSet.getString("option1");
				String option2 = resultSet.getString("option2");
				String option3 = resultSet.getString("option3");
				String option4 = resultSet.getString("option4");
				String answer = resultSet.getString("answer");
				
				//here question display

				System.out.println(question);
				System.out.println("1. " + option1);
				System.out.println("2. " + option2);
				System.out.println("3. " + option3);
				System.out.println("4. " + option4);
				
				//we took user input for answer
                /*here we use toUpperCase() method 
				to Returns a string whose value is string*/
				//sc.nextLine() for scan user input
				
				System.out.print("Enter your answer: ");
				String userAnswer = sc.nextLine().toUpperCase();
                /*user input store in String userAnser*/
				//in if block we compair user answer with correct answer which store in database
				//with this we can calculate the final score
				
				if (userAnswer.equals(answer)) {
					score++;
				}
			}
			System.out.println("enter your student id: ");
			int id = sc.nextInt();
            //to display final score to student for reference
			System.out.println("Your score: " + score);

			// insert score into database with prepared statement

			
			PreparedStatement ps = conne.prepareStatement("INSERT INTO studentdetails (student_id, score)  VALUES (?,?)");
			ps.setInt(1, id);
			ps.setInt(2, score);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
