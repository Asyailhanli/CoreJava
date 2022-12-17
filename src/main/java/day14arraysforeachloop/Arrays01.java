package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays'lerin icine  "primitive data type"leri ve reference(adres) lar  konulabilir.

    public static void main(String[] args) {

        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="surprised you";
        System.out.println(Arrays.toString(str));//java stringinin **adresi var.sanmayin java stringi var.

        //String bir Array olusturunuz ve "Tom" ve "Tom"dan onceki tum elemanlari yazdiriniz.

        String arr[]={"Jane","Mark","Cristopher","Tom","Ali","Rojda"};

        for(String w:arr){

            System.out.print(w+" ");

            if(w.equals("Tom")){//eger bunu diger curly bracesin altina yazarsaniz o zaman tom yer almaz.
                break;//tom dan sonra break ile loop kirildi ve break sizi lopp disina cikartacak

            }
        }

        System.out.println();
        //Example2: String bir Array olusturunuz "Tom" ve "Jane"  haric tum elemanlari yazdiriniz

        String brr[]={"Jane","Mark","Cristopher","Tom","Ali","Rojda"};

       for(String w:brr){


           if(w.equals("Jane") || w.equals("Tom")){
               continue;//false calismaz true de calisir//bosver demek continue.biz loopu kirmak istemiyoruz break ile .
           }            // continue sizi alir diger isme goturur yazdirmaz

           System.out.print(w+" ");
       }
        System.out.println();
       //Array varsa for each loop kullaniyoruz ama array olusturmak icin for loop kullaniriz
       //Example 3 : Kullanici ile beraber bir Array olusturunuz
        //      Bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa'a yuklemesini saglayan kodu yaziniz.

        /*

        ilk yol:
        Scanner input =new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStudent=input.nextInt();

        String names[]=new String[numOfStudent];

        for(int i=1 ; i<=numOfStudent; i++){//i=sira numarasi kullaniliyor

            System.out.println("Lutfen"+i+ ".ogrencinin ilk  ismini giriniz");

            String stdName=input.next();

            names[i-1]=stdName;//index numarasi her zaman sira numarasindan 1 eksik.

        }


        System.out.println(Arrays.toString(names));

        /*
         for(int i=1 ; i<numOfStudent+1; i++){// olabilir

         String stdName=input.next();sil yerine names[i-1]=input.next; yazilabilir

         System.out.println("Lutfen"+i+ ".ogrencinin ilk  ismini giriniz"); yerine.Devam etmek icin herhangi bir tusa basiniz");
        char exit=input.next().charAt(0);
        if(exit=='Q'|| exit=='q'){
            break;

         */


        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz

        //2.yol en ideal cozum:
        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Gerisi sonlandirmak icin Q harfine basiniz.");

        for(int i=1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");

            String stdName = input.next();

            if(stdName.equalsIgnoreCase("Q")){
                break;//false olunca break calismaz break calismazsa  loop kirilmaz can ismini alir
            }

            names[i-1] = stdName;

        }
        System.out.println(Arrays.toString(names));

        //3.Yol:Kendi cozum yolum

        Scanner scan=new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numberOfStudent=scan.nextInt();

        String namesStd[]=new String[numberOfStudent];
        int idx=0;
        System.out.println("Gerisini sonlandirmak icin Q harfine basiniz");
        for(String w: namesStd){

            System.out.println("Lutfen ogrenci ismini giriniz");
            String studentNames=scan.next();
            namesStd[idx]=studentNames;
            idx++;
            if(w.contains("Q") ||w.contains("q")){
                break;
            }


        }
        System.out.println(Arrays.toString(namesStd));















}
}
