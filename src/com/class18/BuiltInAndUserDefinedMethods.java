package com.class18;

import java.util.Scanner;

public class BuiltInAndUserDefinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="Hello";
	str=str.replace("Hello", "Hi");//built-in method
	System.out.println(str);
	
//	Scanner scan=new Scanner(System.in);
//	
//	scan.nextLine(); //built-in method
//	
	
	BuiltInAndUserDefinedMethods obj=new BuiltInAndUserDefinedMethods();
	
	obj.myMethod();
	
	

	}
	
	void myMethod() {
		System.out.println("This is a user defined method");
	}

}
