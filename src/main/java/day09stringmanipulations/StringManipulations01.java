package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str="Kara kara dusunme Ankara";

        //indexOf() method'u verilen character veya character'lerin "ilk gorunumun" index'ini verir
        int idxA1=str.indexOf("kara");//String
        System.out.println(idxA1);//5

        //lastIndexOf() method'u verilen character veya character'lerin "son gorunumun" index'ini verir
        int idxA2=str.lastIndexOf("kara");
        System.out.println(idxA2);//20

        String s="Mississippi";
        int idxI=s.indexOf('i');// indexOf () hem string hemde char ile kullanilabilir.
        System.out.println(idxI);//1

         int idxIss1= s.indexOf("iss");//Ilk gorunumun "ilk" karakterinin indexini verir
        System.out.println(idxIss1);//1

        int idxIss2= s.lastIndexOf("iss");//Son gorunumun "ilk" karakterinin indexini verir
        System.out.println(idxIss2);//4

        // *** Example 1: Bir String'deki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz.
        //         "Hellooo"==> H->Tekrarsiz  e-->Tekrarsiz  l-->Tekrarli   0-->Tekrarli

        String t="Hellooo";

        char c='e';
        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");

        }
      String u="Learn Java earn money";

        // indexof() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri gectikten sonra
        //istenen karakterin ilk gorunumun indexi return eder
        int sonuc=u.indexOf("a",6);// a'nin ilk indexi bana lazim, ama alti karakteri gorme onu gectikten sonra ki degerini al
        System.out.println(sonuc);//7


        //lastindexof() iki parametre ile kullanilirsa ikinci parametre verilen sayiyi index olarak kabule edip en bastan
        //bu indexe kadar olan karakterleri bir kutu icine aliniz  ve lastindexof methodunu sadece bu kutu icindeki string icin kullanilir

        String m="Hello everyone";
        int e=m.lastIndexOf("e",10);
        System.out.println(e);//8

        String v = " ";//bos string"" true
        //"" bos string demek
        //isEmpty() methodu bir string'in bos olup olmadigini kontrol eder
        //Eger string de hic character yoksa isEmpty()"true" return eder,her hangi bir character varsa "false" return eder
        //lenght()==0 demek isEmpty() true verir demektir
        //Bir string 'in bos olup olmadigini anlamak icin "lenght()==0" kullanmayin."isEmpty()" kullanin
        // bosluk yani space de bir karakterdir o zaman false sonucunu verir yani karakter icerir
        boolean bosMu=v.isEmpty();
        System.out.println(bosMu);//false

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren string'ler icin return eder
        boolean blankMi=x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az bir character icermelidir
        Scanner input= new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz... ");
        String ilk=input.nextLine();// tek isim aldigi zaman next birden fazla ise string nextline olmali

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
            
        }

    }
}
