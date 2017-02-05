package com.vektorel.donerci;

public class Islem {

	public static void main(String[] args) {
		
		MutluDoner mutluDoner = new MutluDoner();
		
		mutluDoner.donerKesme();
		mutluDoner.paketleme();
		System.out.println(mutluDoner.fiatHesapla(2, 10));
		
	}
}
