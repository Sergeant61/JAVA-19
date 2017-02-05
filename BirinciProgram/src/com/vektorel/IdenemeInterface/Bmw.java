package com.vektorel.IdenemeInterface;

public class Bmw  implements IAraba {

	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		System.out.println("Bmw - gaz");
	}

	@Override
	public void fren() {
		// TODO Auto-generated method stub
		System.out.println("Bmw - fren");
		abs();
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		System.out.println("Bmw - debriyaj");
	}

	@Override
	public void elFeneri() {
		// TODO Auto-generated method stub
		System.out.println("Bmw - elFeneri");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("Bmw - direksiyons");

	}
	
	public void abs(){
		System.out.println("Bmw - Fren Sistemi devrede.");
	}

}
