package com.vektorel.superfutbol;

public class Basketbol extends Spor{

	
	public Basketbol(){
		super("Basketbol");
		System.out.println("Basketbol S�n�f�.");
	}
	
	@Override
	public void topRenginiSoyle() {
				
		setTopRengi("Kahverengi");
		System.out.println("Top Rengim " + getTopRengi());
		//super.topunSekliniSoyle("Recep abi geldi dostum.");
	}
	
	

	
}
