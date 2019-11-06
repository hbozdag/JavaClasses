package com.class10;

public class ReplQ69 {

	public static void main(String[] args) {
//		Write a program to print out the pattern: 
//
//	        1
//	      22 
//	    333 
//	  4444 
//	55555
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
