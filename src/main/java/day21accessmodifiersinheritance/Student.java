package day21accessmodifiersinheritance;

public class Student {

    /*INTERVIEW!!!!
      Access Modifier:
      1)public   2)protected  3)default(Access Modifier'i default yapmak icin access modifier yazmayiz)   4)private
      Note: Access Modifier'lari genisten dara dogru sayiniz
      public>protected>default>private

      Note:Access Modifier'lari birer birer aciklayiniz
           i)public olanlar her class da kullanilabilir
           ii)protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class " icinden kullanilabilir
           iii)default olanlar baska package'de kullanilmaz
           iv)private olanlar sadece olusturulduklari class icinde kullanilabilir

      Note:protected ile default'un farkini soyleyiniz
          i)protected olanlar baska package'de kullanilmaz ancak baska package 'de "child class" icinden kullanilabilir
          ii)default olanlar baska package'de kullanilmaz

      Note:Class'lar icin hangi "Access Modifier'lar" kullanilabilir
           public ve default kullanilir ama protected ve private kullanilamaz.
     */

    //public her Class'da kullanilabilir.Farkli package'larda da ulasilabilir
    public String stdName="Tom Hanks";

    //protected olanlar ayni package icinde kullanilir ama baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir
    protected String address="Miami";

    //default olanlar baska package'den kullanilamazlar.Default'lar sadece ayni package ve icindeki class'larda kullanilir
    String email="th@gmail.com";//default  acces modifier yazilmaz
    //default diger adi =package private  ***

    //Private olanlar sadece olusturulduklari Class icinde kullanilabilir.Baska package ve class'larda kullanilamazlar
    private String  stdId="20206517004";

    //Class'lar object olusturmak icindir.Object olusturmak istedigimizde ya projenin her yerinden ulasmamiz gerekiyor ya da
    // package'in icinden ulasmamiz gerekir ama %90 class public olur. O zaman da istegimizde her yerde object uretiriz.
    //Class olusturgumuzda icindekine ulasmak isteriz


}
