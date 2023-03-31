/* 
* Nama File : MBujurSangkar.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 24 Maret 2023
* Deskripsi : File class implementasi menghitung luas bujur sangkar
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}