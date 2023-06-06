/*
* Nama File	: LambdaHashMap.java
* Penulis	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal	: 31 Mei 2023
* Deskripsi	: Implementasi lambda
*/

import java.util.HashMap;
import java.util.Map;
 
public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120033", "Nafis Mufadhal");
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
    }
}