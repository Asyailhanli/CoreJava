package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /* interview question:
           Verilen yilin "Leap Year"(Artik Yil) olup olamdigini kontrol eden kodu yaziniz
           i) Yil 100 e bolunurse 400 e de bolunmelidir==>1600+ 1800-
           ii)Yil 100 e bolunmezse 4 e bolunmelidir==>1996+ 2001-
         */

        int year=1600;

       String leap= year%100==0 ? (year%400==0 ? "Leap Year":"Leap Year degil"): (year%4==0 ? "Leap Year":"Leap Year degil ");

        System.out.println(leap);

        /*
           Asagidaki kurallara gore password'un gecerli olup olamdigini kontrol eden kodu yaziniz
           i)sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
           ii)sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
         */
          String pwd= "i2a3ed54";//length stringdeki karakterleri sayiyor yani 8 karakter var

          String gecerli=pwd.length()<8 ? (pwd.charAt(0)=='K'? "Gecerli":"Gecersiz"):(pwd.charAt(0)=='i' ? "Gecerli":"Gecersiz");

           System.out.println(gecerli);



    }
}
