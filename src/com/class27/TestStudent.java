package com.class27;

public class TestStudent {
	
public static void main(String[] args) {
		
		Student stCollege=new CollegeStudent();
		stCollege.studyHours();
		
		Student stSyntax=new SyntaxStudent();
		stSyntax.studyHours();
		
		Student stSchool=new SchoolStudent();
		stSchool.studyHours();
		
		System.out.println("%%%%%%%%");
		
		Student [] std= {new CollegeStudent(), new SyntaxStudent(),new SchoolStudent()};
		
		for (Student allStd:std) {
			allStd.studyHours();
		}
		
		
		
	}

}
