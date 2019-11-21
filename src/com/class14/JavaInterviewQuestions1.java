package com.class14;

import java.util.Scanner;

public class JavaInterviewQuestions1 {

	public static void main(String[] args) {
		/*
		 * Q1= Write aprogramtoswap2numberswithoutatemporaryvariable?
		 * Swap2stringswithout a temporary variable?
		 */

		int x = 10;
		int y = 5;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping : " + "x=" + x + ", y=" + y);
		// After swapping : x=5, y=10

		String a = "Love";
		String b = "You";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b; // love you
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);

		/*
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 */

		int[] num = { 1, 25, 6, 98, 7, 545, 56 };

		int max = num[0];
		int secMax = num[0];

		for (int i = 0; i < num.length; i++) {

			if (max < num[i]) {

				secMax = max;
				max = num[i];
			} else if (secMax < num[i]) {
				secMax = num[i];

			}

		}
		System.out.println(secMax);
		System.out.println(max);

		// max number
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {

				max = num[i];
			}
		}
		System.out.println(max);

		// min number
		for (int i = 0; i < num.length; i++) {
			if (max > num[i]) {

				max = num[i];
			}
		}
		System.out.println(max);

		// 3.Find out how many alpha characters present in a string?

		String str = " ayse tataile ciksin 8927202!@#$$%";

		String str1 = str.replaceAll(" ", "");

		System.out.println(str1.length());

		// 4.How to find out the part of the string from a string?
		// What is substring?Find number of words in string?

		String str3 = "Ali okula gitsin.";

		String str4 = str3.substring(4, 8);

		System.out.println(str4);

		String[] str5 = str3.split(" ");

		System.out.println(str5.length);

		// 5.Write a java program to reverse String? Reverse a string word by word?

		String day = "Samuel okula kos";
		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}

		// 6.Write a Java Program to find whether a String is palindrome or not?
		String palindrome = "nurses run";
		for (int i = palindrome.length() - 1; i >= 0; i--) {
			System.out.print(palindrome.charAt(i));
		}
			// 7.Write a java program to check whether a given number is prime or not?
			
			
		
			//	8.Write a Java Program to print first 10 numbers of Fibonacci series.
			
	
		
		
	}

}
