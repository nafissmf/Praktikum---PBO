/* 
* Nama File : ExceptionOnArray.java 
* Penulis 	: Nafis Mufadhal
* NIM		: 24060121120033
* Tanggal 	: 29 Maret 2023
* Deskripsi : Program Exception class 
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}