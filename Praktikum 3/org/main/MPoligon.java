/*
* Nama File : MPoligon.java 
* Penulis : Nafis Mufadhal
* Tanggal : 8 Maret 2023
* Deskripsi : Driver class untuk poligon, persegi panjang, dan segitiga
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(8,6,10,12);
		persegi.printInfo();
		segitiga.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}
