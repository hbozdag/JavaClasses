package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// break breaks the loop

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;

			}

			System.out.println(i);
		}
		System.out.println("I am outside of the loop");

		// continue keyword will skip current iteration

		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("^^^^^^^^^^^");

		for (int i = 1; i <= 5; i++) {

			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}

		// i want to print numbers 1 to 20 except 5, 6, 7

		for (int i = 1; i <= 20; i++) {

			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
