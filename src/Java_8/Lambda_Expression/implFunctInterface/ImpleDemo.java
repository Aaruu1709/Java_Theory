package Java_8.Lambda_Expression.implFunctInterface;
//normla
interface Calculation{
    int operation(int a,int b);
}
//
//class AdditionDemo implements Calculation{
//    @Override
//    public int operation(int a, int b) {
//        return a+b;
//    }
//}

//class sub implements Calculation{
//
//    @Override
//    public int operation(int a, int b) {
//        return a-b;
//    }
//}
public class ImpleDemo {
    public static void main(String[] args) {
        Calculation cal = new Calculation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }

//   Calculation cal1 =new AdditionDemo();
//        System.out.println(cal1.operation(10,20));
//
//        Calculation cal2=new sub();
//        System.out.println(cal2.operation(30,50));
        };
        System.out.println(cal.operation(10,10));
    }
}