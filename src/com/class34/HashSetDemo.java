package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// let's create a collection of veggies 
		//where i donot want to have duplicate 
		//hset order of the elements is not preserved
		
		HashSet<String> hset=new HashSet<>();
		//storing values into hashset
		
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("lettuce");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//theuy do not have any methods to retrieve elements from the collection 
		//.get(); .set();
		
		//how can we retrive all the eleemnts?
		//iterator
		
		Iterator<String> it =hset.iterator();
		while (it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		
		
        //enhanced for loop
		
		for (String el:hset) {
			System.out.println(el);
		}
	}

}


