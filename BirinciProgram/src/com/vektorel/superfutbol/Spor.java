package com.vektorel.superfutbol;

public class Spor {

	private String tak�m;
	private String topRengi = "Beyaz";

	public Spor() {
		System.out.println("Spor S�n�f�.");
	}

	public Spor(String value) {
		System.out.println("Spor s�n�f� de�er:" + value);

	}

	public void takiminiSoyle() {
		System.out.println("Tak�m " + this.tak�m);
	}

	public void topRenginiSoyle() {
		System.out.println("Top Rengim " + this.topRengi);
	}

	public void topunSekliniSoyle(String value) {
		System.out.println(value);
		System.out.println("Ho�geldin Recep Abi");

	}

	public void topunSekliniSoyle() {
		System.out.println("Top yuvarlakt�r.");
	}

	public void kacKisiyiz(int value) {

		System.out.println("Tak�m " + value + " ki�iyiz.");
	}

	final public void hangiSahadasin(final String sahaIsmi){
		System.out.println("�im sahada");
	}
	
	public String getTak�m() {
		return tak�m;
	}

	public void setTak�m(String tak�m) {
		this.tak�m = tak�m;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}



}
