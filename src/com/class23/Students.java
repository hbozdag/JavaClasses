package com.class23;

public class Students {

	String student;

	int mathGrade, englishGrade, scienceGrade;

	Students(String name, int math, int english, int science) {

		student = name;
		mathGrade = math;
		englishGrade = english;
		scienceGrade = science;

	}

	public void calculateAverageGrade() {

		int average = (mathGrade + englishGrade + scienceGrade) / 3;

		System.out.println(student + " " + "has an avarage of " + average);

	}

	public static void main(String[] args) {

		Students obj = new Students("Ahmo", 45, 34, 67);

		obj.calculateAverageGrade();

		Students obj1 = new Students("Cako", 74, 92, 82);

		obj1.calculateAverageGrade();

		Students obj2 = new Students("Teri", 12, 63, 90);

		obj2.calculateAverageGrade();

		Students obj3 = new Students("laoh", 98, 89, 90);

		obj3.calculateAverageGrade();

		Students obj4 = new Students("heko", 90, 12, 11);

		obj4.calculateAverageGrade();
		
		Students obj5=new Students("haci", 45, 44, 12);
		obj5.calculateAverageGrade();
		
		Students obj6=new Students("kiro", 2, 4, 6);
		obj6.calculateAverageGrade();
	}

}
