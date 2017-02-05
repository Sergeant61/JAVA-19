package com.vektorel.kurs;

public class Islem {
	
	public static void main(String[] args) {
		
		Kisi hoca = new Kisi();
		Kisi musteri = new Kisi();
		Kisi ogrenci = new Kisi();
		
		hoca.setAdi("Mustafa");
		hoca.setSoyadi("Akman");
		hoca.setMevki("Hoca");
		hoca.setHoca(true);;
		
		musteri.setAdi("Recep");
		musteri.setSoyadi("�zen");
		musteri.setMevki("Musteri");
		musteri.setHoca(false);;
				
		ogrenci.setAdi("Harun");
		ogrenci.setSoyadi("�zen");
		ogrenci.setMevki("��renci");
		ogrenci.setHoca(false);;
		
		BaskentSurucuKursu baskentSurucuKursu = new BaskentSurucuKursu();
		
		//System.out.println(baskentSurucuKursu.fiyatHesapla(hoca));
		baskentSurucuKursu.ilkEgitimZaman�(hoca);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		
		System.out.println(baskentSurucuKursu.fiyatHesapla(musteri));
		baskentSurucuKursu.ilkEgitimZaman�(musteri);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		
		System.out.println(baskentSurucuKursu.fiyatHesapla(ogrenci));
		baskentSurucuKursu.ilkEgitimZaman�(ogrenci);
	}

}
