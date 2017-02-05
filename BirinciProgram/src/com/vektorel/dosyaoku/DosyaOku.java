package com.vektorel.dosyaoku;

import java.io.FileNotFoundException;

public class DosyaOku {

	public void dosyaOku()throws FileNotFoundException {

		throw new FileNotFoundException("Hata : File Not Found Exception");
	}

	public void islemYap() {

		try {
			dosyaOku();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
