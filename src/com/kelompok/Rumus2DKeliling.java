package com.kelompok;

public class Rumus2DKeliling extends Rumus2D {
	String type = "Detail";

	// subclass constructor
	Rumus2DKeliling(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas){
		super(tinggi, panjang, lebar, sisiMiring,jari,alas);
	}

	@Override
	void persegi(float sisi){
		System.out.println("Type : " + this.type);

	}

}
