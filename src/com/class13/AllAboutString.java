package com.class13;

public class AllAboutString {

	public static void main(String[] args) {
		// most string manipulation methdos are on com.class12

		String str1 = "Hello"; // this is string literal

		String str2 = new String("Hello");// this is another way

		// string is immutable. that means it cannot be changed.
		// unchanging over time or unable to be changed.

		// for exaMPLE

		String str4 = str1.concat("World");
		// str1 does not change

		System.out.println(str4);

		System.out.println("%%%%%%%%");

		String city = "Fairfax";
		String city1 = "Fairfax";

		// both will have the same id number

		System.out.println(city);
		System.out.println(city1);
		System.out.println(city.isEmpty());
		System.out.println(city.length());

		int[] a = { 12, 33, 44, 55, 45 };
		System.out.println(a.length);

		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println("%%%%%%%%");

		String str5 = "Hello";

		String str6 = "Hello";

		System.out.println(str1.equals(str6));// true

		String str7 = new String("Hello");

		String str8 = new String("Hello");

		System.out.println(str7.equals(str8));

		// what is the difference bewtwen == and .equals?
		// == sign compares objects. if it is called new, it considers as new.
		// String str7= new String ("Hello"); id # 30

		// String str8= new String ("Hello"); id #31

		System.out.println(str7.equalsIgnoreCase(str8));
		// why do we need to use .equalsIgnoreCase?
		// we are trying to compare two strings and see if they have exacty the same
		// content.
		// sometimes we will work larger text and we will not be able to compare them.

		System.out.println(str8.contains("zz"));

		System.out.println("==starts with and ends with ===");

		System.out.println(str5.startsWith("h"));
		System.out.println(str5.startsWith("H"));

		System.out.println(str5.endsWith("t"));
		System.out.println("==concat ===");

		System.out.println(str7.concat(" today is saturday and we have java class"));
		
		System.out.println("==trim ===");
		String str9 = "      It is sunny!     ";

		System.out.println(" before trimming" + str9);
		System.out.println("After trimming: " + str9.trim());
		
		System.out.println("==char ===");

		String str10 = "Tomorrow we will be done with String Manipulation";
		System.out.println(str10.indexOf('e'));
		System.out.println(str10.indexOf('e', 11));
		System.out.println(str10.indexOf("we"));
		
		
		//whenever character is not there it will print -1
		//for example
		System.out.println(str10.indexOf('E'));
		
		//how to find what character we at certain index
		
	
		
		System.out.println(str10.charAt(10));
		
	
		
	

	}

}
