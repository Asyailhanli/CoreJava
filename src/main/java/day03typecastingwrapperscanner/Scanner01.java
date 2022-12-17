package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkileşim kurmamizi saglar.
    // Scanner bir Java Class'idir, bu Class'ı kullanabilmek icin"import"etmek gerekir.
    // Scanner Class'ı Java'nin util kutuphanesindedir.

    public static void main(String[] args) {

        // Kullanicidan data almak icin yapılması gerekenler,

        // 1.Adım: Scanner Class'indan object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adım: Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir ...");

        // 3.Adım: Kullanicidan aldiginiz data'yi bir variable'in icine koyun
        byte age = input.nextByte();
        System.out.println("age = " + age);
        System.out.println("Hey kullanici senin yasin" + age);



    }

}

