package com.recepozen.kelime;

public class CumleSirala {

	static String paragraf = "Microsoft�un yak�n zamanda sunaca�� b�y�k g�ncellemesi Windows 10 Creators Update�in bir par�as� "
			+ "olacak yeni oyun modunun testleri ba�lad�. Oyun oynarken sistemi optimize ederek al�nan kare h�z�n� "
			+ "iyile�tirece�i s�ylenen Game Mode i�in nas�l �al��t���na ili�kin bir de tan�t�m videosu da payla��ld�. "
			+ "Microsoft�un oyunlar� PC platformunda oynayanlar i�in getirdi�i yeni �zelliklerden birisi olan Game Mode "
			+ "(Oyun Modu), CPU ve GPU kullan�m�n�n �o�unlu�unu oyuna ay�rarak oyunun maksimum performansta �al��mas�n� "
			+ "sa�layacak. Oyuncular�n en �ok �ikayet etti�i d���k kare h�z� (FPS) sorununa ��z�m getirece�i a�ikar olan "
			+ "yeni modu, otomatik olarak devreye girmeyecek. Windows Ayarlar� ekran�nda Oyun b�l�m�nden girip Oyun Modunu "
			+ "a�mak gerecek. Microsoft, bu noktada baz� oyunlar�n bu �zelli�i otomatik olarak etkinle�tirdi�ini belirtiyor.";

	public static void main(String[] args) {

		int sayac = 0;

		for (int i = 0; i < paragraf.length(); i++) {

			if (46 == paragraf.charAt(i)) {

				sayac = sayac + 1;

			}

		}

		String[] ad1 = new String[sayac];

		int j = 0, baslangicIndex = 0;

		for (int i = 0; i < paragraf.length(); i++) {

			if (46 == paragraf.charAt(i)) {

				ad1[j] = paragraf.substring(baslangicIndex, i + 1);
				baslangicIndex = i + 1;
				j = j + 1;
			}

		}

		for (int i = 0; i < ad1.length; i++) {

			System.out.println(ad1[i]);

		}
		
		
		int sayac1 = 0;
		
		for (int i = 0; i < ad1.length; i++) {

			sayac1 = 0;
			for(int k = 0; k < ad1[i].length();k++){
					
				if(32==ad1[i].charAt(k)){
					
					sayac1 = sayac1 + 1;
				}
			 
			
			}
			
			ad1[i]=Integer.toString(sayac1);

		}
		
		
		
		int sayi1 = 0;
		int sayi2 = 0;
		
		for (int i = 0; i < ad1.length; i++) {

			for (int k = 0; k < ad1.length; k++)
				if (Integer.valueOf(ad1[k]) > Integer.valueOf(ad1[i])) { // Kodun fark� burda
					
					sayi1 = Integer.valueOf(ad1[k]);
					sayi2 = Integer.valueOf(ad1[i]);
					ad1[k] =Integer.toString(sayi2);
					ad1[i] =Integer.toString(sayi1);
				}
		}

		
		for (int i = 0; i < ad1.length; i++) {

			System.out.println(ad1[i]);

		}
		
		
		
		



	}
}
