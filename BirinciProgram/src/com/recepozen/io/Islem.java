package com.recepozen.io;

public class Islem {
	
	public static void main(String[] args) {
		
		
		Insan insan = new Insan(0, "Recep", "Özen", "Trabzon","Öðrenci", "0 Rh -","21","03.12.1995","Kartal");
		
		IYazmaI yazici = new Yazici();
		
		yazici.dosyaAc("F:/veritabani.txt");
		yazici.veriYaz(insan);
		yazici.dosyaKapt();
		
		IOkuII okuyucu = new Okuyucu();
		
		okuyucu.dosyaAcOku("F:/veritabani.txt","F:/okunan.txt");
		
		IOkuI okuyucuKonsol = new Okuyucu();
		
		okuyucuKonsol.dosyaAcOku("F:/veritabani.txt");
		
		
	}

}
