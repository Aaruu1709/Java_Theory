package JavaInterviewQuestion.SeriAlization_Deseriliazation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesealizeDemo {
    public static void main(String[] args) {

        try{
            FileInputStream fis=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
           Student s=(Student) ois.readObject();
           //“Read an object from file (byte stream) and convert it into a Student object.”
            fis.close();
            ois.close();
            System.out.println("object deserialize successfully..here we do not create object ..without objct creation seralize the objcert");
        s.displayStudentData();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
