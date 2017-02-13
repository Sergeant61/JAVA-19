package com.vektorel.dosyaveritabani;

import java.io.File;
import java.util.Scanner;

public class Okuyucu {

	public void dosyaOku(File file) {

		Scanner oku;
		try {
			
			oku = new Scanner(file);

			while (oku.hasNext()) {
				System.out.println(oku.next());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
