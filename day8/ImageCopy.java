package com.day8;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ImageCopy {

	public static void main(String[] args) throws IOException {
		// FileReader fr = new FileReader("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\file.txt");
			
		FileInputStream is = new FileInputStream("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\download.jpg");
		FileOutputStream os = new FileOutputStream("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\Dog.jpg");	
		
		int ch;
			
			while((ch = is.read()) != -1) {
				os.write(ch);
				
			}
			
			is.close();
			os.close();
			
			System.out.println("Image Copied");
		}
	

	}


