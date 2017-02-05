package com.recepozen.kelime;

public class KelimeSaydýr {

	public static void main(String[] args) {

		String Kelime = "jnfvqa lenlaenmdfl flaflal kflkamsf";

		int sayac = 1;

		for (int i = 0; i < Kelime.length(); i++) {

			if (32 == Kelime.charAt(i)) {

				sayac = sayac + 1;

			}

		}

		System.out.println("Paragrafta bulunan kelime sayýsý= " + sayac);
	}

}
