package com.vektorel.myex;

public class Islem {

	public static void main(String[] args) {

		try {
			throw new ArrayHatalari("c:\\Windows");
		} catch (ArrayHatalari e) {
			e.printStackTrace();
			e.arraySikintilari();
		}
		
		
	

	}

}
