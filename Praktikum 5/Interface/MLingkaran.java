/* 
* Nama File : MLingkaran.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 24 Maret 2023
* Deskripsi : File class implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}