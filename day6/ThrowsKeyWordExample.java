package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyWordExample {

	void myMethod() throws FileNotFoundException {
		FileReader fr = new FileReader("Sundhar.txt");
	}
	
	void myMethod1() {
		try {
			myMethod();
		}
		catch(FileNotFoundException e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
