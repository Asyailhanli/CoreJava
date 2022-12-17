package day18arraylistpassbyvalue;

public class MethodOverloading01 {
    /*
    Method Overloading nasil yapilir?
    1)Method isimleri ayni olmalidir
    2)Method parametreleri farkli olmalidir
       i)Parametre sayilari degistirilebilir
       ii)Parametrelerin data tiplerini degistirebilirsiniz
       iii)Parametrelerin yerlerini degistirebilirsiniz ancak
           data tipleri farkli ise
    3) Method Ismi + Parametreler = Method Signature
      Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.
     */

    public static void main(String[] args) {

        add(3,5);
        add(3,5.0);


    }

    public static void add (int a,int b){// ilk add de java bunu secer
        System.out.println(a+b);

    }
    public static void add (int a,int b,int c) {
        System.out.println(a + b + c);
    }

    public static void add (int a,double b) {// ilk add icin auto widing var // ikinci add icin java bunu secer
        System.out.println(a + b );
    }
    public static void add (double a,int b) {//ilk add icin auto widing var
        System.out.println(a + b );
    }

}
