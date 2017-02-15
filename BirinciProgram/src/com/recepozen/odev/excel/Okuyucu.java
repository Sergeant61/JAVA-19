package com.recepozen.odev.excel;

import java.io.File;
import java.io.FileInputStream;

public class Okuyucu {

	public String fileInputStreamOku(File file) {

		FileInputStream inStream = null;
		byte[] byteArray = new byte[(int) file.length()];
		String text = null;

		try {

			inStream = new FileInputStream(file);

			inStream.read(byteArray);

			text = new String(byteArray);

			System.out.println(text);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return text;

	}

}
