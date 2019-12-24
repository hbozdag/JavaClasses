package com.class38;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//create a method that will check if user is older than 18
	//if it is not then we want to show an exception 
	
	public static void checkAge(int age) {
		if (age>18) {
			System.out.println("ypou can get the driver license");
		}else {
			//let's throw an exception. two steps.1-create the object and  throw
			
			throw new RuntimeException("You musty be older than 18");
			
			
		}
	}
}
