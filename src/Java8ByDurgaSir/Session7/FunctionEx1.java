package Java8ByDurgaSir.Session7;


import java.util.function.Function;

class Student{
    String name;
    int marks;

    //constructor
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class FunctionEx1 {
    public static void main(String[] args) {
//Function: Student -/String(return grade)
        Function<Student,String> f=s->{
            int marks=s.marks;
            String grade="";
            if(marks >=80) grade ="A[Disctiona]";
            else if (marks>=60) grade="B[second grade]";
            else if(marks >=50) grade="C[Third class]";
            else grade="E[Failed]";

            return  grade;

        };

        //student array
        Student [] students={
                new Student("aaruu",1000),
                new Student("sunny",300),
                new Student("meerab",50),
                new Student("kayra" , 80)
        };

        //apply function
        for(Student s: students){
            System.out.println("Name:"+ s.name);
            System.out.println("Marks :"+s.marks);
            System.out.println("grade:c"+ f.apply(s));
            System.out.println("________________________");
        }
    }
}
