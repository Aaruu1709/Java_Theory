package CollectionInterviewQue;

//✅ Step 1: Implement Cloneable
class Student1 implements Cloneable{
    //“Cloning is allowed for this class”
   int id;
   String name;


//   ✅ Step 2: Override clone() method
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ClonableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        //✅ Step 3: Use clone()
        Student1 s1=new Student1();
        s1.id=1;
        s1.name="Amit";

        Student1 s2=(Student1) s1.clone();//s2 is a copy of s1

        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
