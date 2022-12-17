package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
       1)FileInputStream fis=new FileInputStream("src/main/java/day27exceptions/File1.txt");
         "new"den sonraki "FileInputStream" hata verir.Cunku biz Java'ya verilen adresteki dosya'ya git dedik,Java
          iki endise'ye kapildi i)Ya adres yanlissa  ii)Ya verilen adreste yoksa
          Biz "method isminden" sonra "throw FilNoFoundException" yazarak ,Java'ya bu iki endise duydugun durum
          olusursa " Exception At" dedik.

       2) while((k= fis.read())!=-1){} yazdigimizda "read()" method'u hata verir.Cunku biz Java'ya dosya'daki
          karakterleri oku dedik.Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
          Biz method isminden sonra "throw IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik

       3)Method isminden sonra " throw IOException" yazarsaniz Java "throws FilNotFoundException"i siler.Cunku
       "IOException", "FileNotFoundException" i kapsar."IOException", "FileNotFoundException"in parent'idir, onun yaptigi
       herseyi yapabilir o yuzden  "IOException" varken "FilNotFoundException" gerek yoktur

       "IOException","Input Output Exception" demektir.

       4)Gordugunuz gibi  "IOException" ve "FileNotFoundException" biz kod yazarken ,daha "Run" butonuna basmadan ortaya  cikti.
         Bu tarz Exception'lara "Compile Time Exception" denir, diger kodlari "Checked Exception"dir

         "Compile Time Exception"lar kesinlikle halledilmelidir(Exception Handling),halletmeden code yazmaya devam etmeyiniz
     */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();


    }

    //Bir text file daki text'i okuyan kodu yaziniz
    //1.way
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis=new FileInputStream("src/main/java/day27exceptions/File1.txt");
        int k=0;
        while((k= fis.read())!=-1){
            System.out.print((char)k);
        }

    }

    //2.way: try-catch
    public static void readTheText(){

        try {
            FileInputStream fis=new FileInputStream("src/main/java/day27exceptions/File1.txt");
            int k=0;
            while((k= fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }

    }
}
