package com.vektorel.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Deneme {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("log/yazici1.txt");
			file.createNewFile();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
