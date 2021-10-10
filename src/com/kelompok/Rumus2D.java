package com.kelompok;

public class Rumus2D {
	// attribute
	float tinggi,panjang,lebar,sisiMiring,jari,alas;

	// constructor
	Rumus2D(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas){
		this.tinggi = tinggi;
		this.panjang = panjang;
		this.lebar = lebar;
		this.sisiMiring = sisiMiring;
		this.jari = jari;
		this.alas = alas;
	}

	// method attack
	void persegi(float sisi){
		System.out.println("menampilkan rumus persegi");
	}

	void persegipanjang (float panjang, float lebar){
		System.out.println();
	}
	void segitiga(float tinggi){

	}

}