package com.class22;

public class AccessModifiers {

	public static void hello () {//from everywhere
		System.out.println("hello");

	}
	protected static void hello1 () {//from same package 
		System.out.println("hello1");

	}
	 static void hello2 () {//from same package
		System.out.println("hello2");

	}
	private static void hello3 () {//from same class
		System.out.println("hello3");

	}

}
