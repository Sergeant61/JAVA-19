package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {
	
	
	public PlajVoleybol(){
		super();
		System.out.println("Plaj S�n�f�");
	}
	
	public void takiminiSoyle(){
		
		setTak�m("Pon�ik K�zlar");
		super.kacKisiyiz(30);
		System.out.println(getTak�m());
	
	}

}
