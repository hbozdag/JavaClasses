package com.class37;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=0;
		 System.out.println(a/b);

		 System.out.println("code after an exception");
		 
		 //you have to handle the exception
		 System.out.println("code continues");
		 
		 int [] array= {10,20,30};
		 System.out.println(array[3]);
		 
		 ArithmeticException exception=new ArithmeticException();
		 throw(exception);
	}

}
