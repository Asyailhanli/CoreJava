package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
      1)Hash bir tekniktir, birbirine benzemeyen code'lar uretir bu code'lar data'yi unique yapar
      2)Set'lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz(ogrenci numaralari gibi)

      3)HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir
      4)HashSet'ler index kullanmazlar cunku siralama rastgele yapildigi icin index manali olmaz
        HashSet'ler:
        i)Tekrarsiz elemanlarda
        ii)Siralama onemli degilse
        iii)Hiz cok onemliyse
        iv)Index kullanmazlar

     */

    public static void main(String[] args) {

        HashSet<String>emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //INTERVIEW!!!!
        //Var olan elemani eklerseniz hata vermez, son ekleneni var olan data'nin ustune yazar(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]



    }
}
