package com.class28;

public class Child extends Parent{
	String name="James";
	
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	
	public void callingMethod() {
		callName();
		super.callName();
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.callName();
		obj.callingMethod();
	}

}
