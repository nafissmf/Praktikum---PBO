/*
* Nama File	: BangunDatarGeneric.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 17 Mei 2023
* Deskripsi	: Kelas Bangun Datar Generic
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}