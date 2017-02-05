package com.vektorel.IdenemeInterface;

public class Tofas  implements IAraba,IKoportaci  {
	
	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - gaz");
	}

	@Override
	public void fren() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - fren");
		abs();
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - debriyaj");
	}

	@Override
	public void elFeneri() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - elFeneri");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - direksiyons");
	}
	

	public void abs(){
		System.out.println("Tofaþ - Abs yok");
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - macun");
	}

	@Override
	public void boya(String value) {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ Renk : " + value);
	}
	@Override
	public void boya() {
		// TODO Auto-generated method stub
		System.out.println("Tofaþ - boya");
	}

}
