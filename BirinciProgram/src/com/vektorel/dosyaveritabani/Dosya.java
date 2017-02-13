package com.vektorel.dosyaveritabani;

import java.io.File;


public class Dosya {

	public Dosya(String dosyaIsmi, String dosyaYolu) {
		Okuyucu okuyucu = new Okuyucu();
		
		File file = new File(dosyaYolu);
		if (file.exists()) {
			if (file.isDirectory()) {

				File[] files = file.listFiles();

				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()) {
						if(dosyaIsmi.equals(files[i].getName())){
							okuyucu.dosyaOku(files[i]);
						}

					} 

				}

				// for (int i = 0; i < list.length; i++) {
				// System.out.println(list[i]);
				//
				// }
			} 
		}

	}

}
