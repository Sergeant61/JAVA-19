package com.recepozen.odev.set;

import java.util.Set;

public class Islem {
	
	public static void main(String[] args) {
		
		Dosya dosya = new Dosya();
		Okuyucu okuyucu = new Okuyucu();
		
		Set<String> set;
		set = okuyucu.dosyaOkuSet(1);
		
		okuyucu.konsolVeStreamYaz(dosya.getDosyaBaglan("d:/1.txt"), true, set);
		
		
	}

}
