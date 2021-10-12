package com.kelompok;


import java.util.Scanner;

public class Main implements Data {
	
	private static Rumus2D luas2D,keliling2D;
	private static Rumus3DVolume luas3D,keliling3DLuasPermukaan;
	private static float tinggi,panjang,lebar,sisiMiring,jari,alas,sisi,tinggiPrisma,tinggiLimas;
	private static int opsi = 0;
	private static int opsiDetail = 0;
	private static int opsiHitung = 0;


	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);

		luas2D = new Rumus2D(tinggi,panjang,lebar,sisiMiring,jari,alas,sisi);
		keliling2D = new Rumus2DKeliling(tinggi,panjang,lebar,sisiMiring,jari,alas,sisi);

		luas3D = new Rumus3DVolume(tinggi,panjang,lebar,sisiMiring,jari,alas,sisi,tinggiPrisma);
		keliling3DLuasPermukaan = new Rumus3DVolumeLuasPermukaan(tinggi,panjang,lebar,sisiMiring,jari,alas,sisi,tinggiPrisma);

		System.out.println("Perhitungan Bidang");
		for (int i = 0; i < opsi1.length; i++) {
			System.out.println("Ketik "+ (i+1) + " untuk melihat hasil perhitungan dari "+ opsi1[i]);
		}
		System.out.print("Silahkan ketikan pilihan : ");
		opsi =inputNum.nextInt();

		switch (opsi){

			case 1 :
				for (int i = 0; i < opsi2D.length; i++) {
					System.out.println("Untuk menghitung "+ opsi2D[i] + " - ketik "+ (i+1));
				}
				System.out.print("Silahkan ketikan pilihan : ");
				opsiDetail = inputNum.nextInt();
				switch (opsiDetail){
					case 1:
						System.out.println("------------- ");
						System.out.println("Rumus 2D Luas ");
						System.out.println("------------- \n");
						for (int i = 0; i < opsi2DDetail.length; i++) {
							System.out.println("ketik "+(i+1)+" - "+opsi2DDetail[i]);
						}
						System.out.print("Pilih : ");
						opsiHitung = inputNum.nextInt();
						switch (opsiHitung){
							case 1:
								System.out.print("Sisi = ");
								sisi = inputNum.nextFloat();
								luas2D.persegi(sisi);
								break;
							case 2:
								System.out.print("Panjang = ");
								panjang = inputNum.nextFloat();
								System.out.print("Lebar = ");
								lebar = inputNum.nextFloat();
								luas2D.persegipanjang(panjang,lebar);
								break;
							case 3:
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextFloat();
								System.out.print("Alas = ");
								alas = inputNum.nextFloat();
								luas2D.segitiga(tinggi,alas,1);
								break;
							case 4:
								System.out.print("Jari - jari = ");
								jari = inputNum.nextInt();
								luas2D.lingkaran(jari);
								break;
						}
						break;
					case 2:
						System.out.println("----------------- ");
						System.out.println("Rumus 2D Keliling");
						System.out.println("----------------- \n");
						for (int i = 0; i < opsi2DDetail.length; i++) {
							System.out.println("ketik "+(i+1)+" - "+opsi2DDetail[i]);
						}
						System.out.print("Pilih : ");
						opsiHitung = inputNum.nextInt();
						switch (opsiHitung){
							case 1:
								System.out.print("Sisi = ");
								sisi = inputNum.nextFloat();
								keliling2D.persegi(sisi);
								break;
							case 2:
								System.out.print("Panjang = ");
								panjang = inputNum.nextFloat();
								System.out.print("Lebar = ");
								lebar = inputNum.nextFloat();
								keliling2D.persegipanjang(panjang,lebar);
								break;
							case 3:
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextFloat();
								System.out.print("Alas = ");
								alas = inputNum.nextFloat();
								System.out.print("Sisi Miring = ");
								sisiMiring = inputNum.nextFloat();
								keliling2D.segitiga(tinggi,alas,sisiMiring);
								break;
							case 4:
								System.out.print("Jari - jari = ");
								jari = inputNum.nextInt();
								keliling2D.lingkaran(jari);
								break;
						}
						break;
					default:
						break;
				}

				break;
			case 2 :
				for (int i = 0; i < opsi3D.length; i++) {
					System.out.println("Untuk menghitung "+ opsi3D[i] + " ketik "+ (i+1));
				}
				System.out.print("Silahkan ketikan pilihan : ");
				opsiDetail = inputNum.nextInt();
				switch (opsiDetail){
					case 1:
						System.out.println("---------------- ");
						System.out.println("Rumus Volume 3D");
						System.out.println("---------------- \n");
						for (int i = 0; i < opsi3DDetail.length; i++) {
							System.out.println("ketik "+(i+1)+" - "+opsi3DDetail[i]);
						}
						System.out.print("Pilih : ");
						opsiHitung = inputNum.nextInt();
						switch (opsiHitung){
							case 1:
								System.out.print("Sisi = ");
								sisi = inputNum.nextFloat();
								luas3D.kubus(sisi);
								break;
							case 2:
								System.out.print("Panjang = ");
								panjang = inputNum.nextFloat();
								System.out.print("Lebar = ");
								lebar = inputNum.nextFloat();
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextFloat();
								luas3D.balok(panjang,lebar,tinggi);
								break;
							case 3:
								System.out.print("Jari - Jari = ");
								jari = inputNum.nextFloat();
								luas3D.bola(jari);
								break;
							case 4:
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextInt();
								System.out.print("Jari - jari = ");
								jari = inputNum.nextInt();
								luas3D.tabung(tinggi,jari);
								break;
							case 5:
								System.out.print("Alas = ");
								alas = inputNum.nextInt();
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextInt();
								System.out.print("Tinggi Limas = ");
								tinggiLimas = inputNum.nextInt();
								luas3D.limassegitiga(alas,tinggi,tinggiLimas);
								break;
							case 6:
								System.out.print("Sisi = ");
								sisi = inputNum.nextInt();
								System.out.print("Tinggi Limas = ");
								tinggiLimas = inputNum.nextInt();
								luas3D.limassegiempat(sisi,tinggiLimas);
								break;
							case 7:
								System.out.print("Alas = ");
								alas = inputNum.nextInt();
								System.out.print("Tinggi= ");
								tinggi = inputNum.nextInt();
								System.out.print("Tinggi Prisma = ");
								tinggiPrisma = inputNum.nextInt();
								luas3D.prismasegitiga(alas,tinggi,tinggiPrisma);
								break;
						}
						break;
					case 2:
						System.out.println("----------------------- ");
						System.out.println("Rumus 3D Luas Permukaan");
						System.out.println("----------------------- \n");
						for (int i = 0; i < opsi3DDetail.length; i++) {
							System.out.println("ketik "+(i+1)+" - "+opsi3DDetail[i]);
						}
						System.out.print("Pilih : ");
						opsiHitung = inputNum.nextInt();
						switch (opsiHitung){
							case 1:
								System.out.print("Sisi = ");
								sisi = inputNum.nextFloat();
								keliling3DLuasPermukaan.kubus(sisi);
								break;
							case 2:
								System.out.print("Panjang = ");
								panjang = inputNum.nextFloat();
								System.out.print("Lebar = ");
								lebar = inputNum.nextFloat();
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextFloat();
								keliling3DLuasPermukaan.balok(panjang,lebar,tinggi);
								break;
							case 3:
								System.out.print("Jari - Jari = ");
								jari = inputNum.nextFloat();
								keliling3DLuasPermukaan.bola(jari);
								break;
							case 4:
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextInt();
								System.out.print("Jari - jari = ");
								jari = inputNum.nextInt();
								keliling3DLuasPermukaan.tabung(tinggi,jari);
								break;
							case 5:
								System.out.print("Alas = ");
								alas = inputNum.nextInt();
								System.out.print("Tinggi = ");
								tinggi = inputNum.nextInt();
								System.out.print("Tinggi Limas = ");
								tinggiLimas = inputNum.nextInt();
								keliling3DLuasPermukaan.limassegitiga(alas,tinggi,tinggiLimas);
								break;
							case 6:
								System.out.print("Sisi = ");
								sisi = inputNum.nextInt();
								System.out.print("Tinggi Limas = ");
								tinggiLimas = inputNum.nextInt();
								keliling3DLuasPermukaan.limassegiempat(sisi,tinggiLimas);
								break;
							case 7:
								System.out.print("Alas = ");
								alas = inputNum.nextInt();
								System.out.print("Tinggi= ");
								tinggi = inputNum.nextInt();
								System.out.print("Tinggi Prisma = ");
								tinggiPrisma = inputNum.nextInt();
								keliling3DLuasPermukaan.prismasegitiga(alas,tinggi,tinggiPrisma);
								break;
						}
						break;
					default:
						break;
				}
				break;
			default:
				tinggi = 10;
				panjang = 10;
				lebar = 10;
				sisiMiring = 10;
				jari = 10;
				alas = 10;
				sisi = 10;
				tinggiPrisma = 10;

				System.out.println("------------- ");
				System.out.println("Rumus 2D Luas ");
				System.out.println("------------- \n");
				rumus2D();

				System.out.println("------------------ ");
				System.out.println("Rumus 2D Keliling");
				System.out.println("------------------ \n");
				rumus2DKeliling();

				System.out.println("---------------- ");
				System.out.println("Rumus Volume 3D");
				System.out.println("---------------- \n");
				rumus3D();

				System.out.println("----------------------- ");
				System.out.println("Rumus 3D Luas Permukaan");
				System.out.println("----------------------- \n");
				rumus3DKeliling();
				break;
		}


	}

	private static void rumus2D() {
		luas2D.persegi(sisi);

		luas2D.persegipanjang(panjang,lebar);

		luas2D.segitiga(tinggi,alas,sisiMiring);

		luas2D.lingkaran(jari);
	}

	private static void rumus2DKeliling() {
		keliling2D.persegi(sisi);

		keliling2D.persegipanjang(panjang,lebar);

		keliling2D.segitiga(alas,tinggi,sisiMiring);

		keliling2D.lingkaran(jari);
	}

	private static void rumus3D() {
		luas3D.kubus(sisi);

		luas3D.balok(panjang,lebar,tinggi);

		luas3D.bola(jari);

		luas3D.tabung(tinggi,jari);

		luas3D.limassegitiga(alas,tinggi,tinggiLimas);

		luas3D.limassegiempat(sisi,tinggiLimas);

		luas3D.prismasegitiga(alas,tinggi,tinggiPrisma);
	}

	private static void rumus3DKeliling() {
		keliling3DLuasPermukaan.kubus(sisi);

		keliling3DLuasPermukaan.balok(panjang,lebar,tinggi);

		keliling3DLuasPermukaan.bola(jari);

		keliling3DLuasPermukaan.tabung(tinggi,jari);

		keliling3DLuasPermukaan.limassegitiga(alas,tinggi,tinggiLimas);

		keliling3DLuasPermukaan.limassegiempat(alas,tinggiLimas);

		keliling3DLuasPermukaan.prismasegitiga(alas,tinggi,tinggiPrisma);
	}
}
