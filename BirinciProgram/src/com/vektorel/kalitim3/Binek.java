package com.vektorel.kalitim3;

public class Binek extends Araba {

	protected boolean t�p = false;

	protected void tupeGec() {

		System.out.println("Binek - T�pe Ge�");
	}

	@Override
	protected void fren() {

		System.out.println("Binek - Fren");
	}

}
