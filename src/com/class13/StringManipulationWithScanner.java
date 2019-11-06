package com.class13;

import java.util.Scanner;

public class StringManipulationWithScanner {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your class day:: ");
		
		String day= scan.nextLine();
		
		if (day.toLowerCase().equals("saturday")) {//change it all to lower case first
			System.out.println(" Saturday is Java day");
		}else if (day.equalsIgnoreCase("Sunday")) {//IGNORE whatevr case day give you
			System.out.println("Sunday is GIT day");
		}else if (day.toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is SDLC day");
		}else if (day.equals("Thursday")) {
			System.out.println("Thursday is manual testing day");
		}else {
			System.err.println("Invalid Entry ");//if you want wrong entry to be marked in red
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
