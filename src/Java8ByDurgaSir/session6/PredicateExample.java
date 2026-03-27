package Java8ByDurgaSir.session6;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    }
public class PredicateExample {
    public static void main(String[] args) {
        ArrayList <Employee> list =new ArrayList<>();

        list.add(new Employee("aaruu", 1000));
        list.add(new Employee("sauruu",20000));
        list.add(new Employee("piulii",6000));
        list.add(new Employee("meerab", 8000));
        list.add(new Employee("purvi", 50000));

        //predicate 1: salary> 3000
        Predicate<Employee> salaryGreater= e->e.salary>3000;

        //predicate 2: name start with 'A'
        Predicate<Employee> nameStartwithA=e->e.name.startsWith("A");

        //combine predicate
        Predicate<Employee> finalCondition=salaryGreater.and(nameStartwithA);

        System.out.println("employees with salary> 3000 and name starts with A:");

        //Applying predicate
        for (Employee e:list){
            if(finalCondition.test(e)){
                System.out.println(e.name+":"+e.salary);
            }
        }
    }
}
