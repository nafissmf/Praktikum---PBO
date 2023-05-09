/*
* Nama File	: Manajer.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 3 Mei 2023
* Deskripsi	: class manajer
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}