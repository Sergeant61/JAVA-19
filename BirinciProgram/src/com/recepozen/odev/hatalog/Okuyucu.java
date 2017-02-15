package com.recepozen.odev.hatalog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Okuyucu {

	Scanner sc;

	public void konsolYaz(Set<String> set) {
		int sayac = 0;
		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

			try {
				if (sayac == 1) {
					throw new Hata("Ýterator Hatasý");
				}
			} catch (Hata e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sayac = sayac + 1;
		}
	}

	public Set<String> dosyaOkuSet(File file, boolean isSatirSatirMi, int hashSetMiLinkedHashSetMiTreeSetMi) {

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

		dosyaOkuSc(file, isSatirSatirMi, set, false);

		return set;
	}

	private void dosyaOkuSc(File file, boolean isSatirSatirMi, Set<String> set, boolean listMiSetMi) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (isSatirSatirMi) {

			while (this.sc.hasNextLine()) {

				setYaz(set, sc.nextLine());

			}

		} else {

			while (this.sc.hasNext()) {

				setYaz(set, sc.next());

			}
		}
	}

	private void setYaz(Set<String> set, String value) {

		set.add(value);

	}

}
