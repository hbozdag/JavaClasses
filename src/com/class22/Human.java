package com.class22;

public class Human {

	String name;
	String lastName;

	static int eyes = 2;
	static int nose = 1;
	static boolean brain = true;

// static variable is created in the class but outseice 
	public static void main(String[] args) {
		// instance variables

		Human human1 = new Human();

		human1.name = "John";

		human1.lastName = "Smith";
		System.out.println("Printing static variables");
		System.out.println(Human.eyes);//most correct way
		System.out.println(human1.eyes);//possible way
		System.out.println(brain);//it can be accessed w/o class name
		System.out.println(nose);
		System.out.println("------------------");

		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Doe";

	}

}
