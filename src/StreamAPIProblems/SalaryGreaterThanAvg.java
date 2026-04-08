package StreamAPIProblems;
//Find employees whose salary is greater than average salary
import java.util.*;

class Employee1 {
    String name;
    double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SalaryGreaterThanAvg {
    public static void main(String[] args) {

        List<Employee1> list = Arrays.asList(
                new Employee1("John", 50000),
                new Employee1("Alice", 60000),
                new Employee1("Bob", 70000),
                new Employee1("Diana", 80000)
        );

        // Find average salary
        double avg = list.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0);

        // Print employees with salary > average
        list.stream()
                .filter(e -> e.salary > avg)
                .forEach(e -> System.out.println(e.name + ":" + e.salary));
    }
}
