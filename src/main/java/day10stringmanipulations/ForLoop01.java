package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1: Ekrana 5 kere "Hi" yazdiriniz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // tekrarli isler icin"loop" kullaniriz
        //Dort cesit "loop" vardir:i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        // Example 2: Ekrana 5 kere "Hi" yazdiriniz

        // baslangic degeri        loop hangi sart altinda calisacak   Increment(artirma) veya Decrement(azaltma)
        for(   int i=1            ;   i<6                           ;         i=i+1                            ){
            System.out.println("Hi");
        }

       // Example 3 : 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=4;  i<8; i++){
            System.out.print(i + " ");
        }
        //Increment; int i=12;                                        carpma
        //               1)i=i+3                                        i=i*3
        //               2)i+=3***                                      i*=3
        //               3) sadece 1 ile artirmada kullan ; i++ ****    yok

        //Decrement; int k= 15;                                    bolme
        //               1)k=k-7                                   k=k/3
        //               2)k-=7                                    k/=3
        //               3) sadece 1 azaltmak icin kullan ; k--     yok

        System.out.println();

     // Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=14; i>4; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 14 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
       // cift sayilar: 14, 12,10

        //1.YOL:
        for(int i=14 ; i>4; i=i-2){
            System.out.print(i + " ");//14,12,10,8
        }
        System.out.println();

        //2.YOL:Bu yol tercih edilir
        for(int i= 14  ; i>4  ; i--){

            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 6: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for(int i= 28 ; i<158 ; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 7:"Java" String'ini "J*a*v*a" String'ine ceviren kodu yaziniz

        String str="Java";

        for(int i= 0 ; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        // Example 8:Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz//tekrarsiz karakter denildigi zaman indexof=lastindexof
        //   "Hellooo Ali"==>HeAi

        String s= "Helloo Ali";


        for(int i= 0 ;  i<s.length(); i++){

            char c= s.charAt(i);

            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }

    }
}
