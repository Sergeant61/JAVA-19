package com.recepozen.veritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterYazici {

	public PrintWriter printWriterYaz(File file, String text) {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(file);

			pw.println(text);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.close();
		return pw;
	}

}
