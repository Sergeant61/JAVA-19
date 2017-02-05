package com.vektorel.sinif;

public class Ucken {

	private int kenarUzunlugu; // a
	private int tabanUzunlugu; // b
	private int yukseklik; // h

	public Ucken(int kenarUzunlugu, int tabanUzunlugu, int yukseklik) {

		this.kenarUzunlugu = kenarUzunlugu;
		this.tabanUzunlugu = tabanUzunlugu;
		this.yukseklik = yukseklik;

	}

	public int alan() {

		return (tabanUzunlugu * yukseklik) / 2;
	}

	public int cevre() {

		return (kenarUzunlugu * 2) + tabanUzunlugu;
	}
	
	public static void main(String[] args) {
		Ucken ucken = new Ucken(5, 10, 10);
		System.out.println(ucken.alan());
		System.out.println(ucken.cevre());
	}

}
