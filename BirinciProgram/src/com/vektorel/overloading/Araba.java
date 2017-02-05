package com.vektorel.overloading;

public class Araba {


	
	public Araba() {
		System.out.println("Araba Nesnesi Oluþturuldu.");
	}

	public Araba(int arabaId) {
		System.out.println("Araba int id:" + arabaId + " nesnesi oluþturuldu.");
	}
	
	public Araba(double arabaId) {
		System.out.println("Araba double id:" + arabaId + " nesnesi oluþturuldu.");
	}
	
	public Araba(String arabaId) {
		System.out.println("Araba String id:" + arabaId + " nesnesi oluþturuldu.");
	}
	
	protected Araba(int id,String name){
		
		System.out.println("Ýnt iki parametreli: "+id+" Name: "+name);
		
	}
	
	protected Araba(String id,String name){
		
		System.out.println("String iki parametreli: "+id+" Name: "+name);
		
	}

	
	public Araba(Volvo volvo) {
		System.out.println("Volvo nesnesi oluþturuldu."+volvo.getId()+" "+ volvo.getName()+" "+volvo.getModel());
	}
	
	public Araba(Toyota toyota) {
		System.out.println("Toyota nesnesi oluþturuldu."+toyota.getId()+" "+ toyota.getName());
	}	
	
	public Araba(Fiat fiat) {
		System.out.println("Fiat nesnesi oluþturuldu."+fiat.getId()+" "+ fiat.getName());
	}

	public Araba(Fiat fiat, Volvo volvo) {
		System.out.println("Fiat Volvo nesnesi oluþturuldu."+fiat.getId()+" "+ fiat.getName()+" "+volvo.getId()+" "+ volvo.getName()+" "+volvo.getModel());
	}
	
	
}
