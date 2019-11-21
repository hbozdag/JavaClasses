package com.class21;

public class Main {
	
	//this is how you can write a method to write substring of a word multiple times
	
	public static String str;

	String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String str;
		str = word.substring(startIndex, endIndex);
		for (int i = 0; i < 2; i++) {
			System.out.print(str);
		}

		return str;
	}

	public static void main(String[] args) {
		Main obj = new Main();

		Main.str = obj.makeThreeSubstr("hello", 0, 2);
		 System.out.println(Main.str);

		Main obj1 = new Main();
		Main.str = obj1.makeThreeSubstr("shenanigans", 3, 7);

		 System.out.println(Main.str);
	}

}
