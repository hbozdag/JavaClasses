package com.class03;

public class IfConditions {
	
	public static void main (String [] args) {
		
		int a=20;
		int b=30;
		
		//if number a is bigger than number b
		//I want to print a is larger than b
		
		if (a>b) { 
			System.out.println("a is larger than b");
			
		} else { 
			System.out.println("a is smaller than b");
		}
			
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual ->you will succeed
		//otherwise, please study more
		
		
		if (actualHours>expectedHours) {
			System.out.println("you will succeed");
			
		}else {
			System.out.println("please study more");
			
		}
		
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2; //2.99=4.99-2
		
		//if price is morethan i can afford I will NOT buy it
		//if price is less or matches what i can afford then i will buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("I will enjoy my tea");
		}else {
			System.out.println("I cannot afford;I need to study more ");
			System.out.println("I will study more");
		}
		
		
		System.out.println("I will keep writing code");
	}

}
