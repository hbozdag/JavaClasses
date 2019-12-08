package com.class06;

import java.util.Scanner;

public class HomeworkNumberTwoPartTwo {

	public static void main(String[] args) {
		
/*
 * ask user to enter grade then provide explanation:
 * A-Excellent, B-Good, C-Average, D-Bad, 
 * any other grade -->not acceptable
 * at the end print which grade was entered by a user with explanation
 * 
 */
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		
		char grade=scan.next().charAt(0);
		
		switch (grade) {
		
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Average");
			break;
			
		case 'D':
			System.out.println("Bad");
			break;
			default:
			
				System.out.println("not acceptable");
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
