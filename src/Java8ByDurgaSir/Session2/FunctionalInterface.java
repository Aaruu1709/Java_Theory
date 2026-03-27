package Java8ByDurgaSir.Session2;

@java.lang.FunctionalInterface
interface Employee{
    void empName();
}
//class EmpImplementation implements Employee{
//    public void empName(){
//        System.out.println("aaruu");
//    }
//}
public class FunctionalInterface {
    public static void main(String[] args) {
        Employee e=()-> System.out.println("aaruuuu");
e.empName();
    }
}
