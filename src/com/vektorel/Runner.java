package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		OgrenciIslemleri islem = new OgrenciIslemleri();
		int secim = -1;
		do {
			do {
				System.out.println("***OGRENCI KAYIT SISTEMI***");
				System.out.println("1- OGRENCI EKLEME");
				System.out.println("2- OGRENCI SILME");
				System.out.println("3- OGRENCI LISTELEME");
				System.out.println("4- OGRENCI BULMA");
				System.out.println("5- OGRENCI GUNCELLEME");
				System.out.println("6- CIKIS");
				Scanner sc = new Scanner(System.in);

				try {
					System.out.println("LUTFEN BIRINI SECINIZ...");
					secim = sc.nextInt();

				} catch (Exception ex) {
					System.out.println("!!! Lutfen gecerli bir deger giriniz..");
				}
			} while (secim < 1 || secim > 6);

			if (secim == 1) { // Ogrenci Ekleme
				Scanner sc = new Scanner(System.in);
				System.out.println("Ogrencinin Numarasý..:");
				int no = Integer.parseInt(sc.nextLine()); 
				// NEXTLINE ile String olarak algýlanan deðeri int e çevirdik parse ettik
				System.out.println("Ogrencinin Adi..:");
				String ad = sc.nextLine();
				System.out.println("Ogrencinin Soyadi..:");
				String soyad = sc.nextLine();
				System.out.println("Ogrencinin Sinifi..:");
				String sinif = sc.nextLine();
				System.out.println("Ogrencinin Iletisim..:");
				String iletisim = sc.nextLine();
				islem.ogrenciEkle(no, ad, soyad, sinif, iletisim);
			} else if (secim == 2) { // Ogrenci Silme
				System.out.println("Silinecek Ogrenci No...:");
				Scanner sc = new Scanner(System.in);
				int no = Integer.parseInt(sc.nextLine());
				islem.ogrenciSil(no, "", "");
			} else if (secim == 3) { // Ogrenci Listeleme
				islem.ogrenciListesi();
			} else if (secim == 4) { // Ogrenci Bulma
				System.out.println("Bulunacak Ogrenci No...:");
				Scanner sc = new Scanner(System.in);
				int no = Integer.parseInt(sc.nextLine());
				islem.ogrenciBul(no);
			} else if (secim == 5) { // Ogrenci Guncelle
				Scanner sc = new Scanner(System.in);
				System.out.println("Ogrencinin Numarasý..:");
				int no = Integer.parseInt(sc.nextLine()); // String olarak algýlanan deðeri int e çevirdik parse ettik
				System.out.println("Guncellenecek Ogrencinin Adi..:");
				String ad = sc.nextLine();
				System.out.println("Guncellenecek Ogrencinin Soyadi..:");
				String soyad = sc.nextLine();
				System.out.println("Guncellenecek Ogrencinin Sinifi..:");
				String sinif = sc.nextLine();
				System.out.println("Guncellenecek Ogrencinin Iletisimi..:");
				String iletisim = sc.nextLine();
				islem.ogrenciGuncelle(no, ad, soyad, sinif, iletisim);
			}
		} while (secim != 6);
		System.out.println("PROGRAM SONLANDIRILDI...");
	}// main sonu

}// class sonu
