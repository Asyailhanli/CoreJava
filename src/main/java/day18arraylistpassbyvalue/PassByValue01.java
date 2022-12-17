package day18arraylistpassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1)Java variable'larin orjinal degerlerini korumak ister
        2)Variable method'lar icinde kullanildiginda ,Java method'un icine orjinal degeri koymaz ,o degerin kopyasini uretir
        ve method 'a o kopyayi yollar.Method kopya ustunde degisiklik yapar dolasiyla variable'in orjinal degeri korunmus olur.
        Bu sisteme "Pass By Value" denir.
        Note:Java "Pass By Value" kullanir
        Note:Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi developer'lara birakmistir
             Bu tarz diller "Pass By Reference" kullanilir.
         */

        int x=5;//gomlek//original deger
        System.out.println(x);//5
        //static method olan "main method"un icindeki hersey static olmalidir
        change(x);// 15 //ogrenci gomlegi//change methodun icine kopyasini birakiyor
        System.out.println(x);//5 //gomlek

        int ucret=100;

        int kopya=indirim(ucret);
        System.out.println(ucret);//90 //kopyasindan indirim orani cikarilir

        //// ama orjinal degeri degistirmek isterseniz asagidaki sekilde yapabilirsiniz
        ucret=indirim(ucret);

        System.out.println(ucret);//100 orjinal degeri yazdiriyorum bakin 100 tl yine degismedi.cunku java methoda direk vermez kopyasini verir
    }
    public  static void change (int a){// void olunca data vermiyor demek
        System.out.println(a*3);
    }

    //void disindaki "return" type'larda method body'si icinde "return" keyword kullanilmalidir// return ver demektir
    public static int indirim(int gomlekUcreti){

       return gomlekUcreti-10;
    }
}
