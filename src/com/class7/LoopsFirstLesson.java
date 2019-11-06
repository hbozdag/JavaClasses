package com.class7;

public class LoopsFirstLesson {

	public static void main(String[] args) {
		int time=8;
		
		
		while (time<12) {
			System.out.println("good morning");
			//it will run forever unless you add increment value as shown here: time++
			time++;
		}
		
		int i=-1;
		
		while (i<=4) {
			System.out.println("good afternoon");
			i++;
		}
		System.out.println("outside of the loop");
	}

}
