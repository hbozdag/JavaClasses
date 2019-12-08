package com.class08;

import java.util.Scanner;

public class TaskBreakAndContinue {

	public static void main(String[] args) {

		
//		task1 
		
		
		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		
		//task 2
		Scanner scan = new Scanner(System.in);

		for (int a = 1; a <= 10; a++) {
			System.out.println("Please apply for a credit card");
			String answer = scan.nextLine();
			if (answer.equals("yes")) {
				break;
			}

		}
		System.out.println("Thank you!");

	}

}
