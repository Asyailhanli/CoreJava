package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
       TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge"(Natural Order)dizer.
       TreeSet cooook yavas calisir.Bu yuzden TreeSet kullanirken dikkatli olunmali...
        TreeSet "null" object'ini eleman olarak kullanilamaz.

        Note:Tekrarsiz elemanlari natural order'da depolamak icin TreeSet kullanmak mantiklidir.Ama TreeSet'ler coook yavas calistigi icin biz
             elemanlari once HashSet'e depolariz sonra HashSet'i TreeSet'e cevirerek TreeSet in yavas olma problemini asmis oluruz
     */

    public static void main(String[] args) {

        //Example 1: Sekiz tane unique(dedigi icin set) String elemani alfabetik(treeset aklin a gelecek) sirada depolayiniz.
        //1.way:
        Long start1= LocalTime.now().toNanoOfDay();
        TreeSet<String>emails=new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1= LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);//8285000 yavas

        //2.way:INTERVIEW!!!!!
        //elemanlari ekleme de hashset'i kullanirim cok hizli oldugu icin sonrasinda treeset'e ceviririm onunda siralamasindan faydalanirim
        //hashset'in hizindan treeset'in siralamasindan yararlaniyorum
        HashSet<String>myEmails=new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailSorted=new TreeSet(myEmails);//HashSet'i TreeSet e cevirmek icin bu kodu yazdik
        System.out.println(myEmails);
        Long end2=LocalTime.now().toNanoOfDay();
        System.out.println(end2-end1);//359000 hizli
    }

}
