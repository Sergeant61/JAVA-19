package com.recepozen.veritabani;

import java.io.File;



public class Dosya {

	public File getDosyaBaglan(String path) {
		File file = new File(path);

		if (file.exists()) {
			if (file.isFile()) {
				return file;
			}else {System.out.println("Veri tabaný kullanýlabilir deðil.");}
		}else {System.out.println("Veri tabaný dosyasý mevcut deðil.");}
		return null;
	}

}
