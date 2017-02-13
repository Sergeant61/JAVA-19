package com.recepozen.veritabani;

import java.io.File;



public class Dosya {

	public File getDosyaBaglan(String path) {
		File file = new File(path);

		if (file.exists()) {
			if (file.isFile()) {
				return file;
			}else {System.out.println("Veri taban� kullan�labilir de�il.");}
		}else {System.out.println("Veri taban� dosyas� mevcut de�il.");}
		return null;
	}

}
