package day25exceptions;

public class E03 {
    public static void main(String[] args) {
       String str="Ali";
        getNumOfChars(str);//3

        String s="";
        getNumOfChars(s);//0

        String t=null;
        getNumOfChars(t);//NullPointerException
        //Eger lenght() methodunda null kullanirsaniz bu exception i alirsiniz

    }
  //Bir String'de bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz

    public static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("Lenght methodunda bir problem olustu");
            e.printStackTrace();
            //Bu methodu kullandiginiz zaman System.out.print(): kullanmaniza gerek yok
        }


    }
}
