package com.vektorel.overloading;

public class Araba {


	
	public Araba() {
		System.out.println("Araba Nesnesi Oluşturuldu.");
	}

	public Araba(int arabaId) {
		System.out.println("Araba int id:" + arabaId + " nesnesi oluşturuldu.");
	}
	
	public Araba(double arabaId) {
		System.out.println("Araba double id:" + arabaId + " nesnesi oluşturuldu.");
	}
	
	public Araba(String arabaId) {
		System.out.println("Araba String id:" + arabaId + " nesnesi oluşturuldu.");
	}
	
	protected Araba(int id,String name){
		
		System.out.println("İnt iki parametreli: "+id+" Name: "+name);
		
	}
	
	protected Araba(String id,String name){
		
		System.out.println("String iki parametreli: "+id+" Name: "+name);
		
	}

	
	public Araba(Volvo volvo) {
		System.out.println("Volvo nesnesi oluşturuldu."+volvo.getId()+" "+ volvo.getName()+" "+volvo.getModel());
	}
	
	public Araba(Toyota toyota) {
		System.out.println("Toyota nesnesi oluşturuldu."+toyota.getId()+" "+ toyota.getName());
	}	
	
	public Araba(Fiat fiat) {
		System.out.println("Fiat nesnesi oluşturuldu."+fiat.getId()+" "+ fiat.getName());
	}

	public Araba(Fiat fiat, Volvo volvo) {
		System.out.println("Fiat Volvo nesnesi oluşturuldu."+fiat.getId()+" "+ fiat.getName()+" "+volvo.getId()+" "+ volvo.getName()+" "+volvo.getModel());
	}
	
	
}
