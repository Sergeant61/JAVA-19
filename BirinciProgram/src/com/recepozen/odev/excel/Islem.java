package com.recepozen.odev.excel;

public class Islem {

	public static void main(String[] args) {

		Dosya dosya = new Dosya();
		Okuyucu okuyucu = new Okuyucu();
		

		okuyucu.fileInputStreamOku(dosya.getDosyaBaglan("d:/1.xls"));

	}

}
