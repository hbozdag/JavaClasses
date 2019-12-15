package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Countries {

	public static void main(String[] args) {
		

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		// for loop
		Set<String> keys = capitalCities.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + capitalCities.get(key));
		}
		System.out.println("------------------");
		// Iterator
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("----Printing all values--------------");
		Collection<String> values = capitalCities.values();
		// for loop
		for (String val : values) {
			System.out.println(val);
			// Iterator
			Iterator<String> valuesIterator = values.iterator();
			while (valuesIterator.hasNext()) {
				System.out.println(valuesIterator.next());
			}
		}
	}
}