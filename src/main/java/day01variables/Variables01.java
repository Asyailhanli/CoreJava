package day01variables;

public class Variables01 {

    //Variable nasıl oluşturulur?

   //1)Acces modifier 2)Data Type 3)Variable ismi 4)= 5)Değer 6);
   // Java daki ";" Ingilizcedeki "." gibidir
   // Ingilizce'de "cumle"deriz, Java'da "statement" deriz

    // "=" sembolu "assigment(atama) operator" olarak adlandırılır
    // assigment(atama) operator sagdaki degeri alır soldaki variable 'ın icine koyar.

    public int age = 13;

    public int height = 183;

                              // Java'da Data Type'ları
 /*
                              PRİMİTİVE(İLKEL) DATA TYPES
   1)int :Integer'ın kısaltması. Integer tamsayı demektir. 32 bit kullanır.
          Matematikte tamsayıların basi ve sonu yoktur.
          En kücük int = -2,147,483,648
          En büyük int = 2,147,483,648

   2)byte: Tamsayilar icin kullanılır. 8 bit kullanır.
           En kücük byte = -128
           En büyük byte = 127

   3)short: Tamsayilar icin kullanılır. 16 bit kullanır.
            En kücük short = -32768
            En büyük short = 32768

   4)long: Tamsayilar icin kullanılır. 64 bit kullanır.
           En kücük long:-9,223,372,036,854,755,808
           En büyük long: 9,223,372,036,854,755,808

   5)float: Ondalıklı sayılar icin kullanılır.32 bit kullanır.
            "float" virgülden sonra 7 basamak icerebilir.
            "float" degerlerinde sona "f" veya "F" koymanız gerekir.

   6)double: Ondalıklı sayılar icin yazılır. 64 bit kullanır.
             "double" virgülden sonra 16 basamak icerebilir.

   7)boolean : "true" veya "false" degerleri icin kullanilir. 1 bit kullanir.

   8) char: Tek karakterler icin kullanilir. 16 bit kullanir.
            A,c,2,?,_,=,
            NOTE: "char"lara deger verirken degeri tek tirnak arasina koyunuz. Yoksa hata verir.

            NOTE:Java buyuk ve kucuk harflere duyarlidir.
                 Java icin TRUE ve true tamamen farklidir.

   NOTE: Numeric Data Types : byte < short < int < long < float < double
         Numeric Olmayan Data Types : boolean, char

                         Non-Primitive Data Type
     String : isim, adres ,kimlik numarası gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir.
              String non-primitive dir. Yani bir string olusturdugunuzda Java size bir suru method verir.


              Primitive ile Non-Primitive lerin farki nedir?
        1)Non-primitive data type'larinda degerinde yanında method lar vardır.
          Primitive data type'larinda sadece deger vardır,method yoktur.
        2)Primitive data type'lari Java tarafından olusturulmustur,toplam 8 tanedir,biz Primitive data olusturamayiz
          Non-primitive data type'lari Java tarafından da oluşturulmustur,biz de olusturabiliriz.Non-primitive
          sayilamayacak kadar coktur,cunku her developer Non-primitive data type olusturabilir.
        3)Primitive data type isimleri kucuk harflerle baslar.
          Non-primitive data type isimleri buyuk harfle baslar.
        4)Primitive data type'lar memory'de farklı buyuklukte yerler kullanır.
          Non-Primitive 'lerin hepsi memory'de ayni buyuklukte yer kullanırlar.


  */
  public byte price = 12;
  public short populationOfVillage = 2300;

  public float priceOfShirt = 13.99F;
  public double weightOfCell = 0.000012045;

  // Siz "long" demenize ragmen Java verilen sayıyı "int" kabul eder.
  // Bu yüzden, long bir variable'a "int" aralıgının dısında bir sayı verirseniz mutlaka sonu"L" veya "l" koyunuz.
  public long populationOfWorld = 7000000000L;

  // Burada "L" koyamdıgımız halde problem yok cünkü "1234" int aralıgına uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    // "main method" arabanın motoru gibidir.
    // "main method" çalısmadan hicbirsey calismaz.

    public static void main(String[] args) {

    }



}

