package com.class13;



public class ReplaceMethodString {

	public static void main(String[] args) {
		// this method returns a new string replacing
		//all occurrences of old charachtes
		
		
		String str=" Hello Dear Dan, how are you Dan?";
		
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replace('y', 'c'));
		
		System.out.println(str.replace(" Dear", " Respected"));//we can do it with string too
		
		System.out.println(str.replaceFirst("Dan", "Ali"));// I only want to replace first occurrence
		
		// replaces all with new one
		
		
		System.out.println("======");
		String str3= "12-22-1990";
		
		System.out.println(str3.replace('-', '/'));
		System.out.println(str);
		
		
		System.out.println("===regular expression1====");
		
		String str1="823482930H73838E38348L949L9339O";
		
	
		
		//System.out.println(str.replaceAll(regex, replacement)
		
		//print only text not numbers
		
		System.out.println("======");
		System.out.println(str1.replaceAll("[0-9]", ""));//LEAVE ONLY TEXT
		System.out.println("%%%%%%");
		System.out.println(str1.replaceAll("[a-zA-Z]", ""));//LEAVE ONLY NUMBERS

		//remove everything except text and numbers
		String str2= "Hi9834830@#@#@#@#93493349How849";
		System.out.println("^^^^^^^^");
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));//keep only letters and numbers
		System.out.println("********");
		System.out.println(str2.replaceAll("\\w", ""));//remove all numbrs letters. if lowercase w keep leters and numbers
		
		
		System.out.println("===regular expression2====");
		
		
		String str4="today is java class day";
		
		System.out.println(str4.replace(" " , ""));
		System.out.println("*******");
		
		System.out.println(str4.replaceAll("\\s", ""));
		
		String hey="here is what i do everyday witrh my life";
		
		System.out.println(hey.replaceAll("do(.*)", ""));
		
		//.* means everything after this will be replaced
		
		
		
		
		
		
		
	}

}
