package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Example 1: Bir Integer ArrayList'deki 7 haric tum elemanalri 2 artiriniz

        List<Integer> ages= new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w: ages){

            if(w==7){
                continue;
            }
              //w=w+2;==>List'ler boyle update edilemezler. Bu elemanlari ve integer degistirmek icin kullanilir ama listte kullanilmaz
         ages.set(ages.indexOf(w),w+2);// List'lerde rakam degistirmek icin set kullanilir

        }
        System.out.println(ages);//[14, 7, 23, 80, 11]

        //Example 2: Size verilen ArrayList'te 8(inclusive) ve 8 den onceki tum elemanlari 2 katina cikariniz
        List<Integer> nums= new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for(Integer w: nums){

            nums.set(nums.indexOf(w),w*2);//loopu kiran sayiyi inclusive  etmek istiyorsaniz ustune exclusive  istiyorsaniz break altina yazilmali

            if(w==8){
                break;
            }
            System.out.println(nums);//[24, 14, 42, 8, 9]

        }







    }
}
