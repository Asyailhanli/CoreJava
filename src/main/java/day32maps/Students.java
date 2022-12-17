package day32maps;

public class Students {

    public String name;
    public String email;
    public int  age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() { //toString bu class olusturdugunuz : object hakkinda butun detaylari consola yazdirabiliriz  istedigimiz sekilde degistirebiliriz
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
