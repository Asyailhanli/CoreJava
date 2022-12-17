package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 =>bebek
        //5 -12 =>cocuk
        //13- 20 =>genc
        //21 - 30 =>yetiskin
        //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        byte yas = input.nextByte(); // hata verdiginde neden o kirmizi cizgi var izah edilir ne yapman gerekeni sana soyler

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<=4){
            System.out.println("Bebek");
        }else if(yas<=12){
            System.out.println("Cocuk");
        }else if(yas<=20){
            System.out.println("Genc");
        }else if(yas<=30){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }

        // butun kritik degerler mutlaka test edilmelidir /0/4/5/12/13/20/21/30
        // donum noktasinin oncesi ve sonrasina gore test edilmelidir/-1/2/6/14/22/32
        // bu teste "Boundary value analyze test" kisaca "BVA" denir

        if(yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre...");
        }
    }
}
