package JavaBasicIntro;

public class Assignment1 {
    int num1=10;
    int num2=20;
    void add(){
        System.out.println("addition is:"+ (num1+num2));
    }
    void mul(){
        System.out.println("multiplication is:"+ num1*num2);
    }

    public static void main(String[] args) {
        Assignment1 obj1=new Assignment1();
        obj1.add();
        obj1.mul();
    }
}
