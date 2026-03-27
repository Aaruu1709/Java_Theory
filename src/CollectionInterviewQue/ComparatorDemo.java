package CollectionInterviewQue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2{
    int id;
    Student2(int id){
        this.id=id;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student2>list=new ArrayList<>();
        list.add(new Student2(5));
        list.add(new Student2(6));
        list.add(new Student2(1));
        Collections.sort(list,(a,b)->a.id-b.id);

        for(Student2 s:list){
            System.out.println(s.id);
        }
    }
}
//“Sorting based on more than one field
// (e.g., first by id, then by name).”
//👉 Student has:
//
//id
//name
//
//👉 Requirement:
//
//Sort by id
//If id is same → sort by name

//  Collections.sort(list, (a, b) -> {
//            if (a.id != b.id) {
//                return a.id - b.id;   // sort by id
//            } else {
//                return a.name.compareTo(b.name); // sort by name
//            }
//        });