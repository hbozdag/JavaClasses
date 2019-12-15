package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorsList {

	public static void main(String[] args) {
		// create a list that will hold 5 instrctor type of object
		
		List<Instructor> ilist=new ArrayList<>();
		ilist.add(new Instructor("johnny", "banni"));
		ilist.add(new Instructor("weqwas", "haq"));
		ilist.add(new Instructor("diego", "juarez"));
		ilist.add(new Instructor("dempi", "toli"));
		ilist.add(new Instructor("jompoi", "gorjs"));
		
		for(Instructor i:ilist) {
			//i will be holding obejcts
			System.out.println(i.lastName);
		}

	}

}
