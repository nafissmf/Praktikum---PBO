/* 
* Nama File : Segitiga.java 
* Penulis : Nafis Mufadhal
* Tanggal : 8 Maret 2023
* Deskripsi : Representasi dari objek segitiga, turunan kelas poligon
*/

package org.bangundatar; 
 
import org.poligon.Poligon; 
 
public class Segitiga extends Poligon{ 
    private double alas, tinggi, sisiMiring; 
 
    public Segitiga(double alas, double tinggi, double sisiMiring, int jumlahSisi){ 
        this.alas = alas; 
        this.tinggi = tinggi; 
        this.sisiMiring = sisiMiring; 
        this.jumlahSisi = jumlahSisi; 
    } 
 
    public double Pythagoras(){ 
        sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi); 
        return sisiMiring; 
    } 
 
    public void printInfo(){ 
        System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi()); 
    } 
}