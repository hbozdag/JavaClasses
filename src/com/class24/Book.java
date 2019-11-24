package com.class24;

public class Book {
	
	Book(){
		System.out.println("i am non argument constructor");
	}
	
	Book(String name, String time){
		System.out.println("My name is "+name+" and I am "+time);
	}

	
	public static void main(String[] args) {
		Book obj=new Book();
		Book obj1=new Book("Ahmo", "Morning");
		
	}
}
