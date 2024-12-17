package com.day8;

import java.io.FileReader;
import java.io.IOException;

class MyClass {
	
	static void method() throws IOException {
       FileReader fr = new FileReader("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\file.txt");
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fr.close();
	}
}

public class FileReading {

	public static void main(String[] args)   {
		
//		FileReader fr = new FileReader("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\file.txt");
//		
//		int ch;
//		
//		while((ch = fr.read()) != -1) {
//			System.out.print((char)ch);
//		}
//		
//		fr.close();
		
		try {
			MyClass.method();
		} catch (IOException e) {

			e.printStackTrace();
		}
//		
		
		
	}

}
