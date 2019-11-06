package com.class10;

public class TasksArray {

	public static void main(String[] args) {

		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[3]);

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[6]);

		// Task 2

		String[] names = new String[5];
		names[0] = "Al";
		names[1] = "Bal";
		names[2] = "Gal";
		names[3] = "Dal";
		names[4] = "Nal";

		System.out.println(names[3]);

		String[] name = { "Al", "Bal", "Gal", "Dal", "Nal" };

		System.out.println(name[4]);

		// Task 3

		String[] words = { "Java", "Saturday", "day", "coding", "is" };

		System.out.print(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2] + ". Yay!!");

		
//		char[] gradesa = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
//		
//		int a=2;
//		System.out.println(gradesa[a]);
		
		System.out.println("%%%%%%%%%%%%%");
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
		
		
	}

}
