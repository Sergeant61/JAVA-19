package com.vektorel.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazici {
	PrintWriter pw;
	
	
	public void dosyaAc() {
		try {
			this.pw = new PrintWriter("log/yazici.txt");
			// this.pw.println("Recep Vektörel Java");
			// this.pw.println("Merhaba Dünya");
			// this.pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void dosyaKapt() {
		this.pw.close();
	}

	public void veriEkle(Person person) {
		this.pw.println(person.getId() + " " + person.getName());
	}
}
