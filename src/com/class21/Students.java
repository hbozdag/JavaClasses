package com.class21;

public class Students {
	
	
//	Create a Class called Students
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students

	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	

	
	
	public static void main (String []args) {
		
		Students s1=new Students();
		
		s1.studentName="Ali";
		s1.studentID=222;
		Students.numberOfStudents++;
		
Students s2=new Students();
		
		s1.studentName="Seval";
		s1.studentID=2452;
		Students.numberOfStudents++;
		
		System.out.println("the total number of students  "+Students.numberOfStudents++);
		
		
		
	}
}
