package com.class8;

public class ReviewTasksWhileFor {

	public static void main(String[] args) {
		System.out.println("Task 1");
		// Task 0ne Print numbers from 10 to 1
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("Task 2");
		// Task Two Write a program from 40 to 10 and only print the even numbers
	   
		for (int i=40; i>=10; i--) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		
		
		
		System.out.println("Task 3");
	    // Task Three Write a program from 50 to 25 and only print the odd numbers
		
		for (int i=49; i>=25; i-=2) {
			System.out.println(i);
			
		}
		
		
		
		System.out.println("Task 4");
		// Task Four Write a program from 0 to 100 and break the loop once the value  reaches 45
		
	
		
		for (int i=0; i<=100; i++) {
			System.out.println(i);
			if (i==45) {
				break;
			}
		}
		
		
		
		System.out.println("Task 5");
		// Task Five Write a program  1 to 10 and if the value is 10 
	
	for (int i=1; i<=11; i++) {
		
		if (i==10) {
			continue;
			
		}
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
