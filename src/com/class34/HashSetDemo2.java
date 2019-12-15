package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// create a collection that will store Sweets type of object
		//and I do not care about the order as long as I do not have dulicate objects
		
		Set<Sweets> sweetSet=new HashSet<>();
		Sweets sweet=new Sweets("cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets ("Cookies"));
		sweetSet.add(new Sweets ("iCE CREAM"));
		sweetSet.add(new Sweets ("Baklava"));
		sweetSet.add(new Sweets ("Tatli"));
		sweetSet.add(new Sweets ("chocaloate"));
		sweetSet.add(sweet);

		System.out.println(sweetSet.size());//6
		
		//how do we print name of each element
		
		for (Sweets element:sweetSet) {
			System.out.println(element.name);
		}

		System.out.println("&&&__2nd way__&&&&");
		
		Iterator<Sweets> it=sweetSet.iterator();
		
		while(it.hasNext()) {
			Sweets element= it.next();
			System.out.println(element.name);
		}
		

	}

}
