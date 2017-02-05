package com.vektorel.benimHatam;

import java.net.ConnectException;

public class VeriTabani {
	
	public void baglan()throws ConnectException{
		
		throw new ConnectException("Veritabaný Yok");
		
	}
	
	public void islemYap(){
		try {
			baglan();
		} catch (ConnectException e) {
			e.printStackTrace();
		}
	}
	
	

}
