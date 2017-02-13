package com.recepozen.veritabani;

import java.io.File;
import java.util.List;
import java.util.Set;

public class Islem {

	public static void main(String[] args) {

		Dosya dosya = new Dosya();
		Okuyucu okuyucu = new Okuyucu();
		Yazici yazici = new Yazici();

		String paht = ("veri.txt");
		
		File file = dosya.getDosyaBaglan(paht);
//		
//		List<String> list = okuyucu.dosyaOkuList(file, true, false);
//		yazici.KonsolYaz(list);
//		
//		System.out.println("-------------------");
//		
//		Set<String> set = okuyucu.dosyaOkuSet(file, false, 1);
//		yazici.KonsolYaz(set);
	
		
		yazici.veriYaz(new File("veri.txt"));
		
	}

}
