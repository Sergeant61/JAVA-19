package com.vektorel.banka;

public class Banka {

	private Dolar dolar;
	private Tl tl;

	public Dolar getDolar() {
		return dolar;
	}

	public void setDolar(Dolar dolar) {
		this.dolar = dolar;
	}

	public Tl getTl() {
		return tl;
	}

	public void setTl(Tl tl) {
		this.tl = tl;
	}

	public Banka() {

		System.out.println("Banka nesnesi oluþturuldu.");

	}

	public Banka(Dolar dolar) {
		System.out.println("Banka= Dolar : "+dolar.getSeriNo()+" "+dolar.getMiktar()+" "+dolar.getCipNo());
		this.dolar = dolar;

	}

	public Banka(Tl tl) {
		System.out.println("Banka= Tl : "+tl.getSeriNo()+" "+tl.getMiktar()+" "+tl.getFolyoBarkod());
		this.tl = tl;
	}

	public Banka(Dolar dolar, Tl tl) {

		System.out.println("Banka= Dolar : "+dolar.getSeriNo()+" "+dolar.getMiktar()+" "+dolar.getCipNo());
		System.out.println("Banka= Tl : "+tl.getSeriNo()+" "+tl.getMiktar()+" "+tl.getFolyoBarkod());
		this.dolar = dolar;
		this.tl = tl;
		
		System.out.println("");
	}

}
