package com.vektorel.banka;

public class Islem {

	public static void main(String[] args) {

		Dolar dolar = new Dolar();

		dolar.setSeriNo("151fbd3");
		dolar.setMiktar(2000);
		dolar.setCipNo("45v");

		Tl tl = new Tl();

		tl.setSeriNo("151fbd3");
		tl.setMiktar(1500);
		tl.setFolyoBarkod("45v");

		Banka banka = new Banka(dolar, tl);

		System.out.println("Dolar serino : " + banka.getDolar().getSeriNo());
		System.out.println("Tl serino : " + banka.getTl().getSeriNo());
		
		dolar.setSeriNo("G700 - YEBÝ SERÝNO");
		System.out.println("Dolar serino : " + banka.getDolar().getSeriNo());
		
	}

}
