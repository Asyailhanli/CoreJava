package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
           Kullanicidan gun sayisini aliniz ve gun ismini yazdiriniz
           1==>Pazar   2==>Pazartesi

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz....");
        byte gunNo =input.nextByte();

        //1.YOL: if ile cozunuz
        if(gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3) {
            System.out.println("Sali");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        }else if(gunNo==5){
            System.out.println("Persembe");
        }else if(gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else {
            System.out.println("Gecerli sayi giriniz...");
        }

        // switch else if yaptigi herseyi yapar.switch if gore daha sadedir okunmasi kolaydir.
        //2.Yol : switch ile cozunuz
        // direk variable i switch icine koyuyoruz
        // break olmazsa: break olan kismina gelene kadar Java calistirir.tek gun gormek isterseniz break yazilmali sonuna
        switch (gunNo) {

            case 1: // gun numarasi 1 oldugu durumda
                System.out.println("Pazar");
                break; // break mola-ara ver demek.break alir sizi switch in disina alir
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Perşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz");

        }
    }

}
