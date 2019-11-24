package com.class24;

public class Task {

	public String word="ahmo";
	
	public Task() {
		System.out.println("I am public constructor");
	}
	
	Task(String str){
		System.out.println("I am default constructor");
	}
	
	private Task(int num, int num2) {
		
		System.out.println("I am private constructor");
	}
	
	
	  protected Task(String cay, int t) {
		  System.out.println("I am private constructor");
	}

	public static void main(String[] args) {
		
	}
}
