package com.vektorel.maaslar;

public class Mudur extends Calisan {

	int kidem;

	public Mudur(int i) {
		kidem = i;
	}

	public Mudur() {
	}

	@Override
	public int maasAl() {

		return kidem * sabitMas;

	}
	
	@Override
	public String kimsin(){
		return "Mudür";
	}

}
