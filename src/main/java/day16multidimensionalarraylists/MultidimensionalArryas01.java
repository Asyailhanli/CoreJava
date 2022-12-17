package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultidimensionalArryas01 {

    /*
      Array veya Collection varsa "for each loop" kullanmak ilk tercihiniz olsun.
      Array veya Collection var ama "index" kullanmak zorundasiniz o zaman " for-each-loop"calismaz.
       "for-loop" veya "while loop" veya do-while-loop"kullanmalisiniz


     */
    public static void main(String[] args) {

        //Bir tane integer multidimensional array olusturunuz
        //Bu arraydeki tum sayilarin toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr) {

            for (int k : w) {

                sum = sum + k;
            }
        }
        System.out.println(sum);//248

        //Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        // {{2,5,1},{32,75}}==> {2,5,1,32,75}

        int brr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};// eleman sayilarini toplamak icin birinci array ile ikinci veya ucuncu array icin

        int toplam = 0;

        for (int[] w : brr) {

            toplam = toplam + w.length;
        }
        System.out.println(toplam);// buraya kadar multidimensional array icindeki eleman sayisini bulduk o da 5

        int idx = 0;

        int crr[] = new int[toplam];//[0,0,0,0,0]//cunku yeni bir array olusturmaliyiz ve bu yeni array'in uzunlugu original arrayin eleman sayisina esit olmalidir

        for (int[] w : brr) {

            for (int k : w) {
                crr[idx] = k;
                idx++;
            }

        }

        System.out.println(Arrays.toString(crr));


    }
}
