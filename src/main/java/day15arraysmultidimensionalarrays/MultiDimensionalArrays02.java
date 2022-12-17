package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //MultiDimensionalArrays kisa yoldan nasil olusturulur?

        char arr[][]={{'a','b'},{'C','D','D'},{'?'} };

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, D], [?]]

        //Bir String Multidimensional Array'de icinde "a" olan elemanlari console'a yazdiriniz.

        String brr[][]={{"learn","java","it"},{"is","easy"}};

        for(String[] w:brr){

                           //["is","easy"] ikinci olarak bu array data type bakilacak
                          //["learn","java","it"] ilk olarak bu array bakilacak
            for(String k:w){

                if(k.contains("a")){
                    System.out.print(k+" ");//learn java easy
                }

            }

        }

    }
}
