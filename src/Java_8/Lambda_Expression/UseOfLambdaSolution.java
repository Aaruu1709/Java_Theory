package Java_8.Lambda_Expression;

interface Emp{
    void getName();
}
public class UseOfLambdaSolution {
    public static void main(String[] args) {
        Emp e=()->{
            String s = "software enggg";
            System.out.println(s);

        };
        e.getName();
    }
}
