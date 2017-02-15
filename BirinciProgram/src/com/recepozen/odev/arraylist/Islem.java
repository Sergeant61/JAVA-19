package com.recepozen.odev.arraylist;

import java.io.File;
import java.util.List;

public class Islem {

	public static void main(String[] args) {

		Dosya dosya = new Dosya();
		Okuyucu okuyucu = new Okuyucu();
		File file = dosya.getDosyaBaglan("d:/1.txt");
		List<String> list = okuyucu.dosyaOkuList(file, true, true);

		okuyucu.sýrala(list);
		okuyucu.konsolVeStreamYaz(file, false, list);

	}

}
