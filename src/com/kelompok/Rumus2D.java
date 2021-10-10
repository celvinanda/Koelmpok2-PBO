package com.kelompok;

public class Rumus2D {
	// attribute
	float tinggi,panjang,lebar,sisiMiring,jari,alas,sisi;

	// constructor
	Rumus2D(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas,float sisi){
		this.tinggi = tinggi;
		this.panjang = panjang;
		this.lebar = lebar;
		this.sisiMiring = sisiMiring;
		this.jari = jari;
		this.alas = alas;
                this.sisi = sisi;

	}

	// method attack
	void persegi(float sisi){
            
		System.out.println("Luas Persegi");
                System.out.println("Luas = Sisi x Sisi");
                System.out.println("Luas = "+ sisi +" x "+ sisi);
                System.out.println("Luas = "+ sisi * sisi);
                System.out.println("");
                
	}

	void persegipanjang (float panjang, float lebar){
                System.out.println("Luas Persegi Panjang");
                System.out.println("Luas = Panjang x Lebar");
                System.out.println("Luas = "+ panjang +" x "+ lebar);
                System.out.println("Luas = "+ panjang * lebar);
                System.out.println("");
	}
	void segitiga(float tinggi, float alas){
                System.out.println("Luas Segi Tiga");
                System.out.println("Luas = 1/2 x Alas x Tinggi");
                System.out.println("Luas = "+ 0.5 +" x "+ alas +" x "+ tinggi);
                System.out.println("Luas = "+ 0.5 * alas * tinggi);
                System.out.println("");
	}
        void lingkaran(float jari){
            float phi = (float) 3.14;
                System.out.println("Luas Lingkaran");
                System.out.println("Luas = Phi x r x r");
                System.out.println("Luas = "+ phi +" x "+ jari +" x "+ jari);
                System.out.println("Luas = "+ phi * jari * jari);
                System.out.println("");
	}

}
