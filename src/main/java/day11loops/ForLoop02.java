package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1:Bir string 'deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda==>Androeda

        String str="Andrommmeda";

        //1.YOL
        for(  int i=0  ; i<str.length()-1    ;   i++  ){

            char c=str.charAt(i);

            if(c!='m' && c!='M'){
                System.out.print(c);
            }

        }

      //2.YOL

        for(int i=0  ; i<str.length()-1    ;   i++ ){

            char c= str.charAt(i);

            if(c=='m'){
                continue;//bosveerrr looplarda kullanilir continue sizi artirma azaltma bolumune al
                         // loop da icinde bazi degerleri loop a sokmak istemiyorsak o zaman loop dan cikarir
                        //Loop'un icinde bazi degerler icin loop'un calismamasini isterseniz"continue"kullaniniz
            }

            System.out.println(c);
        }

        //Example 2: 1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
        //1 2 3 4 5 6 ==> 6 12 18 24

        for(int i =1; i<101; i++){
              if(i%6==0){
            continue;//6 ya bolunenleri birak gec onu digerlerini yazdirir
        }
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3: Size verilen bir string deki 'm' den onceki karakterleri yazdiriniz
        //     Luxemburg==>Luxe

        String s="Luxemburg";

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
        // eger sout burada yani if den once  yazdirilirsa o zaman "m" dahil alir

            if(c=='m'){
                break;// false ise break calismayacak ama true oldugu zaman break calisir break sizi alip loopun disina cikacak
            }
            System.out.print(c);
        }

    }
}
