package com.class9;

import java.util.Scanner;

public class Task2NestedLoops {

	public static void main(String[] args) {


       // 1- Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.

		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a start number");
		int s=scan.nextInt();
		System.out.println("Enter an end number");
		int e=scan.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=s; i<=e; i++) {
			if (i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("Total number of even numbers is " +sumEven);
		System.out.println("Total number of odd numbers is " +sumOdd);
		
		
	
        //		2- Write a guessing game where the user has to guess a secret number between 1 and 20. 
		// After every guess input, the program tells the user whether their number was
		// too large or too small.
		// The program will keep asking the user to enter the number until he finds the
		// correct number.
		// When the correct answer is found the system should display
		// “Congratulations!!. You got it!”
		
		
		for (int i=1; i<=20; i++) {
			
			System.out.println("Guess the lucky number between 1-20 to earn the biggest suprize!!!");
			int num=scan.nextInt();
			if (num==5){
				System.out.println("Congratulations!!!! You got it!!!");
				break;
			}else if (num>5) {
				 System.out.println("Sorry!! the number is too big");
			}else {
				System.out.println("Sorry!! the number is too small");
			}
		}
		 
	        
		    
	        
	        
	    
		
		
		
		
		
		
		

	}

}
