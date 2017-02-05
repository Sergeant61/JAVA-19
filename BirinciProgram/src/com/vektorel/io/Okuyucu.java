package com.vektorel.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {

	public void dosyaAc() {
		File file = new File("yazici.txt"); 
		
		Scanner oku;
		try {
			oku = new Scanner(file);
			
			while (oku.hasNext()) {
				System.out.println(oku.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}

}
