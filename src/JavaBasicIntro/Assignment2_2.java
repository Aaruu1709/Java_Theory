package JavaBasicIntro;

public class Assignment2_2 {
    int a=20;
    int b=30;
    static void add(Assignment2_2 obj){
        System.out.println("addition is:"+ (obj.a+obj.b));
    }
    static void mul(Assignment2_2 obj){
        System.out.println("mul is:"+ (obj.a*obj.b));
    }

    public static void main(String[] args) {
        Assignment2_2 obj=new Assignment2_2();
        add(obj);
        mul(obj);
    }
}
//A static method cannot access instance variables directly.
// To access instance data, we must either create an object,
// pass the object as a parameter, or make the method non-static.