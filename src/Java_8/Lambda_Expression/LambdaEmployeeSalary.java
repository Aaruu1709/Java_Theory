package Java_8.Lambda_Expression;

import java.util.Arrays;
import java.util.List;

 class Demo {
    private int id;
    private double salary;
    private  String address;


   Demo (int id,double salary,  String address){
       this.id=id;
       this.salary=salary;
       this.address=address;
   }

   public int getId(){
       return id;

   }
   public double getSalary(){
           return salary;
       }
       public  String getAddress(){
       return address;

   }
}
public class LambdaEmployeeSalary{
    public static void main(String[] args) {
        List<Demo> employees = Arrays.asList(
                new Demo(1,60000,"pune"),
                new Demo(2,45000,"Iran"),
                new Demo(3,80000,"austreily")
        );

        employees.stream()
                .filter(e -> e.getSalary() > 50000) // lambda
                .forEach(e -> System.out.println(e.getAddress()));
    }
}