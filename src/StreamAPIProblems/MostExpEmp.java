package StreamAPIProblems;
//Finding the Most Experienced Employee
//Find the employee who has been with the company the longest (based on yearOfJoining).
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int yearOfJoining;

    public Employee(String name, int yearOfJoining) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getName() {
        return name;
    }
}

public class MostExpEmp {
    public static Optional<Employee> findMostExperienceEmp(List<Employee> employees) {

        return employees.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
    }

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("aaruu", 2015),
                new Employee("saruu", 2010),
                new Employee("paruu", 2018)
        );

        System.out.println(findMostExperienceEmp(list).get().getName()); // B
    }
}

