package com.vektorel.kurs;

public abstract class AKurs {
	
	abstract void egitimVer();
	
	
	public double fiyatHesapla(Kisi kisi){
		
		if(kisi.getMevki().equalsIgnoreCase("��renci")){
			System.out.println("��renci indirimi");
			return 5000;	
		}
		else{
			System.out.println("Normal Fiyat");
			return 6000;
		}
		
		
	}
	
	public void ilkEgitimZaman�(Kisi kisi){
		
		if(kisi.isHoca()){
			System.out.println("Hocam Ho�geldiniz");}
		else{
			System.out.println("M�sterimiz Ho�geldiniz");
		}
		
	}
	

}
