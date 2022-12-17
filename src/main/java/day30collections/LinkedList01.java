package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        /*

     * Retrieves, but does not remove, the head (first element) of this list.
     *Returns: the first element of this list, or "null" if this list is empty

     */

       String firstEl= names.peek();//ilk elemani silmek istemiyorsaniz sadece gormek istiyorsaniz peek kullanacaksiniz
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList=new LinkedList<>();
        String first=myList.peek();
        System.out.println(first);//null

        /*
            Retrieves and removes the head (first element) of this list.
            Returns:the head of this list, or "null" if this list is empty
         */
        String firstElement=names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
         * Retrieves and removes the head (first element) of this list.
         * Throws:NoSuchElementException- if this list is empty
         */
        String f=names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
         * Retrieves, but does not remove, the last element of this list,
         * Returns the first element of this list or null if this list is empty.
         */
        names.peekFirst();


        //Example 1: "A" ile baslayan tum isismleri "*****" e ceviriniz
        LinkedList<String> student=new LinkedList<>();
        student.add("Chris");
        student.add("Alexandre");
        student.add("Mark");
        student.add("Tom");
        student.add("Jeremy");
        student.add("Hans");
        System.out.println(student);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for(String w:student){
            if(w.startsWith("A")){
                student.set(student.indexOf(w),"*****");
            }
        }
        System.out.println(student);//[Chris, *****, Mark, Tom, Jeremy, Hans]

        //INTERVIEW SORUSU!!!!
        //Example 2: List'deki 4 harften cok harf iceren isimleri siliniz
        //Eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var , o yuzden for-each loop degil for loop kullaniyoruz

       for(int i=0; i<student.size(); i++){
           if(student.get(i).length()>4){
              student.remove(student.get(i));
              i--;
           }
       }
        System.out.println(student);//[Mark, Tom, Hans]



    }
}
