package Java_8.Lambda_Expression.LambdaparamType;

import org.w3c.dom.ls.LSOutput;

interface ZeroParameterInterface{
    void display();
}
public class ZeroParam {
    public static void main(String[] args) {
        ZeroParameterInterface z=()-> System.out.println("zeroparameter lambda expression");
        z.display();
    }

}
