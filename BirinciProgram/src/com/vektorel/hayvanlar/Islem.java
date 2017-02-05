package com.vektorel.hayvanlar;

public class Islem {

	public static void main(String[] args) {
		Kaplan kaplan = new Kaplan();
		
		kaplan.avlan();
		kaplan.takipEt();
		
		IHayvan ikaplan = new Kaplan();
		
		ikaplan.avlan();
		
		AKedi akaplan = new Kaplan();
		
		akaplan.avlan();
		akaplan.takipEt();
		
		AKedi aKedi = new AKedi() {
			
			@Override
			public void avlan() {
				// AKED� CLASININ �NTERFACES� OLDU�U ���N RUN T�ME DE OLU�TURAB�L�YORUZ.
				
			}
		};
		
	}
}
