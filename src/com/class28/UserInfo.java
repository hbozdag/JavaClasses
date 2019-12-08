package com.class28;

public class UserInfo extends User{
	
	String address;
	
	UserInfo(String name, int mobileNumber, String address){
		super(name,mobileNumber);
		this.address=address;
	}
	
	public void userDetails() {
		System.out.println(name+" "+mobileNumber+" "+address);
		
	}
	
	public static void main(String[] args) {
		UserInfo obj=new UserInfo("harun", 123490393, "707 barnes");
		obj.userDetails();
		UserInfo obj1=new UserInfo("as", 2343546, "hail");
		obj1.userDetails();
	}
	
}

