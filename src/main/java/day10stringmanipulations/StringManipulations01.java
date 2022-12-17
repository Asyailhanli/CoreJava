package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a= "Java kolaydir.";

        //startwith("kola",5) kodu ilk 5 karakterden sonraki stringe bakar ve o stringin "kola"ile baslayip baslamadigini kontrol eder
        //"kola" 'le basliyorsa "true",baslamiyorsa "false" return eder .
        boolean b=a.startsWith("kola",5);//5 karakterden sonra ne ile basliyor kola ile basliyor
        System.out.println(b);

        //replacefirst("a","★") kod string deki ilk "a"yi "★"cevirir
        //replace("a","★") kod string deki tum "a"lari yildiz yapar
        String c=a.replaceFirst("a","★");// sadece ilk a yi yildiz yapar
        System.out.println(c);

        // concat methodu iki tane stringi birbirine yapistirmaya yarar
        //"concatenation" islemi iki turlu yapilabilir;i)+ile ii)concat()ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice"dir
        //concat methodu  her zaman en sona ekler
        String d= c.concat(" Anladin mi?");//basta bosluk olsun diye birakti
        System.out.println(d);

        // a + "Anladin mi?" concat yerine bu da konulabilir

        String e = "    Tom Hanks   ";
        System.out.println(e);//"    Tom Hanks    "

        //trim methodu bir string in bas ve sondaki space karakterlerini siler aradaki space karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h ="Java";
        String i="Kava";

        // h.compareto(i) kod iki tane string i alfabetik olarak karsilastirir
        // buyuk harf kucuk harfe duyarlidir
        //buyuk harf kucuk harfe duyarli olmasini istemezseniz h.compareToIgnoreCase kullanabilirsiniz
        //h.compareto(i) kodd "h"nin alphabetik sirasindan "i"nin alfabetik sirasi cikarilir
        int k= h.compareTo(i);
        System.out.println(k);


        //a.repeat(5) kodu a stringini yanyana 5 kere yapistirir
        // repeat empty string return eder
        //java document'e ulasmak icin windows==ctrl e basili tutun mac== commad e basili tutun  ve mouse ile method ismine tiklayin
        String n=a.repeat(2);
        System.out.println(n);




    }
}
