package com.class09;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		
		int secretNumber, guessNumber;
		
		secretNumber=12;
		
		do {
			System.out.println("Please guess secret number 1-20");
			guessNumber=scan.nextInt();
			
			if (guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if (guessNumber>secretNumber)
			{
				System.out.println("Your number is too large");
			}else {
				System.out.println("Congratulations you got it");
			}
		}while (guessNumber!=secretNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
