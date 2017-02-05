package com.vektorel.kurs;

public abstract class AKurs {
	
	abstract void egitimVer();
	
	
	public double fiyatHesapla(Kisi kisi){
		
		if(kisi.getMevki().equalsIgnoreCase("Öðrenci")){
			System.out.println("Öðrenci indirimi");
			return 5000;	
		}
		else{
			System.out.println("Normal Fiyat");
			return 6000;
		}
		
		
	}
	
	public void ilkEgitimZamaný(Kisi kisi){
		
		if(kisi.isHoca()){
			System.out.println("Hocam Hoþgeldiniz");}
		else{
			System.out.println("Müsterimiz Hoþgeldiniz");
		}
		
	}
	

}
