package com.class09;

public class PatternNestedLoops {

	public static void main(String[] args) {
		

		
		for (int i=1; i<4; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i=0;i<3; i++) {//rows
			for (int y=0; y<10; y++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print 
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 
		 */
		
		for (int i=1; i<5; i++) {
			for (int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*let's print
		 * 
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 * 
		 */
		
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		//print 
				/*
				 * 123456789
				 * 123456789
				 * 123456789
				 * 123456789
				 * 123456789
				 * 
				 */
		
		
		for (int i=1; i<6; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("**********");
		
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("**********");
		
		
		for (int i=5; i>=1; i--) {
			for (int j=1; j<6; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
