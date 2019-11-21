package com.class22;

public class LocalVariables {

	public static void main(String[] args) {

		// I want to acces variable myName from different method

		LocalVariables obj = new LocalVariables();
		obj.sayName();

		System.out.println("--------------------");
//		System.out.println(myName); this variable is local variable so you cannot print it here

		String userEmail = obj.createEmail("John", "Smith", "yahoo");
		System.out.println(userEmail);
	}

	void sayName() {
		String myName = "John"; // local variable
		System.out.println(myName);
	}

	String createEmail(String name, String lastName, String email) {
		String userEmail = name + lastName + "@" + email + ".com";
		return userEmail;
	}
}
