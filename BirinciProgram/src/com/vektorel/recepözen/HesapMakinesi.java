package com.vektorel.recep�zen;
//import com.vekt�rel.*;	 Java lang paketi ve package com.vekt�rel.recep�zen; i�indeyse import yap�lmas�na gerek yok

import java.util.Scanner;

//ctrrl+shift+o =kullan�lmayan paketleri siler ve kullan�lacak paketleri ekler / ctrl+d teksat�r� kopla siler

public class HesapMakinesi {

	public double sonuc;
	
	public  double topla(Double say�1, Double say�2) {

		return say�1 + say�2;
	}

	public double cikar(Double say�1, Double say�2) {

		return say�1 - say�2;
	}

	public double bol(Double say�1, Double say�2) {

		return say�1 / say�2;
	}

	public double carp(Double say�1, Double say�2) {

		return say�1 * say�2;
	}

	public static void main(String[] args) {

		// System.out.println(args[0]); Run/ Ron Configurations / Argumans a
		// eklenen degerleri b�yle �a��ra biliriz.

		double sayi1 = 0;
		double sayi2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hangi ��lemi Yapmak �stiyorsunuz.");
		System.out.println("1 = ��karma, 2 = B�lme, 3 = Toplama, 4 = �arpma");
		int islem = 0;

		try {

			islem = sc.nextInt();

		} catch (Exception e) {
			System.out.println("Hata Kodu: " + e);
		}

		if (islem >= 5 || islem <= 0) {
			System.out.println("B�yle bir i�lem numaras� yok");

		} else {

			HesapMakinesi hesapMakinesi = new HesapMakinesi();
			try {

				System.out.println("Birinci Say�y� Giriniz.");
				sayi1 = sc.nextDouble();
				System.out.println("�kinci Say�y� Giriniz.");
				sayi2 = sc.nextDouble();

			} catch (Exception e) {
				System.out.println("Hata Kodu: " + e);
			}

			switch (islem) {

			case 1:
				System.out.println("Sonu� : " + hesapMakinesi.cikar(sayi1, sayi2));
				break;
			case 2:
				System.out.println("Sonu� : " + hesapMakinesi.bol(sayi1, sayi2));
				break;
			case 3:
				System.out.println("Sonu� : " + hesapMakinesi.topla(sayi1, sayi2));
				break;
			case 4:
				System.out.println("Sonu� : " + hesapMakinesi.carp(sayi1, sayi2));
				break;

			}

		}

		sc.close();

	}

}

// void her hangi bir
// de�er
// d�nmeyecek
// fonsiyonlar i�in
// kullan�l�r.
// public //private
// //protected
// //no-modifier