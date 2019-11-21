package com.class22;

public class Husky {

	static String breed = "Husky";
	static int paws = 4;
	static int tail = 1;

	String name;
	String color;

	void display() {
		System.out.println("Puppy name is " + name + " and its breed is " + breed);
	}

	public static void main(String[] args) {

		Husky puppy1 = new Husky();
		Husky puppy2 = new Husky();
		Husky puppy3 = new Husky();

		puppy1.name = "Meatball";
		puppy1.color = "Brown";
		puppy1.display();

		puppy2.name = "Sharik";
		puppy2.color = "Black";
		puppy2.display();

		
		puppy3.name = "jack";
		puppy3.color = "yellow";
		breed="bulldog";//change is here
		puppy3.display();
		puppy2.display();
		puppy1.display(); //all the values are changed from husky to bulldog
	}

}
