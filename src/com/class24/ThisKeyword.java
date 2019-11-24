package com.class24;


//this.variableName refers to the instance variables

public class ThisKeyword {

	int a, b;

	public ThisKeyword(int a, int b) {

		this.a = a;
		this.b = b;

	}
	
	public ThisKeyword() {
		System.out.println("i am non-arg constructor");
	}

	public void sum(int a, int b) {
		System.out.println("the sum of local parameters " + (a + b));
		System.out.println("the sum of instance variables is " + (this.a + this.b));
	}
	
	public void sayA() {
		System.out.println(a);
	}
	
	public void sayB() {
		System.out.println(b);
	}
	
	public void sayAandB() {
		
		//inside a method body i can call another method
		this.sayA();
		sayB();//compiler adds this automaticvally-->this.sayB();
	
	}

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(5,10) ;
			obj.sum(10, 20);
			
			ThisKeyword obj1=new ThisKeyword() ;
			obj1.sum(100, 200);	
		
			obj.sayA();
			obj.sayB();
	}

}
