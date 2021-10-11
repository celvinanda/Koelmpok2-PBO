package com.kelompok;

public class Rumus3DVolume {
    float tinggi,panjang,lebar,sisiMiring,jari,alas,tinggilimas,tinggiprisma;

    Rumus3DVolume(float tinggi, float panjang, float lebar, float sisiMiring, float jari, float alas, float tinggilimas, float tinggiprisma){
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.sisiMiring = sisiMiring;
        this.jari = jari;
        this.alas = alas;
        this.tinggilimas = tinggilimas;
        this.tinggiprisma = tinggiprisma;
    }

    void kubus(float sisi){
        System.out.println("Volume\t= s x s x s");
        System.out.println("      \t= "+sisi+" x "+sisi+" x "+sisi);
        System.out.println("      \t= "+Math.pow(sisi, 3));
    }

    void balok (float panjang, float lebar, float tinggi){
        System.out.println("Volume\t= p x l x t");
        System.out.println("      \t= "+panjang+" x "+lebar+" x "+tinggi);
        System.out.println("      \t= "+panjang*lebar*tinggi);
    }
    
    void tabung (float tinggi, float jari){
        float phi=(float) 3.14;
        System.out.println("Volume\t= phi x r x r x t");
        System.out.println("      \t= "+phi+" x "+jari+" x "+jari+" x "+tinggi);
        System.out.println("      \t= "+phi*Math.pow(jari, 2)*tinggi);
    }
    
    void bola(float jari){
        float phi=(float) 3.14;
        System.out.println("Volume\t= 4/3 x phi x r x r x r");
        System.out.println("      \t= 4/3 x "+phi+" x "+jari+" x "+jari+" x "+jari);
        System.out.println("      \t= "+4/3*phi*Math.pow(jari, 3));
    }
    
    void limassegitiga(float alas, float tinggi, float tinggilimas){
        System.out.println("Volume\t= 1/3 x 1/2 x a x t x T");
        System.out.println("      \t= 1/3 x 1/2 x "+alas+" x "+tinggi+" x "+tinggilimas);
        System.out.println("      \t= "+0.167*alas*tinggi*tinggilimas);
    }
    
    void limassegiempat(float sisi, float tinggilimas){
        System.out.println("volume\t= 1/2 x s x s x T");
        System.out.println("      \t= 1/2 x "+sisi+" x "+sisi+" x "+tinggilimas);
        System.out.println("      \t= "+0.5*Math.pow(sisi,2)*tinggilimas);
    }
    
    void prismasegitiga(float alas, float tinggi, float tinggiprisma){
        System.out.println("Volume\t= 1/2 x a x t x T");
        System.out.println("      \t= 1/2 x "+alas+" x "+tinggi+" x "+tinggiprisma);
        System.out.println("      \t= "+0.5*alas*tinggi*tinggiprisma);
    }
}
