//package Java8ByDurgaSir.Session1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Set;
//
//
//class Employeee{
//
////    List<Salary>public class Employee implements Comparable<Employee>{
//        private int employeeId;
//        private String employeeName;
//        private int salary;
//
//        public Employeee(int employeeId, String employeeName, int salary){
//            this.employeeId=employeeId;
//            this.employeeName=employeeName;
//            this.salary=salary;
//        }
//
//        public void setEmployeeId(int employeeId) {
//            this.employeeId = employeeId;
//        }
//
//        public void setEmployeeName(String employeeName) {
//            this.employeeName = employeeName;
//        }
//
//        public void setSalary(int salary) {
//            this.salary = salary;
//        }
//
//        public int getEmployeeId() {
//            return employeeId;
//        }
//
//        public String getEmployeeName() {
//            return employeeName;
//        }
//
//        public int getSalary() {
//            return salary;
//        }
//
//        @Override
//        public int compareTo(Employee o) {
//            return this.employeeId-o.employeeId;
//        }
//
//        @Override
//        public String toString() {
//            return "Employee{" +
//                    "employeeId=" + employeeId +
//                    ", employeeName='" + employeeName + '\'' +
//                    ", salary=" + salary +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            Employee e = (Employee) obj;
//            return this.employeeId==e.employeeId;
//        }
//
//        @Override
//        public int hashCode() {
//            return employeeId;
//        }
//
//
////        public static void main(String[] args) {
////            Map<Integer, Employee> map = new HashMap();
////            Employee e1 = new Employee(3221, "Rakesh", 125);
////            Employee e2 = new Employee(3222, "Rohan", 128);
////            map.put(e1.getEmployeeId(), e1);
////            map.put(e2.getEmployeeId(), e2);
////
////            List<String> employeeNames = new ArrayList<>();
////            Set<Integer> set = map.keySet();
////
////            for(Integer e : set){
////                Employee emp = map.get(e);
////                employeeNames.add(emp.getEmployeeName());
////            }
//        }
////    }
////}
//
//
//
//public class StreamPractice {
//    public static void main(String[] args) {
//
//
////        List<Integer> list2 = Arrays.asList(10,20,50,70,8,2);
////        list2.stream()
////                .filter(x -> x % 10 == 0)
////                .map(x -> x * 2)
////                .forEach(System.out::println);
//
//        Employee e1 = new Employee(3221, "Rakesh", 125);
//        Employee e2 = new Employee(3222, "Rohan", 128);
//        Employee e3 = new Employee(3223, "Aman", 150);
//        Employee e4 = new Employee(3224, "Kartik", 165);
//        Employee e5 = new Employee(3225, "Mehul", 185);
//        Employee e6 = new Employee(3230, "Shreshth", 200);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//
//        employeeList.add(e3);
//
//        employeeList.add(e3);
//
//        employeeList.add(e4);
//        employeeList.add(e5);
//        employeeList.add(e6);
//        List<Integer>salary=employeeList.stream().map(e->e.)
//
//
//
////salary
//        //List<Employee> sorting= employeeList.stream().sorted((a,b)-> -a.getSalary()-b.getSalary()).limit(2).skip(1).toList();
//        //System.out.println(sorting);
//
//
//
//    }
//}
