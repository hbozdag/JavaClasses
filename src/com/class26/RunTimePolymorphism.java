package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		//creating an object for parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("%%%%%%%");
		
		//creating an object for parent class
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();

		System.out.println("%%%%%%%");
		
        //widening
		double d = 90;

		// narrowing
		int i = (int) 1.99;
		
		
		//non-primitive typecasting
		//widening -->creating an object of the class and
		//giving reference to the parent class
		Animal obj=new Cat();//assign the child class to parent class
		
		//Cat obj2= new Animal();-->cannot convert from animal to cat. 
		//evry cat is an animal, every animal is not a cat.

		obj.eat();
		obj.sleep();
		//obj.meow();-->method won't be availabe. it will only provide data that
		//is available in the parent clas
	}

}
