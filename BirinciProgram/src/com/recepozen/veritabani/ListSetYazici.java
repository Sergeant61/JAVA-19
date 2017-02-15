package com.recepozen.veritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Okuyucu {
	private Scanner sc;
	private Yazici yazici;

	public List<String> dosyaOkuList(File file, boolean isSatirSatirMi, boolean isArrayListMiLinkedListMi) {

		List<String> list;
		Set<String> set = null;

		if (isArrayListMiLinkedListMi) {

			list = new ArrayList<>();

		} else {
			list = new LinkedList<>();
		}

		dosyaOkuSc(file, isSatirSatirMi, list, set, true);

		return list;

	}

	public Set<String> dosyaOkuSet(File file, boolean isSatirSatirMi, int hashSetMiLinkedHashSetMiTreeSetMi) {

		Set<String> set = null;
		List<String> list = null;

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

		dosyaOkuSc(file, isSatirSatirMi, list, set, false);

		return set;
	}

	private void dosyaOkuSc(File file, boolean isSatirSatirMi, List<String> list, Set<String> set,
			boolean listMiSetMi) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (isSatirSatirMi) {
			this.yazici = new Yazici();
			while (this.sc.hasNextLine()) {

				if (listMiSetMi) {
					yazici.listYaz(list, sc.nextLine());

				} else {
					yazici.setYaz(set, sc.nextLine());
				}

			}

		} else {

			this.yazici = new Yazici();
			while (this.sc.hasNext()) {

				if (listMiSetMi) {
					yazici.listYaz(list, sc.next());

				} else {
					yazici.setYaz(set, sc.next());
				}

			}
		}
	}

}
