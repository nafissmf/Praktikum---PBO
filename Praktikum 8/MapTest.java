/*
* Nama File	: MapTest.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 17 Mei 2023
* Deskripsi	: Program kunci nilai
*/

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//kunci-> integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai 
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> keys = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci ? ditulis pada laporan anda !
		//petunjuk : gunakan iterasi seperti program ArrayListTest
		for(Integer k: keys){
			System.out.println(k + " : " + map.get(k));
		}
	}   
}
