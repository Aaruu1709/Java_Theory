package Java8ByDurgaSir.Session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student4{
    String name;
    int marks;

    Student4(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class MultipleStudentObject {
    public static void main(String[] args) {
        //here we create multiple object like a database data
        List<Student4> student4=new ArrayList<>();
        student4.add(new Student4("Aaruu",90));
        student4.add(new Student4("kiran",80));
        student4.add(new Student4("priya",40));
        student4.add(new Student4("priyansha", 100));

        //alternative way to create list of student
//        List<Student4> s=new ArrayList<>(Arrays.asList())

//predicarte->to filter only passed students ..check student is passed or not
        Predicate<Student4> ispassed=s->s.marks>=35;

        //function<Student,String> to calculate grade
        Function<Student4,String> getGrade=s->{
            if(s.marks>=80)return "A";
            else if (s.marks>=60)return "B" ;
            else if(s.marks>=50) return "C";
            else if(s.marks>=55) return "D";
            else return "Fail";

            };

        //to print all students
        for(Student4 s:student4){
            //here we apply predicate to check is student passed nor not..which is passed only give here
            if(ispassed.test(s)){
                //here we apply function for to return something in this case we return passed student
                String grade=getGrade.apply(s);
                System.out.println("name: "+ s.name);
                System.out.println("marks: "+ s.marks);
                System.out.println("Grade: "+ getGrade.apply(s));
                System.out.println("__________________________________");
            }
        }
        }

    }

//if we use List.of-we can not add remove
//ArrsyList.asList()->You cannot add/remove later (fixed size list)-->
//import java.util.*;
//
//List<Student4> student4 = Arrays.asList(
//        new Student4("Aaruu", 90),
//        new Student4("kiran", 80),
//        new Student4("priya", 40),
//        new Student4("priyansha", 100)
//)''
//⚠️ Important:
//You cannot add/remove later (fixed size list)
//


//🔷 ✅ BETTER (MODIFIABLE LIST)
//List<Student4> student4 = new ArrayList<>(
//        Arrays.asList(
//                new Student4("Aaruu", 90),
//                new Student4("kiran", 80),
//                new Student4("priya", 40),
//                new Student4("priyansha", 100)
//        )
//);
//
//
//👉 Now you can:
//
//        student4.add(...)
//student4.remove(...)