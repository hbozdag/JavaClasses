package com.class20;

public class Task {
	
/*1.	
 * Create a method that will take 1 parameter as a String and return reversed String.
Method should be visibly only within same package.*/
	
	
	String name;
	
	void word (String name) {
		
		String reversed="";
		
		for (int i=name.length()-1; i>=0;i--) {
			
			reversed= reversed+name.charAt(i);
			
			
			
		}
		System.out.println(reversed);
	}
	
	
	
/*2.			Create a method that will take a String and return whether String is palindrome or not.
 *  Method should be available to all classes within your projects.
 */
	
	
	public void palindrome (String word) {
	String original="kayak";
	
	String reversed="";
	
	for ( int i=original.length()-1; i>=0; i--) {
		reversed=reversed+original.charAt(i);
	}
	System.out.println(reversed);
	
	if (original.equals(reversed)){
		System.out.println("string is palindrome");
	}else {
		System.out.println("string is not a palindrome");
	}
	
	}
	
	
	
	
	
/*3.
 * 			Create a method that will take a string and return an array of words from that string.
 *  Method should be available only within same class.
 */

}
