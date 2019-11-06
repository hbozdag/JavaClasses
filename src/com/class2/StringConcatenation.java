package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {

		String name = " HACI";
		String city = " Dallas";
		long myPhoneNumber = 282820209209l;

		System.out.println("Good Morning" + name);

		int day = 22;

		// today is Spetember 22

		System.out.println("Today is September " + day);

		String text = "Today is September ";

		System.out.println(text + day);

		// My name is _
		// I live in city of _
		// My phone number is_

		System.out.println("My name is " + name);
		System.out.println("I live in city of" + city);
		System.out.println("My phone number is " + myPhoneNumber);

		int num1 = 12;
		int num2 = 13;

		// the value of num

		String fruit = "banana";
		char dollar = '$';
		double price = 1.99;

		// the price of banana is $1.99

		System.out.println("The price of banana is $1.99");
		System.out.println("The price of " + fruit + " is " + dollar + price + "!!!");

	}

}
