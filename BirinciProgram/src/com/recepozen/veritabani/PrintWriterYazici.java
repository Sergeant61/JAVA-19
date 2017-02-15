package com.recepozen.veritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Yazici {

	private Scanner sc;

	public void listYaz(List<String> list, String value) {

		list.add(value);

	}

	public void setYaz(Set<String> set, String value) {

		set.add(value);

	}

	public void KonsolYaz(List<String> list) {

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

	public void KonsolYaz(Set<String> set) {

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

	public void veriYaz(File file) {

		

	}

}
