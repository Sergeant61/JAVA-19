package com.vektorel.cons;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kitap kitap1 = new Kitap();
		
		kitap1.setBarkod("NLRNlnlsvls54");
		kitap1.setIsim("zambak");
		kitap1.setId(0);
	
//		Kitap kitap2 = new Kitap("NLRNlnlsvls54");
//		Kitap kitap3 = new Kitap("NLRNlnlsvls54","zambak");
//		System.out.println(kitap3.getIsim());
		
		Kitap kitap4 = new  Kitap("NLRNlnlsvls54", "zambak", 0);
		
		
		KitapEvi evi = new KitapEvi(new  Kitap("NLRNlnlsvls54", "zambak", 0), "KVekt�rel", "K�z�lay");
		
		
		
//		System.out.println("Kitab�n ismini giriniz.");
//		kitap.setIsim(sc.nextLine());
//		System.out.println("Kitab�n Barkodunu giriniz.");
//		kitap.setBarkod(sc.nextLine());
//		System.out.println("Kitab�n idsini giriniz.");
//		kitap.setId(sc.nextInt());
//		
//		KitapEvi evi = new KitapEvi();
//		evi.setKitap(kitap);
//		evi.setIsim("Bir Kitapl� Kitap Evi");
//		evi.setAdresi("K�z�lay");
		
		
		
		
		sc.close();
	}

}
