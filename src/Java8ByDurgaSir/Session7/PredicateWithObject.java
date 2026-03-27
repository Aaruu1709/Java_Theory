package Java8ByDurgaSir.Session7;

import java.util.function.Predicate;

class Student2{
    String name;
    int marks;

    Student2(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class PredicateWithObject {
    public static void main(String[] args) {

        Predicate<Student2> isPassed=p->p.marks >=35;
        Student2 s2=new Student2("aaruuu patil",30);
        System.out.println(isPassed.test(s2));
    }
}
