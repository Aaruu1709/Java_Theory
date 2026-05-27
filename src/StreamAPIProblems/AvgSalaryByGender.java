package StreamAPIProblems;
//Average Salary by Gender
//Find the average salary of male
// and female employees separately.
import java.util.*;
import java.util.stream.Collectors;

class Employeee {
    private String name;
    private String gender;
    private double salary;

    public Employeee(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
}

public class AvgSalaryByGender {

    public static void main(String[] args) {

        List<Employeee> employees = List.of(
                new Employeee("John", "Male", 50000),
                new Employeee("Alice", "Female", 60000),
                new Employeee("Bob", "Male", 70000),
                new Employeee("Diana", "Female", 80000),
                new Employeee("Mike", "Male", 55000)
        );

        // Using Stream API
        Map<String, Double> avgSalaryByGender =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employeee::getGender,
                                Collectors.averagingDouble(Employeee::getSalary)
                        ));
        System.out.println(avgSalaryByGender);

        // Print result
        avgSalaryByGender.forEach((gender, avgSalary) ->
                System.out.println(gender + " : " + avgSalary)
        );

        System.out.println("-------------------------------------------");
    }
}
//We use Java Streams to group employees by gender using Collectors.groupingBy(),
// and then calculate the average salary using Collectors.averagingDouble().