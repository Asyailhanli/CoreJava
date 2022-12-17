package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
       1) Ayni data tipinde coklu data'yi depolamak icin Java'nin olusturdugu yapilar vardir.
         Bu yapilardan birisi de "Array" lerdir
     */

    public static void main(String[] args) {
        // koseli parantez = java'nin onun array oldugunu anlar.
        // integer icin default value 0 dir o yuzden sifir yazdiriyor

        // Array nasil olusturulur?
        int stdAge[]= new int[7];//[0,0,0,0,0,0,0]

        // Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAge));

        //Array'lere elemanlar nasil eklenir?
         stdAge[1]=11;
         stdAge[0]=12;
         stdAge[2]=13;
         stdAge[3]=14;
         stdAge[4]=10;
         stdAge[5]=12;
         stdAge[6]=12;

        System.out.println(Arrays.toString(stdAge));

      //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAge[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemaninin toplamini ekrana yazdiriniz
        Arrays.sort(stdAge);//sort methodu kuuckten buyuge dizer
        System.out.println(Arrays.toString(stdAge));

        int ilk=stdAge[0];

        //note:"length()" String'lerde kullanilir,"length" Array'lerde kullanilir
        int son=stdAge[stdAge.length-1];//son index

        System.out.println(ilk+son);//24

        //Example 2:stdAges Array'i icindeki tum elemanlari toplamini ekrana yazdiran kodu yaziniz

        //1.YOL:for-loop
        int sum=0;
        for( int i =0 ; i< stdAge.length ; i++  ){
            sum=sum+stdAge[i];
        }
        System.out.println(sum);

       //2.YOL:while loop
       int i=0;
       int toplam=0;
       while (i< stdAge.length){
           toplam=toplam+stdAge[i];
           i++;

       }
        System.out.println(toplam);

       //3.YOL:do-while loop
        int k=0;
        int s=0;
        do{
            s=s+stdAge[k];
            k++;
        }while(k< stdAge.length);
        System.out.println(s);



        //4.YOL:for each loop Array'lerde ve Collections'larda kullanilir
        // ilk isin data tipini yazmak sonra her zaman "w:" kullanilir

        int t=0;

        for(int w : stdAge){
            t=t+w;
        }
        System.out.println(t);

     //Example 3: String bir array olusturunuz
        //  Bu Array'e 5 tane isim yerlestiriniz
        //  Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

      String stdNames[]=new String[5];
      stdNames[0]="Ali";
      stdNames[1]="Tom";
      stdNames[2]="Veli";
      stdNames[3]="Kemal";
      stdNames[4]="Cem";

     int karakterSayilariToplami=0;

      for(String w:stdNames){

        karakterSayilariToplami=  karakterSayilariToplami+w.length();
      }
        System.out.println(karakterSayilariToplami);//18


     //Example 4: Char bir array olusturunuz
        //   Bu array 5 eleman ekleyiniz
        //   Bu array'deki sadece buyuk harfleri ekrana yazdiriniz

        char ch[]={'A','c','D','k','M'};//kisa yol =suslu parantez icine karakter yazilabilir

        for(char w:ch){
            if(w>='A'&& w<='Z'){
                System.out.print(w);
            }
        }

    }
}
