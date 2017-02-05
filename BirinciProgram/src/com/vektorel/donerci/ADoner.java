package com.vektorel.donerci;

public abstract class ADoner {
	
	private double kdv = 0.18;
	
	public void paketleme(){
		System.out.println("Paketleme");
	}
	
	public void donerKesme(){
		System.out.println("Döner Kesme");
	}
	
	public double fiatHesapla(int urunAdedi,double fiyat){
		double hesap = urunAdedi * fiyat;
		hesap=hesap+(hesap*kdv);
		return hesap;
		
	}
	

}
