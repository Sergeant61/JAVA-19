package com.vektorel.sinif;

public class Person {

	 int tc;
	 String adi;
	 String soyadi;
	 String meslek;
	 int yas;

	public Person(int tc,String adi, String soyadi) {
		this.tc = tc;
		this.adi = adi;
		this.soyadi = soyadi;

	}

	public Person(int tc, String adi, String soyadi, int yas) {

		this(tc ,adi, soyadi);
		this.yas = yas;

	}

	public Person(int tc, String adi, String soyadi, String meslek, int yas) {

		this(tc, adi, soyadi, yas);
		this.meslek = meslek;

	}

	public void kisi() {
		System.out.println("Kiþinin Adý ve Soyadý:" + adi + " " + soyadi + " Mesleði: " + meslek + " Yaþý: " + yas
				+ " Tc : " + tc);
	}

}
