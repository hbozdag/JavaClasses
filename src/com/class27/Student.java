package com.class27;

public class Student {
	

	
	public void studyHours() {
		System.out.println("Student studies 2 hours a day");
	}

}

class SyntaxStudent extends Student{
	
	@Override
	public void studyHours() {
		System.out.println("Syntax student studies 6 hours a day");
	}
	
	
	
	public void goalSetting() {
		System.out.println("student tries to earn all A's in the class to get the reward.");
	}

}

class CollegeStudent extends Student{
	public void studyHours() {
		System.out.println(" College student studies 3 hours a day");
	}
	
	private void status() {
		System.out.println("student has 2 years left in college");
	}

	
}

class SchoolStudent extends Student{
	public void studyHours() {
		System.out.println("School student studies 1 hour a day");
	}
	
	public void transcript() {
		System.out.println("student gets prepared to send transcipt to colleges in September");
	}
	
	

}
