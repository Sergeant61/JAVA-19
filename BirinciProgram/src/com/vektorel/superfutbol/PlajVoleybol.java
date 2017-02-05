package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {
	
	
	public PlajVoleybol(){
		super();
		System.out.println("Plaj Sýnýfý");
	}
	
	public void takiminiSoyle(){
		
		setTakým("Ponçik Kýzlar");
		super.kacKisiyiz(30);
		System.out.println(getTakým());
	
	}

}
