/*
* Nama File	: Pegawai.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 3 Mei 2023
* Deskripsi	: class pegawai
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
