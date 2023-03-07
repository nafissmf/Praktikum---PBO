/*
Nama file	: Titik.java
Pembuat	: Nafis Mufadhal
Tanggal	: 1 Maret 2023
Deskripsi	: Kelas yang berisi program utama untuk membuat titik
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
	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public double getCounterTitik(){
		return counterTitik;
	}
}