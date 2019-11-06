package com.class13;

public class StringTask {

	public static void main(String[] args) {

//		1. Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";

		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}

//		2.Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters,
//		print the character in the middle of the String.

		String name = "Murad";

		int length = name.length();
		int middle = name.length() / 2; //if we want to find middle charachter
		System.out.println();

		if (!name.isEmpty()) {

			if (length % 2 != 0 && length >= 3) {
				System.out.println(name.charAt(middle));
			} else {
				System.err.println("string is empty");
			}

		}

	}

}
