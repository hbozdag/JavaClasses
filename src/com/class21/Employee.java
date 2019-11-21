package com.class21;

public class Employee {

//	CreateaClasscalledEmployee:
//		● Create three variables eID , salary
//		and set the CEO to “Sumair”
//		● Create two objects of the class
//		Employee
//		● Set the value of eID, salary for each of
//		the objects
//		● Print out the eID , salary and CEO for
//		each of the objects

	public int eID, salary;
	public static String CEO = "Sumair";

	public void employeeInfo() {
		System.out.println(
				" Emplooye's ID number is " + eID + " and his/her salary is " + salary + " and CEO is " + CEO);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();

		obj.eID = 2345;
		obj.salary = 24000;

		Employee obj1 = new Employee();

		obj1.eID = 74849;
		obj1.salary = 78000;

		obj.employeeInfo();
		obj1.employeeInfo();

	}

}
