package com.recepozen.odev.set;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Okuyucu {

	Scanner sc;

	public Set<String> dosyaOkuSet(int hashSetMiLinkedHashSetMiTreeSetMi) {

		Set<String> set = null;

		switch (hashSetMiLinkedHashSetMiTreeSetMi) {
		case 0:

			set = new HashSet<>();

			break;

		case 1:

			set = new LinkedHashSet<>();

			break;

		case 2:

			set = new TreeSet<>();

			break;

		default:
			System.out.println("Parametreler Yanlýþ Girilmiþtir.");
			break;
		}

		dosyaOkuSc(set);

		return set;
	}

	private void dosyaOkuSc(Set<String> set) {

		sc = new Scanner(System.in);
		String text;

		while (true) {

			text = sc.nextLine();
			if (text.equals("exit")) {
				break;
			}
			setYaz(set, text);

		}

	}

	private void setYaz(Set<String> set, String value) {

		set.add(value);

	}

	public void konsolVeStreamYaz(File file, boolean ardArdaMi, Set<String> set) {
		FileOutputStream outStream;
		Iterator<String> iterator = set.iterator();

		String text;

		try {

			outStream = new FileOutputStream(file, ardArdaMi);

			while (iterator.hasNext()) {

				text = iterator.next();
				outStream.write(text.getBytes());
				System.out.println(text);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
