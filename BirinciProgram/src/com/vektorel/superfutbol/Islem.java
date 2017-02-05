package com.vektorel.superfutbol;

public class Islem {

	public static void main(String[] args) {
		Basketbol basketbol = new Basketbol();
		basketbol.topRenginiSoyle();

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*");

		PlajVoleybol plajVoleybol = new PlajVoleybol();
		plajVoleybol.takiminiSoyle();

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
		
		Voleybol.neredeyiz();
		System.out.println(Voleybol.degiskrn);
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
		
		Futbol futbol = new Futbol();
		futbol.hangiSahadasin("Çim Saha");
		
	}

}
