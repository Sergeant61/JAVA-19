package com.vektorel.konfeksion;

public abstract class AKonfeksiyon {
	
	abstract public void kumasKesme1();
	
	private double kdv = 0.18;
	
	public double satinAlma(int fiyat,int miktar){
	
		return fiyat * miktar + (fiyat * miktar * kdv); 
	}
	
	public double toptancidanAlma(int fiyat,int miktar,int komisyon){
		
		return fiyat*miktar+(fiyat*miktar*kdv)+komisyon; 
	}
	
	public void kumasKesme (){
		System.out.println("Kumaþ Kesti.");
	}

	public double getKdv() {
		return kdv;
	}

	public void setKdv(double kdv) {
		this.kdv = kdv;
	}
	
	
	
	
	
}
