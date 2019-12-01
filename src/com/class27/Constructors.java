package com.class27;

public class Constructors {
	
	Constructors(){
		this(1);//this will make line 12 run
		
		System.out.println("Hi");
	}
	
	Constructors(int x){
		this(1,2);//this will make line 17 run first
		System.out.println("hello");
	}
	
	Constructors(int x, int y){
		System.out.println("how are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructors obj=new Constructors();

	}

}
