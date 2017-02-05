package com.recepozen.kelime;

public class CumleSirala {

	static String paragraf = "Microsoft’un yakýn zamanda sunacaðý büyük güncellemesi Windows 10 Creators Update’in bir parçasý "
			+ "olacak yeni oyun modunun testleri baþladý. Oyun oynarken sistemi optimize ederek alýnan kare hýzýný "
			+ "iyileþtireceði söylenen Game Mode için nasýl çalýþtýðýna iliþkin bir de tanýtým videosu da paylaþýldý. "
			+ "Microsoft’un oyunlarý PC platformunda oynayanlar için getirdiði yeni özelliklerden birisi olan Game Mode "
			+ "(Oyun Modu), CPU ve GPU kullanýmýnýn çoðunluðunu oyuna ayýrarak oyunun maksimum performansta çalýþmasýný "
			+ "saðlayacak. Oyuncularýn en çok þikayet ettiði düþük kare hýzý (FPS) sorununa çözüm getireceði aþikar olan "
			+ "yeni modu, otomatik olarak devreye girmeyecek. Windows Ayarlarý ekranýnda Oyun bölümünden girip Oyun Modunu "
			+ "açmak gerecek. Microsoft, bu noktada bazý oyunlarýn bu özelliði otomatik olarak etkinleþtirdiðini belirtiyor.";

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
				if (Integer.valueOf(ad1[k]) > Integer.valueOf(ad1[i])) { // Kodun farký burda
					
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
