package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        double r1=compareNumOfCharacters("Java","xy");
        System.out.println(r1);//2

        double r2=compareNumOfCharacters(null,"xy");
        System.out.println(r1);//NullPointerException

        double r3=compareNumOfCharacters("Selenium","");
        System.out.println(r1);//ArithmeticException

    }

    //Verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method'u olusturunuz
    public static double compareNumOfCharacters(String s,String t){
        double result=0;
        try{
            result= s.length()/t.length();
        }catch(NullPointerException e){
            System.out.println("lenght() method'u null ile kullanilmaz");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
       return result;
    }

    /* INTERVIEW!!!!!
      "final","finally","finalize" aciklayiniz.
      1)"final" bir keyword'dur.Variable,Class ve Method'lar icin kullanilir

        1)"final" bir keyword'dur. Variable, Class, ve Method'lar icin kullanilir.
              "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
          Interview sorusu : "final", "finally", "finalize" nedir?
         final(keyword): ==> final method override edilemez.
              final variable degeri degistirilemez.
              final class child class sahibi olamaz.
        finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

        finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.

      2)"finally" bir "code block"dur
        "try-catch" veya "try" ile kullanilir
        "finally" code block icine yazilan kod'lar her halukarda calistirilir
        Mesela Database ile connection'i kesmek herhalukarda yapilmasi gereken bir fiildir.Bunu "finally"ile yapabiliriz
      3)"finalize" bir method'dur.Bu method Java tarafindan data'lar imha edilmeden once cagrilir, bu method data'lari
         imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'lari mha eder.

         "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar

    */

}
