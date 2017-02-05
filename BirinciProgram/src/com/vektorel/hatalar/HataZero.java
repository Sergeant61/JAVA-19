package com.vektorel.hatalar;

import java.util.Scanner;

public class HataZero {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Giriþ yapýn.");
		
		try{
		
		int a = scanner.nextInt() / scanner.nextInt();
		
		}catch (Exception e) {

			System.out.println("Hata var dostum." + e);
			e.printStackTrace();
			
		}
		
		
		
	}
	
}
