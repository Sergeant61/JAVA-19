package com.vektorel.myex;

public class ArrayHatalari extends Exception {

	public ArrayHatalari() {
		System.out.println("Bir sorun olu�tu.");
	}

	public ArrayHatalari(String value) {
		System.out.println("Dosya yolu hatas�: " + value);
	}

	public void arraySikintilari() {
		System.out.println("Array'de hata var");
	}

}
