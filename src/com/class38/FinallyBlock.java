package com.class38;

public class FinallyBlock {

	public static void main(String[] args) {

		String str = "Hello";
		
		try {
			//char c=str.charAt(0);
			char c=str.charAt(5);//new StringIndexOutOfBoundsException();
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("I am a finally block");
		}
		System.out.println("end of code");

	}

}
