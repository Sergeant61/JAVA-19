package com.vektorel.cons;

public class Cetvel {

	private int id;
	private String isim;

	public Cetvel() {
		System.out.println("Cetvel Oluþturuldu.");
	}

	public Cetvel(int id, String isim) {

		this.id = id;
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public String getIsim() {
		return isim;
	}

	public void Oku() {

		System.out.println("Benim idim: " + this.id);
		System.out.println("Benim Ýsmim: " + this.isim);
	}

	public String IsimSoyle() {

		return isim;
	}

	public int IdSoyle() {

		return id;
	}

}
