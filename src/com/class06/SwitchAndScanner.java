package com.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/*
		 * 
		 * ask user to enter their gender F or M
		 * based on the input provide
		 * if F-->FEMALE
		 * IF m-->MALE
		 * otherwise -->unknown
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your gender: F or M");
		
		char gender=scan.next().charAt(0);
		String userGender;
		
		// swirtch case works only with byte, short, int, char, string
		//no relatinal operators can be used wirth switch
		//switch case only checks for equality
		// no logical operators with switch case
		//switch case is value base
		//duplicate cases are not allowed
		//default is optional and it is similar as else block
		//we need break so execution works correctly
		
		switch (gender) {
		
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender="male";
			break;
			default:
				userGender="Unknown";

			
		}
		System.out.println("Your gender is "+userGender);
		
		
	}

}
