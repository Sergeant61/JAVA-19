package com.vektorel.recepözen;

public class Diziler {

	public static void main(String[] args) {

		char[] ad = new char[5];
		ad[0] = 'R';
		ad[1] = 'e';
		ad[2] = 'c';
		ad[3] = 'e';
		ad[4] = 'p';
		System.out.println(ad);

		String[] ad1 = new String[5];
		ad1[0] = "R";
		ad1[1] = "e";
		ad1[2] = "c";
		ad1[3] = "e";
		ad1[4] = "p";
		System.out.println(ad1);

		for (int i = 0; i < ad.length; i++) {
			System.out.println(ad[i]);
		}

		String[] firmaAdi = new String[] { "Vektörel", "Biliþim", "A.Þ." };

		for (int i = 0; i < firmaAdi.length; i++) {
			System.out.println(firmaAdi[i]);
		}

		int[][][] ikiboyutldizi = new int[2][3][2]; // satýr ilk deðer ,sütun
													// Ýkinci deðer.

		// ikiboyutldizi[0][0][0]=(int) (Math.random()*10);
		// ikiboyutldizi[0][1]=(int) (Math.random()*10);
		// ikiboyutldizi[1][0]=(int) (Math.random()*10);
		// ikiboyutldizi[1][1]=(int) (Math.random()*10);

		int say = 0;
		for (int i = 0; i < ikiboyutldizi.length; i++) {

			for (int k = 0; k < ikiboyutldizi[0].length; k++) {

				for (int j = 0; j < ikiboyutldizi[0][0].length; j++) {
					ikiboyutldizi[i][k][j] = say;
					say++;
				}
			}

		}

		for (int i = 0; i < ikiboyutldizi.length; i++) {

			for (int k = 0; k < ikiboyutldizi[0].length; k++) {
				for (int j = 0; j < ikiboyutldizi[0][0].length; j++)
					System.out.print(ikiboyutldizi[i][k][j] + "-");
			}
			System.out.println();
		}
		
		// Scanner scanner = new Scanner(System.in);

	}

}
