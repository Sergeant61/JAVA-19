package com.vektorel.konfeksion;

public class KozaKonfeksiyon extends AKonfeksiyon {

	public double satinAlma(int fiyat, int miktar, int indirim) {

		return super.satinAlma(fiyat, miktar) - indirim;
	}

	@Override
	public void kumasKesme1() {
		// TODO Auto-generated method stub
		
	}

}
