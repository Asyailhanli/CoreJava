package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        List<String> myList= new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1:Iterators kullanarak list elemanlarini tersten console'a yazdiriniz
        ListIterator<String> itr=myList.listIterator();//sagdan sola geciste listIterator kullan geri vites yapar

        //hasNext() method'u pointer dan sonra eleman varsa true ,yoksa false return eder
        //next() method'u pointeri bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder
        while(itr.hasNext()){//Z,K,A,J,M pointer en sona geldi
            itr.next();
        }
        //hasPrevious() method'u pointer dan once eleman varsa true ,yoksa false return eder
        //previous() method'u pointeri bir sonraki elemanin sonuna  koyar ve ustunden atladigi elemani return eder
        while(itr.hasPrevious()){//hasPrevious() methodu pointera gelip senden once eleman var mi diye sorar? true ise kod calisacak
            String el=itr.previous();//previous pointer alip diger elemanin uzerinden atladigi elemani size verir
            System.out.print(el + " ");
        }
        System.out.println(myList);

        //Example 2:List'deki tum elemanlari siliniz
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList);
        /*
          1)ListIterator da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)prevoius() vi)remove()
          1) Sağdan sola / soldan sağa hareket edebilir.
          2) ListIterator ile bir List'i düzenleyebilirsiniz.

          2)Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.Normal iterator update edilmez
          1) Sadece soldan sağa hareket edebilir.
          2) Update özellikleri yoktur.
         */

        List<String> yourList= new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator= yourList.iterator();//tek kullanim icinde iterator kullan delikanli geri vites yapmaz

        while(iterator.hasNext()){
           String el= iterator.next();
            System.out.print(el);
        }
    }
}
