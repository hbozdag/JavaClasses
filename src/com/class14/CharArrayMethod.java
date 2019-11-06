package com.class14;

public class CharArrayMethod {

	public static void main(String[] args) {
		// This method converts this string to a new character array
		//non-rimitive data types: string, object, array
		
		
		String str="Syntax";
		
		char [] array=str.toCharArray();
		
		
		for (char i:array) {
			System.out.println(i);
			
			
		}
		char b= 'w';
		char c='a';
		System.out.println(b+c);// the result will be a number. we do not concatenate arrays
		
		
		

	}

}
