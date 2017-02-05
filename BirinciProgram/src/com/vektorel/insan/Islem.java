package com.vektorel.insan;

public class Islem {

	public static void main(String[] args) {
		IInsan iInsan=new IInsan() {
			
			@Override
			public void tatmak() {
				// TODO Auto-generated method stub
				System.out.println("Tatmak");
			}
			
			@Override
			public void koklamak() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void gormek(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void duymak(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dusunmek() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dokunmak() {
				// TODO Auto-generated method stub
				
			}
		};
		
		iInsan.tatmak();
		IInsan insan = new Insan();
		Insan insan2 = new Insan();
		insan.dokunmak();
//		insan.karaciger;
		insan2.karaciger();
		
		
		
	}
	
}
