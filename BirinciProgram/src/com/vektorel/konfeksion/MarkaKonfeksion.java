package com.vektorel.konfeksion;

public class MarkaKonfeksion extends AKonfeksiyon {

	@Override
	public double satinAlma(int fiyat, int miktar) {
		setKdv(0.10);
		return super.satinAlma(fiyat, miktar);
	}
	
	@Override
	public void kumasKesme1() {
		// TODO Auto-generated method stub
		
	}
}
