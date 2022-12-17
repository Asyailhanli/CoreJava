package day30collections;

    /*
       Deque:Double Ended Queue manasindadir yani iki uclu Queue demektir
             FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiginde kullanilir
     */

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {

        Deque<String> furnitureTruck=new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);//[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

       /* * Pushes an element onto the stack represented by this deque (in other
                * words, at the head of this deque) if it is possible to do so
                * immediately without violating capacity restrictions, throwing an
                * {@code IllegalStateException} if no space is currently available.
                *
     * <p>This method is equivalent to {@link #addFirst}.
     *
     * @param e the element to push
                * @throws IllegalStateException if the element cannot be added at this
                *         time due to capacity restrictions
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this deque
                * @throws NullPointerException if the specified element is null and this
                *         deque does not permit null elements
                * @throws IllegalArgumentException if some property of the specified
                *         element prevents it from being added to this deque
                */

        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

    }
}
