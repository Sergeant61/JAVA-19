package com.vektorel.cons;

public class Defter {

	private int id;
	private String isim;

	public Defter() {
		System.out.println("Defter Oluþturuldu.");
	}

	public Defter(int id, String isim) {

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
