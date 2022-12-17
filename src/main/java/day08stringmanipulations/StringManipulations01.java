package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz
        //         Ramazan==>Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim= input.next();

      //1.yol:
        char ilkHarf=isim.charAt(0);//Ramazan: indek sirasiyla 0123456 son indeks:  7 karakter eksi indeks6 =7-6=1

        char sonHarf=isim.charAt(isim.length()-1);//Yazdiginiz code  sadece bazi durumlar icin calisirsa o code "Hard Coding" denir
                                                   // Yazdiginiz code her durum icin calisirsa o code "Dynamic Coding" denir

        System.out.println(""+ilkHarf+sonHarf);// charlarin arasinda matematiksel deger kullanirsaniz java ascii degerini alir
                                              // tirnak isareti ile arti eklenirse yani string eklenirse o zaman java ascii degerini almaz


        //2.yol:
        // substring bir string'in icindeki alt string demek. eger bir stringin bir parcasini almak istiyorsaniz
        //o zaman substring kullanacaksiniz.index kullanilir
        // ornegin :Ramazan= indexi:0123456 subtring (1,5) yani index 1,2,3,4 alinir ama 5 alinmaz demek
        // ilk index dahil oluyor son index haric oluyor substring de..

        String ilk=isim.substring(0,1);

        String son=isim.substring(isim.length()-1);

        System.out.println(ilk+son);// stringlerin ascii degeri yoktur

        //Example 2: Verilen String'deki tum hayvan isimlerini ekrana yazdiriniz
        //          "Ben kedi esim tavuk oglum sever inek"

        String str="Ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki tane kullanimi vardir.
        //1)substring(baslangic indexi,bitis indexi) String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
        String kedi=str.substring(4,8);
        String tavuk=str.substring(15,20);
        String inek=str.substring(34);

        System.out.println(kedi+tavuk+inek);

        System.out.println();

        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerinin bas harflerini ekrana yazdiriniz
         //      Ali Can==>AC    Tahsin Yurdakul==>TY

        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim=input.nextLine();
        String a=tamIsim.substring(0,1);

        String b=tamIsim.split(" ")[1].substring(0,1);//split bosluktan ali can 2 parcaya boler :0 birinci bolum,1 ikinci bolum

        System.out.println(a+b);





    }
}
