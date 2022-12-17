package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1: Kullanicadan bir dikdörtgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa ve uzun kenarini giriniz");
          int kisaKenar= input.nextByte();
          int uzunKenar= input.nextInt();
        System.out.println("Alan" + "Cevre = " +(uzunKenar*kisaKenar) +" "+(2*kisaKenar*uzunKenar));


        System.out.println("Dikdörtgenin kisa kenarini giriniz...");
        int en = input.nextInt();


        System.out.println("Dikdörtgenin uzun kenarini giriniz...");
        int boy = input.nextInt();


        System.out.println("Alan " + en*boy );//20


        System.out.println("Cevre " + 2*(en+boy));//24


    }

}


