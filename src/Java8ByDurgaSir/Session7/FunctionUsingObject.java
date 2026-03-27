package Java8ByDurgaSir.Session7;

import java.util.function.Function;

class Student1{
    String name;
    int marks;

    Student1(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class FunctionUsingObject {
    public static void main(String[] args) {
        Function<Student1,String> getName=s->s.name;
        Student1 s1=new Student1("Aaruu",80);

        System.out.println(getName.apply(s1));
    }
}
