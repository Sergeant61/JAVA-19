package com.vektorel.maaslar;

public class Islem {

	public static void main(String[] args) {

		Calisan mudur = new Mudur(5);
		Calisan genelMudur = new GenelMudur(6);
		Calisan yazilimci = new Yazilimci(5);

		maasYazdir(mudur);
		maasYazdir(genelMudur);
		maasYazdir(yazilimci);

	}

	public static void maasYazdir(Calisan calisan) {
		System.out.println(calisan.maasAl());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println(calisan.kimsin());
	}

}
