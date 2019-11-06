package com.class12;



public class StringManipulationDemo {
	public static void main(String[] args) {
		
		//There are two ways to create string objects
		
		
		//1
		
		//String literal
		
		String name="Haci";
		
		System.out.println(name);
		//2
		//Creating string with new key word
		
		String name1=new String ("John1");
		
		System.out.println(name1.length());
		
		//String str=new String ();
		
		/*this method returns the length of this string
		 * the length is equal to the number
		 * of 16-bit unicode charcters in the string
		 * 
		 */
		int name1Len=name1.length();
		
		System.out.println("the length of name1 is = "+ name1Len);
		
		
		String str1=" Hello World";
		
		
		System.out.println("Before:: "+str1);
		
		str1=str1.toLowerCase();
		System.out.println("After:: "+str1);
		
		System.out.println("&&&&&&&&");
		
		//.equals()
		String str2="HElLo WoRld";
		
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		//this one does not care for capitilization. it compares the content only
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		/*
		 * to upper case
		 * this method converts all of the charcteedrs in this string to upprcase
		 * 
		 */
		
		String str3="Hoca";
		
		System.out.println("Before :: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After :: "+str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
