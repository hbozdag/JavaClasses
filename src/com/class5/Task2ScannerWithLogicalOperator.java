package com.class5;

import java.util.Scanner;

public class Task2ScannerWithLogicalOperator {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("Enter your height in inches");

		double height = a.nextDouble();

		if (height < 5) {
			System.out.println("short");
		} else if (height >= 5 && height < 6) {
			System.out.println("medium");
		} else if (height >= 6) {
			System.out.println("tall");
		}

	}

}
