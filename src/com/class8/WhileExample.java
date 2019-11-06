package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * ask user to enter if it is raining or not
		 * true or false
		 * if it keeps raining tell user to take an umbrella
		 * if no rain go to park
		 */
		
		
		Scanner scan;
		scan=new Scanner(System.in);
		boolean isRain;
		
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
		} while(isRain);
		
		System.out.println("Go to the park");
		
		
		
		
		
		
		
		
		
		
		
	}

}
