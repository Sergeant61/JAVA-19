package com.recepozen.odev.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Okuyucu {

	private Scanner sc;

	public List<String> dosyaOkuList(File file, boolean isSatirSatirMi, boolean isArrayListMiLinkedListMi) {

		List<String> list;

		if (isArrayListMiLinkedListMi) {

			list = new ArrayList<>();

		} else {
			list = new LinkedList<>();
		}

		dosyaOkuSc(file, isSatirSatirMi, list);

		return list;

	}

	private void dosyaOkuSc(File file, boolean isSatirSatirMi, List<String> list) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (isSatirSatirMi) {

			while (this.sc.hasNextLine()) {

				listYaz(list, sc.nextLine());

			}

		} else {

			while (this.sc.hasNext()) {

				listYaz(list, sc.next());

			}
		}
	}

	private void listYaz(List<String> list, String value) {

		list.add(value);

	}

	public void konsolYaz(List<String> list) {

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

	public void sýrala(List<String> list) {

		Collections.sort(list);

	}

	public void konsolVeStreamYaz(File file, boolean ardArdaMi, List<String> list) {
		FileOutputStream outStream;

		String text;

		try {

			outStream = new FileOutputStream(file, ardArdaMi);

			for (int i = 0; i < list.size(); i++) {

				text = "\n" + list.get(i);
				outStream.write(text.getBytes());
				System.out.print(text);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
