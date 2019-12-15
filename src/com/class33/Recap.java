package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		// let's create an array list to store numbers

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);

		int size = numbers.size();
		System.out.println(size);

		// add more
		numbers.add(10000);

		System.out.println("&&&&&&&&&&&");
		// remove
		numbers.remove(size - 1);
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println(size - 1);
		System.out.println(size);

		// retrive value from an array list
		int element = numbers.get(0);
		System.out.println(element);

		// 1. for loop

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// 2. advanced loop

		for (int num : numbers) {
			System.out.println(num);
		}

		// I want to get values backward
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}

		// 3. using iterator
		System.out.println("**********");

		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {

			int number=iterator.next(); //autounboxing
			System.out.println(iterator.next());
		}
	}

}
