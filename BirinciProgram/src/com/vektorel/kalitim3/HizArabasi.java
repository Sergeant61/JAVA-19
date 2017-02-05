package com.vektorel.kalitim3;

public class HizArabasi extends Araba {
	
	protected int turboMiktarý;
	protected String aksesuar;
	
	protected void turboYap(){
		
		System.out.println("Hýz Arabasý - Turbo Yap");
	}
	
	@Override
	protected void hareket() {
	
		System.out.println("Hýz Arabasý - Hareket");
	}
	
	
	

}
