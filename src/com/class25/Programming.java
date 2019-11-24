package com.class25;

public class Programming {
	
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming (String language){
		System.out.println("I love "+language);
	}
	
	private static void form(int num) {
		System.out.println(num);
	}
	
	private static void form(int num, int num1) {
		System.out.println(num+num1);
	}
	
	private static void form(String str, int num) {
		System.out.println(str+" " +num);
	}
	
	public static void main(String[] args) {
		
		Programming obj=new Programming(" java");
		
		obj.form(6);
		obj.form(5, 4);
		obj.form("avoid", 7);
		
		
		
	}

}
