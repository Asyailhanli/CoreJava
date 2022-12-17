package day19datetime;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        //Example 2:"Anlik zaman"(Current time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//10:43:55.473941

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zaman"(Current time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T10:47:34.662110

        //Example 4:Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zaman"(Current time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:52:39.117729

        //Example 5:Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zaman"(Current time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:54:09.134257

        //Example 6:Bugunden 789 gun sonra emekli olacaginiza gore ,emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);//2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between(dobAli,dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824

//        //Example 8: Tom Ali den 3 yil 8 ay 13 gun sonra dogdu.Ali ise Veli'den 1 yil 15 gun once dogdu.
//        //           Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz
//
//        LocalDate dobTom=LocalDate.of(2011,11,18);
//
//        LocalDate dobOfAli=dobTom.plusYears(3).plusMonths(8).plusDays(13);//Method chain
//

        //Example 8: Istanbul'un Fethi ile Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz
        //           29 mayis 1453==>Istanbul'un fethi        29 Ekim 1923==>Cumhuriyetin kurulusu

        LocalDate istanbulFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923, 10, 29);


        Long aySayisi = ChronoUnit.MONTHS.between(istanbulFethi, cumhuriyetKurulus);
        System.out.println(aySayisi);//5645

        //Example 9:Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        //

        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.yol:
        if (day >=21 && month == 3) {
            System.out.println("Koc");
        } else if (day <=20 && month == 4) {
            System.out.println("Koc");
        } else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }

        //2.yol:
        if ((day >=21 && month == 3)|| (day <=20 && month == 4)){
            System.out.println("Koca");
        }else if ((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }
















    }
}
