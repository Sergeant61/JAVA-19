package com.vektorel.fonksiyonasiriyuklenme;

public class Islem {

	public static void main(String[] args) {

		Hal hal = new Hal();

		hal.fiyatHesaplıElma();
		hal.fiyatHesaplıElma(40);
		hal.fiyatHesaplıElma(450, 1);
		
		Manav buyukManav = new Manav();
		buyukManav.setBk(true);
		Manav kucukManav = new Manav();
		kucukManav.setBk(false);
		
		hal.fiyatHesaplıElma(200, buyukManav);
		hal.fiyatHesaplıElma(100, kucukManav);
		
		
		buyukManav.setBk(false);
		kucukManav.setBk(true);
		
		hal.fiyatHesaplıElma(200, buyukManav);
		hal.fiyatHesaplıElma(100, kucukManav);
	}

}
