package com.vektorel.araypoly;

public class Islem {

	public static void main(String[] args) {

//		String[] strings = new String[5];
//
//		MuzikAletleri muzAletleri = new VurmalýCalgýlar();
//
//		muzAletleri.sesVer();
//
//		MuzikAletleri muzAletleri2 = new MuzikAletleri();
//
//		muzAletleri2.sesVer();

		MuzikAletleri[] muzikAletleri = new MuzikAletleri[3];

		muzikAletleri[0] = new MuzikAletleri();
		muzikAletleri[1] = new VurmalýCalgýlar();
		muzikAletleri[2] = new YaylýCalgýlar();

		aletlerSesVer(muzikAletleri);

	}

	private static void aletlerSesVer(MuzikAletleri[] muzikAletleri) {
		for(int i = 0 ; i < muzikAletleri.length ; i ++ ){
			muzikAletleri[i].sesVer();
		}
		
		
		
	}

}
