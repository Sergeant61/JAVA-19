package com.vektorel.stream;

import java.io.File;

public class Islem {
	
	public static void main(String[] args) {
		
		Dosya dosya = new Dosya();
		
		File file = dosya.getBenimDosyam("d:/recep.txt");
		
		Yazici yazici = new Yazici();
		yazici.yaz(file);
		Okuyucu okuyucu = new Okuyucu();
		
		okuyucu.oku(file);
		
	}

}
