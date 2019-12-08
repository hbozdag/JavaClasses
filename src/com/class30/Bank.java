package com.class30;

public interface Bank {
	
	void haveChecking();
	void haveSavings();

}

interface Trustable{
	void trust();
}
class Finance {
	public void financing () {
		System.out.println("financial transactions must happen");
	}
}

class BOA extends Finance implements Bank, Trustable{ //you can implement multiple interfaces

	@Override
	public void haveChecking() {
		System.out.println("BOA has checkng account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust bofa with your money");
		
	}
	
}
class CapitalOne extends Finance implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("CapitaloNE has checkng account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("cAPITALoNE has saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust capitaloNE with your money");
		
	}
	
}
class CapitalOneChild extends CapitalOne{
	
}