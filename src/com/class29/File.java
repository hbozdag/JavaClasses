package com.class29;

public abstract class File {

	public abstract void open();

	public void edit() {
		
		System.out.println("edit the files below");

	}

	public void close() {
System.out.println("close them now");
	}

}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open java file you will need to install intelliJ");
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("to open word file you should have microsoft installed ");
		
	}
	
}

class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("to open pdf file download adobe here");
		
	}
	
}