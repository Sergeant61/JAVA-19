package com.vektorel.kalitim3;

public class HizArabasi extends Araba {
	
	protected int turboMiktar�;
	protected String aksesuar;
	
	protected void turboYap(){
		
		System.out.println("H�z Arabas� - Turbo Yap");
	}
	
	@Override
	protected void hareket() {
	
		System.out.println("H�z Arabas� - Hareket");
	}
	
	
	

}
