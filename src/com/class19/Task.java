package com.class19;

public class Task {

	public static void main(String[] args) {

		Task email = new Task();

		String emailAddress = email.createEmail("john", "doe", "gmail.com");
		System.out.println(emailAddress);

		Task obj = new Task();

		
	}

	String createEmail(String userName, String lastName, String emailType) {

		String result = userName + lastName + "@" + emailType;

		return result;

	}
	
	
	

//	void isPrime(int num) {
//		boolean isPrime = true;
//
//		if (num <= 1) {
//			isPrime = false;
//			System.out.println(num+" is not a prime number");
//
//		} else {
//
//			for (int i = 2; i < num; i++) {
//				if (num % i == 0) {
//					isPrime = true;
//					break;
//					
//				}
//				System.out.println(num+" is a prime number");
//			}
			

		

	}


