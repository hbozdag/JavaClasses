package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	public static void main(String[] args) {
		/*CRATE an array lsit of words.
		 * remove evry word that ends with "e". use iterator
		 */
		
		ArrayList<String> list=new ArrayList<>();
		list.add("cute");
		list.add("love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			if (it.next().endsWith("e")) {
				it.remove();
				
			}
		}
		System.out.println(list);		

	}

}
