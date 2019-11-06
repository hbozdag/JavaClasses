package com.class6;

import java.util.Scanner;

public class HomeworkNumberThree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");

		double num1 = scan.nextDouble();

		System.out.println(
				"Please select your operator from the list below. \n Type 'sum' for additon \n type 'subtract' for subtraction \n type 'multiply' for multiplication  \n type 'divide' for division");

		String operator = scan.next();

		System.out.println("Please enter second number");

		double num2 = scan.nextDouble();

		switch (operator) {

		case "sum":
			System.out.println(num1 + num2);
			break;
		case "subtract":
			System.out.println(num1 - num2);
			break;
		case "multiply":
			System.out.println(num1 * num2);
			break;
		case "divide":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Unknown");

		}

	}

}
