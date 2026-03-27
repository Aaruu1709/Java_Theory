package JavaInterviewQuestion.Sorting_Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2{
    int marks;
    String name;
    Student2(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(80,"A"));
        list.add(new Student(50,"B"));
        list.add(new Student(90,"C"));

        //sort by marks
        Collections.sort(list,(s1,s2)->s1.marks -s2.marks);

        for(Student s: list){
            System.out.println(s.marks + ": " + s.name);
        }
    }
}
