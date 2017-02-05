package com.vektorel.setget;

public class Login {

	private String userName;
	private String password;

	public void kontrolEt(String kullanici, String sifre) {

		Veritabani veritabani = new Veritabani();

		veritabani.setUserName("recep");
		veritabani.setPassword("****");
		
		this.userName = veritabani.getUserName();
		this.password = veritabani.getPassword();
		
		if (this.userName == null || this.password == null) {

			System.out.println("Deðerleriniz boþ.");
			return;
		}

		if (this.userName.equals(kullanici) && this.password.equals(sifre)) {

			System.out.println("Kullanýcý Giriþ Yaptý.");

		}else {
			System.out.println("Hatalý giriþ.");
		}

	}

}
