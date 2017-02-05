package com.vektorel.hatalar;

import java.util.Scanner;

public class ArayIslemString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] dizi = new String[5];

		System.out.println("Giriþ Yapýn.");

		try {

			for (int i = 0; i < 6; i++) {
				dizi[i] = scanner.nextLine();
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hey dostum hata var : " + e.getMessage() + " ");

		}catch (Exception e) {
			System.out.println("Hey dostum hata var : " + e.getMessage() + " ");

		}finally {
			
			System.out.println("416");
			
			
		}
		
		
		
		
		
		scanner.close();

	}

}
