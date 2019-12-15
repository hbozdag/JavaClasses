package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void display() {
		System.out.println("My name is "+name+" my students id is "+studentId);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		// create an arrayLIST taht will store student type of objects
		
		List<Student> students=new ArrayList<>();
		
		Student stu= new Student("John", 101);
		Student stu1= new Student("Jnae", 102);
		Student stu2= new Student("Jill", 103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//dispaly info of each statement
		
		stu.display();
		stu1.display();
		stu2.display();
		
		//for each
		
		for (Student student:students) {
			student.display();
		}
		
		//ADDING MORE OBJECT OF A STUDENT TYPE
		students.add(new Student ("Michael", 104));
		students.add(new Student ("David", 105));
		students.add(new Student ("jONI", 106));
		
		//display info of each student
		
		Iterator<Student> myIterator=students.iterator();
		while(myIterator.hasNext()) {
			myIterator.next().display();
		}
		
	}

}
