package com.kelompok;

public class Rumus3DLuasPermukaan extends Rumus3D{ 
    String type = "Detail";

    // subclass constructor
    Rumus3DLuasPermukaan(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas, float tinggilimas){
            super(tinggi, panjang, lebar, sisiMiring , jari , alas , tinggilimas);
    }

    @Override
    void kubus(float sisi){
        System.out.println("L\t= 6 x s x s");
        System.out.println(" \t= 6 x "+sisi+" x "+sisi);
        System.out.println(" \t= "+6*Math.pow(sisi, 2));
    }
    
    @Override
    void balok (float panjang, float lebar, float tinggi){
        System.out.println("L\t= (p x t) + (p x l) + (l x t)");
        System.out.println(" \t= (" +panjang+ " x " +tinggi+ ") + (" +panjang+ " x " +lebar+ ") + (" +lebar+ " x " +tinggi+ ")");
        System.out.println(" \t= "+(panjang*tinggi)+(panjang*lebar)+(lebar*tinggi));
    }
    
    @Override
    void tabung (float tinggi, float jari){
        float phi=(float) 3.14;
        System.out.println("L\t= (2 x phi x jari x tinggi) + (2 x phi X jari x jari)");
        System.out.println(" \t= (2 x "+phi+" x "+jari+" x "+tinggi+") + (2 x "+phi+" x "+jari+" x "+jari+" )");
        System.out.println(" \t= "+(2*phi*jari*tinggi)+(2*phi*Math.pow(jari, 2)));
    }
    
    @Override
    void bola(float jari){
        float phi=(float) 3.14;
        System.out.println("L\t= 4 x phi x r x r");
        System.out.println(" \t= 4 x "+phi+" x "+jari+" x "+jari);
        System.out.println(" \t= "+4*phi*Math.pow(jari, 2));
    }
    
    @Override
    void limassegitiga(float alas, float tinggi, float tinggilimas){
        System.out.println("L\t= 4 x (1/2 x a x t)");
        System.out.println(" \t= 4 x (1/2 x "+alas+" x "+tinggi+")");
        System.out.println(" \t= "+2*alas*tinggi);
    }
}
