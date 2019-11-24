package com.class25;

public class ConsructorOverloading {
	
	//fifferent amount of params 
	
	ConsructorOverloading(){
		System.out.println("I am non argument constructor");
	}
	
	ConsructorOverloading(String str){
		System.out.println("I am  constructor with 1 string param");
	}

	//different type of params
	
	ConsructorOverloading(int num){
		System.out.println("I am constructor with 1 int param");
	}
}
