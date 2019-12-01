package com.class27;

public class FinalKeyword {
	
	//final keyword can be used with class name above, but this will prevent any subclass and inheritance
	
	public final String str="Hello";
	

	public static void main(String[] args) {
		

		String str="I am awesome";
		str="i am cool";//varibale is chaneged
		
		System.out.println(str);
		
		final String finalString ="Java is easy";
		//finalString="Java is hard"; error because you used non access modifier "final"
		
		final int age=20;
		//age =120;ce (compile error)
		
		
		}
	public final void hello() {
		System.out.println("i am a final method in parent class");

	}
	
	public final void hello(int num) {
		System.out.println("i am a final method in parent class");

	}
	
	//can we overload final method? Yes!
	
	

}

class FinalKeywordChild extends FinalKeyword{
	
	//cannot be overridden. because it has a final method
	
//	public final void hello() { 
//		System.out.println("i am a final method in parent class");

	//}
	
}
