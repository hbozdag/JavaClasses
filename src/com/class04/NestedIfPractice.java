package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		
		boolean isFriday=true;
		
		int day=13;
		
		//if today is friday. if the day is the 13th
		
		if (isFriday) {
			System.out.println("today is Friday");
			if (day==13) {
				System.out.println("I will watch a horror movie");
			}
		}else {
			System.out.println("i am good");
		}

	}

}
