package com.class21;

public class Student {

	// varibale types

	/*
	 * varibales that are created inside the method will disappear outside the block
	 * 
	 */

	public String studentName;
	public double GPA;
	public static String school; 
	
	public void displayInfo() {
		
		System.out.println(studentName+ " attending "+school+" has a GPA of "+GPA);
	}
	
	protected void study (int hours ) {
		int localVariable=4;
		System.out.println(studentName+" is studying for "+ hours + " hours");
	}

}
