/* 
* Nama File : Poligon.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 15 Maret 2023
* Deskripsi : File Super Class Poligon
*/

package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}