package Java8ByDurgaSir.Session7;

import java.util.function.Function;
import java.util.function.Predicate;

class Student3{
    String name;
    int marks;

    Student3(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class FunctionAndPredicate {
    public static void main(String[] args) {

         Function<Student3,String> getGrade=s->{
            if(s.marks>=60)return "pass";
            else return "fail";
        };
        //predicate ->check pass
        Predicate<Student3> isPassed=s->s.marks>=60;

        Student3 s3=new Student3("aaruu", 75);
        System.out.println("name: "+s3.name);

        if(isPassed.test(s3)){
            System.out.println("status:passed" );
        }
        else {
            System.out.println("status: failed");
        }
        System.out.println("grade:"+getGrade.apply(s3));
    }
}
