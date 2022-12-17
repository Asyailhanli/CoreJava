package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini  saat olarak hesaplayan kodu yaziniz
        LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));//22
        LocalDateTime almanya=LocalDateTime.now(ZoneId.of("Europe/Berlin"));//21
        Long fark=ChronoUnit.HOURS.between(almanya,japan);
        System.out.println(fark);//6

        //Example 2:Sabit bir tarih olusturunuz
        LocalDate myDate= LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);//2011-04-13

        /*
          Java'da sabit datalari(gun isimler,ay isimleri,amerika'daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar
          olusturunuz. Bu depolara "Enum" denir.
         */

        //Example 3: USA icin "Woow!", UK icin "Big",CANADA icin "Cold" ,TURKEY icin "Vatan", GERMANY icin "Araba", RWANDA icin "Cay"


        Countries country= Countries.TURKEY;

        switch (country){

            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke .... ");


        }



    }
}
