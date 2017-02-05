package com.vektorel.recep�zen;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Rekursif {

	public double faktoriyel(double value) {
		if (value == 1) {
			return 1;
		}
		return value * faktoriyel(value - 1);
	}

	public double faktoriyelFor(double value) {
		double sonuc = 1;
		for (double i = 1; i <= value; i++) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}

	public void isimYazma(int value, String isim) {
		if (value == 0) {
			return;
		}
		System.out.println(isim);
		isimYazma(value - 1, isim);
	}

	public void isimYazmaFor(int value, String isim) {
		for (int i = 0; i < value; i++) {
			System.out.println(isim);
		}
	}

	public int fibo(int rakam) {

		if (rakam == 1) {
			return 1;
		}
		if (rakam == 0) {
			return 0;
		}

		return fibo(rakam - 1) + fibo(rakam - 2);
	}

	public int ustAl(int taban, int ust) {

		if (ust == 0) {
			return 1;
		}

		return taban * ustAl(taban, ust - 1);
	}

	public void bekleme(int suru) {

		Timer timer = new Timer();

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println(suru + " sn beklendi.");

			}
		};
		timer.schedule(task, suru * 1000);

	}

	public static void main(String[] args) {
		Rekursif rekursif = new Rekursif();
		Scanner sc = new Scanner(System.in);
		// System.out.println(rekursif.faktoriyel(5));
		// rekursif.isimYazma(5, "Recep");
		// rekursif.isimYazmaFor(5, "�mer");
		// System.out.println(rekursif.faktoriyelFor(5));
		// System.out.println("Fibo say�s�n� giriniz: ");
		// System.out.println("Fibo say�s�n� : " + rekursif.fibo(sc.nextInt()));
		// System.out.println("Taban ve �st say�s�n� giriniz: ");
		// System.out.println(rekursif.ustAl(sc.nextInt(), sc.nextInt()));

		System.out.println("Ka� sn beklemek istiyorsunuz.");
		rekursif.bekleme(sc.nextInt());
		sc.close();

	}

}
