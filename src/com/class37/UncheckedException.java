package com.class37;

public class UncheckedException {

	public static void main(String[] args) {

		System.out.println("Beginning of your code");

		int a = 20;
		int b = 0;

		// we can use try and catch

		try {
			System.out.println("I am the code inside try block");
			System.out.println(a / b);
			System.out.println("I am the continues code inside try  block");//not exceuted
		} catch (ArithmeticException e) {
			System.out.println("I am the code inside catch block");
			e.printStackTrace();//way 1 to print exception to remind yourself
			System.out.println(e);//way 2
			System.out.println(e.getMessage());//way 3
			
		}
		System.out.println("End of your code");
	}

}
