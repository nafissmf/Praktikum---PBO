/*
* Nama File	: Lingkaran.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 17 Mei 2023
* Deskripsi	: Kelas Lingkaran
*/


public class Lingkaran extends BangunDatar{
	private double jejari;

	public Lingkaran (double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}