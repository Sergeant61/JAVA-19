package com.vektorel.vergilendirme;

public class VergiHatalari extends Exception{
	
	public VergiHatalari(int i) {
		
		switch (i) {
		case 1:
			yanlisKisi();
			break;
		case 2:
			degerHatli();
			break;
			
		}
	}

	public void yanlisKisi(){
		System.out.println("Yanl�� isim");
	}

	public void degerHatli(){
		System.out.println("De�er hatal�");
	}
}
