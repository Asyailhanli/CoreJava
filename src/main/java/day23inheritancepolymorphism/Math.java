package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("X");// super() demek parent class git demek ,Icinde string olani sec ve icine string "x" yazdik.parent constructor'ina gidip oradaki string constructor secer
        System.out.println("Constructor 1");
    }

    public Math(int a){//int a parametresi
       this(); //this bu class demek parantez ise constructer demek.Ayni class'in icinde  constructori kullanmak icin this () kullanilir
        System.out.println("Constructor 2");
    }
}
