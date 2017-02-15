package com.recepozen.odev.hatalog;

import java.io.FileOutputStream;
import java.io.IOException;

public class Hata extends Exception {

	public Hata(String text) {

		fileOutputStreamYaz(text);
	}

	private void fileOutputStreamYaz(String text) {
		FileOutputStream outStream;

		try {

			outStream = new FileOutputStream("log.txt", true);

			text = text + "\n";
			outStream.write(text.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
