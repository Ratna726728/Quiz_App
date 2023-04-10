package com.infosys.quizapp;

import java.util.Scanner;
import com.infosys.adminoperation.AdminOperationDemo;
import com.infosys.database.AnswerUpdate;
import com.infosys.database.ConnectionTest;
import com.infosys.database.DisplayQuestions;
import com.infosys.database.LoginTest;
import com.infosys.database.StudentScore;


public class ApplicationImpl implements Application {

	Scanner scan = new Scanner(System.in);

//	for choice of user
	@Override
	public void Choice(int num) {
		try {
			if (num == 1) {
				System.out.println("1. Student Registration");
				System.out.println("2. Student Login");
				System.out.println("3. Display the list of Questions");
				System.out.println("4. Display Quiz Result");
//			choose one option from above
				System.out.println("Choose the option : ");
				int option_1 = scan.nextInt();
				if (option_1 == 1) {
					System.out.println("   Registration form   ");
//		creating object of student class from other package
					ConnectionTest connectionTest = new ConnectionTest();
					connectionTest.databaseDetails();					
//	from here we need to create a new class where we take input from user and store it into	database 
//	calling RegistrationLogin class here

				} else if (option_1 == 2) {
					System.out.println("   Student Login    ");
					LoginTest loginTest = new LoginTest();
					loginTest.loginDetails();
//					System.out.println("Enter the Student ID :");
//					String id = scan.next();
//					System.out.println("Enter username :");
//					String uname = scan.next();
					System.out.println("Enter Password :");
					String pass = scan.next();
					
					
//		Creating the object of LoginTest class to extract login information from user
					
//					details Fetched successfully
					System.out.println("Details fetched from database successfully");
					

//using the database who is having uname and password, we fetch the details from their
//asking user to provide student id.
//	student id input== using scanner class
//					studentid==3
//database will fetch student uname and password using that studentid
//	will compare those details with login details the user providing during login time

				} else if (option_1 == 3) {
					System.out.println("QUIZ QUESTION SHEET");
//					use for loop and switch case statements  and store the input in scanner
					
					DisplayQuestions dq =new DisplayQuestions();
					dq.getDisplayQuestions();
					
					
				} else if (option_1 == 4) {
					System.out.println("Show result");
					StudentScore ss= new StudentScore();
					ss.studentScore();
				} else {
					System.out.println("Invalid input");
				}
			} else if (num == 2) {
				System.out.println("1. Display all student score in Ascending order");
				System.out.println("2. Fetch student score by using ID");
				System.out.println("3. Add questions with 4 options into database");
//				choose one option from above
				System.out.println("Choose the option : ");
				int option_2 = scan.nextInt();
				if (option_2 == 1) {
					System.out.println(" Student score");
					
					AdminOperationDemo aod = new AdminOperationDemo();
					aod.displayAllScoresAscending();
					
				} else if (option_2 == 2) {
					System.out.println("Display score using Student_id");
					AdminOperationDemo aod = new AdminOperationDemo();
					aod.fetchStudentScoreById();
				} else if (option_2 == 3) {
					System.out.println("to Add questions");
					
					AdminOperationDemo aod = new AdminOperationDemo();
					aod.addQuestionWithOptions();
				} else {
					System.out.println("Invalid input");
				}

			} else {
				System.out.println("Invalid choice");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
