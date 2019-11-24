package com.class24;

public class Constructor {

	void Constructor() {
		System.out.println("Hello");
	}

	Constructor() {
		System.out.println("I am constructor");
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.Constructor();

		/*
		 * constructyor vs method consttr do not have return type. method can have
		 * return type const must have the same class name. method can have any name
		 * const. cannot use any non access modifiers. while method can be static,
		 * final, abstract cosnt call happens automatically when obj/instance of class
		 * gets created. method must be called const initializes the obj while method
		 * performs some specific functionalities. method describes behavior of the
		 * object.
		 * 
		 */

		// similarities
		/*
		 * both can have parameters or do not have params.
		 * can use access modifiers
		 */

	}

}
