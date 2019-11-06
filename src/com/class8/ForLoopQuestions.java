package com.class8;

public class ForLoopQuestions {

	public static void main(String[] args) {
		// print numbers from 1 to 100 in 1 line with space
		
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
			
		}
		
		
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("_____");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum= sum+i;
			System.out.print(sum+"+");
		}
	
	}

}
