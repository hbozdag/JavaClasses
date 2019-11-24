package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non-argument constructor.");
	}
	
	ThisWithConstructor(String str){
		this();//used to call current class constructor
		System.out.println("I am cosntrucvtor with 1 string parameter");
	}
	
	ThisWithConstructor(String str, String str1){
		this(str);//it will look first constructor with string and ignor other one
		System.out.println("I am cosntrucvtor with 2 params");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("hELLO");
		System.out.println("%%%%%%%%%%%%%%");
		
		
		//Can we exceiute two constriuctirs at the same time. yes.
		//we can do it with this() keyword
		//this type of constructor call is known as Constructor Chaining
		ThisWithConstructor obj1=new ThisWithConstructor("hELLO", "Bye");
		
		
		
		
		
		
		
		
		
	}

}
