/* 
* Nama File : Asersi1.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 29 Maret 2023
* Deskripsi : Program Asersi 1
*/


public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
