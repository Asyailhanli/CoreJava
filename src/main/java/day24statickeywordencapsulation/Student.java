package day24statickeywordencapsulation;

//Encapsulation:"Data Hiding(Gizlemek)" demektir.

//Data'yi nicin gizlersiniz? Data'yi dis etkenlerden korumak icin

//Data'yi nasil gizlersiniz? Access Modifier'i "private" yaparak gizlerim

//Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
//"get method"lar(getter) olusturarak gizledigimiz data'lari okunur hale getirebiliriz.

//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method"lar(setter) olusturarak gizledigimiz data'lari degistirebiliriz

//Variable'in "data type" ile get method'un "return type'i" ayni olmalidir
//get method'lari isimlendirirken "get+<variable name>" ancak variable 'in dataa type'i "boolean" ise is "is+<variable name>"

//Encapsulation bir method'u "set" ile istediginiz kadar degistirip yeni method'lar olusturabilirsiniz

public class Student {

   public String stdName="Tom Hanks";
   private String stId= "TH202201";
   private double gpa= 3.8;
   private boolean retired= false;

    public String getStId() {
        return stId;//return ver demek
    }
    public double getGpa() {
        return gpa;
    }
    public boolean isRetired() {
        return retired;
    }

    public void setStId(String stId) {//setter size birsey vermez o yuzden void kullanilir
        this.stId = stId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
/* Bir variable'i encapsule etmek icin
   1- Access modifier'i private yapariz
   2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
       - Eger sadece okunmasini istiyorsaniz getter
       - Sadece deger girilebilsin isterseniz setter
        methodlarini olustururuz.
        Bir variable icin hem getter hem setter olusturursaniz
        o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

 */