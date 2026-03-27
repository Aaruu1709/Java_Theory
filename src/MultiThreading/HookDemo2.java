package MultiThreading;

public class HookDemo2 {

        public static void main(String[] args) {

            Runtime.getRuntime().addShutdownHook(
                    new Thread(() -> System.out.println("Hook thread running"))
            );

            System.out.println("Before exit");
            System.exit(0);
            System.out.println("After exit"); // never executes
        }


}
