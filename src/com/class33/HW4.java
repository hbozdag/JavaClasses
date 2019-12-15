package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW4 {

	public static void main(String[] args) {
		/*
		 * CREATE an array list of even numbers from 1 to 50. using iterator remove any
		 * number that is divisible by 5 from that arrraylist.
		 * 
		 */

		List<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			if (it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
