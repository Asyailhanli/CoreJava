package day16multidimensionalarraylists;

import java.util.Arrays;
import java.util.Comparator;

public class MultidimensionalArray02 {

    public static void main(String[] args) {

        //Bir multidimensional array'deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz

        int arr[][]={{2,5,1},{83,75}};

        int maxElement=arr[0][0];//2 demek
        int minElement=arr[0][0];

        for(int [] w : arr){//{{2,5,1},{83,75}} w arraydir

            for(int k: w){//[2,5,1,] [83,75] w degerlerini k nin icine sirasiyla  koyacak// k integerdir.

                maxElement=Math.max(maxElement,k);// sonra k degerleri icine alip maxelement degeri de surekli degisecek
                minElement=Math.min(minElement,k);
            }
        }
        System.out.println(maxElement);//83
        System.out.println(minElement);//1

        System.out.println(maxElement+minElement);//84



    }
}
