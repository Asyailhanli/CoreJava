package day20stringbuilderstringbuffer;

import java.sql.SQLOutput;

public class StringBuilder01 {

    /*
       1)StringBuilder Java'da bir Class'dir.
       2)StringBuilder, String olusturmaya yarar
       3)"String" Class varken nicin "StringBuilder"a ihtiyac duyariz?
        Cunku String Class "Immutable(degirmeyen) Class"dir, ama biz bazen "Mutable(degisime acik)" String'lere ihtiyac duyariz
        StringBuilder bize "Mutable"String verir
       4)"Immutable Class"larda varolan deger degistirilemez.Siz var olan bir degeri degistirmek istediginizde
         i)Memory'de yeni bir variable yeni degerle olusturulur
         ii)Eski variable'in pointer'a yeni variable dondurulur
         iii) Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir

          "Mutable Class"larda var olan deger degistirilebilir.Orjinal deger korunmaz
        5)"String Class"larin "immutable" yapisi "security" iicn onemlidir
          Ayni degere sahip birden fazla String oldugunda ,Java bir tane container olusturur ve ayni degere sahip String'lerin
          bu container'i kullanmasini temin eder.Bu memory'i kullanmak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde
          tum variable'larin etkilenmesi tehlikesi vardir.Bu tehlikeden kurtulmak icin Java String'leri "immutable(degismez)"yapmistir.Fakat herhangi
          bir variable'in degerini degistirmek icin Java bir yol bulmustur.Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in
          pointer'ini bu yeni variable'a yonlendirir.Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {

        String str="Java";//String class olusturursaniz str degismez
        str="Super Java";
        System.out.println(str);//Super Java

        String hesabSahibi1="Tom Hanks";
        String hesabSahibi2="Tom Hanks";
        String hesabSahibi3="Tom Hanks";

        //StringBuilder nasil olusturulur?
        //1.yol:
        StringBuilder strb1= new StringBuilder("Java");//strb degisime acik o yuzden string hemen yeni string olusturulur digerini silip.
        System.out.println(strb1);//Java

        //2.yol:
        StringBuilder strb2= new StringBuilder();
        //yol a:
        strb2.append("Java");//append ekle demek anlamina geliyor//String'deki concat islevini, append StringBuilder da kullanilir
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);//Java is easy!!!

        //yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);//Learn Java earn money.

        //StringBuilder'larda character sayisi nasil bulunur?
        StringBuilder strb3= new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar=strb3.length();
        System.out.println(numOfChar);//3

        //Capacity asimlarinda  capacity var olanin iki katinin iki fazlasina cikar
        int capacity1=strb3.capacity();
        System.out.println(capacity1);//34 // StringBuilder'in kapasitesi 16'dir.

        strb3.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int capacity2= strb3.capacity();
        System.out.println(capacity2);//70

        //setCharAt(2,r)==> Index 2'deki character'i "r"ye cevirir
        strb3.setCharAt(2,'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //delete(3,18)==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler
        strb3.delete(3,18);
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //deleteCharAt(2)==>Index 2 deki characteri sil
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Caxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //***reverse() method'u StringBuilder'i ters cevirir Ali==>ila
        //"mutable"larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir
        strb3.reverse();
        System.out.println(strb3);//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaC

        //"immutable"larda orjinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz
        String abc="Java";
        abc=abc.replace("a","i");
        System.out.println(abc);//Java

        //toString() method'u StringBuilder'lari String'e cevirir.
        String stringStrb3=strb3.toString();
        System.out.println(stringStrb3);//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaC

        //String'dende StringBuilder'a asagaidaki gibi donebilirsiniz
        StringBuilder strb4= new StringBuilder(stringStrb3);
        System.out.println(strb4);//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaC

        //insert(3,"xxxx") 3. character'den sonra "xxxx" leri koyar
        strb4.insert(3,"xxxx");
        System.out.println(strb4);//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaC


        //insert(3,"KLMOPQRSTU",5,8)==>3. character'den sonra "KLMOPQRSTU" String'inin index5,6,7 deki character'lerini yerlestirir
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);//xxxQRSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaC

        StringBuilder a= new StringBuilder("Java");
        StringBuilder b= new StringBuilder("Java");

        //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir
        //                        ii) a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        int sonuc=a.compareTo(b);//compareto kiyaslamak karsilastirmak
        System.out.println(sonuc);//0


    }
}
