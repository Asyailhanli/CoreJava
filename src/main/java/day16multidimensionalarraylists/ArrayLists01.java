package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /* INTERVIEW:
        Arraylist'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayListin farki nedir?
        1) Array olustururken Array'in icine kac tane eleman koyamamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz
           Array'ler eleman sayisinda "fixed"dirler.
           Arraylist'ler olustururken eleman sayisi soylemeye gerek yok, cunku Arraylist'ler eleman sayisinda "flexible"(esnek) dirler
        2) Array'lerin icine "primitive" ve "reference(adres)" konabilir
           Arraylist'lerin icine sadece "non-primitive" 'ler konulur.
        3)Array'ler "super fast"(cok hizli) .Array'ler memory'i cok az kullanilir.

        Note:Eleman sayisi kesin belli olan coklu datalari  depolamak icin Array kullaniliriz ama
             Eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
        *** Eger uzunlugundan emin oldugunuz coklu data type'lerde array kullaniniz.
     */

    public static void main(String[] args) {

        //ArrayList nasil olsuturulur?
        //1.YOL:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.YOL:
        ArrayList<Integer> heights = new ArrayList<>();
        //3.YOL:
        List<Integer> nums = new ArrayList<>();

        //ArrayList'ler  nasil yazdirilir?
        System.out.println(nums);//[]

        //ArrayListler nasil eleman eklenir?
        //add() methodu her zaman  elemani en sona ekler .(insertion order yerlestirme sirasi)
        // add methodu boolean return eder .true gorev tamamdir,false yerlestirilemedi

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]

        nums.add(1,50);//add() methodu verilen indexe verilen elemani koyuyor.void demek birsey yok  demek sonuc yok.
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);// arrayliste baska bir arraylist eklenir all collectional
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2,prices);// buradaki index collection istediginiz yere istediginiz indexi ekleyebilirsiniz
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur?// Arrayleri konusurken lenght diyin ama listleri konusurken size diyin****
        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() methodu istenen bir index'teki elemani verir.ONEMLI
        int el1=nums.get(3);
        System.out.println(el1);//185

        //ArrayList'in bos olup olmadigini nasil anlariz?
        boolean bos1=nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2=ages.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'te bir eleman nasil degistirilir?
        nums.set(3,200);// set() varolan bir metodu degistirmek icin kullanilir. index ile calisir.index 3 deki eleamini(185) bulup 200 ceviriyor
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

       for(int w: nums){ //[21, 50, 23, 200, 18, 20, 23, 185]

           if(w%2!=0){

               nums.set(nums.indexOf(w),w+11);
           }
       }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        //remove() methodun icine tamsayi koyarsaniz Java onu index olarak kabul eder.ONEMLI

        //Example 2:ArrayList'den 200 elemanini siliniz
        //Note 1 :Tum tamsayilar Java icin aksi soylenmedikce primitivedir yani "int"dir
        //Note 2: "primitive"ler Arraylistlerin elemani olamazlar.
        //Note 3: "primitive"i "Wrapper class"a ceviriseniz. non-primitive olur ve non-primitivler  ArrayListlerin elemani olur,index olamaz

        Integer sayi=200;// boyle yaparsak o zaman 200 siler

        /*
          nums.remove(new Integer(200));//remove verilen objeyi siliyor. // ustu cizili birsey gorurseniz o eskiden kullaniliyordu ama simdi artik kullanilmiyor update edilecek
          Java da butun tam sayilar primitive kabul eder.

        */
        
        nums.remove(sayi);
        System.out.println(nums);//[32, 50, 34, 18, 20, 34, 196]














    }
}
