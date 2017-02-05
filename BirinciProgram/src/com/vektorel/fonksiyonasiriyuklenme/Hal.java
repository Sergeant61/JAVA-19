package com.vektorel.fonksiyonasiriyuklenme;

public class Hal {

	private final double elmaFiyat� = 5;
	private double kdv;
	private double miktar;
	private double fiyat;

	public void fiyatHesapl�Elma() {

		System.out.println("Halin ilk giri� �creti 10 tl.");
	}

	public void fiyatHesapl�Elma(double miktar) {

		System.out.println(miktar + " Miktar elman�n fiyat�= " + (miktar * elmaFiyat�));

	}

	public void fiyatHesapl�Elma(double miktar, double fiyat) {

		System.out.println(miktar + " Miktar elman�n pazarl�kl� fiyat�= " + (miktar * fiyat));
	}

	public void fiyatHesapl�Elma(double miktar, Manav manav) {

		if(manav.getBk()){
			System.out.println(miktar + " Miktar elman�n fiyat�= " + (miktar * (elmaFiyat�-2)));
		}else{
			System.out.println(miktar + " Miktar elman�n fiyat�= " + (miktar * (elmaFiyat�-1)));
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
