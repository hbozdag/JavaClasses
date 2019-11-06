package com.class6;

import java.util.Scanner;

public class HomeworkNumberOne {

	public static void main(String[] args) {
		/*
		 * ask usr enter where they are from
		 * based ont hje country we will specify their language 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		
		String country, language;
		
		
		System.out.println("Please enter you country's name");
		
		country=scan.nextLine();
		
		switch (country) {
		
		case "Turkey":
			language="Turkish";
		break;
		
		
		case "Ethiopia":
			language="Ethiopian";
		break;
		
		case "Morocco":
			language="Arabic";
			break;
			
		case "Kazakhstan":
			language="Kazak";
			break;
			
		case "Pakistan":
			language="Urdu";
			break;
			
		case "Russia":
			language="Russian";
			break;
			
		case "Cuba":
			language="Spanish";
			break;
			default:
				language="Unknown";
		
		
		}
		System.out.println(" You are from "+ country+ " and your language is "+ language);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
