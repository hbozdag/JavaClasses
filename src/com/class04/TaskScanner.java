package com.class04;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		
		Scanner loan= new Scanner(System.in);
		
		
	
		
		System.out.println("Please enter how much loan you want to borrow.");
		
		int amount=loan.nextInt();
		
		
		if (amount>200000) {
			
			System.out.println("Your request is rejected");
		}else {
			System.out.println("You are approved for loan amount");
		}
		
		System.out.println("****");
//		
//		//task 2
//		
		Scanner dmv=new Scanner (System.in);
//		
//		
//		
		System.out.println("please enter your age ");
		int age= dmv.nextInt();
		
		if (age>=18) {
			
			System.out.println("Your driver license is issued");
		}else {
			System.out.println("You can have a permit ");
		}
		System.out.println("****");
		
		//task 3
		Scanner temp=new Scanner (System.in);
		System.out.println("Please add your city name ");
		
		String city=temp.nextLine();
		
		System.out.println("Please type temperature in Fahrenheit");
		
		int fahrenheit=temp.nextInt();
		
		
		int celcius=(fahrenheit-32)*5/9;
		
		
		System.out.println("the temp in "+city+" is "+ celcius);
		
		
	}

}
