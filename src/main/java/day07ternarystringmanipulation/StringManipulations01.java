package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {



    /*
                      String Class Methodlari
        1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar. //o method ne zaman kullanilir
                   ii) equals() method'u "boolean" return eder.  //o method size ne verir

        2)equalIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlammiza yarar
                             ii)equalsIgnoreCase() method'u "boolean"return eder.

        3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir
                         ii) toLowerCase() method'u "String" return eder

        4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir
                         ii) toUpperCase() method'u "String" return eder

         5)charAt() : i) Bir String'den belli bir index'deki characteri almak icin kullanilir
                      ii) charAt() method'u "char" return eder

         6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                     ii)length() method'u "int" return eder

          7)contains():i) Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                       ii)contains() method'u "boolean" return eder

          8)split():i)Bir String'i istedigimiz character'den parcalamaya yarar// Ali baba
                    ii) split() method'u "array" return eder

     */

    /*
        Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz
        i)En az 8 character icermeli
        ii) space characteri icermemeli
        iii)ilk harf "M" veya "m"harf olmali
        iiii)son characteri "?" olmali

     */

        String pwd = "Manisa12?";

        //i)en az 8 character icermeli //karsilastirma her zaman boolen cevirir
        boolean first = pwd.length() > 7;

        //ii) space characteri icermemeli
        boolean second = !pwd.contains(" ");// unlem icermez anlamina gelir degil analaminda

        //iii)ilk harf "M" veya "m"harf olmali
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        //iiii)son characteri "?" olmali// java 4 harf var index 0123 son index harf sayisindan 1 eksik
        //length-1 son index demektir

        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first && second && third && fourth);//true



    }



}











