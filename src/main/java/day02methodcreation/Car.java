package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {


        // Object nasıl olusturulur?
        //1)Class ismini yaziniz 2) Objeye bir isim veriniz 3)=   4)new keyword'unu kullan 5)Class ismini parantezle beraber(Constructor)

                  Car                myHonda                   =    new                       Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();

        //MethodCreation class'indan  object olusturmak
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda guvenli durur...");
    }


}
