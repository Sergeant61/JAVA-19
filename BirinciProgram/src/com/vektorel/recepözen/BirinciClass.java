package com.vektorel.recep�zen;

import java.util.Scanner;

import com.vektorel.kalitim3.Araba;

public class BirinciClass extends Araba {
	
	short age = 21;

	public static void main(String[] args) {
		
		
		/*System.out.println("Recep �zen");

		String name = "Recep";
		String surname = "�zen";
		
		boolean cins = true; // true=Erkek / false=Bayan
		String conpany = "";
		String pozisyon = "";
		float many = 4150.50f;
		boolean evliMi = false;

		int say�1 = 121;
		int say�2 = 25;
		int sonuc = say�1 % say�2;
		System.out.println(sonuc);

		int rakam1 = 20;
		rakam1 += 21;
		rakam1 *= 21;
		rakam1 /= 21;
		rakam1 -= 21;
		System.out.println(rakam1);

		byte x = 8; // bit d�zeyinde i�lemler
		byte y = 7; //
		System.out.println(x & y); // bit d�zeyinde ve lemek
		System.out.println(x | y); // bit d�zeyinde veyalamak

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		int maas�m = 1500;
		System.out.println(maas�m <= 1250);

		if (maas�m > 2500) {

			System.out.println("Maa��n y�ksek.");

		} else if (maas�m < 750) {

			System.out.println("Ma��n d���k.");

		} else if (maas�m > 1250 && maas�m < 1500) {

			System.out.println("Ma��n d����e yak�n.");
		} else {

			System.out.println("Maa��n ideal.");
		}

		// String a = maas�m > 2500 ? "recep" : "�zen";

		// for( ba�lang�� ; biti� ; artt�r�m ) {}

		System.out.println("------------------");

		int i;
		for (i = 0; i < 10; i++) {

			if (i == 5) {
				System.out.println("Be�i atl�yorum");

				// continue; // bir sat�r atla
				// break; // break g�r�ld�m� for biter.
			}

			/*
			 * if (i!=5) { System.out.println("�u anki say� : "+(i+1)); }
			 */

		/*	System.out.println("�u anki say� : " + (i + 1));

		}
		System.out.println(i);

		int sayac = 5;
		while (sayac < 25) {

			System.out.println((sayac - 4) + "-) Sayac yaz�yor.");
			sayac++;
		}

		do {
			System.out.println("Do while �al���yor."); // sadece bir kere
														// �al���r. while false
														// oldu�u i�in.
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
			System.out.println("Bir kere �al��");
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
				System.out.println("Ya��n�z 19");
				break;
			case 20:
				System.out.println("Ya��n�z 20");	
				break;
			case 21:
				System.out.println("Ya��n�z 21");
				break;
			default:
			System.out.println("Ya��n�z� Bulamad�k");	
				break;
	
		}
		
		int[] a = new int[5];		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		
		
		

		/*
		 * && ve || veya < k���kt�r <= k���k e�ittir > b�y�kt�r >= b�y�k e�ittir
		 * == e�ittir
		 */

		
		double sayi1 = 0;
		double sayi2 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// System.out.println(sc.nextLine());

		hesap h = new hesap();
		System.out.println("Birinci Say�y� Giriniz.");
		sayi1 = sc.nextDouble();
		System.out.println("�kinci Say�y� Giriniz.");
		sayi2 = sc.nextDouble();

		System.out.println(h.c�kar(sayi1, sayi2));
		System.out.println(h.b�l(sayi1, sayi2));
		System.out.println(h.topla(sayi1, sayi2));
		System.out.println(h.carp(sayi1, sayi2));
		 

	}

}

/*
 * DE���KEN T�RLER� MET�NSEL VER� T�RLER�
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