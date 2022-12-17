package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Tom");
        cities.add("Thomas");
        cities.add("Taceddin");

        names.removeAll(cities);//removeAll()collection olani kullanildiginizda sadece ilk list degisir parantezin icindeki list degismez
        System.out.println(names);//[Tahsin, Trump]
        System.out.println(cities);//[Tom, Thomas, Taceddin]

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder
        // hepsi varsa true,en az biri yoksa false verir
        System.out.println(sonuc1);//false

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);
        //Example 1: "a" listinde "shoes" elemaninin ilk gorunumu siliniz

        a.remove("Shoes");//remove(object)olani
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2: "a" listinde "shoes" elemaninin tum gorunumu siliniz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        //Example 3:Bir tane salary listi olusturun eger salary 10000'den az ise %20 ,10000 ve 10000'den cok ise %10 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);//[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);//set methodu var olan degistirmeye yarar
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);//[13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        //Example 4:Iki Array'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki arraylistin esit olabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni index'te olmali

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.WAY
        int counter=0;//flag
        for(int i=0 ; i<m.size() ; i++){

            if(m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if( m.get(i)!=n.get(i) ){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
          if(counter==0){
          System.out.println("Listler esittir");
     }

     //2.WAY
        boolean esitMi=m.equals(n);

      if(esitMi){
          System.out.println("Listler esittir");
      }else{
          System.out.println("Listler esit degildir");
      }







    }
    }