package com.vektorel.sinif2;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		Daire daire = new Daire();
//		System.out.println("Dairenizin çapýný giriniz.");
//		System.out.println("Dairenizin alaný= " + daire.yariCap(scanner.nextDouble()));

		GeometrikSekiller geo = new GeometrikSekiller();
		
		GeometrikSekiller.Daire daire = geo. new Daire();
		GeometrikSekiller.Kare kare = geo. new Kare();
		
		daire.alanHesapla(5);
		kare.hacimHesapla(15);
		
		
	}

}
