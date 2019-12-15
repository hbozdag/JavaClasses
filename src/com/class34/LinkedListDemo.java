package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2, "how are you");
		System.out.println(llist);
		
		//replace 1 element
		
		llist.set(1, "goodbye");
		System.out.println(llist);

		//retrieve 1 element
		
		String element=llist.get(2);
		System.out.println(element);
		
		//retrive all elements
		System.out.println("___1st Way_______");
		
		for (int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		
		System.out.println("___2nd Way_______");
		
		for (String el:llist) {
			System.out.println(el);
		}
		
		System.out.println("___3rd Way_______");
		
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
	}

}
