package Map_Interface.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

class Student{
    int rollno;
    String name,address;

    public Student(int rollno, String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }

    public  String toString(){
        return this.rollno+" : "+ this.name+ " :"+ this.address;
    }
}

class SortByRollno implements Comparator<Student>{
    public int compare(Student a,Student b){
        //compare based on roll number
        return a.rollno-b.rollno;
    }
}
public class CustomSortingComparator {
    public static void main(String[] args) {
        TreeMap<Student,Integer> tm=new TreeMap<>(new SortByRollno());
        tm.put(new Student(111,"aaruu","pune"),1);
        tm.put(new Student(131,"saruu","landon"),2);
        tm.put(new Student(112,"paruu","paris"),3);

        System.out.println("treemap sorted by roll number: "+ tm);
    }
}
