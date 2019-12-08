package com.class08;

public class TaskForLoop {

	public static void main(String[] args) {
		// find the sum of even &odd numbers
		//from range 1 to 20
		//expect 2 outputs
		//sum for odd nums=
		//sum for even nums=
		
		
		int sumOdd=0;
		
		for (int y=1; y<=20; y+=2) {
			sumOdd= sumOdd+y;
		}
			System.out.println(sumOdd);

			
			int sumEven=0;
			
			for (int y=1; y<=20; y++) {
				if (y%2==0) {
					sumEven=sumEven+y;	
				}
				
			}
			System.out.println(sumEven);
			
			
			//2nd way
			
			int sumEven2=0;
			int sumOdd2=0;
			
			for (int i=1; i<=20; i++) {
				
				if (i%2==0) {
					sumEven2=sumEven2+i;
				}else {
					sumOdd2= sumOdd2+i;
					
				}
			}
			
			System.out.println("The total of all even #="+ sumEven2);
			System.out.println("The total of all odd #="+ sumOdd2);
	}

}
