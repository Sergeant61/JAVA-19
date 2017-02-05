package com.vektorel.dongu;

import java.util.Scanner;

public class Donguler {

	public static String kelime() {

		Scanner scaner = new Scanner(System.in);
		String isim = scaner.nextLine();
		// scaner.close();

		return isim;

	}

	public static void main(String[] args) {

		System.out.println("Ýsimleri Giriniz");

		String[] ad = new String[2];

		for (int i = 0; i < ad.length; i++) {

			ad[i] = kelime();

		}

		for (int i = 0; i < ad.length; i++) {

			System.out.print(ad[i] + " ");

		}

	}

}
