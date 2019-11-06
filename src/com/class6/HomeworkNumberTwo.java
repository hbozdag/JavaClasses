package com.class6;

import java.util.Scanner;

public class HomeworkNumberTwo {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask user to enter number of worked years and annual salary
		 * if user worked for more or equals to 5 years 
		 * than user is eligible for the bonus, otherwise he is not
		 * once user is eligible and salary is larger than 50000 than bonus = 5000
		 * otherwise bonus 3000
		 */

		Scanner scan=new Scanner(System.in);
		
		
		
		
		System.out.println("Enter number of work years");
		int year=scan.nextInt();

		System.out.println("Enter annual salary amount");
		int salaryAmount=scan.nextInt();
		
		if (year>=5) {
			System.out.println("You are eligible for the bonus");
			
			if (salaryAmount>50000) {
				System.out.println("Your bonus will be $5000");
			}else {
				System.out.println("Your bonus will be $3000");
			}
		}else {
			System.out.println("You are not eligible for the bonus");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
