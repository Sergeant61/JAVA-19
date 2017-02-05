package com.vektorel.kalitim3;

import com.vektorel.kalitim.AraziAraci;

public class Islem {

	public static void main(String[] args) {
		
		
		HizArabasi arabasi = new HizArabasi();
		
		arabasi.motorGucu=3000;
		arabasi.model = 2015;
		arabasi.markasi = "Bugatti";
		arabasi.turboMiktarý=10;
		arabasi.aksesuar="Rüzgarlýk";
		
		arabasi.hareket();
		arabasi.fren();
		arabasi.turboYap();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*");
		
		AraziAraci araziAraci = new AraziAraci();
		araziAraci.motorGucuDegistir();
		
		System.out.println(araziAraci.motorGucu);
		
		
		
		
		
	}
	
}
