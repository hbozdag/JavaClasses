package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		/*
		 * ask usr where they are from
		 * based ont hje country we will specify favorite food
		 */
		
		Scanner scan=new Scanner(System.in);
		
		
		String country, foodName;
		
		
		System.out.println("Please enter you country's name");
		
		country=scan.nextLine();
		
		switch (country) {
		
		case "Turkey":
			foodName="kebab";
		break;
		
		
		case "Ethiopia":
		foodName="Tibs";
		break;
		
		case "Morocco":
			foodName="Tajin";
			break;
			
		case "Kazakhstan":
			foodName="Kumis";
			break;
			
		case "Pakistan":
			foodName="Beryani";
			break;
			
		case "Russia":
			foodName="Caviar";
			break;
			
		case "Cuba":
			foodName="Sofrito";
			break;
			default:
			foodName="Unknown";
		
		
		}
		System.out.println(" You are from "+ country+ " and your favorite food is "+ foodName);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
