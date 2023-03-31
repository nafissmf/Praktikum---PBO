/* 
* Nama File : BujurSangkar.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 24 Maret 2023
* Deskripsi : File class implementasi class bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    // jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi errpr
    // dimana file bujursangkat tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}
