package com.vektorel.cons;

import com.vektorel.cons.pro.Fotokopi;
import com.vektorel.publicdeneme.Kagýt;

public class Kirtasiye {

	public static void main(String[] args) {
		/*Kirtasiye kirtasiye = new Kirtasiye();

		// Cetvel cetvel = new Cetvel();
		// Kalem kalem = new Kalem();
		// Defter defter = new Defter();

		Cetvel cetvel = new Cetvel(0, "Mikro Cetvel");
		Kalem kalem = new Kalem(0, "Mikro Kalem");
		Defter defter = new Defter(0, "Mikro Defter");

		kirtasiye.cetvelOku(cetvel);
		kirtasiye.kalemOku(kalem);
		kirtasiye.defterOku(defter);
		
		System.out.println("-----------------------");
		
		cetvel.Oku();
		kalem.Oku();
		defter.Oku();
		
		System.out.println("-----------------------");
		
		System.out.println(cetvel.IsimSoyle());
		System.out.println(cetvel.IdSoyle());
		
		System.out.println(kalem.IsimSoyle());
		System.out.println(kalem.IdSoyle());
		
		System.out.println(defter.IsimSoyle());
		System.out.println(defter.IdSoyle());
		
		System.out.println("-----------------------");*/
		
		Fotokopi fotokopi = new Fotokopi();
		
		System.out.println(fotokopi.id);
		
		System.out.println(fotokopi.isim);
		
		
		System.out.println("-----------------------");
		
		Kagýt kagýt = new Kagýt();
		
		kagýt.setId(5);
		
		System.out.println(kagýt.getId());
		System.out.println("-----------------------");
		
		Canta canta = new Canta();
		
		System.out.println(canta.getId());
		System.out.println(canta.getName());
		
	}

	public void cetvelOku(Cetvel cetvel) {

		System.out.println("Benim idim: " + cetvel.getId());
		System.out.println("Benim Ýsmim: " + cetvel.getIsim());
	}

	public void kalemOku(Kalem kalem) {

		System.out.println("Benim idim: " + kalem.getId());
		System.out.println("Benim Ýsmim: " + kalem.getIsim());
	}

	public void defterOku(Defter defter) {

		System.out.println("Benim idim: " + defter.getId());
		System.out.println("Benim Ýsmim: " + defter.getIsim());
	}

}