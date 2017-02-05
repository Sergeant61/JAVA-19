package com.vektorel.su;

public class Baraj extends ASu implements IBalikTutmak {

	@Override
	public int debi() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void OltaIleTutmak() {

		System.out.println("Barajda balýk tutmak.");

	}

	@Override
	public void tuzlulukOrani() {
		System.out.println(10 + " Tuz oraný.");
	}

}
