package com.class7;

import java.util.Scanner;

public class HomeworkLargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double no1=scan.nextDouble();
		double no2=scan.nextDouble();
		double no3=scan.nextDouble();
		
		
		
		if (no1>no2) {
			if (no1>no3) {
				System.out.println("Largest number is "+no1);
			}else {
				System.out.println("Largest number is "+no3);
			}
		}else {
			if (no2>no3) {
				System.out.println("Largest number is "+no2);
			}else {
				System.out.println("Largest number is "+no3);
			}
		}

	}

}
