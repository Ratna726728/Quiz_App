package com.infosys.quizapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.infosys.database.ConnectionTest;

public class Test {
	public static void main(String[] args) throws SQLException {
//		to be printed on console
		System.out.println("Welcome to console Based Quiz Application");
//		to add some space on console
		System.out.println();
//		created a menu to show student what are the options present on application
		System.out.println("    1. User Operation    ");
		System.out.println();
		System.out.println("    2. Admin Operation   ");
		System.out.println();
		
//		Creating scanner class object here to take input from user
		Scanner scanner = new Scanner(System.in);
		
//		If student wants to login then he should choose option 1 or if admin wants to login choose option 2.
		System.out.println("Choose 1 for Student Login Operation");
		System.out.println("Choose 2 for Admin login operations");
		System.out.println("Please enter your choice : ");
//		creating int variable to get int input from user
		int choice1 = scanner.nextInt();
		
//		creating object of ApplicationImpl class
		ApplicationImpl applicationimpl1 = new ApplicationImpl();
//		providing choice to applicaionimpl
		applicationimpl1.Choice(choice1);		
		
//		same for choice 2
		int choice2 = scanner.nextInt();
		ApplicationImpl applicationimpl2 = new ApplicationImpl();
		applicationimpl2.Choice(choice2);

		
		
		
		
		

	
		
		
		
		
		
	}

}
