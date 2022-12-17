package day25exceptions;

public class E02 {
    public static void main(String[] args) {

        String arr[]={"Ali","Can","Veli","Han"};

        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException
    }
    //Bir String Array den index girerek eleman edebilmek icin bir method olusturun

    public static void getElementFromArray(String arr[],int idx){
        try{
            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e){
            //bu benim teknik olmayan aciklamam
            System.out.println("Array index 'te bir problem meydana geldi==>" + e.getMessage());

            //Exception ile ilgili detaylica teknik mesaj verir
            e.printStackTrace();

            //hata mesajini diger mesajlardan ayirmak icin kullaniriz
            System.err.println("Array index te bir problem yasandi");
        }


    }

}
