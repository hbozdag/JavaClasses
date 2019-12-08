package com.class07;

import java.util.Scanner;

public class BestExampleOfWhileAndDoWhile {

	public static void main(String[] args) {
		/*
		 * ask user to pay for coffee keep asking user to pay for it until entered price
		 * is equal to 5 after user paid then say enjoy your coffee
		 */

		Scanner scan = new Scanner(System.in);

//		way:1

		int a = 1;

		while (a <= 5) {
			System.out.println("Please pay for your coffee");
			a = scan.nextInt();
			a++;

		}
		System.out.println("Enjoy your coffee");

		// way :2

		int price1;
		System.out.println("Please pay for your coffee");
		price1 = scan.nextInt();

		while (price1 != 5) {
			System.out.println("Please pay for your coffee");
			price1 = scan.nextInt();

		}
		System.out.println("Enjoy your coffee");
		
		//way :3
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price = scan.nextInt();

		}while(price1 != 5);
		System.out.println("Enjoy your coffee");
	}

}
