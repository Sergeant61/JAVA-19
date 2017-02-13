package com.vektorel.io;

import java.util.Collections;

/**
 * byte Tabanlý 
 * 		InputStream
 *				FileInputStream
 *				ByteArrayInputStream
 *				FilterInputStream
 *		OutPutStream
 *				FileInputStream
 *				ByteArrayInputStream
 *				FilterInputStream
 *
 *Karekter Tanbanlý
 *		Reader
 *				BufferedReader
 *				InputStreamReader
 *				StringReander
 *		writer
 *				BufferedWriter
 *				OutputStreamWriter
 *				StringWriter
 *				Printwriter
 * 
 * @author Recep Özen
 *
 */

public class Islem {
	
	public static void main(String[] args) {
		Person person = new Person();
	
 		Yazici yazici = new Yazici();
 		
 		
		
 		yazici.dosyaAc();
 		person.setId(1);
 		person.setName("Recep");
 		
 		yazici.veriEkle(person);
 		
 		person.setId(2);
 		person.setName("Harun Reþit");
 		
 		yazici.veriEkle(person);
 		
 		person.setId(3);
 		person.setName("Emine");
 		
 		yazici.veriEkle(person);
 		yazici.dosyaKapt();
 		
 		Okuyucu okuyucu = new Okuyucu();
 		okuyucu.dosyaAc();

	}

}
