package com.vektorel.hatalar;

import javax.swing.JOptionPane;

public class ArrayIslem {

	public static void main(String[] args) {
		
		int[] hataliList = new int[3];
		
	
		try{
			hataliList[0]=10;
			hataliList[1]=20;
			hataliList[2]=30;
			
			System.out.println("Hata öncesi.");
			
			hataliList[3]=30;
			
			System.out.println("Hata Sonrasý.");

		}catch (Exception e) {

			System.out.println("Hata Kodu :"+e);
			JOptionPane.showMessageDialog(null,e);
			
			//e.printStackTrace();
			
		}
		
		

		
		System.out.println("Herþey yolunda.");
		
	}
	
	
	
}
