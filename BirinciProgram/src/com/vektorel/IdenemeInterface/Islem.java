package com.vektorel.IdenemeInterface;

public class Islem {

	public static void main(String[] args) {
//
//		IAraba volvo = new Volvo();
//		IAraba bmw = new Bmw();
//		IAraba tofas = new Tofas();
//		
//		
//		volvo.gaz();
//		volvo.fren();
//		volvo.debriyaj();
//		volvo.elFeneri();
//		volvo.direksiyon();
//		
//		System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
//				
//		bmw.gaz();
//		bmw.fren();
//		bmw.debriyaj();
//		bmw.elFeneri();
//		bmw.direksiyon();
//		
//		System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
//				
//		tofas.gaz();
//		tofas.fren();
//		tofas.debriyaj();
//		tofas.elFeneri();
//		tofas.direksiyon();
//		
//		System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
		IKoportaci KoportaciTofas = new Tofas();
		
		IKoportaci koportaciVolvo = new Volvo();
		
		KoportaciTofas.boya("Bordo");
		koportaciVolvo.boya("Mavi");
		

	}
}
