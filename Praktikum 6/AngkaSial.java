/* 
* Nama File : AngkaSial.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 29 Maret 2023
* Deskripsi : File yang menunjukkan angka sial
*/


public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		} catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!");
		}
	}
}

/*
1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi? tereksekusi, baris 12 akan tereksekusi ketika masukan angka berupa 10 pada baris ke-22. Kemudian baris 12 dieksekusi karena angka 10 bukan angka sial.
Hasil eksekusi : 10 bukan angka sial
   
2. Apakah baris 21 pada AngkaSial.java diatas dieksekusi?
tereksekusi, baris 21 diatas akan tereksekusi ketika masukan angka berupa 21 pada baris ke 23. Kemudian baris 21 dieksekusi karena angka 13 angka sial.
Hasil eksekusi : jangan memasukan angka 13 karena angka sial !!! (dari class turunan AngkaSialException)
*/