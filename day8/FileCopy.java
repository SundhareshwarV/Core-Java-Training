package com.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
      
       FileReader fr = new FileReader("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\file.txt");
       FileWriter fw = new FileWriter("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\MyFile1.txt");
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("File Copird");

	}

}
