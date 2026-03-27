package JavaInterviewQuestion.SeriAlization_Deseriliazation;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int rollNo;
    int password;
    String address;
    Student(String name,int rollNo, int password, String address){
        this.name=name;
        this.rollNo=rollNo;
        this.password=password;
        this.address=address;

    }

    void displayStudentData(){
        System.out.println("my name is : "+ name+ "And I'm from : "+ address);

    }
}
