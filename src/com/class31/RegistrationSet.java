package com.class31;

public class RegistrationSet {

	public static void main(String[] args) {

		Registration reg = new Registration();
		reg.setEmail("hb@gmail.com");
		String a = reg.getEmail();
		
		reg.setPassword(292848);
		int b=reg.getPassword();
		
		reg.setUserName("hbozdag");
		String c=reg.getUserName();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
