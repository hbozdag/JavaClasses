package com.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please print any number");
		
		/*
		 * 
		 * nextInt();-->for numbers
		 * nextLine();->for strings
		 * next double();->double
		 * 
		 */
		
		int number =scan.nextInt();
		
		System.out.println("Entered number is " +number);
		
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("please enter your name");
		
		String name= input.nextLine();
		System.out.println("Good afternoon "+name);
	
	

	}

}
