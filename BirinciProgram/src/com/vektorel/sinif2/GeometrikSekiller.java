package com.vektorel.sinif2;

public class GeometrikSekiller {

	public static Daire Daire;
	final double PI =3.14;
	double h=1 ;
	class Daire {
		public void alanHesapla(double yarıCap){
			System.out.println("Dairenin Alanı= "+ (yarıCap*yarıCap)*PI);
		}
	}

	class Kare {
		public void hacimHesapla(double kenarUzunlugu){
			System.out.println("Karenin Hacmi= "+ (kenarUzunlugu*kenarUzunlugu*h));
		}
	}

	class Ucgen {

	}

}
