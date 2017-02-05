package com.vektorel.dongu;

import java.util.Scanner;

public class Insan {

	private void akciger(String oksijen) {
		System.out.println(oksijen);
	}

	private void böbrek(String ure) {
		System.out.println(ure);
	}

	private void karaciger(String toksit) {
		System.out.println(toksit);
	}

	public static void main(String[] args) {
		Insan insan = new Insan();
		Scanner sc = new Scanner(System.in);

		System.out.println("Tapmak istediðiniz iþlemi seçiniz. 1 2 3");
		
		while (true) {
			switch (sc.nextInt()) {
			case 1:
				insan.akciger("Nefes alýyorum.");
				break;
			case 2:
				insan.böbrek("Kaný temizliyorum.");
				break;
			case 3:
				insan.karaciger("Vitaminleri depoluyorum.");
				break;

			default:
				System.out.println("Vücut Ex.");
				break;
			}
			
		}
	}

}
