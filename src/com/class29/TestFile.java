package com.class29;

public class TestFile {

	public static void main(String[] args) {
		

		File jfile=new JavaFile();
		jfile.close();
		jfile.edit();
		jfile.open();
		
		System.out.println("******");
		
		File wfile=new WordFile();
		wfile.close();
		wfile.edit();
		wfile.open();
		
		System.out.println("%%%%%%%");
		
		File pfile=new PDFFile();
		pfile.close();
		pfile.edit();
		pfile.open();
	}

}
