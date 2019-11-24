package com.class24;

public class Student {
	
	//homework
	
	String name, address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
		
		
	}
	
	public void displayInfo() {
		System.out.println(this.name+" "+this.address);
	}
	
	
	public static void main(String[] args) {
		
		Student obj=new Student("john", "23 Paddock");
		obj.displayInfo();
		
		
		
	}

}
