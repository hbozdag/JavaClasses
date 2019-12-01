package com.class28;

public class DeviceTest {
	public static void main(String[] args) {
		
		Apple apple=new Apple("iphone", "11pro");
		System.out.println(apple.deviceType);
		Apple apple1=new Apple("ipad", "12pro");
		System.out.println(apple1.deviceType);

}
}