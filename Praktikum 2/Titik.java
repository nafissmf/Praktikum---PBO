/*
Nama file	: Titik.java
Pembuat	: Nafis Mufadhal
NIM		: 24060121120033
Tanggal	: 1 Maret 2023
Deskripsi	: Class OperasiTitik
Lab		: B1
*/

class Titik{
    // Atribut
    private double ordinat,absis;
    private static double counterTitik;

    // Konstruktor
    Titik(){
        counterTitik++;
    }
    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }
    // Method
    // Getter
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    static double getCounterTitik(){
        return counterTitik;
    }

    // Setter
    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double b){
        ordinat = b;
    }
}