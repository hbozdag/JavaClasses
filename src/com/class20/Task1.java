package com.class20;

public class Task1 {

	
	
	public static void main(String[] args) {
		

		Task1 task=new Task1();
		
		String result=task.reverseString("Syntax");
		
		System.out.println(result);

	}
	
	/*1.	
	 * Create a method that will take 1 parameter as a String and return reversed String.
	Method should be visibly only within same package.*/
	
	
	String reverseString(String param) {
		
		String result="";
		
		char [] charArray=param.toCharArray();
		
		for (int i=charArray.length-1; i>=0; i--) {
			result+=charArray[i];
		}
		return "reversed string";
	}
	
	
	/*2.			Create a method that will take a String and return whether String is palindrome or not.
	 *  Method should be available to all classes within your projects.
	 */
	
	public boolean isPalindrome (String param) {
		
		boolean result =false;
		
		String reverse=reverseString(param);
		
		if (param.equalsIgnoreCase(reverse)) {
			result=true;
		}else {
			result=false;
		}
		
		return true;
	}
	
	
	
	
	
	

}
