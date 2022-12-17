package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        // If it rains I will cancel the picnic
        // If statement belli kodlari sartlara baglı olarak calistirmaya yarar.

        // Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12 ;
         if(s>0){
             System.out.println("Positive");
         }
        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin.

        char ch = 'A';

         if(ch>='A' && ch<='Z'){
             System.out.println("Buyuk Harf");
         }
     /*
        && islemi sadece boolean ile kullanilir
            true && true = true
            true && false = false
            false && true = false
            false && false = false
        && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
        Bir tane false varsa sonuc false demektir.

      */
        // Example 3 :Verilen bir sayi uc basamaklı ise ekrana"Uc basamaklı" yazdiriniz.
        int n = -2430;

       n = Math.abs(n);

        if(n>99 && n<1000 ){ // n>100 && n<999 veya n>99 && n<1000
            System.out.println("Uc basamakli");
        }

        // Example 4: Verilen bir sayı cift sayi ise ekrana cift sayi yazdiriniz.
        int p = -18;

        p = Math.abs(p);

        // "=" isareti atama operatorudur, matematikteki esittir anlamına gelemez.
        // Matematikteki esittir sembolu Java'da "==" seklindedir.
        //2+3 == 5

        if(p%2==0){
            System.out.println("Cift sayi");
        }

        // Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyu ise ekrana "Harika sayi" yazdiriniz.
        int r = 250;

        if (r<300 || r>1200){
            System.out.println("Harika sayi");
        }
        /*
          || islemi sadece boolean ile kullanilir.
              true || true = true
              true || false= true
              false || true= true
              false || false= false

        ||

      Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
            || isleminde sadece bir tane true sonucu true yapmaya yeter
     */

   }

}