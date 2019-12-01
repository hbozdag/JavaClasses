package com.class25;

public class IncrementWithStatic {

	//Incrementing with Static
	
	static int count=0;
	   public void increment(){
	       count++;
	   }
	  public static void main(String[] args) {
		  IncrementWithStatic obj1=new IncrementWithStatic();
		  IncrementWithStatic obj2=new IncrementWithStatic();
		  IncrementWithStatic obj3=new IncrementWithStatic();
		  IncrementWithStatic obj4=new IncrementWithStatic();
	      obj1.increment();
	      obj2.increment();
	      obj3.increment();
	     
	       
	      System.out.println(obj1.count);
	      System.out.println(obj2.count);
	      System.out.println(obj3.count);
	  }

}
