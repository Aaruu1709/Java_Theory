package JavaInterviewQuestion.Sorting_Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }

    public int compareTo(Student s){
        return this.marks - s.marks;//ascending
    }


}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(80,"A"));
        list.add(new Student(50,"c"));
        list.add(new Student(90,"c"));

        Collections.sort(list);
        for(Student s: list){
            System.out.println(s.marks +":"+s.name);
        }
        System.out.println(list);
    }
}
