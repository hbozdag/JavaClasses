package com.class19;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();
		char letterGrade=obj.getGrade(85);
System.out.println(letterGrade);
	}

	char getGrade(int grade) {
		char letterGrade;

		switch (grade) {

		case 90:
			letterGrade = 'A';
			break;
		case 80:
			letterGrade = 'B';
			break;
		case 70:
			letterGrade = 'C';
			break;
		case 50:
			letterGrade = 'D';
			break;
		default:
			letterGrade = 'F';

		}
		return letterGrade;
	}
}
