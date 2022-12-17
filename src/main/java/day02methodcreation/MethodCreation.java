package day02methodcreation;

public class MethodCreation {
    //main method icinde hersey "static" olmalidir.

    public static void main(String[] args) {

         System.out.println(toplamaYap(1.2,5));
         System.out.println(ucSayiyiCarp(2,1.5,6));

         System.out.println(ilkIkiyiToplaUcuncuIlecarp(2,8,3.2));

         //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
         //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==>Satirbasi yapar   ii)System.out.print()==>Satirbasi yapmaz.


    }
    // Example 1 ;Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b){
       return a+b;
    }
    // Example 2 ;Uc sayiyi birbiri ile carpan bir method olusturunuz.
    public static double ucSayiyiCarp (double a, double b, double c){
        return a*b*c;

    }

    //Example 3 ; Uc sayidan ilk ikisini toplayıp ucuncu ile carpan method olusturup,sonucu ekran yazdiriniz.
    public static double ilkIkiyiToplaUcuncuIlecarp(double a,double b,double c){

        return(a+b) * c;

    }




    }



