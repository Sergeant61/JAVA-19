package com.vektorel.cons;

public class Kalem {

	private int id;
	private String isim;

	public Kalem() {
		System.out.println("Kalem Oluþturuldu.");
	}

	public Kalem(int id, String isim) {

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
