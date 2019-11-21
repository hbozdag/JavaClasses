package com.class22;

public class AccessingStaticVariables {
	
	public static void main(String[] args) {
		
		
		Husky obj= new Husky();
		
		System.out.println(obj.name);//not accessible- not static
		System.out.println(Husky.breed);//accessible
		System.out.println(obj.breed);//accessible because it is static
		
		Husky.breed="New Breed";
	}

}
