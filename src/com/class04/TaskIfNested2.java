package com.class04;

public class TaskIfNested2 {

	public static void main(String[] args) {

		double mortgageRate = 4.2;
		int housePrice = 223000;

		if (mortgageRate > 4.5) {

			System.out.println("I will not buy a house.");
		} else {
			System.out.println("I wil buy a house");

			if (housePrice > 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash.");

			}

		}

	}

}
