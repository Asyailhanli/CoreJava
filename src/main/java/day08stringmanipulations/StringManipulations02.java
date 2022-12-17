package day08stringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {


        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //          "Ali okula gitti."==>14

       String abc="Ben ders calismadim.";
         int no=abc.replace(" ","").length();
        System.out.println(no);


        String str = "Ali okula gitti.";
        //replace() method'u bir stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir
        int num= str.replaceAll(" ","").length();
        System.out.println(num);

        //Example 2: Bir string'deki tum 'a' harflerini 'A'ya ceviriniz
        String s="Ankara'nin tasina gozlerinin yasina bak.";

        String yeniS=s.replace("a","A");
        System.out.println(yeniS);


        //Example 3: Bir string'deki tum "kara" kelimelerinin yerine "*" koyunuz
        String t= "Kara kara dusunme Ankara";
        String yeniT=t.replace("kara","★");
        System.out.println(yeniT);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);// AC*********

        /*
           Bir grup data'yi ifade eden kod'laraa "Regex" denir.
           "Regex" Regular Expressions in kisalatilmis halidir.

           1)Tum rakamlar==>[0-9]
           2)Tum kucuk harfler==>[a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum harfler==> [a-zA-Z]
           5)Sesli harfler ==>[aeiouAEIOU]
           6) Space==>[]
           7)Tum rakamlar ve tum harfler ==>[0-9a-zA-Z]
           8)Tum noktalama isaretleri ==>\\p{Punct}

           1)Rakamlar haric tum karakterler ==>[^0-9]
           2)Kucuk harfler haric tum karakterler ==>[^a-z]
           3)Buyuk harfler haric tum karakterler ==>[^A-Z]
           4)Tum harfler haric tum karakterler ==>[^a-zA-Z]
           5)Space haric==>[^ ]
           6)Tum noktalama isaretleri haric ==>[^\\p{Punct}]

         */

        // Example 5: Verilen bir String de  kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz.

        String u= "Ali 13 yasinda, dersem inanma!...";

        int sonuc=u.
                    replaceAll("[0-9]","").
                    replace(" ","").// tek karakter degistirecekseniz replace
                    replaceAll("\\p{Punct}","").// birden fazla karakter degistireceksiniz replaceall
                    length();

        System.out.println(sonuc);

        //Example 6:Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //            i)Space haric en az sekiz karakter olmali
        //            ii) En az 1 sembol icermeli
        //            iii) En az bir rakam vermeli
        //            iv)En az 1 buyuk harf icermeli
        //              v)En az 1 kucuk harf icermeli

        String pwd="B78c? K!m";

        //  i)Space haric en az sekiz karakter olmali
        boolean first=pwd.replace(" ","").length()>7;


        //  ii) En az 1 sembol icermeli
        boolean second=pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //  iii) En az bir rakam vermeli
        boolean third=pwd.replaceAll("[^0-9]","").length()>0;


        //  iv)En az 1 buyuk harf icermeli
        boolean fourth=pwd.replace("[^A-Z]","").length()>0;


        //  v)En az 1 kucuk harf icermeli
        boolean fifth=pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli=first && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("Password'unuz gecerlidir..");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }


        //Example 7: Bir string'deki noktalama isaretlerinin  sayisini gosteren kodu yaziniz
        String cumle="Sen yapmazsan, ben?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8:Verilen bir string "Al" ila basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //          aksi halde "Normal" yazdirin

        String v="Alex";

        boolean baslangic=v.startsWith("Al");

        boolean bitis=v.endsWith("x");

        String result=baslangic && bitis ?"Harika":"Normal";

        System.out.println(result);


        }
    }





