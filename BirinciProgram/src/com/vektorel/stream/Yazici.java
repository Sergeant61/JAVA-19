package com.vektorel.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Yazici {

	public void yaz(File file) {
		FileOutputStream stream;

		try {
			
			stream = new FileOutputStream(file , false);
			
			
			String yazi = "Vektörel Java 19";
			
			stream.write(yazi.getBytes());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
