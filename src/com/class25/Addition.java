package com.class25;

public class Addition {

	/*
	 * polymorphism :
	 * 
	 * -compile time polymorphism/static binding/early binding -Run time
	 * polymorphism
	 * 
	 * 
	 * method overloading(compile time polymorphism)is having the same name within same class.
	 * 1.by passing different amount of parameters
	 * 2.by passing different type of parameters
	 */

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	 //2.by passing different type of parameters
	
	public double add(double num1, double num2) {
		double sum=num1+num2; 
		return sum;
	}

	public void add(double num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public static void main(String[] args) {

		Addition obj = new Addition();
		obj.add(3, 4);
		obj.add(3, 4, 5);
		obj.add(5.8, 8, 8);
		
		
		String str="Hello";
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 4));
	}
}
