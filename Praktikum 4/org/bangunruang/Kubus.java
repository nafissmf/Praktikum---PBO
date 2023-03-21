/* 
* Nama File : Kubus.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 15 Maret 2023
* Deskripsi : File Class Kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    // atribut
    private BujurSangkar permukaan;

    // konstruktor
    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    // method
    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}