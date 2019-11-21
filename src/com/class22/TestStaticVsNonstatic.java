package com.class22;

public class TestStaticVsNonstatic {
	
	public static void main(String[] args) {
		
		/*
		 * how to access static members?
		 * they can be accessed by class name
		 */
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		

		/*
		 * how to access nonstatic members?
		 * they can be accessed by creating an object if hte class
		 */
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		
		obj.name="lOL";
		obj.grade='A';
		
		obj.getInfo1();//possible not preferred
	}

}
