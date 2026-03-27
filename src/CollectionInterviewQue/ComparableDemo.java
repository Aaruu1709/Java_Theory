package CollectionInterviewQue;


//✅ 1. What is Comparable?
//“Comparable is used to define natural/default sorting inside the class.”

//✅ 2. What is Comparator?
//“Comparator is used to define custom sorting outside the class.”

//🧠 4. How Sorting Works Internally
//Uses:
//compareTo() OR compare()
//👉 Returns:
//Negative → smaller
//Zero → equal
//Positive → greater


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable
class Student implements Comparable<Student>{
int id;//variable
Student(int id){//constructor
    this.id=id;
}

//override Comaparable method compareTo()
    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
        list.add(new Student(3));
        list.add(new Student(1));
        list.add(new Student(2));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.id);
        }
    }

}
