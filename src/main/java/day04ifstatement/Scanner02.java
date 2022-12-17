package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
       Not: char variable'lari matematiksel islemlerde kullanirsaniz ,Java onlarin ASCII degerlerini kullanir.
            Örnegin: System.out.println( 'A' + 'C'); ekrana AC yerine 132 yazdirir.
       Note: Java'da "+" sembolunun iki anlami vardir. i) Toplama islemi ii) birlestirme islemi (Concatenation)
             Java"+" sembolu gorunce toplama yapmaya calisir, yapamazsa birlestirme islemi yapamaya calısır, o da olmazsa hata verir.

     */
    public static void main(String[] args) {

        // Example 1 : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy ismini ilk harflerini ekrana yazdiriniz
        // Ali Can ==> AC

        // 1.Yol:
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next().charAt(0);//A

        System.out.println("Soy isminizi giriniz..");
        char son = input.next().charAt(0); //C

        System.out.println("" + ilk + son);

        //2.Yol:
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();// Ali Can
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsimIlkHarfi = tamIsim.split("\\s")[1].charAt(0);
        System.out.println(soyIsimIlkHarfi);

        System.out.println(ilkHarf+soyIsimIlkHarfi);

    }
}
