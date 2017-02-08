package com.recepozen.io;

public class Islem {
	
	public static void main(String[] args) {
		
		
		Insan insan = new Insan(0, "Recep", "Özen", "Trabzon","Öðrenci", "0 Rh -","21","03.12.1995","Kartal");
		
		IYazmaI yazici = new Yazici();
		
		yazici.dosyaAc("H:/veritabani.txt");
		yazici.veriYaz(insan);
		yazici.dosyaKapt();
		
		IOkuII okuyucu = new Okuyucu();
		
		okuyucu.dosyaAcOku("H:/veritabani.txt","H:/okunan.txt");
		
		IOkuI okuyucuKonsol = new Okuyucu();
		
		okuyucuKonsol.dosyaAcOku("H:/veritabani.txt");
		
		
	}

}
