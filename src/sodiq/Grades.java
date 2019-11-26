package sodiq;

import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// Grading of Student's Score
		
		Scanner database = new Scanner(System.in);
		
		// Declare variables
		String user = "Sodiq Jimoh";
		
		// Display user
		System.out.println();
		System.out.println("User's Name: " +user);
		
		// accept password
		System.out.println("Enter your password: ");
		String password = database.nextLine();
		
		// check password
		if (password.equals("ojugbele24434")){
			
			System.out.println("ACCESS GRANTED !");
			Calculategrade();
		}
		else{
			System.out.println("ACCESS DENIED !");
			
		}
	}
			
			// Scanner Object
			public static void Calculategrade(){
			Scanner keyin = new Scanner(System.in);
			
			//Declare Variables
			String Spdid = "0034";
			String Name = "Sodiq Jimoh";
			String dept = "Bus";
			String Course = "Bus Man";
			
			System.out.println("Student I.D " + "= " +Spdid);
			System.out.println("Student Name " + "= " +Name);
			System.out.println("Student Dept. " +"= "+dept);
			System.out.println("Student Course  " +"= " +Course);
			
			// accept data from users
			System.out.println("Enter your Score");
			int Score = keyin.nextInt();
			
			// Check for performance
			if ((Score>=70) & (Score<=100)){
				System.out.println("Grade A");
				System.out.println("Excellent Performance");
				}
			else if((Score>=60) &(Score<=69)){
				System.out.println("Grade B");
				System.out.println("Very Good Performance");
		     }
			else if((Score>=50) & (Score<=59)){
				System.out.println("Grade C");
				System.out.println("Average Performance");
				}
			else if((Score>=40) & (Score<=49)){
				System.out.println("Grade D");
				System.out.println("Good Performance");
				}
			else if((Score>=30) & (Score<=39)){
				System.out.println("Grade E");
				System.out.println("Poor Performance");
			}
			else if((Score>=20) & (Score<=29)){
				System.out.println("Grade F");
				System.out.println("Very Poor Performance");
		
		}
		
		

	}

}

