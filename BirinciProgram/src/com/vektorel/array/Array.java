package com.vektorel.array;

public class Array implements IArray, IArrayMax{

	int[] array;

	public Array(int[] dizi) {

		this.array = dizi;

	}

	public void diziSiralaTek() {
		System.out.println();
		System.out.println("Çift Sayý");

		for (int i = 0; i < this.array.length; i++) {

			if (0 == (this.array[i] % 2)) {
				System.out.print(this.array[i] + " ");
			}

		}
	}

	public void diziSiralaCift() {

		System.out.println();
		System.out.println("Tek Sayý");

		for (int i = 0; i < this.array.length; i++) {

			if (1 == (this.array[i] % 2)) {
				System.out.print(this.array[i] + " ");
			}

		}

	}
	
	public void diziSiralaMax() {

		System.out.println();
		int ilk = this.array[0];
		for(int i = 0 ; i < this.array.length ; i++ ){
			if(ilk < this.array[i])
				ilk =  this.array[i];
		}
		System.out.println("Max Sayý " + ilk);

	}

}
