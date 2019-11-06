package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
boolean b1=!true;
boolean b2=!false;


		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("Hello");
		}else {
			System.out.println("bye");
		}
		
		boolean isRain=false;
		
		if (!isRain) {
			System.out.println("take an umbrella");
		}else {
			System.out.println("not take umbrealla");
		}

		
		//let's compare 2 numbers using not operator
		
		int num1=10;
		int num2 =10;
		
		if (!(num1==num2)) {
			System.out.println("numbers are not equal");
		}else {
			System.out.println("numbers are equal");
			
			
			
		}
		
		//if name is not marry or ana then you are not my sister
		
		String name="Helen";
		String name2="JUNE";
		
		
		if (!(name.equals("Mary")|| name.equals("Ana"))) {
			System.out.println("you are not my sister");
		}else {
			System.out.println("you are my sister");
		}
		
	}

}
