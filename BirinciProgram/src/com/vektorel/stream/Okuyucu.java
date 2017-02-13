package com.vektorel.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Okuyucu {

	public void oku(File file) {
		FileInputStream stream;
		try {

			stream = new FileInputStream(file);
//			for (int i = 0; i < 10 /*file.length()*/; i++) {
//				
//				System.out.print((char)stream.read());
//			}
//			
//			System.out.println("\n*******************");
			
			byte[] byteArray = new byte[(int)file.length()];
			stream.read(byteArray);
			String text = new String(byteArray);
			
			System.out.println(text);
			// System.out.println(stream.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
