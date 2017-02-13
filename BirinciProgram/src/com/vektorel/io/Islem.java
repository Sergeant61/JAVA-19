package com.vektorel.io;

import java.util.Collections;

/**
 * byte Tabanl� 
 * 		InputStream
 *				FileInputStream
 *				ByteArrayInputStream
 *				FilterInputStream
 *		OutPutStream
 *				FileInputStream
 *				ByteArrayInputStream
 *				FilterInputStream
 *
 *Karekter Tanbanl�
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
 * @author Recep �zen
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
 		person.setName("Harun Re�it");
 		
 		yazici.veriEkle(person);
 		
 		person.setId(3);
 		person.setName("Emine");
 		
 		yazici.veriEkle(person);
 		yazici.dosyaKapt();
 		
 		Okuyucu okuyucu = new Okuyucu();
 		okuyucu.dosyaAc();

	}

}
