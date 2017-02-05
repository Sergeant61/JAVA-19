package com.vektorel.array;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dizi miktarýný giriniz.");
		int[] dizi = new int[sc.nextInt()];
		//sc.nextLine();


		try {

			for (int i = 0; i < dizi.length+1; i++) {

				dizi[i] = Integer.parseInt(sc.next());

			}

		} catch (Exception e) {
			System.out.println("Hata:"+ e);
			e.printStackTrace();
		}finally {
			System.out.println("finally");
			sc.close();
			
		}

		IArray array = new Array(dizi);
		IArrayMax array1 = new Array(dizi);

		array.diziSiralaCift();
		array.diziSiralaTek();
		array1.diziSiralaMax();

	}

}
