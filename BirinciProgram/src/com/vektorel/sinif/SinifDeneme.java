package com.vektorel.sinif;

public class SinifDeneme {

	public static void main(String[] args) {

		Person p = new Person(1, "Recep", "Özen", " ", 22);
		Person p2 = p;
		p2.tc=2;
		
		
		
		p.kisi();
		p2.kisi();
	}
}