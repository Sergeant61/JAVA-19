package com.vektorel.fonksiyonasiriyuklenme;

public class Islem {

	public static void main(String[] args) {

		Hal hal = new Hal();

		hal.fiyatHesapl�Elma();
		hal.fiyatHesapl�Elma(40);
		hal.fiyatHesapl�Elma(450, 1);
		
		Manav buyukManav = new Manav();
		buyukManav.setBk(true);
		Manav kucukManav = new Manav();
		kucukManav.setBk(false);
		
		hal.fiyatHesapl�Elma(200, buyukManav);
		hal.fiyatHesapl�Elma(100, kucukManav);
		
		
		buyukManav.setBk(false);
		kucukManav.setBk(true);
		
		hal.fiyatHesapl�Elma(200, buyukManav);
		hal.fiyatHesapl�Elma(100, kucukManav);
	}

}
