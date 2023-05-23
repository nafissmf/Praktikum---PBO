/*
* Nama File	: ArrayListTest.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 17 Mei 2023
* Deskripsi	: Program objek ArrayList Collection class
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
		//inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
        
    }
}