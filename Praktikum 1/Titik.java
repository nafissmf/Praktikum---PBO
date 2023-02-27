//Nama : Nafis Mufadhal //
//NIM  : 24060121120033 //
//Deskripsi : program utama yang memanfaatkan OperasiTitik //
class Titik{
	double absis; 
	double ordinat;
	static int counterTitik;

	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}

	Titik(int a, int b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}

	void setAbsis(double a){
		absis =a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	double getCounterTitik(){
		return counterTitik;
	}
}
