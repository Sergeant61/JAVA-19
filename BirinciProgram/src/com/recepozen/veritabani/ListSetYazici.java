package com.recepozen.veritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListSetYazici {
	private Scanner sc;

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

			while (this.sc.hasNextLine()) {

				if (listMiSetMi) {
					listYaz(list, sc.nextLine());

				} else {
					setYaz(set, sc.nextLine());
				}

			}

		} else {

			while (this.sc.hasNext()) {

				if (listMiSetMi) {
					listYaz(list, sc.next());

				} else {
					setYaz(set, sc.next());
				}

			}
		}
	}

	private void listYaz(List<String> list, String value) {

		list.add(value);

	}

	private void setYaz(Set<String> set, String value) {

		set.add(value);

	}

	public void konsolYaz(List<String> list) {

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

	public void konsolYaz(Set<String> set) {

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

	}
}
