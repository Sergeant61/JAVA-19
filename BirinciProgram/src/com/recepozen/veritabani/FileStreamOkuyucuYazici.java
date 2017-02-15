package com.recepozen.veritabani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamOkuyucuYazici {

	public String fileInputStreamOku(File file) {

		FileInputStream inStream = null;
		byte[] byteArray = new byte[(int) file.length()];
		String text = null;

		try {

			inStream = new FileInputStream(file);

			inStream.read(byteArray);

			text = new String(byteArray);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return text;

	}

	public void fileOutputStreamYaz(File file, String text, boolean ardArdaMi) {
		FileOutputStream outStream;

		try {

			outStream = new FileOutputStream(file, ardArdaMi);

			outStream.write(text.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
