package com.vektorel.sinif2;

public class GeometrikSekiller {

	public static Daire Daire;
	final double PI =3.14;
	double h=1 ;
	class Daire {
		public void alanHesapla(double yar�Cap){
			System.out.println("Dairenin Alan�= "+ (yar�Cap*yar�Cap)*PI);
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
