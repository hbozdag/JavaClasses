package com.class30;

interface TakeScreenshot{
	
	//public static final  automatically added
	
	String FILE_EXTENSION=".png";
	
	void takeScreen();
	
	//we cannot have constructors inside the interface
	
	
	
	//inside the interface we can have static method and default method. 
	
	
	static void takeSelfie() {
		//this is  created to a method that cannot be overridden
		
		System.out.println(" I am defiend static method");
	}
	
	default void takePictures() {
		
		// they did this becuase if we create abstract methids it will affect all children
		//no all childeren can have access to it withoudt being forced to implement it 
		
		System.out.println("I am default defined method of this interface");
		
	}
}

interface Application{
	void applicationTest();
}


public interface WebDriver extends TakeScreenshot {
	
	/*Create a WebDriver Interface that will have the following unimplemented behaviour: 
	 * openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	 */
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}

abstract class Browser{
	 
	 public abstract void refresh();
	 
	
}
class ChromeDriver extends Browser implements WebDriver, Application{

	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver opens");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver closes");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("ChromeDriver maximize the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("ChromeDriver finds the element");
	}

	@Override
	public void refresh() {
		System.out.println("Refresh ChromeDriver ");
	}

	@Override
	public void takeScreen() {
		System.out.println("take screen shot ChromeDriver ");
		
	}

	@Override
	public void applicationTest() {
		System.out.println("Application ChromeDriver ");
	}
	
}
class FireFoxDriver extends Browser implements WebDriver, Application{

	@Override
	public void openBrowser() {
		System.out.println("FireFoxDriver opens");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFoxDriver closes");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FireFoxDriver maximize the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("FireFoxDriver finds the element");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh FireFoxDriver ");
		
	}

	@Override
	public void takeScreen() {
		System.out.println("Take screen shot FireFoxDriver ");
		
	}

	@Override
	public void applicationTest() {
		System.out.println("Application test FireFoxDriver ");
		
	}
	
}

