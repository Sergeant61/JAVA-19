package com.vektorel.vergilendirme;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�sminizi giriniz.");

		try {

			String ad = sc.nextLine();

			if (!(ad.equals("Ahmet") || ad.equals("Mehmet") || ad.equals("Hasan"))) {
				throw new VergiHatalari(1);
			}

			System.out.println("Kar�n�z� giriniz.");

			int kar = sc.nextInt();

			if (kar < 0) {

				throw new VergiHatalari(2);
			}
			double vergi = (kar / 100) * 40;
			System.out.println("Vergi : " + vergi);
		} catch (VergiHatalari e) {
		}

	}

}
