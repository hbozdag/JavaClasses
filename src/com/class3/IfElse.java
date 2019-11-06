package com.class3;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {

			System.out.println("Num1 islarger than num2");
		} else if (num1 == num2) {
			System.out.println("Num1 is equal to num2");
		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 6;

		if (day == 1) {

			System.out.println("Today is Monday. I have to go to work.");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have SDLC class.");
		} else if (day == 3) {
			System.out.println("Today is Wednesday. I have Java review class.");
		} else if (day == 4) {
			System.out.println("Today is Thursday.I have SDLC class.");
		} else if (day == 5) {

			System.out.println("Today is Friday. nO WORK");
		} else if (day == 6) {
			System.out.println("Today is SATURDAY. I have java");
		} else if (day == 7) {
			System.out.println("Today is Sunday. Java again");
		} else {
			System.out.println("No such a thing");
		}

		System.out.println("I am done whith if statement");

		// command+shift+f--> to fix the format

	}

}
