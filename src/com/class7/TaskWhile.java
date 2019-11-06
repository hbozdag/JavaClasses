package com.class7;

public class TaskWhile {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true crate int variable day and
		 * assign it to 1 as long as it is workDay print " i need a day off" and
		 * increase the vlaue once day is 6 print " i dont need a day off anymore"
		 */

		boolean workDay = true;

		int day = 1;

		while (day < 6) {

			System.out.println(" I need a day off");
			day++;
		}
		if (day == 6) {
			System.out.println("I do not need a day off anymore");
		}

		// here is the way teacher does it
//		
//		boolean workDay=true;
//		
//		int day=1;
//		
//		while (workDay) {
//			if (day==6 &&day==7) {
//				workDay=false;
//				System.out.println(" I do not need a day off anymore");
//			}else {
//				System.out.println("I need a day off");
//			}
//			
//			day++;
//		}
//	

	}

}
