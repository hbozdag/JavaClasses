package com.class34;

import java.util.LinkedList;

class Sweets {
	String name;

	public Sweets(String name) {
		this.name = name;

	}

	public void iLove() {
		System.out.println("I love " + name);
	}
}

public class LinkedListDemo2 {

	public static void main(String[] args) {

		// create a list odf sweets objects

		LinkedList<Sweets> sweetList = new LinkedList();
		sweetList.add(new Sweets("chcolate"));
		sweetList.add(new Sweets("cake"));
		sweetList.add(new Sweets("cookies"));
		sweetList.add(new Sweets("macaroons"));

		// lets display name of each sweet object

		for (Sweets element : sweetList) {
			System.out.println(element.name);
			element.iLove();
		}

		
		//retrieve 1 element and accesssing method in 2 steps
		Sweets mySweet = sweetList.get(2);
		mySweet.iLove();
		
		//retrieve 1 element and accesssing method in 1 step
		
		sweetList.get(2).iLove();
		
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		String str="Hello 123";
		str.replace("123", "456").trim();
		
		Integer num=100;
		//100-->"100"-->"200"
		
		

	}

}
