package com.vektorel.overloading;

public class Toyota {
	
	private int id;
	private String name;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Toyota(int id, String name) {/*** Yap�land�r�c� ***/
		this.id=id;
		this.name=name;
	}

	public Toyota() {
		System.out.println("Toyota nesnesi olu�turuldu.");
	}

	
}
