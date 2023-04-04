/* 
* Nama File : AngkaSialException.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 29 Maret 2023
* Deskripsi : File angka sial Expection
*/

class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}