package MultiThreadingPractice;

class Student{
    int rollNo;
    String name;

    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
//    protected void finalize(){
//        System.out.println("Student object is garbage collected");
//
//    }
}
public class GarbageCollectorex1 {
    public static void main(String[] args) {
        Student s1=new Student(1,"aaruu");
        Student s2=new Student(2,"saruu");

        s1=null;
        s2=null;

        System.gc();
    }
}
