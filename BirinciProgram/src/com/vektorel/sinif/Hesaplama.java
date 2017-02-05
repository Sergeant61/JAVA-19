package com.vektorel.sinif;

import java.util.Scanner;

public class Hesaplama {

	public static void main(String[] args) {

		Muhasebeci muhasebeci = new Muhasebeci();
		Scanner scanner = new Scanner(System.in);
		System.out.println("KDV'siz fiyatý hesapla");
		System.out.println("KDVLÝ FÝYAT:" + muhasebeci.kdvHesap(scanner.nextDouble()));
		scanner.close();

	}

}