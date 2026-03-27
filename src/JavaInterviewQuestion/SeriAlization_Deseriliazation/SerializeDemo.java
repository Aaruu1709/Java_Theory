package JavaInterviewQuestion.SeriAlization_Deseriliazation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Student s=new Student("aaruu",123,12345,"Malthan,Pune");

       try{
           FileOutputStream fos=new FileOutputStream("student.txt");
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           oos.writeObject(s);
           oos.close();
           fos.close();
           System.out.println("object serialized succesfully");
       }catch (Exception e){
           e.printStackTrace();
       }

    }

}
