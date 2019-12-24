package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car{
	String make, model;
	
	
	public Car(String make, String model){
		this.make=make;
		this.model=model;
		
	}
	
	public void display() {
		System.out.println(make+" "+model);
	}
}




public class CarTest {
	
	//create a car class that will have variables , methods and cosntrcutors
	//create a map theat will hold car numbers and car objects store in it 
	
	
	
	public static void main(String[] args) {
		
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		
		mapCar.put(1, new Car ("BMW", "x5"));
		mapCar.put(2, new Car ("tesla", "sl"));
		mapCar.put(3, new Car ("toyota", "se"));
		mapCar.put(4, new Car ("honda", "crv"));
		mapCar.put(2, new Car ("chev", "ty")); //since key is the same this value will not be counted
		
		//display oonly value objects
		
		Collection <Car> coll=mapCar.values();
		for (Car c:coll) {
			System.out.println(c.make+"--"+c.model);
		}
		
		System.out.println(mapCar.size());
		//map key to its corresponding values (entryset or keyset
		
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		
		//entrySet brings you the unique collection of entry
		for(Entry<Integer, Car> ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key " + i+ " is associated with the value of "+c.make);
		}
		
		//using keyset to map keys to values
		
		Set<Integer> keySet=mapCar.keySet();
		for(int key:keySet) {
			                //integer+map object-->value object (car type)
			System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
			
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(key+"="+carDetails);
			
		}
		
		//use iterator to iterate through values, keySet, entrySet
		
	}
	
	

}
