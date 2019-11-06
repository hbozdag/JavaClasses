package com.class7;

public class WhileExamples {

	public static void main(String[] args) {
		int num = 10;

		while (num <= 7) {

			System.out.println("Hello");
			num++;
		}

		int num1 = 10;// initilaize variable

		do {// execute code.
			System.out.println("Bye");// even if code is false code will execute at least once
			num1++;//increment goes in the do code block
		} while (num1 < 7);// check condition

		System.out.println("^^^^^^^^^");

		// print even numbers 20 to 50 using do while

		int a = 20;

		do {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a += 2;
		} while (a <= 50);

	}

}
