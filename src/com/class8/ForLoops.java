package com.class8;

public class ForLoops {

	public static void main(String[] args) {
		
		for ( int i=20; i>=1; i-=2) {
			System.out.println(i);
		}

		
		
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("******");
		
		
		int sumAll=0;
		
		for (int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		
		System.out.println(sumAll);
		
		System.out.println("#######");
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.print(sum+"+");
		}
		System.out.println("^^^^^^^###");
		
		
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y;//2=2*1; 4=2*2; 12=3*4
		}
		System.out.println(total);
		
		
		
	}

}
