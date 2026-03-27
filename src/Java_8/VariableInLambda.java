package Java_8;


interface Employee{

     int getSalary();
}
public class VariableInLambda {
   int a=3;

    public static void main(String[] args) {

    }
    private  void doSomething(){
//int a=3;
        Employee e=()->{
 a=3;
            return 10;
        };
        System.out.println(e.getSalary());
    }
}
