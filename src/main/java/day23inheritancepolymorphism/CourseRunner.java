package day23inheritancepolymorphism;

public class CourseRunner {

    public static void main(String[] args) {

//        Math math= new Math();//ilki class ikinci obje ismidir. tercihen ikisi ayni olmali
//        math.liveSessions();
//        math.practice();

        Math math= new Math(6);// buraya int'a 6 koyarak java math class'ina gidip int olan constructor'i secer
                               //Constructor B sirayla yukardan asagi dogru.Parent'tan child'lara dogru
                               //Constructor 1
                               //Constructor 2

    }
}
