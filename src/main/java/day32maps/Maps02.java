package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) { //iNTERVIEW!!!!!

        //Size verilen bir kelimedeki kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz
        //abbcaa= a=3,b=2,c=1

        String kelime="abbcaa";
        HashMap<String,Integer> gorunum= new HashMap<>();//{                   }
        String [] harfler=kelime.split("");
        System.out.println(Arrays.toString(harfler));//[a, b, b, c, a, a]

        for(String w:harfler){
            Integer gorunumSayisi=gorunum.get(w);//gorunum map'inde a nin degeri nedir ? Hic gorunum olmadigi icin null olur
            if(gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }

        System.out.println(gorunum);//{a=3, b=2, c=1}

       /* for (String w : harfler){
            gorunum.merge(w, 1, Integer::sum);
        }
     */

    }
}
