package com.recepozen.iodeneme;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deneme {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			in = new FileInputStream("d:/1.txt");
			out = new FileOutputStream("d:/2.txt");

			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
