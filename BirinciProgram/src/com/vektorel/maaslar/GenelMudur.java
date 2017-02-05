package com.vektorel.maaslar;

public class GenelMudur extends Mudur {

	int kidem;
	

	public GenelMudur(int i) {

		kidem = i;
	}

	@Override
	public int maasAl() {

		return kidem * sabitMas;

	}
	
	@Override
	public String kimsin(){
		return "GenelMudür";
	}

}
