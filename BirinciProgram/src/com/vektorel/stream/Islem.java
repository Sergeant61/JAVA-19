package com.vektorel.stream;

import java.io.File;

public class Islem {
	
	public static void main(String[] args) {
		
		Dosya dosya = new Dosya();
		Yazici yazici = new Yazici();
		Okuyucu okuyucu = new Okuyucu();
		File file = dosya.getBenimDosyam("d:/1.xls");
		
		
		yazici.yaz(file);
		
		
		okuyucu.oku(file);
		
	}

}
