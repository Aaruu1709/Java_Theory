//package ExceptionHandling.overrideRule;
//
//public class Rule1 {
//    public static void main(String[] args) {
//
//
//        //case:1
//        void marriage () throws InterruptedException {
//            System.out.println("parent did marriage ");
//        }
//    }
//
//    class Child extends Rule1 {
//        void marriage() throws ArithmeticException {
//            System.out.println("im child of rule1-parent");
//        }
//
//
//    System.out.println("____________________________")
//
//
//            case:2
//
//        void marriage() throws InterruptedException {
//            System.out.println("parent did marriage ");
//        }
//    }
//
//    class Child extends Rule1 {
//        void marriage() throws InterruptedException {
//            Thread.sleep(1000);
//            System.out.println("im child of rule1-parent");
//        }
//    }
//}
