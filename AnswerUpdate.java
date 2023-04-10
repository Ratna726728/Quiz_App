package com.infosys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class AnswerUpdate {
	public void insertData() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//try
			// loading driver class
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "Password@123");
			// Prepared statement
			ps = con.prepareStatement(
					"insert into answer(que1, que2, que3, que4, que5, que6, que7, que8, que9, que10) values(?,?,?,?,?,?,?,?,?,?);");
			
			System.out.println("1. JVM stands for?");
			System.out.println("A. Java Visual Machine");
			System.out.println("B. Java Virtual Machine");
			System.out.println("C. Joint Visual Mechanism");
			System.out.println("D. All of Above");
			
			if(sc.next()=="B") {
				String b1= "true";
				ps.setString(1, b1);
			}else {
				String b1 ="false";
				ps.setString(1, b1);
			}
			
			
			
			System.out.println("2. what is JRE?");
			System.out.println("A. Java Runtime Environment");
			System.out.println("B. Java runtime Executable");
			System.out.println("C. Joint Run Execution");
			System.out.println("D. All of Above");
			ps.setString(2, sc.next());
			
			System.out.println("3. when Java is developed?");
			System.out.println("A. 1996");
			System.out.println("B. 1995");
			System.out.println("C. 1992");
			System.out.println("D. 2005");
			ps.setString(3, sc.next());
			
			System.out.println("4. How many features are present in Java?");
			System.out.println("A. 5");
			System.out.println("B. 10");
			System.out.println("C. 15");
			System.out.println("D. 13");
			ps.setString(4, sc.next());
			
			System.out.println("5. what is JIT?");
			System.out.println("A. Debugger");
			System.out.println("B. Interpreter");
			System.out.println("C. Complier");
			System.out.println("D. All of Above");
			ps.setString(5, sc.next());
			
			System.out.println("6. why to use If statement?");
			System.out.println("A. To compare");
			System.out.println("B. To execute");
			System.out.println("C. Developer want to use that is why");
			System.out.println("D. All of Above");
			ps.setString(6, sc.next());
			
			System.out.println("7. JDBC Stands for");
			System.out.println("A. Java Runtime Environment");
			System.out.println("B. Java Database connection");
			System.out.println("C. Joint Database console");
			System.out.println("D. All of Above");
			ps.setString(7, sc.next());
			
			System.out.println("8. how to use Database?");
			System.out.println("A. to store the data");
			System.out.println("B. to execute the data");
			System.out.println("C. to retrive data");
			System.out.println("D. All of Above");
			ps.setString(8, sc.next());
			
			System.out.println("9. how many control statements are present in java?");
			System.out.println("A. 1");
			System.out.println("B. 2");
			System.out.println("C. 3");
			System.out.println("D. 4");
			ps.setString(9, sc.next());
			
			System.out.println("10. what is OOP?");
			System.out.println("A. Object oriented Programming");
			System.out.println("B. object only program");
			System.out.println("C. Object oriented Priniting");
			System.out.println("D. All of Above");                               
			ps.setString(10, sc.next());
			
			int a = ps.executeUpdate();
			System.out.println("Exam Done and Database Updated!!!" + a);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
			ps.close();
			sc.close();
		}
	}

}
