package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
         1)HashTable bir map'dir.
         2)HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
         3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe(ayni andan birden fazla is yapabilme
          becerisi) ve synchronized(coklu islerin zaman kazandiracak sekilde siralanabilmesidir)'dir
         4)HashTable'larda key null olamaz.Key'i null yaparsaniz NullPointerException atar
         4)HashTable'larda value null olamaz.Value'yu null yaparsaniz NullPointerException atar

         NOTE:toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur
              toString() method'u olusturmadan object'i console'a yazdirirsaniz Java o object'in adresini yazdirir
    */

  /*  INTERWIEW QUESTIONS
      MAP'LER ARASINDAKI FARKLAR
      1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
         HashTable synchronized ve thread-safe dir.

      2) Treemap'ler natürel order yapar.
         LinkedHashMap giriş sırasına göre listeler.
         HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

      3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
         TreeMap'lerde key'ler icin "null" kullanılmaz.
         HashTable larda ikisi içinde null kullanılmaz. */

    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulations= new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);
        System.out.println(countryPopulations);//{USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null,90000000);// HashTable'larda key null olamaz.NullPointerException
        //countryPopulations.put("France",null);// HashTable'larda value null olamaz.NullPointerException

        Hashtable<String,Students> myStudents= new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        myStudents.put("Science",new Students("Mary Star","ms@gmail.com",32,false));
        System.out.println(myStudents);

        String  name=myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks

        int age=myStudents.get("Math").age;
        System.out.println(age);//21
    }
}
