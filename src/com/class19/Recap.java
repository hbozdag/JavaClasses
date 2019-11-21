package com.class19;

public class Recap {

	void sum(int num1, int num2) {
		int c = num1 + num2;
		System.out.println("The sum of 2 number is =" + c);

	}
	// i want to say hello many times

	void sayHello(int times) {

		for (int i = 0; i < times; i++) {
			System.out.println("hello");
		}
	}

	// say something manytimes
	void saySomething(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
	
	//void saySomething compiler will give me error if i WRITE THE SAME METJHOD

	public static void main(String[] args) {

		Recap obj = new Recap();
		obj.sum(6, 65);
		obj.saySomething("Hi", 3);
		obj.sayHello(2);

	}

}
