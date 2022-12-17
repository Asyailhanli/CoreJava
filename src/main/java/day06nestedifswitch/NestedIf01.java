package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
           Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
           Password'un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password
         */

        // Nested:ic ice gecmis demektir.Example: sehpa

        // Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
            //Bu yuzden mumkunse "nested" kod yazmamaya calisiriz
        // Mecbur kaldigimiz zamanlarda  nested kullaniriz

        String pwd="Axy12!";// index:012345 //kucuk harflerin ascii degerleri buyuk harflerden fazladir

        char ilkHarf=pwd.charAt(0);

        if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') {// pwd.charAt(0) yerine ilkHarf yazmak javayi hizlandirir

            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }


        }else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z') {

            if (pwd.charAt(0) == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        } else{
                System.out.println("Ilk karakter harf olmalidir");


        }
    }
}
