package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

      /*
        1)LinkedList'deki her eleman iki bolumden olusur i)Data ii)Pointer
        2)LinkedList'deki herbir eleman "Node" olarak adlandirilir
        3)LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
        4)LinkedList'ler eleman arama islemlerinde basarirsizdirlar.
        5)3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi LinkedList kullanilmalidir
        6)ArrayList'ler index kullanir LinkedList'ler index kullanmaz
        7)Index kullanmak eleman bulma islemlerinde cok basarilidir.Bu yuzden eleman bulma islemlerini cok yapacaksaniz
           ArrayList kullanmalisiniz
       */
      public static void main(String[] args) {

          LinkedList<String> visitor= new LinkedList<>();
          visitor.add("Tom");
          visitor.add("Hanks");
          visitor.add("Tom Hanks");
          visitor.add("Brad");
          visitor.add("Pitt");
          visitor.add("Brad Pitt");
          visitor.add(2,"Angelina Jolie");//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt]
          visitor.add("Brad Pitt");
          visitor.add("Tom Hanks");

          System.out.println(visitor);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

          //LinkedList'ler ekleme ve silme islemlerinde cok basarili olduklarinda ekleme ve silme ile alakali cok fazla method icerir
          visitor.addLast("Ajda Pekkan");
          visitor.addFirst("Cuneyt Arkin");
          System.out.println(visitor);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

          visitor.removeLast();
          System.out.println(visitor);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

          visitor.removeFirst();
          System.out.println(visitor);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

          visitor.removeFirstOccurrence("Tom Hanks");
          System.out.println(visitor);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

          visitor.removeLastOccurrence("Brad Pitt");
          System.out.println(visitor);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

          /*
            Remove and returns the first element of this list
            This method is equivalent to removeFist().
            Throws:NoSuchElementException- if this list is empty
           */
          String firstEl=visitor.pop();//cut + paste==>Ctrl+X
          System.out.println(firstEl);//Tom
          System.out.println(visitor);//[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

          LinkedList<String> myList= new LinkedList<>();
          //myList.pop();//NoSuchElementException

      }
}
