package com.vektorel.recepözen;

import java.util.Scanner;

public class KullaniciGirdi {

	public static void main(String[] args) {

		/*
		 * Scanner scanner1 = new Scanner(System.in);
		 * 
		 * System.out.println("Lütfen Yaþýnýzý Girin ?");
		 * 
		 * int yas1 = scanner1.nextInt();
		 * 
		 * System.out.println("Yaþýnýz = "+ yas1);
		 */

		/*
		 * double sayi1,sayi2; Scanner sc = new Scanner(System.in); hesap h =
		 * new hesap(); System.out.println("Birinci Sayýyý Giriniz.");
		 * sayi1=sc.nextDouble(); System.out.println("Ýkinci Sayýyý Giriniz.");
		 * sayi2=sc.nextDouble();
		 * 
		 * System.out.println(h.cýkar(sayi1, sayi2));
		 * System.out.println(h.böl(sayi1, sayi2));
		 * System.out.println(h.topla(sayi1, sayi2));
		 * System.out.println(h.carp(sayi1, sayi2));
		 */

		/*Scanner scanner = new Scanner(System.in);

		String adi;
		String soyadi;
		String meslek;
		String cinsiyet;
		byte yas;

		System.out.println("Lütfen Adýnýzý Girin ?");
		adi = scanner.nextLine();
		System.out.println("Lütfen Soyadýnýzý Girin ?");
		soyadi = scanner.nextLine();
		System.out.println("Lütfen Mesleðinizi Girin ?");
		meslek = scanner.nextLine();
		System.out.println("Lütfen Cinsiyetinizi Girin ?");
		cinsiyet = scanner.nextLine();
		System.out.println("Lütfen Yaþýnýzý Girin ?");
		yas = scanner.nextByte();

		System.out.println("\"" + adi + "\"\n\"" + soyadi + "\"\n" + meslek + "\n" + cinsiyet + "\n" + yas);*/
		
		
		Scanner scsayi = new Scanner(System.in);
		System.out.println("Kaç sayý toplamak istiyorsunuz.");
		byte kacSayi=scsayi.nextByte();
		
		int sonuc=0;
		for(int i=0;i<kacSayi;i++){
			
			System.out.println((i+1)+". Sayýyý Giriniz:");
			sonuc=sonuc + scsayi.nextInt();				// sonuc += scsayi.nextInt();
			
		}
		
		System.out.println("Sayýlarýnýzýn Toplamý :" + sonuc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
