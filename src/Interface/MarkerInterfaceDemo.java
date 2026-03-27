package Interface;

public class MarkerInterfaceDemo implements Cloneable {
    int a=10,b=20;
    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterfaceDemo m=new MarkerInterfaceDemo();
        System.out.println("simple");
        System.out.println(m.a+ " "+ m.b);

       MarkerInterfaceDemo copy= (MarkerInterfaceDemo)m.clone();
        System.out.println("using clonable");
        System.out.println(copy.a+" "+copy.b);

    }
}
