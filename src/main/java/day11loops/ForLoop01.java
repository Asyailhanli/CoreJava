package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu  yaziniz

        int sum=0;//cunku sifir toplamada etkisiz eleman oldugu icin sifiri aldik

        for( int i=3  ; i<7    ;  i++  ){

            sum=sum+i;

        // eger her loop un sonucunu gormek istiyorsaniz sout loop icine yazilir
        }

        //Note: sytem.out.println(sum) loop un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        //      sytem.out.println(sum) loop un icine yazilirsa her bir loop icin "sum"in hangi degerleri aldigini gosterir
        System.out.println(sum);//18 loop bittikten sonra sout yazilinca son deger olan 18 verir

      //Example 2:6 dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz

        int multiply=1;
        for(int i =6 ; i>2  ; i-- ){

            multiply=multiply*i;
        }
        System.out.println(multiply);//360
    // Example 3: Size verilen  bir tamsayinin  rakamlarinin toplamini bulunuz

        /*
          385=3+8+5=16
          i)385%10=5
          java da tamsayiyi tamsayiya bolerseniz sonuc tamsayi olur.eger sonuc virgullu sayi ise java ondalik kismi siler
          385/10=38.5 olmaz 38 olur
          ii)38%10=8
          38/10=3
          iii)3%10=3
          3/10=0
       */

        int num=385;

        Math.abs(num);//bu sayinin mutlak degerini alir math absolute value

        int sonuc=0;

        for( int i=num  ;  i>0    ;   i=i/10   ){

            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);//16

        //Example 4:Size verilen bir String i ters ceviren kodu yaziniz
        //         "Kaba"==>abak

        String str="Kaba";

        //Concatenation yapacaksiniz "" kullanin
        String ters="";

        for(int i=str.length()-1; i>=0   ; i--){

           char c= str.charAt(i);

           ters=ters+c;
        }

        System.out.println(ters);


    }
}
