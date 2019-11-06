package com.class12;

public class StringManipulationAndStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		
		if (a ==20) {
			
			System.out.println("number is "+a);
		}else {
			System.err.println("Number is not 20 but it is "+a);
		}
		
		
		
	System.out.println("%%%%%%%%%%%%%");
		
		/*
		 * .contains();
		 */
		
		String sentence= "It was raining";
		
		System.out.println(sentence.contains("w"));
		
		System.out.println("%%%%%%%%%%%%%");
		
		
		//create two strings and initialize them with some value.
		//implement the following methods on those strings
		
		
//		sen.length();
//		sen.equals();
//		sen.contains("s");
//		sen.toUpperCase();
//		sen.toLowerCase();
//		sen.equalsIgnoreCase(anotherString);
		//sen.startsWith("it")
		
	
		String name="aLi";
		String name1="joni";
		
		System.out.println(name.length());
		System.out.println(name1.equals(name));
		System.out.println(name.contains("i"));
		System.out.println(name1.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.equalsIgnoreCase(name1));
		
		
		System.out.println("+++++++++");
		
		/*
		 * this method tests if this string ends with 
		 * the specifed prefix beginning

		 */
		
		
		String str2="let's finish this class";
		System.out.println("Is this string starts with = "+ str2.startsWith("it"));
		System.out.println();
		
		/*
		 * this method tests if this string ends with 
		 * the specifed suffix
		 */
		
		
		System.out.println("Does this string end with = "+ str2.endsWith("class"));
		
		System.out.println("$$$$$$$$$$$$");
		/*this method checks whether a string is empty or not. 
		 * this method returns true if the given string is empty.
		 * else it returns false
		 */
		
		String str3="";
		System.out.println("Is this string empty ="+ str3.isEmpty());
		String str4="Hello";
		System.out.println("Is this string empty ="+ str4.isEmpty());
		
		if (!str3.isEmpty()) {
			System.out.println("this is not empty");
		}else {
			System.err.println("this is empty string");
		}
		
		
		System.out.println("@@@@@@@@@");
		
		/*
		 * this method appends one string to the end of another
		 * this method returns a string with the value of the string 
		 * passed in to the method appended to the end 
		 * of the string used to invoke this method
		 */
		
		String str5="Hello ";
		String str6="World";
		String str7=" Hi";
		
		System.out.println(str5+" "+str6);
		System.out.println(str5.concat(" "+str6+" "+str7));
		System.out.println(str5.concat(str6).concat(str7));
		System.out.println("@@@@@@@@@");
		
		
		/*
		 * this method returns a copy odf the string 
		 * with leading and trailing whitespace omitted
		 */
		
		String str8=" how are you?";
		
		System.out.println(str8.trim());
		
		/*
		 * this method returns the character located at the string's specified index.
		 * the srting indexes start form zero
		 */
		
		String str9= "we should be done early today";
		System.out.println(str9.charAt(13));
		
		/*
		 * this method returns the index within this string of the 
		 * first occurrence of the specified character or -1
		 * if the character does not ocur
		 * 
		 */
		
		System.out.println(str9.indexOf('s'));
		//System.out.println(str9.indexOf('s'), 4);
	
		System.out.println("######");
		
		/*
		 * chedck class 12 files for the rest of the string methods
		 */
		
	}

}
