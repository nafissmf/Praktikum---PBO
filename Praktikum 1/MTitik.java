class MTitik{
	public static void main(String[] args){
		//titik t1 = (1,2)
		Titik t1,t2,t3;
		t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		//titik t2 = (3,4)
		t2 = new Titik();
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);

		//titik t3 = ()
		t3 = new Titik(5,6);

		//run program
		System.out.println("Jumlah objek titik : "+t1.getCounterTitik());
		System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
	}
}  