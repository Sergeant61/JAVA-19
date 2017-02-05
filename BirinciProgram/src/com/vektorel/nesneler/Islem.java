package com.vektorel.nesneler;

public class Islem {

	public static void main(String[] args) {

		Object tahta = new Tahta();
		System.out.println(tahta.toString());

		Object astes = new Ates();
		System.out.println(astes.toString());

		Object toprak = new Toprak();
		System.out.println(toprak.toString());

		tipiniSoyle(tahta);
		tipiniSoyle(astes);
		tipiniSoyle(toprak);

	}

	private static void tipiniSoyle(Object obj) {

		if (obj instanceof Tahta) {
			Tahta tahta1 = (Tahta) obj;
			tahta1.cinsiniSoyle();

		} else if (obj instanceof Ates) {
			Ates ates1 = (Ates) obj;
			ates1.cinsiniSoyle();

		} else if (obj instanceof Toprak) {
			Toprak toprak1 = (Toprak) obj;
			toprak1.cinsiniSoyle();
		}

	}

}
