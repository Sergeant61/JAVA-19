package com.vektorel.kalitim;

public class Islem {

	public static void main(String[] args) {

		Baba baba = new Baba();

		baba.konusma();
		baba.yurume();
		baba.okumaYazma();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

		Dede dede = new Dede();

		dede.konusma();
		dede.yurume();

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		Amca amca = new Amca();

		amca.konusma();
		amca.yurume();
		amca.gozRengi();
		amca.pilot();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

		Cocuk cocuk = new Cocuk();

		cocuk.konusma();
		cocuk.yurume();
		cocuk.okumaYazma();
		
		Dede dede2 = new Baba();
		
		

	}

}
