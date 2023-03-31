/* 
* Nama File : Lingkaran.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 24 Maret 2023
* Deskripsi : File class implementasi luas lingkaran
*/

import static java.lang.Math.PI;
class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}