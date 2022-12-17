package day29abstractioncollections;

    /*INTERVIEW!!!!
        "abstract method"lar sadece ne yapilacagini soyler(what to do)
        "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini(how to do) da soyler.

        "interface"ler bir yapilacak isler listesidir.(To do list)

        "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu method'larin
         return typle'lari ayni olmalidir. Aksi takdir de hata verir

         "interface"lerde "constructor" olmadigi icin interface'lerden object olusturulamaz.
         "abstract class"larda class olduklari icin constructor vardir.Ama constructorlar abstract class'larda object olusturamazlar

         "interface'ler farkli bir yapidir.O yuzden class degildir.

         Soru:"Abstract Class" ile "Interface"in farklari nelerdir?
               1)Method
                   "Abstract Class" hem abstract hem de concrete method'lar icerebilir
                   "Interface'ler ise sadece abstract method'lar icerir
                   Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method'lar olusturabiliriz

               2)Variable
                  "Abstract Class"larda normal Class'lardaki gibi her turlu variable olusturulabilir
                  "Interface"lerde ise variable'lar public,static ve final olmak zorundadir

               3)Inheritance
                    "Abstract Class"lar class olduklari icin multiple inheritance'a musaade etmezler
                    "Interface"ler ise multiple inheritance'i desteklerler

               4)Object Creation
                     "Abstract Class"larda constructor vardir ama object olusturmada kullanilmazlar
                     "Interface"lerde  constructor olmadigindan object olusturulamaz.

              Soru:Object Oriented Programming Language prensibleri nelerdir?
                   i)Inheritance
                   ii)Polymorphism
                   iii)Encapsulation
                   iv)Abstraction



    */

public class Civic implements Engine,Ac{

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }



}
