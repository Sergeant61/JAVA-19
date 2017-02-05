package com.vektorel.recepözen;
//import com.vektörel.*;	 Java lang paketi ve package com.vektörel.recepözen; içindeyse import yapýlmasýna gerek yok

import java.util.Scanner;

//ctrrl+shift+o =kullanýlmayan paketleri siler ve kullanýlacak paketleri ekler / ctrl+d teksatýrý kopla siler

public class HesapMakinesi {

	public double sonuc;
	
	public  double topla(Double sayý1, Double sayý2) {

		return sayý1 + sayý2;
	}

	public double cikar(Double sayý1, Double sayý2) {

		return sayý1 - sayý2;
	}

	public double bol(Double sayý1, Double sayý2) {

		return sayý1 / sayý2;
	}

	public double carp(Double sayý1, Double sayý2) {

		return sayý1 * sayý2;
	}

	public static void main(String[] args) {

		// System.out.println(args[0]); Run/ Ron Configurations / Argumans a
		// eklenen degerleri böyle çaðýra biliriz.

		double sayi1 = 0;
		double sayi2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hangi Ýþlemi Yapmak Ýstiyorsunuz.");
		System.out.println("1 = Çýkarma, 2 = Bölme, 3 = Toplama, 4 = Çarpma");
		int islem = 0;

		try {

			islem = sc.nextInt();

		} catch (Exception e) {
			System.out.println("Hata Kodu: " + e);
		}

		if (islem >= 5 || islem <= 0) {
			System.out.println("Böyle bir iþlem numarasý yok");

		} else {

			HesapMakinesi hesapMakinesi = new HesapMakinesi();
			try {

				System.out.println("Birinci Sayýyý Giriniz.");
				sayi1 = sc.nextDouble();
				System.out.println("Ýkinci Sayýyý Giriniz.");
				sayi2 = sc.nextDouble();

			} catch (Exception e) {
				System.out.println("Hata Kodu: " + e);
			}

			switch (islem) {

			case 1:
				System.out.println("Sonuç : " + hesapMakinesi.cikar(sayi1, sayi2));
				break;
			case 2:
				System.out.println("Sonuç : " + hesapMakinesi.bol(sayi1, sayi2));
				break;
			case 3:
				System.out.println("Sonuç : " + hesapMakinesi.topla(sayi1, sayi2));
				break;
			case 4:
				System.out.println("Sonuç : " + hesapMakinesi.carp(sayi1, sayi2));
				break;

			}

		}

		sc.close();

	}

}

// void her hangi bir
// deðer
// dönmeyecek
// fonsiyonlar için
// kullanýlýr.
// public //private
// //protected
// //no-modifier