package day32maps;

public class StaticBlocks01 {

    public static double pi;

    //static block'lar ihtiyacimiz olan variable'larin class olsuturma safhasinda elimizde olmasini saglar
    //static block'lar class icindeki hersey'den once calistirilir."main method'dan ve diger tum method'lardan once calistirilir
    //static block'lar icinde sadece "static variable"lara deger atanabilir
    //1'den fazla static block varsa ustteki once calistirilir

    static {
        pi=3.14;
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

    }

    static {
        System.out.println("Static block 2");
    }
}
