package com.class05;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {

		Scanner anyVariable = new Scanner(System.in);

		System.out.println("Please enter String value");
		String val = anyVariable.nextLine(); // take entire line

		System.out.println("Please enter boolean value");
		boolean val1 = anyVariable.nextBoolean();

		System.out.println("Please enter String value");
		String val2 = anyVariable.next(); // take first word until space

		System.out.println("Please enter integer value");

		int val3 = anyVariable.nextInt();
		System.out.println("Please enter double value");
		double val4 = anyVariable.nextDouble();

		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}
