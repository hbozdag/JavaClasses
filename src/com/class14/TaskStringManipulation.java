package com.class14;

public class TaskStringManipulation {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		
		String str= "It is a nice day.";
		System.out.println(str.replaceAll(" ", ""));
		
		
		System.out.println("============");
		
		
		
	
		/*Create a String that should be combination of letters, numbers and special characters.
		 *  Find out how many alpha characters are there in the String.
		 */
		
		String str1="83928ksjfsfjshfosnHKHKJHJ%$###$$#";
		
		String str2=str1.replaceAll("[^A-z]", "");
		 
				
				System.out.println(str1.replaceAll("[^A-z]", ""));
		
		System.out.println("The number of alpha characters in this string: "+ str2.length());
				
			
		
		
		
		/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		 * How would you find out how many sentences are in that String?
		 */
		
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String [] array=a.split("\\?"); 
		System.out.println(array.length);     
				
				
				


	}

}
