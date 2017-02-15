package com.recepozen.odev.hatalog;

import java.io.File;
import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		
		Dosya dosya = new Dosya();
		Okuyucu okuyucu = new Okuyucu();
		File file = dosya.getDosyaBaglan("recep.txt");
		
		Set<String> set = okuyucu.dosyaOkuSet(file, true, 0);
		okuyucu.konsolYaz(set);
		
	}
	
}
