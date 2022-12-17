package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        List<String> myList= new ArrayList<>();// new derseniz yoktan var edersniz
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for loop kullanarak her elemanin sonuna "!" ekleyiniz
        // Note:loop'lar kendi baslarina "Collection"lari update edemezler.Java bu yuzden "iterator"lari olusturdu.
        //Iterator'lar Collection'lari update etmek icin kullanilir

        for(String w:myList){//looplar kendi baslarina list'leri update edemiyorlar
            w=w+"!";
        }
        System.out.println(myList);//[Z, K, A, J, M] unlem isareti ekleyemedi

        ListIterator<String> itr= myList.listIterator();//kendi list'imden listiterator olusturuyorum [ en basa pointer koyar,Z,K,A,J,M]

        while(itr.hasNext()){//hasNext() method pointer'a derki senden sonra eleman var mi ? diye sorar var ise true oluncak kod calisir
            String el=itr.next();// 2 is yapar i)pointer'i alir diger elemanin basina koyar ii) ve ustunden atladigi  elemani sana verir
            itr.set(el + "!");// Z burada update ediliyor
        }
        System.out.println(myList);//[Z!, K!, A!, J!, M!]

    }
}
