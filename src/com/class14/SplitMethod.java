package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// This method splits around matches of the given regualr expression
		
		
		
		String str="Sophie Amundsen &*%$ is fourteen years old. when the book begins, "
				+ "living in Norway. She begins, a strange correspondence course "
				+ "in philosophy 5";
		
		String []array =str.split(" ");
		
		for ( int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("========");
		//how can we find how many sentences are in the following string
		
		String str1="today is sunny. i AM HAPPY. HOW ARE YOU? I AM GOOD.";
		
		
		String [] array2=str1.split("\\." );  
		
		System.out.println(" the number of sentences in the given string is : "+array2.length);
		
		for( String string :array2) {
			System.out.println(string.trim());
		}
		
		System.out.println("%%%%%%%%");
		
		//how many seperate comma delimited string 
		
		
		
	String [] array3=str.split(",");
	
	for (int i=0; i<array3.length; i++) {
		System.out.println(array3[i]);
	}
	
		System.out.println("&&&&&&&&&&");
		
		
		String str4="Welcome to Syntax Technologies";
		
		String [] array4= str4.split(" ", 2);//i want to split it in two pieces
		
		System.out.println(array4.length);
		
		for (int i=0; i<array4.length; i++) {
			
			System.out.println(array4[i]);
		}
		
		
		
		
		
	}

}
