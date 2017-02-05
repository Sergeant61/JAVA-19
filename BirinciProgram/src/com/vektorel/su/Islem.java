package com.vektorel.su;

public class Islem {

	public static void main(String[] args) {
		Golet golet = new Golet();

		golet.akar();

		IBalikTutmak balikTutmak = new Baraj();

		balikTutmak.OltaIleTutmak();

		ASu abstrracOrnegiGolet = new  Golet();
		
		ASu abstrracOrnegiBaraj = new  Baraj();

		abstrracOrnegiGolet.tuzlulukOrani();
		
		abstrracOrnegiBaraj.tuzlulukOrani();
	}

}
