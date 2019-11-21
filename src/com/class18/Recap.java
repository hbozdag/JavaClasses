package com.class18;

public class Recap {
	
	int students, teachers, classRooms;
	String name, address, website;
	
	void study() {
		System.out.println("Students study at "+name);
	}
	void teach() {
		System.out.println("Teachers teach at "+name);
	}
	
	public static void main (String [] args) {
		
		Recap school= new Recap();
		
		school.name="Syntax";
		school.students=200;
		
		Recap school1=new Recap();
		
		school1.name="Pinnecle";
		school1.students=345;
		
		
		school.study();
		school1.teach();
	}

}
