/* 
* Nama File : BangunDatar.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 24 Maret 2023
* Deskripsi : File abstract class bangun datar
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}