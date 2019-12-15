package com.class35;

import java.util.*;

public class RetrieveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("address", "123 test");
		personMap.put("city", "dallas");
		personMap.put("state", "TX");

		System.out.println(personMap);

		// how to retrieve a specific value

		String value = personMap.get("State");
		System.out.println(value);

		// how to retrieve all keys and all values

		System.out.println("===printing all keys======");
		Set<String> keys = personMap.keySet();// all the keys

		for (String key : keys) {
			System.out.println(key + " " + personMap.get(key));
		}

		System.out.println("________");
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}

		System.out.println("===printing all values======");

		Collection<String> values = personMap.values();

		for (String val : values) {
			System.out.println(val);
		}

		Iterator<String> valuesOfIterator = values.iterator();
		while (valuesOfIterator.hasNext()) {
			System.out.println(valuesOfIterator.next());
		}

		// how can i RETRIVE and print values key:value using iterator

		Iterator<String> keysIterator1 = keys.iterator();
		while (keysIterator1.hasNext()) {
		//	System.out.println(keysIterator1.next() + personMap.get(keysIterator1.next()));
			String mapKey=keysIterator.next();
			String mapValue=personMap.get(mapKey);
			
			System.out.println(mapKey+ " "+mapValue);
		}

	}

}
