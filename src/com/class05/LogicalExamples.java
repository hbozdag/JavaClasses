package com.class05;

import java.util.Scanner;

public class LogicalExamples {

	// to import short cut commnad+shift+O

	public static void main(String[] args) {
		/*
		 * 
		 * write a program. ask user to enter daily sales bassed on the sales range we
		 * want to give commission to the person
		 * 
		 * if sale is less than 100-->commission is 10% if sales between
		 * 100-200-->commission is 20%
		 */

		Scanner scan;
		double salesAmount;

		double commission;

		scan = new Scanner(System.in);
		System.out.println("please enter your sales amount");
		salesAmount = scan.nextDouble();

		if (salesAmount < 100) {

			// lets give user 10% commission of the sale
			commission = salesAmount * 0.1;

		} else if (salesAmount >= 100 && salesAmount < 200) {
			// lets give user 20% commission of the sale
			commission = salesAmount * 0.2;

		} else if (salesAmount >= 200 && salesAmount < 500) {
			// lets give user 30% commission of the sale
			commission = salesAmount * 0.3;
		} else if (salesAmount >= 500) {
			// lets give user 50% commission of the sale
			commission = salesAmount * 0.5;
		} else {
			commission = 0;

		}
		System.out.println("based on the sales your commission is " + commission);

	}

}
