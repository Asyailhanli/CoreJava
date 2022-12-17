package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        int age=250;
        try{
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
    //Yas'i ekrana yazdiran bir method olusturunuz

    public static void printAge(int age){

     if(age<0 || age>200){
         throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olamaz");
     }
        System.out.println(age);

    }

    /*
      Exception'lar ikiye ayrılır
      1) RunTime(Unchecked) Exception: Siz run butonuna bastıktan sonra oluşan Exception'lardır
       a)ArithmaticException
       b)NullPointerException
       c)ArrayIndexOutOfBoundsException
       d)StringIndexOutOfBoundsException
       e)NumberFormatException
      2) CompileTime(Checked) Exception: Biz kod yazarken javanın kızmızı altını çizmesi.
  */

}
