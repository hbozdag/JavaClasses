package com.class38;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
System.out.println("beginnig");
		
		callingExceptionMethod();
		
		System.out.println("end");

	}

	public static void throwingException() {
		System.out.println("creating exception");
		ArithmeticException ae= new ArithmeticException();
		throw(ae);
	}
	
	public static void callingExceptionMethod() {
		try {
			throwingException();
		}catch(ArithmeticException e){
			System.out.println("Arithmetic E got caught");
			
		}
		
	}
}
