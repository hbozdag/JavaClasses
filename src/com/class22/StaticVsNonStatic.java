package com.class22;

public class StaticVsNonStatic {

	// template for student (school. name grade)

	static String school = "Syntax";
	String name;
	char grade;

	//instance method nonstatic
	void getInfo() {

		System.out.println("My name is " + name + " and I am going to " 
		                  + school + " an my grade is " + grade);
	}
	
	//static method
	static void getInfo1() {

		System.out.println("I am attending classes at "
		                  + school );
		
		//we can't access nonstatic method within static methods. like I can't call "name" here.
	}

	public static void main(String[] args) {
		
		System.out.println(school);//you can call the static variable by its name
		getInfo1(); //or just use method name
		
		
	}
}
