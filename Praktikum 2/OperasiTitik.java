/*
Nama file	: OperasiTitik.java
Pembuat	: Nafis Mufadhal
NIM		: 24060121120033
Tanggal	: 1 Maret 2023
Deskripsi	: Class OperasiTitik
Lab		: B1
*/

class OperasiTitik{
    // Atribut
    //private Titik t;

    // Konstruktor


    // Method
    private void refeksiSumbuX(Titik titik){
        double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }

    private void refeksiSumbuY(Titik titik){
        double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }

    public void refleksiX(Titik t){
        refeksiSumbuX(t);
    }

    public void refleksiY(Titik t){
        refeksiSumbuY(t);
    }
}