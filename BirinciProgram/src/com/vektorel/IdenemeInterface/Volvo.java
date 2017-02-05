package com.vektorel.IdenemeInterface;

public class Volvo implements IAraba,IVolvoTamirci,IKoportaci {

	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - gaz");
	}

	@Override
	public void fren() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - fren");
		abs();
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - debriyaj");
	}

	@Override
	public void elFeneri() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - elFeneri");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - direksiyons");
	}

	@Override
	public void frenTamir() {
		// TODO Auto-generated method stub
		
	}
	
	public void abs(){
		System.out.println("Volvo - Fren Sistemi devrede.");
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya() {
		// TODO Auto-generated method stub
		System.out.println("Volvo - boya");
	}

	@Override
	public void boya(String value) {
		// TODO Auto-generated method stub
		System.out.println("Volvo Renk : " + value);
	}
}
