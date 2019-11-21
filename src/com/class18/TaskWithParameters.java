package com.class18;

public class TaskWithParameters {

	public static void main(String[] args) {
//		Create a method that will take 2 parameters as a numbers and prints which number is larger.
//
//
//		Create a method that will take a number and prints whether the number is even or odd.
//
//
//		Create a method that will print whether given String is palindrome or not.
		
		
	
		
		TaskWithParameters obj=new TaskWithParameters();
		
		obj.isLarger(12, 45);
		obj.isEvenOrOdd(347);
		obj.isPalindrome("kayak");
	}
	
	
	void isLarger(int a, int b) {
		
		
		
		if (a>b) {
		System.out.println(a + " is bigger than "+b);
		
		}else {
			System.out.println(b + " is bigger than "+a);
			
		}
		
	}
	void isEvenOrOdd (int a) {
		
		if (a%2==0) {
			System.out.println(a+" is an even number");
		}else {
			System.out.println(a+" is an odd number");
		}
	}
	
	void isPalindrome (String word) {
		
		
		
		String word1="";
		
		for (int i=word.length()-1; i>=0; i--) {
		word1=word1+word.charAt(i);  
		}
		
		if (word1.equals(word)) {
			System.out.println(word+" is a palindrome");
		}else {
			System.out.println(word+" is not a palindrome");
		}
		
		
		
		
		
	}
	
	

}
