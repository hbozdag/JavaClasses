package com.class25;

public class CanWeOverload {
	
	//can we overload a private memthod?-->Yes
	
	private void methodOne() {
		System.out.println("i am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("i am method one with "+str);
	}
	
	//can we overload a main method? -->yes
	
	
	
	public static void main(String str) {
		System.out.println("I am a main method "+ str +" arg");
		
	}
	
	public static void main(String str, String [] arg) {
		System.out.println("I am a main methodmwith 2 parameters");
	}
	
	public static void main(String[] args) {
		System.out.println("I am a main method");
		
		main("String");
		
		String [] array= {"A", "B"};
		main ("Hello", array);
	}

}
