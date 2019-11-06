package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);


System.out.println("Do you have a credit card? True or false");
boolean cc=input.nextBoolean();

if (cc) {
	
	System.out.println("What is the balance on you credit card?");
	
	int balance=input.nextInt();
	
	if (balance>1000) {
		System.out.println("please pay off your balance");
	}else {
		System.out.println("you can spend more money");
	}
}else {
	System.out.println("Would you like to apply for a credit ard?");
}
		
		
		
		
		
		
		
		

	}

}
