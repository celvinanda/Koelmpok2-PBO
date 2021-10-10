package com.kelompok;


public class Main {
	public static void main(String[] args) {
		float tinggi = 10;
		float panjang = 10;
		float lebar = 10;
		float sisiMiring = 10;
		float jari = 10;
		float alas = 10;

		Rumus2D luas2D = new Rumus2D(tinggi,panjang,lebar,sisiMiring,jari,alas);
		Rumus2DKeliling keliling2D = new Rumus2DKeliling(tinggi,panjang,lebar,sisiMiring,jari,alas);

		Rumus2D luas3D = new Rumus2D(tinggi,panjang,lebar,sisiMiring,jari,alas);
		Rumus2DKeliling keliling3D = new Rumus2DKeliling(tinggi,panjang,lebar,sisiMiring,jari,alas);

		luas2D.persegi(panjang);
		keliling2D.persegi(panjang);


//		rumus.display();
//		penjelasan.display();

//		rumus.persegi(hero2);
//		penjelasan.attack(rumus);

//		rumus.display();
//		penjelasan.display();
	}
}
