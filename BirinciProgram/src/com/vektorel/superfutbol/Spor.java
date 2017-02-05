package com.vektorel.superfutbol;

public class Spor {

	private String takým;
	private String topRengi = "Beyaz";

	public Spor() {
		System.out.println("Spor Sýnýfý.");
	}

	public Spor(String value) {
		System.out.println("Spor sýnýfý deðer:" + value);

	}

	public void takiminiSoyle() {
		System.out.println("Takým " + this.takým);
	}

	public void topRenginiSoyle() {
		System.out.println("Top Rengim " + this.topRengi);
	}

	public void topunSekliniSoyle(String value) {
		System.out.println(value);
		System.out.println("Hoþgeldin Recep Abi");

	}

	public void topunSekliniSoyle() {
		System.out.println("Top yuvarlaktýr.");
	}

	public void kacKisiyiz(int value) {

		System.out.println("Takým " + value + " kiþiyiz.");
	}

	final public void hangiSahadasin(final String sahaIsmi){
		System.out.println("Çim sahada");
	}
	
	public String getTakým() {
		return takým;
	}

	public void setTakým(String takým) {
		this.takým = takým;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}



}
