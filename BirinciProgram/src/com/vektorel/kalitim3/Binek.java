package com.vektorel.kalitim3;

public class Binek extends Araba {

	protected boolean tüp = false;

	protected void tupeGec() {

		System.out.println("Binek - Tüpe Geç");
	}

	@Override
	protected void fren() {

		System.out.println("Binek - Fren");
	}

}
