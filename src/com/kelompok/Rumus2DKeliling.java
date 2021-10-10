package com.kelompok;

public class Rumus2DKeliling extends Rumus2D {
	String type = "Detail";

	// subclass constructor
	Rumus2DKeliling(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas,float sisi){
		super(tinggi, panjang, lebar, sisiMiring,jari,alas,sisi);
	}

	@Override
	void persegi(float sisi){
		System.out.println("Keliling Persegi");
                System.out.println("Keliling = 4 x Sisi");
                System.out.println("Keliling = 4 x "+ sisi);
                System.out.println("Keliling = "+ 4 * sisi);
                System.out.println("");
	}
        @Override
        void persegipanjang(float panjang, float lebar){
                System.out.println("Keliling Persegi Panjang");
                System.out.println("Keliling = 2 x ( Panjang + Lebar )");
                System.out.println("Keliling = 2 x "+ panjang + lebar);
                System.out.println("Keliling = "+ 2 * panjang+lebar);
                System.out.println("");
        }
        
        void segitiga(float alas, float sisiMiring, float tinggi){
                System.out.println("Keliling Segi Tiga");
                System.out.println("Keliling = Alas + Tinggi + Sisi Miring");
                System.out.println("Keliling = "+ alas +" + "+ tinggi +" + "+ sisiMiring);
                System.out.println("Keliling = "+ alas + tinggi + sisiMiring);
                System.out.println("");
        }
        
        void lingkaran(float jari){
            float phi = (float) 3.14;
                System.out.println("Keliling Lingkaran");
                System.out.println("Keliling = 2 x Phi x r ");
                System.out.println("Keliling = "+ 2 +" x "+ phi +" x "+ jari);
                System.out.println("Keliling = "+ 2 * phi * jari);
                System.out.println("");
        }

}
