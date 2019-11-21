package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		/* 
		 * declare a string 
		 * if string has more than 10 charactwrs -->string is large
		 * otherwiuse stirng is small
		 *
		 */
		
		String str="Welcome home";
		int numOfChars=str.length();
		
		if (numOfChars>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		
		char character=str.charAt(4);
		System.out.println(character);
		
		//create an object of the class where method is defined 
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		
	int sum=obj.sum(50, 50);
	System.out.println(sum);
	int large=obj.findLargest(20, 40);
		System.out.println(large);
		
	}
	
	//return tyope, methdfo name( list of parameters)
	
	int sum (int num1, int num2) {
		
		int c =num1+num2;
		return c;
	}

	
	//fidn the largest
	
	int findLargest (int num1, int num2) {
		
		int largest;
		
		if (num1>num2) {
			largest=num1;
			
		}else {
			largest=num2;
			
		}
		return largest;
	}
}
