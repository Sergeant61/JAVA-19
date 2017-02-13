package com.vektorel.file;

import java.io.File;
import java.io.IOException;

public class DosyaIslemleri {

	public DosyaIslemleri(String paht) {
		File file = new File(paht);
		if (file.exists()) {
			if (file.isDirectory()) {
				String[] list = file.list();

				File[] files = file.listFiles();

				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()) {
						System.out.println(files[i].getName());
						
					}else {
						
						
					}

				}

				// for (int i = 0; i < list.length; i++) {
				// System.out.println(list[i]);
				//
				// }
			} else if (file.isFile()) {

				System.out.println(file.getName());
				System.out.println(file.getPath());
				file.delete();
			}
		} else {

			String[] array = paht.split("\\.");

			if (array.length > 1) {
				try {
					file.createNewFile();

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				file.mkdir();

			}

		}
	}

}
