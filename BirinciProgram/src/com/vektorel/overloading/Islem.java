package com.vektorel.overloading;

public class Islem {

	public static void main(String[] args) {

		Araba araba = new Araba();

		Araba arabaIntId = new Araba(101);

		Araba arabaDoubleId = new Araba(101.0);

		Araba arabaStringId = new Araba("101.0");

		Araba arabaIkiParametreliInt = new Araba(100, "Fiat");

		Araba arabaIkiParametreliString = new Araba("100", "Fiat");

		System.out.println("----------------------------");

		Fiat fiat = new Fiat();
		fiat.setId(100);
		fiat.setName("500");
		Toyota toyota = new Toyota();

		Araba arabaFiat = new Araba(fiat);
		Araba arabaToyota = new Araba(toyota);
		Araba arabaToyota2 = new Araba(new Toyota(100, "Corolla"));

		Araba arabaVolvo = new Araba(new Volvo());
		Araba arabaVolvo2 = new Araba(new Volvo(100));
		
		Araba arabaFiatVolvo = new Araba(fiat,new Volvo(100,"s60",2011));

		Araba arabaFiatVolvo2 = new Araba(new Fiat(100,"500"),new Volvo(100,"s60",2011));
		
		
		
		
		
	}

}
