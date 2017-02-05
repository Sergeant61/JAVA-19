package com.vektorel.kalitim2;

public class Islem {

	public static void main(String[] args) {

		Omurgalilar omurgalilar = new Omurgalilar();

		omurgalilar.Boy();
		omurgalilar.kilo();
		omurgalilar.yurumek();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		SogukKanli sogukKanli = new SogukKanli();
		
		sogukKanli.Boy();
		sogukKanli.kilo();
		sogukKanli.yurumek();
		sogukKanli.kýsUykusu();

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		Omurgasizlar omurgasizlar = new Omurgasizlar();
		
		omurgasizlar.Boy();
		omurgasizlar.kilo();
		omurgasizlar.surunmek();
		
	}

}