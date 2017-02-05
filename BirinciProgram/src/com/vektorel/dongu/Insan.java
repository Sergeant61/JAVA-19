package com.vektorel.dongu;

import java.util.Scanner;

public class Insan {

	private void akciger(String oksijen) {
		System.out.println(oksijen);
	}

	private void b�brek(String ure) {
		System.out.println(ure);
	}

	private void karaciger(String toksit) {
		System.out.println(toksit);
	}

	public static void main(String[] args) {
		Insan insan = new Insan();
		Scanner sc = new Scanner(System.in);

		System.out.println("Tapmak istedi�iniz i�lemi se�iniz. 1 2 3");
		
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				insan.akciger("Nefes al�yorum.");
				break;
			case 2:
				insan.b�brek("Kan� temizliyorum.");
				break;
			case 3:
				insan.karaciger("Vitaminleri depoluyorum.");
				break;

			default:
				System.out.println("V�cut Ex.");
				break;
			}
			
		}
	}

}
