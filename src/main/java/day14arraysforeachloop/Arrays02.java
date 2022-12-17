package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1:[0,2,3,0,12,0] sifirlari en sona koyunuz //interview//orginal array[0,2,3,0,12,0]
                                                    // ii(ikinci adim) sifirsa birsey yapma degilse sayi at
        //          [2,3,12,0,0,0]//0 fiyat konulmamis               i)   // yeni array [0,0,0,0,0,0]
                                                                    //eleman sayisi orijinal array ile ayni olmali

        int original[]={0,12,-3,0};

        int yeni[]=new int[original.length];

        int idx=0;

        for(int i=0; i< original.length; i++){

            if(original[i]!=0){
              yeni[idx] =original[i];
              idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Array sort olunca negatif oldugu icin kullanmiyoruz

     //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigi kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //   [2,1,2,-3,2]==> Kullanici 2'yi sordu==>2 elemani var ve 3 kere tekrarlandi
        //                   Kullanici 6'yi sordu==>6 array de  yok

        int arr[]= {5,1,-3,5};

        int eleman=7;

        int counter=0;//"flag":Bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir

        for(int w: arr){
            if(w==eleman){
                counter++;
            }
        }

        if(counter>0){
            System.out.println(eleman+ " array'de "+ counter+ " defa var");// 5 array de 2 defa var//7 array de yok

        }else{
            System.out.println(eleman+" array'de yok");
        }

     //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
     //                "Java kolaydir calisana, ne kolay ki calismayana"==>calismayana

        String sentence="Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence=sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        String word[]=sentence.split(" ");//split array kullanilir cunku coklu data

        Arrays.sort(word,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(word));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]

        System.out.println(word[word.length-1]);//calismayana









    }
}
