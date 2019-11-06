package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
	
		/*
		 * ask user to enter the month tey were born
		 * based on the month define the seaoson
		 * if user is born in dec,jan, feb winter
		 */
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the month you were born");
		
		String month=scan.nextLine();
		String season;
	
		
		if (month.equals("December")|| month.equals("January") || month.equals("February")) {
			season="Winter";
		}else if (month.equals("March")|| month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June")|| month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September")|| month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
			season="unknown";
		}
			
		System.out.println("You were born in "+ season);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
