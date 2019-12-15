package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("se");
		stringList.add("haic");
		stringList.add("usas");
		stringList.add("metihks");
		stringList.add("muradi");
		stringList.add("korallie");

		

		// remove names that are shorter than 4 characters

		stringList.remove(2);
		System.out.println(stringList);

		for (int i = 0; i < stringList.size(); i++) {
			if (stringList.get(i).length() <= 4) {
				stringList.remove(i);
			}
		}

		System.out.println(stringList);

		// best way to remove an element from the collection is using iterator

		List<String> stringList1 = new ArrayList<>();
		stringList1.add("Esra");
		stringList1.add("Hasan");
		stringList1.add("se");
		stringList1.add("haic");
		stringList1.add("usas");
		stringList1.add("metihks");
		stringList1.add("muradi");
		stringList1.add("korallie");

		Iterator<String> it = stringList1.iterator();
		while(it.hasNext()) {
			if (it.next().length()<=4) {
				it.remove();
			}
		}
	System.out.println(stringList1);
	}

}
