package com.vektorel.IdenemeInterface;

public class Tofas  implements IAraba,IKoportaci  {
	
	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - gaz");
	}

	@Override
	public void fren() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - fren");
		abs();
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - debriyaj");
	}

	@Override
	public void elFeneri() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - elFeneri");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - direksiyons");
	}
	

	public void abs(){
		System.out.println("Tofa� - Abs yok");
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - macun");
	}

	@Override
	public void boya(String value) {
		// TODO Auto-generated method stub
		System.out.println("Tofa� Renk : " + value);
	}
	@Override
	public void boya() {
		// TODO Auto-generated method stub
		System.out.println("Tofa� - boya");
	}

}
