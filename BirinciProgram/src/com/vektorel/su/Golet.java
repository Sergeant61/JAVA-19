package com.vektorel.su;

public class Golet extends ASu implements IBalikTutmak {

	@Override
	public int debi() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void OltaIleTutmak() {
		System.out.println("Gölette balýk tutmak.");

	}

	@Override
	public void tuzlulukOrani() {
		System.out.println(20 + " Tuz oraný.");
	}

}
