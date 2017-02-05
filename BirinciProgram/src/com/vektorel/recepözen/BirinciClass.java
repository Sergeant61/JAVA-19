package com.vektorel.recepözen;

import java.util.Scanner;

import com.vektorel.kalitim3.Araba;

public class BirinciClass extends Araba {
	
	short age = 21;

	public static void main(String[] args) {
		
		
		/*System.out.println("Recep Özen");

		String name = "Recep";
		String surname = "Özen";
		
		boolean cins = true; // true=Erkek / false=Bayan
		String conpany = "";
		String pozisyon = "";
		float many = 4150.50f;
		boolean evliMi = false;

		int sayý1 = 121;
		int sayý2 = 25;
		int sonuc = sayý1 % sayý2;
		System.out.println(sonuc);

		int rakam1 = 20;
		rakam1 += 21;
		rakam1 *= 21;
		rakam1 /= 21;
		rakam1 -= 21;
		System.out.println(rakam1);

		byte x = 8; // bit düzeyinde iþlemler
		byte y = 7; //
		System.out.println(x & y); // bit düzeyinde ve lemek
		System.out.println(x | y); // bit düzeyinde veyalamak

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		int maasým = 1500;
		System.out.println(maasým <= 1250);

		if (maasým > 2500) {

			System.out.println("Maaþýn yüksek.");

		} else if (maasým < 750) {

			System.out.println("Maþýn düþük.");

		} else if (maasým > 1250 && maasým < 1500) {

			System.out.println("Maþýn düþüðe yakýn.");
		} else {

			System.out.println("Maaþýn ideal.");
		}

		// String a = maasým > 2500 ? "recep" : "özen";

		// for( baþlangýç ; bitiþ ; arttýrým ) {}

		System.out.println("------------------");

		int i;
		for (i = 0; i < 10; i++) {

			if (i == 5) {
				System.out.println("Beþi atlýyorum");

				// continue; // bir satýr atla
				// break; // break görüldümü for biter.
			}

			/*
			 * if (i!=5) { System.out.println("Þu anki sayý : "+(i+1)); }
			 */

		/*	System.out.println("Þu anki sayý : " + (i + 1));

		}
		System.out.println(i);

		int sayac = 5;
		while (sayac < 25) {

			System.out.println((sayac - 4) + "-) Sayac yazýyor.");
			sayac++;
		}

		do {
			System.out.println("Do while çalýþýyor."); // sadece bir kere
														// çalýþýr. while false
														// olduðu için.
		} while (false);

		System.out.println("------------------");

		for (i = 0; i < 5; i++) {

			for (int k = 0; k <= i; k++) {
				System.out.print(" * ");
			}
			System.out.println();

			/*
			 * if(i==0){ System.out.println("*"); }else if(i==1){
			 * System.out.println("* *"); }else if(i==2){
			 * System.out.println("* * *"); }else if(i==3){
			 * System.out.println("* * * *"); }
			 */

		/*}
		System.out.println("------------------");

		for (i = 5; i > 0; i--) {

			for (int k = 0; k < i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("------------------");
		int k;
		i = 5;
		while (i >= 0) {
			k = 0;
			while (k < i) {

				System.out.print(" * ");
				k++;
			}
			System.out.println();

			i--;
		}

		System.out.println("------------------");

		for (i = 0; i < 10; i++) {

			for (k = 0; k <= i % 5; k++) {
				System.out.print(" * ");
			}

			System.out.println();
			// if(i==4)i=0;
		}*/
		
	
		
			
			
			
		
		/* Sarmal veri tipleri
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * 
		 */
		
		/*byte a1; // Byte
		short a2; // Short
		int a3; // Integer
		long a4; // Long
		float a5; // Float
		double a6; // Double
		char a7; // Char
		boolean a8; // Boolean
		String a9; // String

		if(a8==false) {
			
		}
		
		for (int i = 0; i < 10; i++) {

		}
		int i;
		while (i <= 10) {

		}
		
		do{
			System.out.println("Bir kere Çalýþ");
		}while(false);*/
		
		/*System.out.println("-----------------------");
		for (int i = 0; i < 5; i+=2) {	
				for(int k=0; i>=k  ; k++){	
					System.out.print("*");
				}
				System.out.println();	
		}
		byte age=20;
		
		System.out.println("-----------------------");
		
		switch (age) {
		
			case 19:
				System.out.println("Yaþýnýz 19");
				break;
			case 20:
				System.out.println("Yaþýnýz 20");	
				break;
			case 21:
				System.out.println("Yaþýnýz 21");
				break;
			default:
			System.out.println("Yaþýnýzý Bulamadýk");	
				break;
	
		}
		
		int[] a = new int[5];		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		
		
		

		/*
		 * && ve || veya < küçüktür <= küçük eþittir > büyüktür >= büyük eþittir
		 * == eþittir
		 */

		
		double sayi1 = 0;
		double sayi2 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// System.out.println(sc.nextLine());

		hesap h = new hesap();
		System.out.println("Birinci Sayýyý Giriniz.");
		sayi1 = sc.nextDouble();
		System.out.println("Ýkinci Sayýyý Giriniz.");
		sayi2 = sc.nextDouble();

		System.out.println(h.cýkar(sayi1, sayi2));
		System.out.println(h.böl(sayi1, sayi2));
		System.out.println(h.topla(sayi1, sayi2));
		System.out.println(h.carp(sayi1, sayi2));
		 

	}

}

/*
 * DEÐÝÞKEN TÜRLERÝ METÝNSEL VERÝ TÜRLERÝ
 * 
 * byte 8 bit 1 byte yapar String Short 16 bit
 * 
 * int 32 bit long 64 bit
 * 
 * float 32 bit double 64 bit
 * 
 * bloolean 1 0 yes no 8 bit olabir char karakter tipi tuyar 16 bit UTF-16
 * "a-64/A-65"
 * 
 */