package com.vektorel.recep�zen;

import java.util.Scanner;

public class KullaniciGirdi {

	public static void main(String[] args) {

		/*
		 * Scanner scanner1 = new Scanner(System.in);
		 * 
		 * System.out.println("L�tfen Ya��n�z� Girin ?");
		 * 
		 * int yas1 = scanner1.nextInt();
		 * 
		 * System.out.println("Ya��n�z = "+ yas1);
		 */

		/*
		 * double sayi1,sayi2; Scanner sc = new Scanner(System.in); hesap h =
		 * new hesap(); System.out.println("Birinci Say�y� Giriniz.");
		 * sayi1=sc.nextDouble(); System.out.println("�kinci Say�y� Giriniz.");
		 * sayi2=sc.nextDouble();
		 * 
		 * System.out.println(h.c�kar(sayi1, sayi2));
		 * System.out.println(h.b�l(sayi1, sayi2));
		 * System.out.println(h.topla(sayi1, sayi2));
		 * System.out.println(h.carp(sayi1, sayi2));
		 */

		/*Scanner scanner = new Scanner(System.in);

		String adi;
		String soyadi;
		String meslek;
		String cinsiyet;
		byte yas;

		System.out.println("L�tfen Ad�n�z� Girin ?");
		adi = scanner.nextLine();
		System.out.println("L�tfen Soyad�n�z� Girin ?");
		soyadi = scanner.nextLine();
		System.out.println("L�tfen Mesle�inizi Girin ?");
		meslek = scanner.nextLine();
		System.out.println("L�tfen Cinsiyetinizi Girin ?");
		cinsiyet = scanner.nextLine();
		System.out.println("L�tfen Ya��n�z� Girin ?");
		yas = scanner.nextByte();

		System.out.println("\"" + adi + "\"\n\"" + soyadi + "\"\n" + meslek + "\n" + cinsiyet + "\n" + yas);*/
		
		
		Scanner scsayi = new Scanner(System.in);
		System.out.println("Ka� say� toplamak istiyorsunuz.");
		byte kacSayi=scsayi.nextByte();
		
		int sonuc=0;
		for(int i=0;i<kacSayi;i++){
			
			System.out.println((i+1)+". Say�y� Giriniz:");
			sonuc=sonuc + scsayi.nextInt();				// sonuc += scsayi.nextInt();
			
		}
		
		System.out.println("Say�lar�n�z�n Toplam� :" + sonuc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
