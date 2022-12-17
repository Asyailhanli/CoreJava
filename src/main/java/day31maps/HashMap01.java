package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
      1)Map'lar key-value structure kullanilir
      2)Key'ler unique'dir(tekdir)tekrarsizdir
      3)Value'lar tekrarli data icerebilir
      4)Map'lerde eleman olmaz EntrySet kullaniriz
      5)Key'ler de null tekrarsiz olarak kullanilir
      6)Value'lar null kabul eder
      7)HashMap'ler EntrySet'leri herhangi bir siralama tabi tutmaz,rastgele siralar
      8)Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.
     */
    public static void main(String[] args) {


        HashMap<String,Integer> studentAges= new HashMap<>();

        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);
        studentAges.put("Ali",88);//ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
        studentAges.put(null,55);
        studentAges.put(null,66);//overwrite==> var olan deger guncellendi
        studentAges.put("Ayhan isik",null);
        studentAges.put("Sadri alasik",null);//value'larda tekrarli degerleri uzerine yazmaz
        System.out.println(studentAges);//{null=66, Sadri alasik=null, Ayhan isik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}
                                        // rastgele random siralama yapiyor

        //Map'ten sadece key'ler nasil alinir??
        Set<String> keys=studentAges.keySet();
        System.out.println(keys);//[null, Sadri alasik, Ayhan isik, Tom, Ajda, Brad, Cuneyt, Ali]

        //Map'ten sadece value'lar nasil alinir??
        Collection<Integer> values=studentAges.values();
        System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

        //Belli bir key'e ait value nasil alinir?
        Integer cuneytAge=studentAges.get("Cuneyt");
        System.out.println(cuneytAge);//75

        //Example 1: Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        Collection<Integer> ages=studentAges.values();
        Integer sum=0;
       double counter=0;

        for(Integer w: ages){//[66, null, null, 21, 76, 12, 75, 88]
            if(w!=null){//w null degil ise
                sum=sum+w;
                counter++;
            }
        }
        System.out.println(" Ortalama yas : " + (sum/counter));//56.33333333


        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu bulunuz
        Set<String> names=studentAges.keySet();
        int sum1=0;
        for(String w:names){//[null, Sadri alasik, Ayhan isik, Tom, Ajda, Brad, Cuneyt, Ali]
            if(w!=null && !w.startsWith("A")){
                sum1=sum1+w.length();

            }
        }
        System.out.println(sum1);//25

        //remove("ajda",76) key'si Ajda ve value'su 76 olan EntrySet i siler ve size boolean return eder
        boolean result =studentAges.remove("Ajda",76);
        System.out.println(result);//true

        Integer result1=studentAges.remove(null);
        System.out.println(result1);//66

        //Key varsa value'u ver , key yoksa sizin istediginiz degeri verir
        Integer result2=studentAges.getOrDefault("Sadriye",0);
        System.out.println(result2);//0


        //Value null ise ekleme yapar, value null degilse ekleme yapmaz
        Integer result3 =studentAges.putIfAbsent("Brad",100);
        System.out.println(studentAges);//{Sadri alasik=null, Ayhan isik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}
        System.out.println(result3);//12

        Integer result4 =studentAges.putIfAbsent("Ayhan isik",100);
        System.out.println(result4);//null
        System.out.println(studentAges);//{Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //Key yoksa ekleme yapar
        Integer result5 =studentAges.putIfAbsent("Acun Ilicali",200);
        System.out.println(result5);//null
        System.out.println(studentAges);//{Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

        //replace() method'u value'lari key'e bakarak degistirdi
        studentAges.replace("Acun Ilicali",49);//value'lari update etmek icin replace kullanilir
        System.out.println(studentAges);//{Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}


        //replace() method'u value'lari key ve value'yu kontrol ettikten sonra degistirdi
        studentAges.replace("Acun Ilicali",49,53);
        System.out.println(studentAges);//{Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}


        //Example 3: Map'teki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz
        //           {Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}

        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir.Aksi takdirde Map'de loop kullanamazsiniz.
        Set<Map.Entry<String,Integer>> entries=studentAges.entrySet();//Map'e gidecek Map'teki herbir entry'i bir setin icine koyacak
                                                           // [Sadri alasik=null, Ayhan isik=100, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88]
        for(Map.Entry<String,Integer> w: entries){
            System.out.println(w);
        }








    }

}
