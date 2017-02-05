package com.vektorel.fonksiyonasiriyuklenme;

public class Hal {

	private final double elmaFiyatı = 5;
	private double kdv;
	private double miktar;
	private double fiyat;

	public void fiyatHesaplıElma() {

		System.out.println("Halin ilk giriş ücreti 10 tl.");
	}

	public void fiyatHesaplıElma(double miktar) {

		System.out.println(miktar + " Miktar elmanın fiyatı= " + (miktar * elmaFiyatı));

	}

	public void fiyatHesaplıElma(double miktar, double fiyat) {

		System.out.println(miktar + " Miktar elmanın pazarlıklı fiyatı= " + (miktar * fiyat));
	}

	public void fiyatHesaplıElma(double miktar, Manav manav) {

		if(manav.getBk()){
			System.out.println(miktar + " Miktar elmanın fiyatı= " + (miktar * (elmaFiyatı-2)));
		}else{
			System.out.println(miktar + " Miktar elmanın fiyatı= " + (miktar * (elmaFiyatı-1)));
		}
		
		
	}
	


	public double getKdv() {
		return kdv;
	}

	public void setKdv(double kdv) {
		this.kdv = kdv;
	}

	public double getMiktar() {
		return miktar;
	}

	public void setMiktar(double miktar) {
		this.miktar = miktar;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
