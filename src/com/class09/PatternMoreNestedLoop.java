package com.class09;

public class PatternMoreNestedLoop {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		 
		System.out.println("##########");
		
		for (int i=1; i<6; i++) {
			for (int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		System.out.println("##########");

		for (int i=1; i<10; i++) {
			for (int j=1; j<=i; j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
		

		System.out.println("##########");
		
		/*999999999
		 * 88888888
		 * 7777777
		 * 666666
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 * 
		 */
		

		for (int i=9; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
