package com.vektorel.maaslar;

public class Yazilimci extends Calisan {

	int kidem;

	public Yazilimci(int i) {
		kidem = i;
	}

	@Override
	public int maasAl() {

		return kidem * sabitMas;

	}
	
	@Override
	public String kimsin(){
		return "Yazılımcı";
	}


}
