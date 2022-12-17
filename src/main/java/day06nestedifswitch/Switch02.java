package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
           Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
         */
     // Note:toLowerCase() methodu bir String'deki tum character'leri kucuk harfe cevirir
        //   toUpperCase() methodu bir String'deki tum character'leri buyuk harfe cevirir

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz..");
        String ayIsmi= input.next().toLowerCase();//mArT yerine mart verirse eger kullanci o zaman next sonuna . koyup toLowerCase secilmesi gerekiyor

        switch(ayIsmi){
            case"ocak":
                System.out.println("Ocak");
            case"subat":
                System.out.println("Subat");
            case"mart":
                System.out.println("Mart");
            case"nisan":
                System.out.println("Nisan");
            case"mayis":
                System.out.println("Mayis");
            case"haziran":
                System.out.println("Haziran");
            case"temmuz":
                System.out.println("Temmuz");
            case"agustos":
                System.out.println("Agustos");
            case"eylul":
                System.out.println("Eylul");
            case"ekim":
                System.out.println("Ekim");
            case"kasim":
                System.out.println("Kasim");
            case"aralik":
                System.out.println("Aralik");
                break;// Java'ya dur demek icin break kullanilir
            default:
                System.out.println("Gecerli ay ismini giriniz");

        }

    }
}
